
package com.YoProgramo.portfolio.service;

import com.YoProgramo.portfolio.model.Estudio;
import com.YoProgramo.portfolio.model.Habilidad;
import com.YoProgramo.portfolio.repository.EstudioRepository;
import com.YoProgramo.portfolio.repository.HabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EstudioService {

    @Autowired
    private EstudioRepository estRepository;
    
    public void saveEstudio(Estudio e){
        estRepository.save(e);
    }
    
    public List<Estudio> getEstudios(){
        return estRepository.findAll();
    }
    
    /**
     * Elimina el estudio cuyo id se recibe por parámetro.
     */
    public void deleteEstudio(Long id){
        estRepository.deleteById(id);
    }
    
}
