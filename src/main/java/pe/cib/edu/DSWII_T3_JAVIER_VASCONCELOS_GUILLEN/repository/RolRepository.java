package pe.cib.edu.DSWII_T3_JAVIER_VASCONCELOS_GUILLEN.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.cib.edu.DSWII_T3_JAVIER_VASCONCELOS_GUILLEN.model.bd.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{

    Rol findByNomrol(String nomrol);
}