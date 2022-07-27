package com.YoProgramo.portfolio.controller;

import com.YoProgramo.portfolio.dto.LoginDTO;
import com.YoProgramo.portfolio.dto.ServicioDTO;
import com.YoProgramo.portfolio.dto.PersonaDTO;
import com.YoProgramo.portfolio.dto.EstudioDTO;
import com.YoProgramo.portfolio.dto.TrabajoDTO;
import com.YoProgramo.portfolio.dto.HabilidadDTO;
import com.YoProgramo.portfolio.dto.PortfolioDTO;
import com.YoProgramo.portfolio.dto.ContactoDTO;
import com.YoProgramo.portfolio.service.TrabajoService;
import com.YoProgramo.portfolio.model.Contacto;
import com.YoProgramo.portfolio.model.Estudio;
import com.YoProgramo.portfolio.model.Habilidad;
import com.YoProgramo.portfolio.model.Persona;
import com.YoProgramo.portfolio.model.Servicio;
import com.YoProgramo.portfolio.model.Trabajo;
import com.YoProgramo.portfolio.service.ContactoService;
import com.YoProgramo.portfolio.service.EstudioService;
import com.YoProgramo.portfolio.service.HabilidadService;
import com.YoProgramo.portfolio.service.PersonaService;
import com.YoProgramo.portfolio.service.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://portfoliofe-9bccb.web.app/")
@RestController
public class MyController {
    
    @Autowired
    private PersonaService personaServ;
    
    @Autowired
    private HabilidadService habilidadServ;
    
    @Autowired
    private EstudioService estudioServ;
    
    @Autowired
    private TrabajoService trabajoServ;
    
    @Autowired
    private ServicioService servicioServ;
       
    @Autowired
    private ContactoService contactoServ;
    
    
     /**
     * Salva un contacto 
     */
    @PostMapping ("/contacto/salvar")
    public String crearContacto(@RequestBody ContactoDTO instanciaContactoDTO){

         Contacto nuevoContacto = new Contacto();
         nuevoContacto.setNombre(instanciaContactoDTO.getNombre());
         nuevoContacto.setEmail(instanciaContactoDTO.getEmail());
         nuevoContacto.setAsunto(instanciaContactoDTO.getAsunto());
         nuevoContacto.setMensaje(instanciaContactoDTO.getMensaje());

         contactoServ.saveContacto(nuevoContacto);
         
         return "El contacto se salvó correctamente";
    }
    
   
  
     /**
     * Salva una persona 
     */
    @PutMapping ("/persona/salvar")
    public String modificarPersona(@RequestBody PersonaDTO instanciaPersonaDTO){

         Persona nuevaPersona = new Persona();
         nuevaPersona.setId(instanciaPersonaDTO.getId());
         nuevaPersona.setTitulo(instanciaPersonaDTO.getTitulo());
         nuevaPersona.setNombre(instanciaPersonaDTO.getNombre());
         nuevaPersona.setApellido(instanciaPersonaDTO.getApellido());
         nuevaPersona.setFecha(instanciaPersonaDTO.getFechaDeNacimiento());
         nuevaPersona.setLugar(instanciaPersonaDTO.getLugar());
         nuevaPersona.setDireccion(instanciaPersonaDTO.getDireccion());
         nuevaPersona.setNacionalidad(instanciaPersonaDTO.getNacionalidad());
         nuevaPersona.setEstadoCivil(instanciaPersonaDTO.getEstadoCivil());
         nuevaPersona.setCp(instanciaPersonaDTO.getCp());
         nuevaPersona.setCelular(instanciaPersonaDTO.getCelular());
         nuevaPersona.setMail(instanciaPersonaDTO.getMail());
         nuevaPersona.setAniosDeTrabajo(instanciaPersonaDTO.getAniosDeTrabajo());
         nuevaPersona.setCantidadDeProyectos(instanciaPersonaDTO.getCantidadDeProyectos());
         nuevaPersona.setUbicacion(instanciaPersonaDTO.getUbicacion());
         
         personaServ.savePersona(nuevaPersona);
         
         return "La Persona se salvó correctamente";
    }
   
    
    /**
     * Salva una Habilidad nueva (si no se especifica id) o pre-existente
     * (si se especifica el id)
     */
    @PutMapping ("/habilidad/salvar")
    public String modificarHabilidad(@RequestBody HabilidadDTO instanciaHabilidadDTO){

         Habilidad nuevaHabilidad = new Habilidad();
         nuevaHabilidad.setId(instanciaHabilidadDTO.getId());
         nuevaHabilidad.setTitulo(instanciaHabilidadDTO.getTitulo());
         nuevaHabilidad.setPorcentaje(instanciaHabilidadDTO.getPorcentaje());
         nuevaHabilidad.setDisciplina(instanciaHabilidadDTO.getDisciplina());

         habilidadServ.saveHabilidad(nuevaHabilidad);
         
         return "La habilidad se salvó correctamente";
    }
    
