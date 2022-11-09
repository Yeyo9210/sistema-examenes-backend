package com.springcode.examenes.repositories;

import com.springcode.examenes.entity.Examen;
import com.springcode.examenes.entity.Pregunta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface PreguntaRepository extends JpaRepository<Pregunta,Long> {

    Set<Pregunta> findByExamen(Examen examen);
}
