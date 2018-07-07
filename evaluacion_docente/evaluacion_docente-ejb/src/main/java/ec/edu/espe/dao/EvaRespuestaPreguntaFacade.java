/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.dao;

import ec.edu.espe.model.EvaRespuestaPregunta;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author adrianmena
 */
@Stateless
@LocalBean
public class EvaRespuestaPreguntaFacade extends AbstractFacade<EvaRespuestaPregunta> {

    @PersistenceContext(unitName = "ec.edu.espe_evaluacion_docente-ejb_ejb_1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EvaRespuestaPreguntaFacade() {
        super(EvaRespuestaPregunta.class);
    }
    
}
