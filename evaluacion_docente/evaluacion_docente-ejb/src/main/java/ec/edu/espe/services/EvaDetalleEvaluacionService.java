/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.services;

import ec.edu.espe.dao.EvaDetalleEvaluacionFacade;
import ec.edu.espe.model.EvaDetalleEvaluacion;
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
public class EvaDetalleEvaluacionService {
    
    @EJB
    private EvaDetalleEvaluacionFacade evaDetEva;
    
    public EvaDetalleEvaluacion porId(String id1, String id2)
    {
        List<EvaDetalleEvaluacion> edeList= evaDetEva.findAll();
        
        EvaDetalleEvaluacion resp=new EvaDetalleEvaluacion();
        
        for(EvaDetalleEvaluacion obj : edeList)
        {
            if((obj.getEvaDetalleEvaluaconPK().getCodCuestionario().compareTo(id1)==0)&&(obj.getEvaDetalleEvaluaconPK().getCodEvaluacion().compareTo(id2)==0))
            {
                resp=obj;
                break;
            }
        }
        return resp;
    }
       
        
    
}
