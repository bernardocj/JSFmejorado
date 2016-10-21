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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author bernardo coronilla jaramillo
 */
@Entity
@Table(name = "proyecto")
public class Proyecto implements Serializable{
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  
  @Column(name = "id_proyecto")
    private Long idProyecto;
    @Column(name = "nombre_proyecto", length = 10)
    private String nombreProyecto;
       @Column(length = 15)
     private String descripcion;
   @ManyToOne
    @JoinColumn(name = "id_plataforma")
    private Plataforma plataforma;
    @ManyToOne
    @JoinColumn(name = "id_lenguaje")
    private Lenguaje lenguaje;

    public Proyecto(Long idProyecto, String nombreProyecto, String descripcion,Plataforma plataforma, Lenguaje lenguaje) {
        this.idProyecto = idProyecto;
        this.nombreProyecto = nombreProyecto;
        this.descripcion = descripcion;
        this.plataforma=plataforma;
        this.lenguaje = lenguaje;
    }
    
     public Proyecto() {
        this.idProyecto = 0L;
    }

    public Long getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Long idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Plataforma getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    public Lenguaje getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(Lenguaje lenguaje) {
        this.lenguaje = lenguaje;
    }

    
    
     
}//final

