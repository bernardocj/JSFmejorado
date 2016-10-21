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
import utng.datos.PlataformaDAO;
import utng.modelo.Plataforma;

/**
 *
 * @author bernardo coronilla jaramillo
 */
@ManagedBean @SessionScoped
public class PlataformaBean implements Serializable {
    
    private List<Plataforma> plataformas;
    private Plataforma plataforma;

public PlataformaBean(){
}

    public List<Plataforma> getPlataformas() {
        return plataformas;
    }

    public void setPlataformas(List<Plataforma> plataformas) {
        this.plataformas = plataformas;
    }
    public Plataforma getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

     public String listar(){
        PlataformaDAO dao =new PlataformaDAO();
        try{
            plataformas= dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Plataformas";
    }
      public String eliminar(){
        PlataformaDAO dao = new PlataformaDAO();
        try{
            dao.delete(plataforma);
           plataformas = dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return  "Eliminar";
        
        }
      
       public String iniciar(){
        plataforma = new Plataforma();
        return "Iniciar";
           
    }
    public String guardar(){
        PlataformaDAO dao = new PlataformaDAO();
        try{
            if(plataforma.getIdPlataforma()!=0){
                dao.update(plataforma);
            }else{
                dao.insert(plataforma);
            }
            plataformas = dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Guardar";
    }
     public String cancelar(){
        return "Cancelar";
    }
    public String editar(Plataforma plataforma){
        this.plataforma = plataforma;
        return "Editar";
            }
}//final
