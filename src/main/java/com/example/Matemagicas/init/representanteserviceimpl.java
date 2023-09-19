package com.example.Matemagicas.init;
import com.example.Matemagicas.modelos.Representate;
import com.example.Matemagicas.repositorio.RepresentateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class representanteserviceimpl implements representanteservice{
    private final RepresentateRepository representateRepository; 

    @Autowired
    public representanteserviceimpl(RepresentateRepository representateRepository) {
        this.representateRepository = representateRepository;
    }

    @Override
    public List<Representate> findAll() {
        return representateRepository.findAll(); 
    }
}

