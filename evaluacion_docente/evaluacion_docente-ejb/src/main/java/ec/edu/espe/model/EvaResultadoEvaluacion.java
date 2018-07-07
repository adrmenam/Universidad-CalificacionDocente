/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author adrianmena
 */
@Entity
@Table(name = "eva_resultado_evaluacion")
@NamedQueries({
    @NamedQuery(name = "EvaResultadoEvaluacion.findAll", query = "SELECT e FROM EvaResultadoEvaluacion e")})
public class EvaResultadoEvaluacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EvaResultadoEvaluacionPK evaResultadoEvaluacionPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "PROMEDIO_TOTAL")
    private BigDecimal promedioTotal;

    public EvaResultadoEvaluacion() {
    }

    public EvaResultadoEvaluacion(EvaResultadoEvaluacionPK evaResultadoEvaluacionPK) {
        this.evaResultadoEvaluacionPK = evaResultadoEvaluacionPK;
    }

    public EvaResultadoEvaluacion(EvaResultadoEvaluacionPK evaResultadoEvaluacionPK, BigDecimal promedioTotal) {
        this.evaResultadoEvaluacionPK = evaResultadoEvaluacionPK;
        this.promedioTotal = promedioTotal;
    }

    public EvaResultadoEvaluacion(String codEvaluacion, String codNrc) {
        this.evaResultadoEvaluacionPK = new EvaResultadoEvaluacionPK(codEvaluacion, codNrc);
    }

    public EvaResultadoEvaluacionPK getEvaResultadoEvaluacionPK() {
        return evaResultadoEvaluacionPK;
    }

    public void setEvaResultadoEvaluacionPK(EvaResultadoEvaluacionPK evaResultadoEvaluacionPK) {
        this.evaResultadoEvaluacionPK = evaResultadoEvaluacionPK;
    }

    public BigDecimal getPromedioTotal() {
        return promedioTotal;
    }

    public void setPromedioTotal(BigDecimal promedioTotal) {
        this.promedioTotal = promedioTotal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (evaResultadoEvaluacionPK != null ? evaResultadoEvaluacionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EvaResultadoEvaluacion)) {
            return false;
        }
        EvaResultadoEvaluacion other = (EvaResultadoEvaluacion) object;
        if ((this.evaResultadoEvaluacionPK == null && other.evaResultadoEvaluacionPK != null) || (this.evaResultadoEvaluacionPK != null && !this.evaResultadoEvaluacionPK.equals(other.evaResultadoEvaluacionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.model.EvaResultadoEvaluacion[ evaResultadoEvaluacionPK=" + evaResultadoEvaluacionPK + " ]";
    }
    
}
