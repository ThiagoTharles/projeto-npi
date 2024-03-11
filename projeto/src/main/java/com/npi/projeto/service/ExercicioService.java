package com.npi.projeto.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.npi.projeto.model.Exercicio;

@Service
public interface ExercicioService {
    public Exercicio addExercicio(Exercicio exercicio);

    public Exercicio getExercicioById(long id);

    public List<Exercicio> getExercicios();

    public void deleteExercicio(long id);

    public Exercicio updatExercicio (Exercicio exercicio);
}
