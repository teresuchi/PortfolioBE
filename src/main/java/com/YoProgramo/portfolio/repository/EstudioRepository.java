
package com.YoProgramo.portfolio.repository;

import com.YoProgramo.portfolio.model.Estudio;
import com.YoProgramo.portfolio.model.Habilidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Repository
public interface EstudioRepository extends JpaRepository <Estudio, Long>{
    
}


