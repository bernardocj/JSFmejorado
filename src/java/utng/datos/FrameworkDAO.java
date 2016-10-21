/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Framework;

/**
 *
 * @author bernardo coronilla jaramillo
 */
public class FrameworkDAO extends DAO<Framework>{
    public FrameworkDAO(){
        super (new Framework());
    }
    
    public Framework getOneById(Framework framework)
            throws HibernateException{
        return super.getOneById(framework.getIdFramework());
    }
     
}//final
