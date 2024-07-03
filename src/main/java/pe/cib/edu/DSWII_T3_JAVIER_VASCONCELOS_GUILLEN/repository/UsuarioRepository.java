package pe.cib.edu.DSWII_T3_JAVIER_VASCONCELOS_GUILLEN.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.cib.edu.DSWII_T3_JAVIER_VASCONCELOS_GUILLEN.model.bd.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Usuario findByNomusuario(String nomusuario);

    Usuario findByNombres(String nombres);

}