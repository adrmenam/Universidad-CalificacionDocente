/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author adrianmena
 */
@Entity
@Table(name = "eva_cuestionario")
public class EvaCuestionario implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Size(min = 1, max = 30)
    @Column(name = "COD_CUESTIONARIO")
    private String codCuestionario;

    @NotNull
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "ESTADO")
    private String estado;

    public EvaCuestionario() {
    }

    public EvaCuestionario(String codCuestionario) {
        this.codCuestionario = codCuestionario;
    }

    public String getCodCuestionario() {
        return codCuestionario;
    }

    public void setCodCuestionario(String codCuestionario) {
        this.codCuestionario = codCuestionario;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCuestionario != null ? codCuestionario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EvaCuestionario)) {
            return false;
        }
        EvaCuestionario other = (EvaCuestionario) object;
        if ((this.codCuestionario == null && other.codCuestionario != null) || (this.codCuestionario != null && !this.codCuestionario.equals(other.codCuestionario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EvaCuestionario{" + "codCuestionario=" + codCuestionario + ", fechaCreacion=" + fechaCreacion + ", estado=" + estado + '}';
    }

}
