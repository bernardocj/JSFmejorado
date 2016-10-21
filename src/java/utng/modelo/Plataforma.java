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
 *
 * @author bernardo coronilla jaramillo 
 */
@Entity @Table(name= "plataforma")
public class Plataforma implements Serializable{
    @Id
    @GeneratedValue(
            strategy =GenerationType.IDENTITY)
    
        @Column(name = "id_plataforma")
    private Long idPlataforma;
    @Column(length = 30)
    private String nombre;
    @Column(length = 30)
    private String desarrollador;
    @Column(length = 30)
      private String descripcion;
    
     public Plataforma(){
        this.idPlataforma= 0L;
    }

    public Long getIdPlataforma() {
        return idPlataforma;
    }

    public void setIdPlataforma(Long idPlataforma) {
        this.idPlataforma = idPlataforma;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
     
     
}//final
