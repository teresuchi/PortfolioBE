package com.YoProgramo.portfolio.repository;

import com.YoProgramo.portfolio.model.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ContactoRepository extends JpaRepository <Contacto, Long>{
    
}