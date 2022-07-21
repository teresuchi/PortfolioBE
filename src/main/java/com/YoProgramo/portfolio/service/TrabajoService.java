package com.YoProgramo.portfolio.service;


import com.YoProgramo.portfolio.model.Trabajo;
import com.YoProgramo.portfolio.repository.TrabajoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TrabajoService {

    @Autowired
    private TrabajoRepository traRepository;
    
    public void saveTrabajo(Trabajo h){
        traRepository.save(h);
    }
     public List<Trabajo> getTrabajos(){
        return traRepository.findAll();
    }
}