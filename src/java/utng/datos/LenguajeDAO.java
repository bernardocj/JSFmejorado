/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Lenguaje;

/**
 *
 * @author bernardo coronilla jaramillo
 */
public class LenguajeDAO extends DAO<Lenguaje>{
    public LenguajeDAO(){
        super(new Lenguaje());
    }
     public Lenguaje getOneById(Lenguaje lenguaje)
            throws HibernateException{
        return super.getOneById(lenguaje.getIdLenguaje());
    }
}//final
