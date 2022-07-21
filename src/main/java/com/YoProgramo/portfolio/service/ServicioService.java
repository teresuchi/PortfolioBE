
package com.YoProgramo.portfolio.service;


import com.YoProgramo.portfolio.model.Servicio;
import com.YoProgramo.portfolio.repository.ServicioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServicioService {

    @Autowired
    private ServicioRepository serRepository;
    
    public void saveServicio(Servicio h){
        serRepository.save(h);
    }
     public List<Servicio> getServicios(){
        return serRepository.findAll();
    }
}