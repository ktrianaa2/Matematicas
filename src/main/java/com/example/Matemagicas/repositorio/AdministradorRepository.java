package com.example.Matemagicas.repositorio;
import com.example.Matemagicas.modelos.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministradorRepository extends JpaRepository<Administrador, Long> {
        Administrador findByCorreoelectronico(String correoelectronico);
}

