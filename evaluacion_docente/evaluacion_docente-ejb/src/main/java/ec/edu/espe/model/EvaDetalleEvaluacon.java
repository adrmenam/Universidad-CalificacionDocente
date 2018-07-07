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
import javax.validation.constraints.Size;

/**
 *
 * @author adrianmena
 */
@Entity
@Table(name = "eva_detalle_evaluacon")
@NamedQueries({
    @NamedQuery(name = "EvaDetalleEvaluacon.findAll", query = "SELECT e FROM EvaDetalleEvaluacon e")})
public class EvaDetalleEvaluacon implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EvaDetalleEvaluaconPK evaDetalleEvaluaconPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PONDERACION")
    private BigDecimal ponderacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "COD_ROL")
    private String codRol;

    public EvaDetalleEvaluacon() {
    }

    public EvaDetalleEvaluacon(EvaDetalleEvaluaconPK evaDetalleEvaluaconPK) {
        this.evaDetalleEvaluaconPK = evaDetalleEvaluaconPK;
    }

    public EvaDetalleEvaluacon(EvaDetalleEvaluaconPK evaDetalleEvaluaconPK, String codRol) {
        this.evaDetalleEvaluaconPK = evaDetalleEvaluaconPK;
        this.codRol = codRol;
    }

    public EvaDetalleEvaluacon(String codEvaluacion, String codCuestionario) {
        this.evaDetalleEvaluaconPK = new EvaDetalleEvaluaconPK(codEvaluacion, codCuestionario);
    }

    public EvaDetalleEvaluaconPK getEvaDetalleEvaluaconPK() {
        return evaDetalleEvaluaconPK;
    }

    public void setEvaDetalleEvaluaconPK(EvaDetalleEvaluaconPK evaDetalleEvaluaconPK) {
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
        if (!(object instanceof EvaDetalleEvaluacon)) {
            return false;
        }
        EvaDetalleEvaluacon other = (EvaDetalleEvaluacon) object;
        if ((this.evaDetalleEvaluaconPK == null && other.evaDetalleEvaluaconPK != null) || (this.evaDetalleEvaluaconPK != null && !this.evaDetalleEvaluaconPK.equals(other.evaDetalleEvaluaconPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.model.EvaDetalleEvaluacon[ evaDetalleEvaluaconPK=" + evaDetalleEvaluaconPK + " ]";
    }
    
}
