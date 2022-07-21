package com.YoProgramo.portfolio.service;

import com.YoProgramo.portfolio.model.Contacto;
import com.YoProgramo.portfolio.model.Persona;
import com.YoProgramo.portfolio.repository.ContactoRepository;
import com.YoProgramo.portfolio.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactoService {
    
    @Autowired
    private ContactoRepository contRepository;
    
    /**
     * Guarda al contacto c en la BD.
     * @param c 
     */
    public void saveContacto(Contacto c){
        contRepository.save(c);
    }
}





    
    