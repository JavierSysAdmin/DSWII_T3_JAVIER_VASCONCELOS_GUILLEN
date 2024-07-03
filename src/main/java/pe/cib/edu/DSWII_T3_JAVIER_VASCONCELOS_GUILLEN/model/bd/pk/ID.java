package pe.cib.edu.DSWII_T3_JAVIER_VASCONCELOS_GUILLEN.model.bd.pk;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class ID implements Serializable {
    private String idalumno;
    private String idcurso;
}