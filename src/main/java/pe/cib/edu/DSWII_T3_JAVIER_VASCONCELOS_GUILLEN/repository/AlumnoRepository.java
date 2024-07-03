package pe.cib.edu.DSWII_T3_JAVIER_VASCONCELOS_GUILLEN.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.cib.edu.DSWII_T3_JAVIER_VASCONCELOS_GUILLEN.model.bd.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, String> {
}