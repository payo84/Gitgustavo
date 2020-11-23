import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Momento inicial");
        System.out.println("********");
        System.out.println("Introduce la hora");
        int hora1 = sc.nextInt();
        System.out.println("Introduce los minutos");
        int minutos1 = sc.nextInt();
        System.out.println("Introduce los segundos");
        int segundos1 = sc.nextInt();

        System.out.println("Momento final");
        System.out.println("********");
        System.out.println("Introduce la hora final");
        int hora2 = sc.nextInt();
        System.out.println("Introduce los minutos finales");
        int minutos2 = sc.nextInt();
        System.out.println("Introduce los segundos finales");
        int segundos2 = sc.nextInt();
        System.out.println("Datos introducidos: Momento inicial: "+ hora1+" : "+minutos1+" : "+segundos1+"  "+"Momento final: "+hora2+" : "+minutos2+" :"+segundos2);
        int horainicialsegundos = (hora1 * 3600) + (minutos1 * 60) + segundos1;
        int horafinalsegundos = (hora2 *3600) +  (minutos2 * 60) + segundos2;
        int diferenciahorasegundos = horafinalsegundos - horainicialsegundos;
        int horafinal = diferenciahorasegundos / 3600;
        int cocientehoras = diferenciahorasegundos % 3600;
        int finalminutos = cocientehoras / 60;
        int finalsegundos = cocientehoras % 60;

        System.out.println ("La diferencia entre ambos momentos es: "+horafinal+" : "+finalminutos+" : "+finalsegundos);
    }
}

