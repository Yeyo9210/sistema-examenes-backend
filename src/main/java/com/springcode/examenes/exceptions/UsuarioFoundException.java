package com.springcode.examenes.exceptions;

public class UsuarioFoundException extends Exception {

    public UsuarioFoundException(){
        super("El usuario con ese username ya existe en la base de datos , vuelva a intentar!!");
    }

    public UsuarioFoundException(String message){
        super(message);
    }
}
