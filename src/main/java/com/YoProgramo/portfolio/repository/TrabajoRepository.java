
package com.YoProgramo.portfolio.repository;

import com.YoProgramo.portfolio.model.Estudio;
import com.YoProgramo.portfolio.model.Trabajo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TrabajoRepository extends JpaRepository <Trabajo, Long>{
    
}