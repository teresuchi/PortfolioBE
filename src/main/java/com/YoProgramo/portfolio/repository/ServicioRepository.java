
package com.YoProgramo.portfolio.repository;

import com.YoProgramo.portfolio.model.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ServicioRepository extends JpaRepository <Servicio, Long>{
    
}