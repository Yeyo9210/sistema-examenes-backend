package com.springcode.examenes;

import com.springcode.examenes.entity.Rol;
import com.springcode.examenes.entity.Usuario;
import com.springcode.examenes.entity.UsuarioRol;
import com.springcode.examenes.exceptions.UsuarioFoundException;
import com.springcode.examenes.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SistemaExamenesBackendApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SistemaExamenesBackendApplication.class, args);
    }

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void run(String... args) throws Exception {
        /*try {
            Usuario usuario = new Usuario();

            usuario.setNombre("Jheyson");
            usuario.setApellido("Garcia");
            usuario.setUsername("yeyo");
            usuario.setPassword(bCryptPasswordEncoder.encode("12345"));
            usuario.setEmail("jhey@gmail.com");
            usuario.setTelefono("5565156261");
            usuario.setPerfil("foto.png");

            Rol rol = new Rol();
            rol.setRolId(1L);
            rol.setRolNombre("ADMIN");

            Set<UsuarioRol> usuarioRoles = new HashSet<>();
            UsuarioRol usuarioRol = new UsuarioRol();
            usuarioRol.setRol(rol);
            usuarioRol.setUsuario(usuario);
            usuarioRoles.add(usuarioRol);

            Usuario usuariogGuardado = usuarioService.guardarUsuario(usuario, usuarioRoles);
            System.out.println(usuariogGuardado.getUsername());
        }catch (UsuarioFoundException exception){
            exception.printStackTrace();
        }*/
    }
}
