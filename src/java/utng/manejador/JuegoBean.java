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
import utng.datos.JuegoDAO;
import utng.modelo.Plataforma;
import utng.modelo.Juego;


/**
 *
 * @author bernardo coronilla jaramillo
 */
@ManagedBean(name = "juegoBean")@SessionScoped
public class JuegoBean implements Serializable{
    private List<Juego> juegos;
    private Juego juego;
    private List<Plataforma> plataformas;
    public JuegoBean(){
        juego = new Juego();
        juego.setPlataforma(new Plataforma());
    } 

    public List<Juego> getJuegos() {
        return juegos;
    }

    public void setJuegos(List<Juego> juegos) {
        this.juegos = juegos;
    }

    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }

    public List<Plataforma> getPlataformas() {
        return plataformas;
    }

    public void setPlataformas(List<Plataforma> plataformas) {
        this.plataformas = plataformas;
    }
    
     public String listar(){
        JuegoDAO dao = new JuegoDAO();
        try{
            juegos= dao.getAll();
        }catch(Exception e){ e.printStackTrace();}
        return "Juegos";
        }
     public String eliminar(){
        JuegoDAO dao = new JuegoDAO();
        try{
            dao.delete(juego);
            juegos = dao.getAll();
        }catch(Exception e){e.printStackTrace();}
        return "Eliminar";
        }
     public String iniciar(){
        
       juego = new Juego();
       juego.setPlataforma(new Plataforma());
       try{
           plataformas = new PlataformaDAO().getAll();
       }catch(Exception e){e.printStackTrace();}
       return "Iniciar";
       }
      public String guardar(){
        JuegoDAO dao = new JuegoDAO();
        try{ 
            if(juego.getIdJuego()!=0){
                dao.update(juego);
        }else{ dao.insert(juego);}
           
        }catch(Exception e){e.printStackTrace();
        } 
        juegos = dao.getAll();
        return "Guardar";
    }
      
    public String cancelar(){ return"Cancelar";}
    public String editar(Juego juego){
        this.juego = juego;
        try{
           plataformas = new PlataformaDAO().getAll();
        }catch (Exception e){e.printStackTrace();}
        return "Editar";
    }
}//final
