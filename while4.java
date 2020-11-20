public class while4 {
    public static void main (String [] args){
        int num = 1;
        int contadorMultiplos = 0;
        while (contadorMultiplos < 20) {
            if (num % 5 == 0) {
                System.out.println(num + " ");
                contadorMultiplos++;
            }
            num++;
        }
}
}
