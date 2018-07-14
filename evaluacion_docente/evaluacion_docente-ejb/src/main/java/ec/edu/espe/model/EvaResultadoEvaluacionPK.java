/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author adrianmena
 */
@Embeddable
public class EvaResultadoEvaluacionPK implements Serializable {

    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "COD_EVALUACION")
    private String codEvaluacion;
    
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "COD_NRC")
    private String codNrc;

    public EvaResultadoEvaluacionPK() {
    }

    public EvaResultadoEvaluacionPK(String codEvaluacion, String codNrc) {
        this.codEvaluacion = codEvaluacion;
        this.codNrc = codNrc;
    }

    public String getCodEvaluacion() {
        return codEvaluacion;
    }

    public void setCodEvaluacion(String codEvaluacion) {
        this.codEvaluacion = codEvaluacion;
    }

    public String getCodNrc() {
        return codNrc;
    }

    public void setCodNrc(String codNrc) {
        this.codNrc = codNrc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codEvaluacion != null ? codEvaluacion.hashCode() : 0);
        hash += (codNrc != null ? codNrc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EvaResultadoEvaluacionPK)) {
            return false;
        }
        EvaResultadoEvaluacionPK other = (EvaResultadoEvaluacionPK) object;
        if ((this.codEvaluacion == null && other.codEvaluacion != null) || (this.codEvaluacion != null && !this.codEvaluacion.equals(other.codEvaluacion))) {
            return false;
        }
        if ((this.codNrc == null && other.codNrc != null) || (this.codNrc != null && !this.codNrc.equals(other.codNrc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EvaResultadoEvaluacionPK{" + "codEvaluacion=" + codEvaluacion + ", codNrc=" + codNrc + '}';
    }

}
