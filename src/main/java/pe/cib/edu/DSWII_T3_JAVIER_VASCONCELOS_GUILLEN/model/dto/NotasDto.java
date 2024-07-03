package pe.cib.edu.DSWII_T3_JAVIER_VASCONCELOS_GUILLEN.model.dto;
import lombok.Data;
@Data
public class NotasDto extends DtoEntity {
    private Double exaParcial;
    private Double exaFinal;
    private String nomcursoCurso;
    private String nomalumnoAlumno;
    private String apealumnoAlumno;
}
