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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "eva_respuesta_pregunta")
@NamedQueries({
    @NamedQuery(name = "EvaRespuestaPregunta.findAll", query = "SELECT e FROM EvaRespuestaPregunta e")})
public class EvaRespuestaPregunta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COD_REGISTRO_RESPUESTAS")
    private Integer codRegistroRespuestas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_PREGUNTA")
    private int codPregunta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "COD_PERSONA")
    private String codPersona;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RESPUESTA")
    private int respuesta;

    public EvaRespuestaPregunta() {
    }

    public EvaRespuestaPregunta(Integer codRegistroRespuestas) {
        this.codRegistroRespuestas = codRegistroRespuestas;
    }

    public EvaRespuestaPregunta(Integer codRegistroRespuestas, int codPregunta, String codPersona, int respuesta) {
        this.codRegistroRespuestas = codRegistroRespuestas;
        this.codPregunta = codPregunta;
        this.codPersona = codPersona;
        this.respuesta = respuesta;
    }

    public Integer getCodRegistroRespuestas() {
        return codRegistroRespuestas;
    }

    public void setCodRegistroRespuestas(Integer codRegistroRespuestas) {
        this.codRegistroRespuestas = codRegistroRespuestas;
    }

    public int getCodPregunta() {
        return codPregunta;
    }

    public void setCodPregunta(int codPregunta) {
        this.codPregunta = codPregunta;
    }

    public String getCodPersona() {
        return codPersona;
    }

    public void setCodPersona(String codPersona) {
        this.codPersona = codPersona;
    }

    public int getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codRegistroRespuestas != null ? codRegistroRespuestas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EvaRespuestaPregunta)) {
            return false;
        }
        EvaRespuestaPregunta other = (EvaRespuestaPregunta) object;
        if ((this.codRegistroRespuestas == null && other.codRegistroRespuestas != null) || (this.codRegistroRespuestas != null && !this.codRegistroRespuestas.equals(other.codRegistroRespuestas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.model.EvaRespuestaPregunta[ codRegistroRespuestas=" + codRegistroRespuestas + " ]";
    }
    
}
