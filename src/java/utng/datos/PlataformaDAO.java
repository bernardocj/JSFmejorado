/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Plataforma;

/**
 *
 * @author bernardo coronilla jaramillo
 */
public class PlataformaDAO extends DAO<Plataforma>{
    public PlataformaDAO(){
        super(new Plataforma());
    }
     public Plataforma getOneById(Plataforma plataforma)
            throws HibernateException{
        return super.getOneById(plataforma.getIdPlataforma());
    }
}//final
