import java.util.Scanner;
public class clasetres {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿sobre qué tipo de estrucctura quieres resolver ejercicios? ");
        int número1 = sc.nextInt();
        if (número1 < 0) {
            System.out.println("el número es negativo");
            System.exit( 1 );
        }
        System.out.println("Introduce segundo número");
        int número2 = sc.nextInt();
        if (número2 < 0) {
            System.out.println("el número es negativo");
            System.exit(1);
        }
        System.out.println("Introduce operación: + - * / ");
        char ch = sc.next().charAt(0);
        boolean b1 = '+' == ch;
        boolean b2 = '-' == ch;
        boolean b3 = '*' == ch;
        boolean b4 = '/' == ch;
        boolean b5 = !b1 && !b2 && !b3 && !b4;
        if (b1) {
            System.out.println("Resultado " + (número1 + número2));
        } else if (b2) {
            System.out.println("Resultado " + (número1 - número2));
        } else if (b3) {
            System.out.println("Resultado " + (número1 * número2));
        } else if (b4) {
            System.out.println("Resultado " + (número1 / número2));
        } else if (b5) {
            System.out.println("No es válido ");
            System.exit(1);
        }
    }
}

