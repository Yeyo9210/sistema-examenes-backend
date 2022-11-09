package com.springcode.examenes.repositories;

import com.springcode.examenes.entity.Examen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamenRepository extends JpaRepository<Examen,Long> {
}
