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
@Table(name = "framework")
public class Framework implements Serializable{
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  
  @Column(name = "id_framework")
    private Long idFramework;
    @Column(name = "nombre_framework", length = 10)
    private String nombreFramework;
    @Column(length = 15)
    private String version;
    @Column(length = 15)
     private String descripcion;
   
    @ManyToOne
    @JoinColumn(name = "id_lenguaje")
    private Lenguaje lenguaje;

    public Framework(Long idFramework, String nombreFramework, String version, String descripcion, Lenguaje lenguaje) {
        this.idFramework = idFramework;
        this.nombreFramework = nombreFramework;
        this.version = version;
        this.descripcion = descripcion;
        this.lenguaje = lenguaje;
    }
    
     public Framework() {
        this.idFramework = 0L;
    }

    public Long getIdRestaurante() {
        return idFramework;
    }

    public void setIdFramework(Long idFramework) {
        this.idFramework = idFramework;
    }

    public String getNombreFramework() {
        return nombreFramework;
    }

    public void setNombreFramework(String nombreFramework) {
        this.nombreFramework = nombreFramework;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Lenguaje getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(Lenguaje lenguaje) {
        this.lenguaje = lenguaje;
    }

    public Long getIdFramework() {
        return idFramework;
    }
    
     
}//final
