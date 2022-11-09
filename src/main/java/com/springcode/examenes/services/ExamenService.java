package com.springcode.examenes.services;

import com.springcode.examenes.entity.Examen;

import java.util.Set;

public interface ExamenService {

    Examen agregarExamen(Examen examen);
    Examen actualizaExamen(Examen examen);
    Set<Examen> obtenerExamenes();
    Examen obtenerExamen(Long examenId);
    void eliminarExamen(Long examenId);
}
