/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.FrameworkDAO;
import utng.datos.LenguajeDAO;
import utng.datos.PlataformaDAO;
import utng.datos.ProyectoDAO;
import utng.modelo.Framework;
import utng.modelo.Lenguaje;
import utng.modelo.Plataforma;
import utng.modelo.Proyecto;

/**
 *
 * @author bernardo coronilla jaramillo
 */
@ManagedBean(name = "proyectoBean")@SessionScoped
public class ProyectoBean implements Serializable{
    private List<Proyecto> proyectos;
    private Proyecto proyecto;
    private List<Plataforma> plataformas;
    private List<Lenguaje> lenguajes;
    public ProyectoBean(){
        proyecto = new Proyecto();
        proyecto.setPlataforma(new Plataforma());
        proyecto.setLenguaje(new Lenguaje());
    } 

    public List<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(List<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public List<Plataforma> getPlataformas() {
        return plataformas;
    }

    public void setPlataformas(List<Plataforma> plataformas) {
        this.plataformas = plataformas;
    }

    public List<Lenguaje> getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(List<Lenguaje> lenguajes) {
        this.lenguajes = lenguajes;
    }

    
    
     public String listar(){
        ProyectoDAO dao = new ProyectoDAO();
        try{
            proyectos= dao.getAll();
        }catch(Exception e){ e.printStackTrace();}
        return "Proyectos";
        }
     public String eliminar(){
        ProyectoDAO dao = new ProyectoDAO();
        try{
            dao.delete(proyecto);
            proyectos = dao.getAll();
        }catch(Exception e){e.printStackTrace();}
        return "Eliminar";
        }
     public String iniciar(){
        
       proyecto = new Proyecto();
       proyecto.setPlataforma(new Plataforma());
       proyecto.setLenguaje(new Lenguaje());
       try{
           plataformas = new PlataformaDAO().getAll();
           lenguajes = new LenguajeDAO().getAll();
       }catch(Exception e){e.printStackTrace();}
       return "Iniciar";
       }
      public String guardar(){
        ProyectoDAO dao = new ProyectoDAO();
        try{ 
            if(proyecto.getIdProyecto()!=0){
                dao.update(proyecto);
        }else{ dao.insert(proyecto);}
           
        }catch(Exception e){e.printStackTrace();
        } 
        proyectos = dao.getAll();
        return "Guardar";
    }
      
    public String cancelar(){ return"Cancelar";}
    public String editar(Proyecto proyecto){
        this.proyecto = proyecto;
        try{
           plataformas= new PlataformaDAO().getAll();
           lenguajes = new LenguajeDAO().getAll();
        }catch (Exception e){e.printStackTrace();}
        return "Editar";
    }
}//final