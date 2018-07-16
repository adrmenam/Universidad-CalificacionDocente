/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author adrianmena
 */
@Entity
@Table(name = "eva_evaluacion")
public class EvaEvaluacion implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Size(min = 1, max = 20)
    @Column(name = "COD_EVALUACION")
    private String codEvaluacion;
    
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "DESCRIPCION")
    private String descripcion;

    public EvaEvaluacion() {
    }

    public EvaEvaluacion(String codEvaluacion) {
        this.codEvaluacion = codEvaluacion;
    }

    public EvaEvaluacion(String codEvaluacion, String descripcion) {
        this.codEvaluacion = codEvaluacion;
        this.descripcion = descripcion;
    }

    public String getCodEvaluacion() {
        return codEvaluacion;
    }

    public void setCodEvaluacion(String codEvaluacion) {
        this.codEvaluacion = codEvaluacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codEvaluacion != null ? codEvaluacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EvaEvaluacion)) {
            return false;
        }
        EvaEvaluacion other = (EvaEvaluacion) object;
        if ((this.codEvaluacion == null && other.codEvaluacion != null) || (this.codEvaluacion != null && !this.codEvaluacion.equals(other.codEvaluacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EvaEvaluacion{" + "codEvaluacion=" + codEvaluacion + ", descripcion=" + descripcion + '}';
    }

}
