package pe.cib.edu.DSWII_T3_JAVIER_VASCONCELOS_GUILLEN.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import pe.cib.edu.DSWII_T3_JAVIER_VASCONCELOS_GUILLEN.model.bd.Curso;

public interface CursoRepository extends JpaRepository<Curso, String> {
}
