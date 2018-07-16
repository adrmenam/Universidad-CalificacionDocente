/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.dao;

import ec.edu.espe.model.EvaPregunta;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author jolube
 */
@Stateless
public class EvaPreguntaFacade extends AbstractFacade<EvaPregunta> {

    @PersistenceContext(unitName = "ec.edu.espe_evaluacion_docente-ejb_ejb_1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EvaPreguntaFacade() {
        super(EvaPregunta.class);
    }
    
    public List<EvaPregunta> getPreguntaPorCuestionario(String codCuestionario) {
 
        Query q = this.em.createQuery("SELECT obj FROM EvaPregunta obj WHERE obj.codCuestionario = ?1");
 
        q.setParameter(1, codCuestionario);
 
        return q.getResultList();
 
    }
 
    
}
