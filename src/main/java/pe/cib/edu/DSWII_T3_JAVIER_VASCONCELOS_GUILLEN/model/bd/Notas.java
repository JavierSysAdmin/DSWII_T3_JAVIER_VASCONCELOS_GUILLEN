package pe.cib.edu.DSWII_T3_JAVIER_VASCONCELOS_GUILLEN.model.bd;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pe.cib.edu.DSWII_T3_JAVIER_VASCONCELOS_GUILLEN.model.bd.pk.ID;

@Getter
@Setter
@Entity
@Table(name = "notas")
public class Notas {
    @EmbeddedId
    private ID alumnoCursoId;
    private Double exaparcial;
    private Double exafinal;
    @ManyToOne
    @MapsId("idalumno")
    @JoinColumn(name = "idalumno")
    @JsonBackReference
    private Alumno alumno;
    @ManyToOne
    @MapsId("idcurso")
    @JoinColumn(name = "idcurso")
    @JsonBackReference
    private Curso curso;

}