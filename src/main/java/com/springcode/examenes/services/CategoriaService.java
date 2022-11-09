package com.springcode.examenes.services;

import com.springcode.examenes.entity.Categoria;

import java.util.Set;

public interface CategoriaService {

    Categoria agregarCategoria(Categoria categoria);
    Categoria actualizarCategoria(Categoria categoria);
    Set<Categoria> obtenerCategorias();
    Categoria obtenerCategoria(Long categoriaId);
    void eliminarCategoria(Long categoriaId);
}
