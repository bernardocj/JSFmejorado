/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Juego;

/**
 *
 * @author bernardo coronilla jaramillo
 */
public class JuegoDAO extends DAO<Juego>{
    public JuegoDAO(){
        super (new Juego());
    }
    
    public Juego getOneById(Juego juego)
            throws HibernateException{
        return super.getOneById(juego.getIdJuego());
    }
     
}//final
