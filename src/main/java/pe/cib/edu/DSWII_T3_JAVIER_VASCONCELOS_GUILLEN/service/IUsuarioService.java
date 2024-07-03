package pe.cib.edu.DSWII_T3_JAVIER_VASCONCELOS_GUILLEN.service;

import pe.cib.edu.DSWII_T3_JAVIER_VASCONCELOS_GUILLEN.model.bd.Usuario;

public interface IUsuarioService {

    Usuario obtenerUsuarioPorNomUsuario(
            String nomusuario);
}