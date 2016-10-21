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
import utng.datos.LenguajeDAO;
import utng.datos.FrameworkDAO;
import utng.modelo.Lenguaje;
import utng.modelo.Framework;


/**
 *
 * @author bernardo coronilla jaramillo
 */
@ManagedBean(name = "frameworkBean")@SessionScoped
public class FrameworkBean implements Serializable{
    private List<Framework> frameworks;
    private Framework framework;
    private List<Lenguaje> lenguajes;
    public FrameworkBean(){
        framework = new Framework();
        framework.setLenguaje(new Lenguaje());
    } 

    public List<Framework> getFrameworks() {
        return frameworks;
    }

    public void setFrameworks(List<Framework> frameworks) {
        this.frameworks = frameworks;
    }

    public Framework getFramework() {
        return framework;
    }

    public void setRestaurante(Framework framework) {
        this.framework = framework;
    }

    public List<Lenguaje> getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(List<Lenguaje> lenguajes) {
        this.lenguajes = lenguajes;
    }
    
     public String listar(){
        FrameworkDAO dao = new FrameworkDAO();
        try{
            frameworks= dao.getAll();
        }catch(Exception e){ e.printStackTrace();}
        return "Frameworks";
        }
     public String eliminar(){
        FrameworkDAO dao = new FrameworkDAO();
        try{
            dao.delete(framework);
            frameworks = dao.getAll();
        }catch(Exception e){e.printStackTrace();}
        return "Eliminar";
        }
     public String iniciar(){
        
       framework = new Framework();
       framework.setLenguaje(new Lenguaje());
       try{
           lenguajes = new LenguajeDAO().getAll();
       }catch(Exception e){e.printStackTrace();}
       return "Iniciar";
       }
      public String guardar(){
        FrameworkDAO dao = new FrameworkDAO();
        try{ 
            if(framework.getIdFramework()!=0){
                dao.update(framework);
        }else{ dao.insert(framework);}
           
        }catch(Exception e){e.printStackTrace();
        } 
        frameworks = dao.getAll();
        return "Guardar";
    }
      
    public String cancelar(){ return"Cancelar";}
    public String editar(Framework framework){
        this.framework = framework;
        try{
           lenguajes = new LenguajeDAO().getAll();
        }catch (Exception e){e.printStackTrace();}
        return "Editar";
    }
}//final
