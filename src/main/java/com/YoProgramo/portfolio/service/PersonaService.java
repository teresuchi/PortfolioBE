package com.YoProgramo.portfolio.service;

import com.YoProgramo.portfolio.model.Persona;
import com.YoProgramo.portfolio.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    
    @Autowired
    private PersonaRepository persoRepository;
    
    /**
     * Guarda a la persona p en la BD.
     * @param p 
     */
    public void savePersona(Persona p){
        persoRepository.save(p);
    }
    
    /**
     * Devuelve la única persona que existe en la BD (el/la administrador/a del portal web).
     */
    public Persona getPersona(){
        Persona persona = persoRepository.findAll().get(0);
        return persona;
    }
    
    /**
     * Elimina la persona cuyo id se recibe por parámetro.
     */
    public void deletePersona(Long id){
        persoRepository.deleteById(id);
    }
    
}
