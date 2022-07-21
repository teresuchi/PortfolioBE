package com.YoProgramo.portfolio.dto;

public class PersonaDTO {
    
    private Long id;
    String apellido_y_nombre;
    String titulo;
    String nombre;
    String apellido;
    String fechaDeNacimiento;
    String lugar;
    String direccion;
    String nacionalidad;
    String estadoCivil;
    String cp;
    String celular;
    String mail;
    String aniosDeTrabajo;
    String cantidadDeProyectos;
    String ubicacion;

    public Long getId() {
        return id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    public String getApellido_y_nombre() {
        return apellido_y_nombre;
    }

    public void setApellido_y_nombre(String apellido_y_nombre) {
        this.apellido_y_nombre = apellido_y_nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
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

}