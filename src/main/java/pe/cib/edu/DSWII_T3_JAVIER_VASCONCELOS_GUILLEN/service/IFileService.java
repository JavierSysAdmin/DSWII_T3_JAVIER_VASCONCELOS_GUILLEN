package pe.cib.edu.DSWII_T3_JAVIER_VASCONCELOS_GUILLEN.service;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;
public interface IFileService {
    void guardarArchivo(MultipartFile archivo) throws Exception;
    void guardarArchivos(List<MultipartFile> archivos) throws Exception;
}