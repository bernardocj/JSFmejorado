/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * bernardo coronilla jaramillo
 */
@Entity @Table(name= "lenguaje")
public class Lenguaje implements Serializable{
    @Id
    @GeneratedValue(
            strategy =GenerationType.IDENTITY)
    
        @Column(name = "id_lenguaje")
    private Long idLenguaje;
    @Column(length = 30)
    private String nombre;
    @Column(length = 30)
    private String desarrollador;
    @Column(length = 30)
      private String serial;
    
     public Lenguaje(){
        this.idLenguaje= 0L;
    }

    public Long getIdLenguaje() {
        return idLenguaje;
    }

    public void setIdLenguaje(Long idLenguaje) {
        this.idLenguaje = idLenguaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

     
}//final
