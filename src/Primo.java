import java.util.*;
public class Primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.print("Escribe el " + i + " numero. ");
            int num = sc.nextInt();

            if (num < 0) {
                System.out.println("El numero es negativo.");
            } else if (esPrimo(num)) {
                System.out.println("El numero " + num + " es primo.");

            } else
                System.out.println("El numero " + num + " no es primo.");
        }
    }
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        } else
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        return true;
    }
}
