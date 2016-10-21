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
import utng.modelo.Lenguaje;

/**
 *
 * @author bernardo coronilla jaramillo
 */
@ManagedBean @SessionScoped
public class LenguajeBean implements Serializable {
    
    private List<Lenguaje> lenguajes;
    private Lenguaje lenguaje;

public LenguajeBean(){
}

    public List<Lenguaje> getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(List<Lenguaje> lenguajes) {
        this.lenguajes = lenguajes;
    }
    public Lenguaje getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(Lenguaje lenguaje) {
        this.lenguaje = lenguaje;
    }

     public String listar(){
        LenguajeDAO dao =new LenguajeDAO();
        try{
            lenguajes= dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Lenguajes";
    }
      public String eliminar(){
        LenguajeDAO dao = new LenguajeDAO();
        try{
            dao.delete(lenguaje);
           lenguajes = dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return  "Eliminar";
        
        }
      
       public String iniciar(){
        lenguaje = new Lenguaje();
        return "Iniciar";
           
    }
    public String guardar(){
        LenguajeDAO dao = new LenguajeDAO();
        try{
            if(lenguaje.getIdLenguaje()!=0){
                dao.update(lenguaje);
            }else{
                dao.insert(lenguaje);
            }
            lenguajes = dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Guardar";
    }
     public String cancelar(){
        return "Cancelar";
    }
    public String editar(Lenguaje lenguaje){
        this.lenguaje = lenguaje;
        return "Editar";
            }
}//final
