import java.util.*;
public class Tablas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un numero para hacer su tabla de multiplicar: ");
        int num = sc.nextInt();
        tablas(num);


    }
    public static void tablas(int num) {
        if (num > 30) {
            System.out.println("El numero es demasiado grande, prueba uno mas pequeño.");
            return;
        } else
            System.out.println("Aqui esta la tabla de multiplicar de " + num);
        for (int i = 1; i <= 10; i++) {
            int res = num * i;
            System.out.println(num + " x " + i + " = " + res);
            }
        }
    }
