<template>
      <v-card>
        <v-card-title>
          Seus Exercicios
        </v-card-title>
        <v-row>
          <v-spacer></v-spacer>
          <v-btn @click="dialog = true" text="Adicionar Exercicio" prepend-icon="mdi-dumbbell"></v-btn>
          <v-dialog v-model="dialog" max-width="600">
            <v-card prepend-icon="mdi-dumbbell" title="Adicionar Exercicio">
              <v-row p>
                <v-text-field clearable label="Nome" required v-model="exercicio.nome"></v-text-field>
              </v-row>
              <v-row>
                <v-text-field clearable label="Repeticoes" required v-model="exercicio.rep" suffix="reps"></v-text-field>
                <v-text-field clearable label="Carga" required v-model="exercicio.kg" suffix="Kg"></v-text-field>
              </v-row>

              <v-divider></v-divider>

              <v-card-actions>
                <v-spacer></v-spacer>

                <v-btn text="Cancelar" variant="plain" @click="clearExercicio"></v-btn>

                <v-btn color="primary" text="Adicionar" variant="tonal" @click="addExercicio"></v-btn>
              </v-card-actions>
            </v-card>
          </v-dialog>
        </v-row>
        
        <v-table>
          <thead>
            <tr>
              <th class="text-left">Id</th>
              <th class="text-left">Nome</th>
              <th class="text-left">Repeticoes</th>
              <th class="text-left">Carga</th>
              <th class="text-center">Acoes</th>
            </tr>
          </thead>
          <tbody>
            <tr v-for="exercicio in exercicios" :key="exercicio.name">
                <td>{{ exercicio.id }}</td>
                <td>{{ exercicio.nome }}</td>
                <td>{{ exercicio.rep }}</td>
                <td>{{ exercicio.kg }}</td>
                <td>
                    <v-btn stacked variant="flat" @click="getExercicio(exercicio.id)" density="compact">
                        <v-icon icon="mdi-pencil-circle" size="large"></v-icon>
                        Editar
                    </v-btn>
                    <v-btn stacked variant="flat" @click="deleteExercicio(exercicio.id)" density="compact">
                        <v-icon color="error" icon="mdi-delete-circle" size="large"></v-icon>
                        Apagar
                    </v-btn>
                </td>
            </tr>
          </tbody>
        </v-table>
      </v-card>
</template>
<script>

export default{
    name: 'ViewExercicios',
    data() {
        return {
          exercicios: [],
          exercicio: {
            nome: '',
            rep: 0,
            kg: 0
          },
          dialog: false
        }
    },

    beforeMount(){
      this.getExercicios();
      console.log(this.exercicios);
      console.log(this.exercicio);
    },

    methods: {
        getExercicios(){
            fetch('http://localhost:8080/exercicios')
            .then(res => res.json())
            .then(data => {
                this.exercicios = data
                console.log(data)
            })
        },
        deleteExercicio(id){
            fetch(`http://localhost:8080/exercicio/${id}`, {
                method: 'DELETE'
            })
            .then(data => {
                console.log(data)
                this.getExercicios()
            })
        },
        addExercicio(){
          fetch('http://localhost:8080/add', {
              method: 'POST',
              headers: {
                  'Content-Type': 'application/json'
              },
              body: JSON.stringify(this.exercicio)
          })
          .then(data => {
              console.log(data)
              window.location.href = "/";
          })
        },
        getExercicio(id){
            fetch(`http://localhost:8080/exercicio/${id}`).
            then(res =>res.json()).
            then(data => {
                this.exercicio = data;
                console.log(this.exercicio);
            })
            this.dialog = true;
        },
        updateExercicio(){
            fetch(`http://localhost:8080/exercicio`, {
                method: 'PUT',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(this.exercicio)
            })
            .then(data => {
                console.log(data);
                window.location.href = "/";
            })
        },
        clearExercicio(){
          this.dialog=false;
          this.exercicio = {
            nome: '',
            rep: 0,
            kg: 0
          };
        }
    }
}
</script>