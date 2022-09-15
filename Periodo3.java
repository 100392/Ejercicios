import java.util.Scanner;

/**
 *
 * @author Andrea
 */
public class Periodo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Unidad3_Semana2_Clase4_Ejercicio1");
        
        Scanner entrada = new Scanner (System.in);
        int password;
        
     do {
          System.out.print("Ingrese su contraseña numérica: ");
          password=entrada.nextInt();
          
          if (password != 1234) 
              {
                  System.out.print("La contraseña no es válida ");
              }
     } while (password != 1234);

  
    }//Fin codigo
    
}//Fin 