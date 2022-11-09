package com.springcode.examenes.exceptions;

public class UsuarioNotFoundException extends Exception{

    public UsuarioNotFoundException(){
        super("El usuario con ese username ya existe en la base de datos , vuelva a intentar!!");
    }

    public UsuarioNotFoundException(String message){
        super(message);
    }
}
