package pe.cib.edu.DSWII_T3_JAVIER_VASCONCELOS_GUILLEN.service;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.nio.file.*;
import java.util.List;

@Service
public class FileService implements IFileService{

    private final Path pathFolder= Paths.get("uploads");

    @Override
    public void guardarArchivo(MultipartFile archivo) throws Exception {
        Files.copy(archivo.getInputStream(),
                this.pathFolder.resolve(archivo.getOriginalFilename()));
    }

    @Override
    public void guardarArchivos(List<MultipartFile> archivoList) throws Exception {
        for (MultipartFile archivo : archivoList) {
            validarDoc(archivo.getOriginalFilename());
            validarTamaño(archivo);
            this.guardarArchivo(archivo);
        }
    }

    private void validarTamaño(MultipartFile archivo) throws Exception {
        if (archivo.getSize() > 2 * 1024 * 1024) {
            throw new Exception("El pesa más de 2MB");
        }
    }

    private void validarDoc(String filename) throws Exception {
        String extension = filename.substring(filename.lastIndexOf('.') + 1).toLowerCase();
        if (!extension.equals("docx")) {
            throw new Exception("Solo archivos word");
        }
    }
}