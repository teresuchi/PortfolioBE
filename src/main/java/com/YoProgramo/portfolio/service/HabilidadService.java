package com.YoProgramo.portfolio.service;

import com.YoProgramo.portfolio.model.Habilidad;
import com.YoProgramo.portfolio.repository.HabilidadRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadService {

    @Autowired
    private HabilidadRepository habRepository;
    
    /**
     * Guarda la Habilidad h en la BD.
     * @param h 
     */
    public void saveHabilidad(Habilidad h){
        habRepository.save(h);
    }
    
    /**
     * Devuelve todas las habilidades de Front End de la BD. 
     */
    public List<Habilidad> getHabilidadesFE(){
        List<Habilidad> habilidadesFE = new ArrayList();

        for(Habilidad habilidad:habRepository.findAll()){
            if("FE".equals(habilidad.getDisciplina())){
                habilidadesFE.add(habilidad);
            }
        }
        return habilidadesFE;
    }
    
    /**
     * Devuelve todas las habilidades de Back End de la BD. 
     */
    public List<Habilidad> getHabilidadesBE(){
        List<Habilidad> habilidadesBE = new ArrayList();

        for(Habilidad habilidad:habRepository.findAll()){
            if("BE".equals(habilidad.getDisciplina())){
                habilidadesBE.add(habilidad);
            }
        }
        return habilidadesBE;
    }
   
    
    /**
     * Elimina la habilidad cuyo id se recibe por parámetro.
     */
    public void deleteHabilidad(Long id){
        habRepository.deleteById(id);
    }
    
    
}
