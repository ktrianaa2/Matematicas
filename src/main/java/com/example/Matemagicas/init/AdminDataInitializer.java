package com.example.Matemagicas.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.example.Matemagicas.modelos.Administrador;
import com.example.Matemagicas.repositorio.AdministradorRepository;

@Component
public class AdminDataInitializer implements CommandLineRunner {

    @Autowired
    private AdministradorRepository administradorRepository;

    @Override
    public void run(String... args) throws Exception {
        // Verificar si ya existe un administrador en la base de datos
        if (administradorRepository.count() == 0) {
            // Si no existe, crear y guardar un nuevo administrador
            Administrador administrador = new Administrador();
            administrador.setNombre("Mikaela");
            administrador.setApellido("Triana");
            administrador.setCorreoelectronico("mika@admin.com");
            administrador.setContrasenia("123");
            administradorRepository.save(administrador);
        }
    }
}
