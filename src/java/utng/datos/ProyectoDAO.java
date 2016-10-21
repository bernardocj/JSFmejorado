/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Proyecto;

/**
 *
 * @author bernardo coronilla jaramillo
 */
public class ProyectoDAO extends DAO<Proyecto>{
    public ProyectoDAO(){
        super (new Proyecto());
    }
    
    public Proyecto getOneById(Proyecto proyecto)
            throws HibernateException{
        return super.getOneById(proyecto.getIdProyecto());
    }
     
}//final