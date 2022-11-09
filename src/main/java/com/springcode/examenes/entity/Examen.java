package com.springcode.examenes.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "examenes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Examen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long examenId;

    private String titulo;
    private String descripcion;
    private String puntosMaximos;
    private String numeroDePreguntas;
    private boolean activo = false;

    /*
    Muchos examenes pueden pertenecer a una categoria
    Fetc traera todas los examenes de esa categoria
     */
    @ManyToOne(fetch = FetchType.EAGER)
    private Categoria categoria;

    /*
    Un examen a muchas preguntas y el fetch sera tipo perezoso
    hasta que nosotros le indiquemos y si al eliminar un examen
    se eliminaran las preguntas de ese examen
     */
    @OneToMany(mappedBy = "examen",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Pregunta> preguntas = new HashSet<>();
}
