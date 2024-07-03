package pe.cib.edu.DSWII_T3_JAVIER_VASCONCELOS_GUILLEN.exception;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String mensaje){
        super(mensaje);
    }
}