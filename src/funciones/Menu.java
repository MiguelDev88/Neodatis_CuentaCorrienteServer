package funciones;
import java.io.BufferedReader;
import java.io.IOException;


// @author Miguel

public class Menu {
    
    public static byte menuPrincipal (BufferedReader leer) throws IOException {
        
        byte b;
        
        System.out.println("\n Seleccione opción:"
                + "\n0.Finalizar ");
        b=Byte.parseByte(leer.readLine());
        
        return b;
        
    } 
}