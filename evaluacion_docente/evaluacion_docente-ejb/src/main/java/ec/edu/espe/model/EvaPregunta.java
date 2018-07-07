/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "eva_pregunta")
@NamedQueries({
    @NamedQuery(name = "EvaPregunta.findAll", query = "SELECT e FROM EvaPregunta e")})
public class EvaPregunta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_PREGUNTA")
    private Integer codPregunta;
    @Size(max = 30)
    @Column(name = "COD_CUESTIONARIO")
    private String codCuestionario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "ENUNCIADO")
    private String enunciado;

    public EvaPregunta() {
    }

    public EvaPregunta(Integer codPregunta) {
        this.codPregunta = codPregunta;
    }

    public EvaPregunta(Integer codPregunta, String enunciado) {
        this.codPregunta = codPregunta;
        this.enunciado = enunciado;
    }

    public Integer getCodPregunta() {
        return codPregunta;
    }

    public void setCodPregunta(Integer codPregunta) {
        this.codPregunta = codPregunta;
    }

    public String getCodCuestionario() {
        return codCuestionario;
    }

    public void setCodCuestionario(String codCuestionario) {
        this.codCuestionario = codCuestionario;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPregunta != null ? codPregunta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EvaPregunta)) {
            return false;
        }
        EvaPregunta other = (EvaPregunta) object;
        if ((this.codPregunta == null && other.codPregunta != null) || (this.codPregunta != null && !this.codPregunta.equals(other.codPregunta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.model.EvaPregunta[ codPregunta=" + codPregunta + " ]";
    }
    
}
