public class while5 {
    public static void main (String[] args){
        int num = 1;
        int contadorMultiplos = 0;
        while (contadorMultiplos < 50) {
            if (num % 5 == 0) {
                System.out.print(num + "\t");
                contadorMultiplos++;
               if (contadorMultiplos % 10 == 0) {
                   System.out.println();
               }
               }
            num++;
        }
    }
}

