package com.springcode.examenes.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JwtResponse {
    /*
    Aqui se pasa el token de authentication
     */
    private String token;

    public JwtResponse(String token) {
        this.token = token;
    }
}
