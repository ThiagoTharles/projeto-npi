<template>
  <v-app>
    <v-main>
      <Navbar></Navbar>

      <ViewExercicios></ViewExercicios>

      <Footer></Footer>
    </v-main>
  </v-app>
</template>

<script>
import Navbar from "@/components/Navbar.vue";
import Footer from "@/components/Footer.vue";
import ViewExercicios from "@/views/ViewExercicios.vue";

  export default {  
    name: 'App',
    components: {
      Navbar,
      Footer,
      ViewExercicios
    }
  }
</script>
