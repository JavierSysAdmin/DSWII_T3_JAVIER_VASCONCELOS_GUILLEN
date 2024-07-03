package pe.cib.edu.DSWII_T3_JAVIER_VASCONCELOS_GUILLEN.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UsuarioSeguridadDto {
    private Integer idusuario;
    private String nomusuario;
    private String token;
}