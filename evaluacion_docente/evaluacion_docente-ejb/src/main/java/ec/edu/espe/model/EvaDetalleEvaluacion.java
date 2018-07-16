/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author adrianmena
 */
@Entity
@Table(name = "eva_detalle_evaluacion")
public class EvaDetalleEvaluacion implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @EmbeddedId
    private EvaDetalleEvaluacionPK evaDetalleEvaluaconPK;
   
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PONDERACION")
    private BigDecimal ponderacion;

    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "COD_ROL")
    private String codRol;

    public EvaDetalleEvaluacion() {
    }

    public EvaDetalleEvaluacion(EvaDetalleEvaluacionPK evaDetalleEvaluaconPK) {
        this.evaDetalleEvaluaconPK = evaDetalleEvaluaconPK;
    }

    public EvaDetalleEvaluacionPK getEvaDetalleEvaluaconPK() {
        return evaDetalleEvaluaconPK;
    }

    public void setEvaDetalleEvaluaconPK(EvaDetalleEvaluacionPK evaDetalleEvaluaconPK) {
        this.evaDetalleEvaluaconPK = evaDetalleEvaluaconPK;
    }

    public BigDecimal getPonderacion() {
        return ponderacion;
    }

    public void setPonderacion(BigDecimal ponderacion) {
        this.ponderacion = ponderacion;
    }

    public String getCodRol() {
        return codRol;
    }

    public void setCodRol(String codRol) {
        this.codRol = codRol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (evaDetalleEvaluaconPK != null ? evaDetalleEvaluaconPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EvaDetalleEvaluacion)) {
            return false;
        }
        EvaDetalleEvaluacion other = (EvaDetalleEvaluacion) object;
        if ((this.evaDetalleEvaluaconPK == null && other.evaDetalleEvaluaconPK != null) || (this.evaDetalleEvaluaconPK != null && !this.evaDetalleEvaluaconPK.equals(other.evaDetalleEvaluaconPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EvaDetalleEvaluacion{" + "evaDetalleEvaluaconPK=" + evaDetalleEvaluaconPK + ", ponderacion=" + ponderacion + ", codRol=" + codRol + '}';
    }

}
