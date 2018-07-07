/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.services;


import ec.edu.espe.dao.EvaEvaluacionFacade;
import ec.edu.espe.model.EvaEvaluacion;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author Andrés
 */
@Stateless
@LocalBean
public class EvaEvaluacionService {
    
    @EJB
    private EvaEvaluacionFacade evaEvaluacionFacade;
    
    public EvaEvaluacion porId(String id)
    {
        List<EvaEvaluacion> edeList= evaEvaluacionFacade.findAll();
        EvaEvaluacion resp=new EvaEvaluacion();
        
        for(EvaEvaluacion obj : edeList)
        {
            if(obj.getCodEvaluacion().compareTo(id)==0)
            {
                resp=obj;
                break;
            }
        }
        return resp;
    }
       
        
    
}
