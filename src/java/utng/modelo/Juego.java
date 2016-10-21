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
@Table(name = "juego")
public class Juego implements Serializable{
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  
  @Column(name = "id_juego")
    private Long idJuego;
    @Column(name = "nombre_juego", length = 10)
    private String nombreJuego;
    @Column(length = 15)
    private String costo;
    @Column(length = 15)
     private String descripcion;
   
    @ManyToOne
    @JoinColumn(name = "id_plataforma")
    private Plataforma plataforma;

    public Juego(Long idJuego, String nombreJuego, String costo, String descripcion, Plataforma plataforma) {
        this.idJuego = idJuego;
        this.nombreJuego = nombreJuego;
        this.costo = costo;
        this.descripcion = descripcion;
        this.plataforma = plataforma;
    }
    
     public Juego() {
        this.idJuego = 0L;
    }

    public Long getIdJuego() {
        return idJuego;
    }

    
    public void setIdJuego(Long idJuego) {
        this.idJuego = idJuego;
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
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
    
    
    
     
}//final
