package com.example.Matemagicas.modelos;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Administrador")
@Data
public class Administrador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nombre;

    @Column
    private String apellido;

    @Column
    private String correoelectronico;

    @Column
    private String contrasenia;
}
