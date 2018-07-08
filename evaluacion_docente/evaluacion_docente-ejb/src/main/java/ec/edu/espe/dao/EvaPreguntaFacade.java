/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.dao;

import ec.edu.espe.model.EvaDetalleEvaluacon;
import ec.edu.espe.model.EvaPregunta;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author adrianmena
 */
@Stateless
@LocalBean
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
    
    public List<EvaPregunta> cargarCuestionario(String codRol, String codEvaluacion) {
        
        List<EvaPregunta> preguntasResp=new ArrayList<EvaPregunta>();
        List<EvaDetalleEvaluacon> listaEvaluacones=new ArrayList<EvaDetalleEvaluacon>();
        
        Query qry = this.em.createQuery("SELECT obj FROM EvaDetalleEvaluacon obj WHERE obj.segRol.codigo=?1 AND obj.evaEvaluacion.codigo=?2");
        qry.setParameter(1, codRol);
        qry.setParameter(2, codEvaluacion);
        listaEvaluacones=qry.getResultList();
        
        for(int i=0;i<listaEvaluacones.size();i++)
        {
            System.out.println(listaEvaluacones.get(i).getCodPerfil());
        }
        
        Query qry1 = this.em.createQuery("SELECT obj FROM EvaPregunta obj WHERE obj.evaCuestionario.codigo =?1");
        qry1.setParameter(1, listaEvaluacones.get(0).getEvaDetalleEvaluaconPK().getCodCuestionario());
        preguntasResp=qry1.getResultList();
        
        for(int i=0;i<preguntasResp.size();i++)
        {
            System.out.println(preguntasResp.get(i).getEnunciado());
        }
        
        return preguntasResp;
    }
    
}
