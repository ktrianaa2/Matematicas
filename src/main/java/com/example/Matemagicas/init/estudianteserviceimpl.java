package com.example.Matemagicas.init;
import com.example.Matemagicas.modelos.Estudiante;
import com.example.Matemagicas.repositorio.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class estudianteserviceimpl implements estudianteservice{
    private final EstudianteRepository estudianteRepository; 

    @Autowired
    public estudianteserviceimpl(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    @Override
    public List<Estudiante> findAll() {
        return estudianteRepository.findAll(); 
    }
}

