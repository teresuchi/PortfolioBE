package com.YoProgramo.portfolio.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String apellido;  
    private String titulo;
    private String fecha;  
    private String lugar;
    private String direccion;
    private String nacionalidad;
    private String estadoCivil;
    private String cp;
    private String celular;
    private String mail;
    private String aniosDeTrabajo;
    private String cantidadDeProyectos;
    private String ubicacion;
    
    //Devuelve el nombre completo de la persona.
    public String getNombreCompleto(){
        String nombreCompleto;
        nombreCompleto =  nombre + " " + apellido;
        return nombreCompleto;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAniosDeTrabajo() {
        return aniosDeTrabajo;
    }

    public void setAniosDeTrabajo(String aniosDeTrabajo) {
        this.aniosDeTrabajo = aniosDeTrabajo;
    }

    public String getCantidadDeProyectos() {
        return cantidadDeProyectos;
    }

    public void setCantidadDeProyectos(String cantidadDeProyectos) {
        this.cantidadDeProyectos = cantidadDeProyectos;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}
