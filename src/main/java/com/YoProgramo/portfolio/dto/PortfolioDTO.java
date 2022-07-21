package com.YoProgramo.portfolio.dto;

import java.util.ArrayList;

public class PortfolioDTO {
    PersonaDTO personaDTO;
    ServicioDTO servicio_1;
    ServicioDTO servicio_2;
    ServicioDTO servicio_3;
    TrabajoDTO trabajo_1;
    TrabajoDTO trabajo_2;
    TrabajoDTO trabajo_3;
    ArrayList<HabilidadDTO> frontend;
    ArrayList<HabilidadDTO> backend;
    ArrayList<EstudioDTO> educacion;
   

    public ArrayList<EstudioDTO> getEducacion() {
        return educacion;
    }

    public void setEducacion(ArrayList<EstudioDTO> educacion) {
        this.educacion = educacion;
    }
    
    public ArrayList<HabilidadDTO> getBackend() {
        return backend;
    }

    public void setBackend(ArrayList<HabilidadDTO> backend) {
        this.backend = backend;
    }
    
    public TrabajoDTO getTrabajo_1() {
        return trabajo_1;
    }

    public void setTrabajo_1(TrabajoDTO trabajo_1) {
        this.trabajo_1 = trabajo_1;
    }

    public TrabajoDTO getTrabajo_2() {
        return trabajo_2;
    }

    public void setTrabajo_2(TrabajoDTO trabajo_2) {
        this.trabajo_2 = trabajo_2;
    }

    public TrabajoDTO getTrabajo_3() {
        return trabajo_3;
    }

    public void setTrabajo_3(TrabajoDTO trabajo_3) {
        this.trabajo_3 = trabajo_3;
    }

    public ServicioDTO getServicio_2() {
        return servicio_2;
    }

    public void setServicio_2(ServicioDTO servicio_2) {
        this.servicio_2 = servicio_2;
    }

    public ServicioDTO getServicio_3() {
        return servicio_3;
    }

    public void setServicio_3(ServicioDTO servicio_3) {
        this.servicio_3 = servicio_3;
    }

    public ServicioDTO getServicio_1() {
        return servicio_1;
    }

    public void setServicio_1(ServicioDTO servicio_1) {
        this.servicio_1 = servicio_1;
    }
    
    public ArrayList<HabilidadDTO> getFrontend() {
        return frontend;
    }

    public void setFrontend(ArrayList<HabilidadDTO> frontend) {
        this.frontend = frontend;
    }

    public PersonaDTO getPersonaDTO() {
        return personaDTO;
    }

    public void setPersonaDTO(PersonaDTO personaDTO) {
        this.personaDTO = personaDTO;
    }
    
    
}
