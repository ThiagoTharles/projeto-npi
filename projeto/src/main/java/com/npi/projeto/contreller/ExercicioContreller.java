package com.npi.projeto.contreller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.npi.projeto.model.Exercicio;
import com.npi.projeto.service.ExercicioService;

@RestController
public class ExercicioContreller {
    @Autowired
    private ExercicioService exercicioService;

    @RequestMapping("/")
    public String hello_world(){
        return "Hello World";
    }

    @PostMapping("/add")
    public String addExercicio(@RequestBody Exercicio exercicio){
        exercicioService.addExercicio(exercicio);
        return "Exercicio adicionado";
    }

    @GetMapping("/exercicio/{id}")
    public Exercicio getExercicioById(@PathVariable ("id") long id){
        return exercicioService.getExercicioById(id);
    }

    @CrossOrigin(origins = "http://localhost:8080/exercicios")
    @GetMapping("/exercicios")
    public List<Exercicio> getExercicios(){
        return exercicioService.getExercicios();
    }

    @DeleteMapping("/exercicio/{id}")
    public String deletExercicio(@PathVariable ("id") long id){
        exercicioService.deleteExercicio(id);
        return "Exercicio deletado";
    }

    @PutMapping("/exercicio")
    public Exercicio updatExercicio(@RequestBody Exercicio exercicio){
        return exercicioService.updatExercicio(exercicio);
    }
}
