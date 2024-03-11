package com.npi.projeto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npi.projeto.model.Exercicio;
import com.npi.projeto.repository.ExercicioRepository;

@Service
public class ExercicioServiceImpl implements ExercicioService{
    @Autowired
    private ExercicioRepository exercicioRepository;

    @SuppressWarnings("null")
    @Override
    public Exercicio addExercicio(Exercicio exercicio) {
        return exercicioRepository.save(exercicio);
    }

    @Override
    public Exercicio getExercicioById(long id) {
        return exercicioRepository.findById(id).get();
    }

    @Override
    public List<Exercicio> getExercicios() {
        return (List<Exercicio>) exercicioRepository.findAll();
    }

    @Override
    public void deleteExercicio(long id) {
        exercicioRepository.deleteById(id);
    }

    @SuppressWarnings("null")
    @Override
    public Exercicio updatExercicio(Exercicio exercicio) {
        return exercicioRepository.save(exercicio);
    }

}
