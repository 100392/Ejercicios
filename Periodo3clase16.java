import java.util.Scanner;
public class Periodo3clase16 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int password;
        do {
            System.out.print("Introduzca su contraseña numerica: ");
            password = keyboard.nextInt();
            if (password != 12345)
                System.out.println("La contraseña no es valida");
        }
        while (password !=12345);
    }
}