    @DeleteMapping("/habilidad/borrar/{id}")
    public String deleteHabilidad(@PathVariable Long id){
        
        habilidadServ.deleteHabilidad(id);
        return "La habilidad se eliminó correctamente";
    }
    
       
    @PutMapping ("/estudio/salvar")
    public String salvarEstudio(@RequestBody EstudioDTO instanciaEstudioDTO){

         Estudio nuevoEstudio = new Estudio();
         nuevoEstudio.setId(instanciaEstudioDTO.getId());
         nuevoEstudio.setAnio(instanciaEstudioDTO.getAnio());
         nuevoEstudio.setTitulo(instanciaEstudioDTO.getTitulo());
         nuevoEstudio.setInstitucion(instanciaEstudioDTO.getInstitucion());

         estudioServ.saveEstudio(nuevoEstudio);
         
         return "El estudio se salvó correctamente";
    }
    
    @DeleteMapping("/estudio/borrar/{id}")
    public String deleteEstudio(@PathVariable Long id){
        
        estudioServ.deleteEstudio(id);
        return "El estudio se eliminó correctamente";
    }
    

     @PutMapping ("/trabajo/salvar")
    public String modificarTrabajo(@RequestBody TrabajoDTO instanciaTrabajoDTO){

         Trabajo nuevoTrabajo = new Trabajo();
         nuevoTrabajo.setId(instanciaTrabajoDTO.getId());
         nuevoTrabajo.setTitulo(instanciaTrabajoDTO.getTitulo());
        
         trabajoServ.saveTrabajo(nuevoTrabajo);
         
         return "El trabajo se salvó correctamente";
    }
  
    
    @PutMapping ("/servicio/salvar")
    public String modificarServicio(@RequestBody ServicioDTO instanciaServicioDTO){

         Servicio nuevoServicio = new Servicio();
         nuevoServicio.setId(instanciaServicioDTO.getId());
         nuevoServicio.setTitulo(instanciaServicioDTO.getTitulo());
         nuevoServicio.setDescripcion(instanciaServicioDTO.getDescripcion());

         servicioServ.saveServicio(nuevoServicio);
         
         return "El servivio se salvó correctamente";
    }
    
    
     /**
     * Salva un contacto 
     */
    @PostMapping ("/login")
    public String loguearUsuario(@RequestBody LoginDTO instanciaLoginDTO){

         String usr = instanciaLoginDTO.getUsuario();
         String pass = instanciaLoginDTO.getPassword();
         System.out.println("USR: " + usr + " PASS: " + pass);
         return "USR: " + usr + " PASS: " + pass;
    }
       
    
    @GetMapping ("/portfolio")
    @ResponseBody
    public PortfolioDTO obtenerPortfolio(){
                
       //**** DTO para Persona ****/
       //Obtengo la unica persona que existe en la capa del modelo.
       Persona persona = personaServ.getPersona();
       
       //Creo el DTO
       PersonaDTO personaDTO = new PersonaDTO();
       //Cargo al DTO con los datos de la Persona del modelo.
       personaDTO.setId(persona.getId());
       personaDTO.setNombre(persona.getNombre());
       personaDTO.setApellido_y_nombre(persona.getNombreCompleto());
       personaDTO.setTitulo(persona.getTitulo());
       personaDTO.setApellido(persona.getApellido());
       personaDTO.setFechaDeNacimiento(persona.getFecha());
       personaDTO.setLugar(persona.getLugar());
       personaDTO.setDireccion(persona.getDireccion());
       personaDTO.setNacionalidad(persona.getNacionalidad());
       personaDTO.setEstadoCivil(persona.getEstadoCivil());
       personaDTO.setCp(persona.getCp());
       personaDTO.setCelular(persona.getCelular());
       personaDTO.setMail(persona.getMail());
       personaDTO.setAniosDeTrabajo(persona.getAniosDeTrabajo());
       personaDTO.setCantidadDeProyectos(persona.getCantidadDeProyectos());
       personaDTO.setUbicacion(persona.getUbicacion());
       
       
       /**** DTOs para Servicios ****/
       //Obtengo la lista de objetos Servicio de la capa del modelo.
       List<Servicio> listaDeServicio = servicioServ.getServicios();
       
       //**Primer Servicio**
       //Obtengo el primer servicio de la lista.
       Servicio servicio1 = listaDeServicio.get(0);
       //Creo el DTO
       ServicioDTO servicio_1DTO = new ServicioDTO();
       //Cargo al DTO con los datos del sericio del modelo.
       servicio_1DTO.setTitulo(servicio1.getTitulo());
       servicio_1DTO.setDescripcion(servicio1.getDescripcion());
       servicio_1DTO.setId(servicio1.getId());
       
       //**Segundo Servicio**
       //Obtengo el segundo servicio de la lista.
       Servicio servicio2 = listaDeServicio.get(1);
       //Creo el DTO
       ServicioDTO servicio_2DTO = new ServicioDTO();
       //Cargo al DTO con los datos del sericio del modelo.
       servicio_2DTO.setTitulo(servicio2.getTitulo());
       servicio_2DTO.setDescripcion(servicio2.getDescripcion());
       servicio_2DTO.setId(servicio2.getId());
       
        //**Tercer Servicio**
       //Obtengo el tercer servicio de la lista.
       Servicio servicio3 = listaDeServicio.get(2);
       //Creo el DTO        
       ServicioDTO servicio_3DTO = new ServicioDTO();
       servicio_3DTO.setTitulo(servicio3.getTitulo());
       servicio_3DTO.setDescripcion(servicio3.getDescripcion());
       servicio_3DTO.setId(servicio3.getId());

       /**** DTOs para Trabajos ****/
       //Obtengo la lista de objetos Trabajos de la capa del modelo.
       List<Trabajo> listaDeTrabajo = trabajoServ.getTrabajos();
       
       //**Primer Trabajo**
       //Obtengo el primer trabajo de la lista.
       Trabajo trabajo1 = listaDeTrabajo.get(0);
       //Creo el DTO
       TrabajoDTO trabajo_1DTO = new TrabajoDTO();
       //Cargo al DTO con los datos del sericio del modelo.
       trabajo_1DTO.setTitulo(trabajo1.getTitulo());
       trabajo_1DTO.setId(trabajo1.getId());
       
       //**Segundo Trabajo**
       Trabajo trabajo2 = listaDeTrabajo.get(1);
       TrabajoDTO trabajo_2DTO = new TrabajoDTO();
       trabajo_2DTO.setTitulo(trabajo2.getTitulo());
       trabajo_2DTO.setId(trabajo2.getId());
       
       //**Tercer Trabajo**
       Trabajo trabajo3 = listaDeTrabajo.get(2);
       TrabajoDTO trabajo_3DTO = new TrabajoDTO();
       trabajo_3DTO.setTitulo(trabajo3.getTitulo());
       trabajo_3DTO.setId(trabajo3.getId());
   
      
       /**** Habilidades para la lista de Frontend ****/
       
       //Creo la lista de DTOs vacía.
       ArrayList<HabilidadDTO> listaDeFrontEnd = new ArrayList<HabilidadDTO>();
       //Obtengo la lista con los objetos Habilidad de la Capa del Modelo.       
       List<Habilidad> habilidadesFrontEnd = habilidadServ.getHabilidadesFE();
       //Itero los objetos del modelo para llenar la lista de DTOs.
       for (Habilidad habilidad:habilidadesFrontEnd){
           //Creo el DTO.
           HabilidadDTO habilidadDTO = new HabilidadDTO();
           //Cargo el DTO con los datos traìdos de la Capa del Modelo.
           habilidadDTO.setTitulo(habilidad.getTitulo());
           habilidadDTO.setPorcentaje(habilidad.getPorcentaje());
           habilidadDTO.setId(habilidad.getId());
           habilidadDTO.setDisciplina(habilidad.getDisciplina());
           //Agrego el DTO a la lista de DTOs.
           listaDeFrontEnd.add(habilidadDTO);
       }
       
              
       /**** Habilidades para la lista de Backend ****/
       
       //Creo la lista de DTOs vacía.
       ArrayList<HabilidadDTO> listaDeBackEnd = new ArrayList<HabilidadDTO>();
       //Obtengo la lista con los objetos Habilidad de la Capa del Modelo.       
       List<Habilidad> habilidadesBackEnd = habilidadServ.getHabilidadesBE();
       //Itero los objetos del modelo para llenar la lista de DTOs.
       for (Habilidad habilidad:habilidadesBackEnd){
           //Creo el DTO.
           HabilidadDTO habilidadDTO = new HabilidadDTO();
           //Cargo el DTO con los datos traìdos de la Capa del Modelo.
           habilidadDTO.setTitulo(habilidad.getTitulo());
           habilidadDTO.setPorcentaje(habilidad.getPorcentaje());
           habilidadDTO.setId(habilidad.getId());
           habilidadDTO.setDisciplina(habilidad.getDisciplina());
           //Agrego el DTO a la lista de DTOs.
           listaDeBackEnd.add(habilidadDTO);
       }
       
       
       /**** DTOs para educación  ****/ 
       
       ArrayList<EstudioDTO> listaDeEducacion = new ArrayList<EstudioDTO>();     
       List<Estudio> Estudio = estudioServ.getEstudios();
       for (Estudio estudio:Estudio){
           EstudioDTO estudioDTO = new EstudioDTO();
           estudioDTO.setId(estudio.getId());
           estudioDTO.setAnio(estudio.getAnio());
           estudioDTO.setInstitucion(estudio.getInstitucion());
           estudioDTO.setTitulo(estudio.getTitulo());
           listaDeEducacion.add(estudioDTO);
       }
       
       /**** Creo y armo la instancia de PortfolioDTO a devolver. ****/
       
       PortfolioDTO miPortfolioDTO = new PortfolioDTO();
       miPortfolioDTO.setPersonaDTO(personaDTO);
       miPortfolioDTO.setServicio_1(servicio_1DTO);
       miPortfolioDTO.setServicio_2(servicio_2DTO);
       miPortfolioDTO.setServicio_3(servicio_3DTO);
       miPortfolioDTO.setTrabajo_1(trabajo_1DTO); 
       miPortfolioDTO.setTrabajo_2(trabajo_2DTO);
       miPortfolioDTO.setTrabajo_3(trabajo_3DTO);
       miPortfolioDTO.setFrontend(listaDeFrontEnd);
       miPortfolioDTO.setBackend(listaDeBackEnd);
       miPortfolioDTO.setEducacion(listaDeEducacion);
       
       
       // Devuelvo el DTO (que serà convertido automàticamente en un JSON)
       return miPortfolioDTO;
    }

    @GetMapping ("/prueba")
    @ResponseBody
    public String pruebaServicio(){
        return "Respuesta de servicio exitosa.";
    }
    
}
