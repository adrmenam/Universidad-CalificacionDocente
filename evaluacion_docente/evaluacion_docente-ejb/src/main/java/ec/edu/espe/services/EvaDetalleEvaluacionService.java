/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.services;

import ec.edu.espe.dao.EvaDetalleEvaluaconFacade;
import ec.edu.espe.model.EvaDetalleEvaluacon;
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
    private EvaDetalleEvaluaconFacade evaDetEva;
    
    public EvaDetalleEvaluacon porId(String id1, String id2)
    {
        List<EvaDetalleEvaluacon> edeList= evaDetEva.findAll();
        
        EvaDetalleEvaluacon resp=new EvaDetalleEvaluacon();
        
        for(EvaDetalleEvaluacon obj : edeList)
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
