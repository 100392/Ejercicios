import java.util.Scanner;

/**
 *
 * @author Andrea
 */
public class Periodo3ejerci2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Unidad3_Semana2_Clase4_Ejercicio1");
        
        Scanner entrada = new Scanner (System.in);
        int valinicial, valfinal;
        
        valinicial=8;
        
        System.out.print("Multiplos de 8 hasta 500");
              
        while (valinicial<=500)
        {
            System.out.print(valinicial+",");
            valinicial=valinicial+8;
        }
  
    }//Fin codigo
    
}//Fin 