package com.springcode.examenes.services;

import com.springcode.examenes.entity.Examen;
import com.springcode.examenes.entity.Pregunta;

import java.util.Set;

public interface PreguntaService {

    Pregunta agregarPregunta(Pregunta pregunta);
    Pregunta actualizarPregunta(Pregunta pregunta);
    Set<Pregunta> obtenerPreguntas();
    Pregunta obtenerPregunta(Long preguntaId);
    Set<Pregunta> obtenerPreguntasDelExamen(Examen examen);
    void eliminarPregunta(Long preguntaId);
}
