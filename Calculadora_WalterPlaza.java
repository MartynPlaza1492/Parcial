import java.util.Scanner;

public class Calculadora_WalterPlaza {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double f_number, s_number;

        while (true) {
            System.out.print("Calculadora \n¿Que operación desea realizar?: 1. Suma," +
                    " 2. Resta, 3. Multiplicación, 4.Division, 0. Salir \nIngrese su opcion: ");
            int opcion = input.nextInt();

            if (opcion == 0) {
                System.out.print("Que tenga un buen dia");
                break;
            }
            else {
                System.out.print("Ingrese un número");
                f_number = input.nextDouble();
                System.out.print("Ingrese otro número");
                s_number = input.nextDouble();

                if (opcion == 1) System.out.println("Resultado de Suma: " + (f_number + s_number));
                else if (opcion == 2) System.out.println("Resultado de Resta: " + (f_number - s_number));
                else if (opcion == 3) System.out.println("Resultado de Multiplicar: " + (f_number * s_number));
                else if (opcion == 4) {
                    if (s_number == 0) System.out.println("Error: No se puede dividir por cero");
                    else System.out.println("Resultado de Division: " + (f_number / s_number));
                } else System.out.println("Opcion Invalida");
            }
        }
    }
}
