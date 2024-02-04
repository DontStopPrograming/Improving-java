import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        double ventas[] = new double[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese las diez ventas:");
        for (int i = 0; i < ventas.length; i++) {
            System.out.println("venta" + (i + 1));
            ventas[i] = sc.nextDouble();

        }
        int k = 0;
        int total = 0;
        while (k < 5) {
            if (ventas[k] >= 100) {
                System.out.println(ventas[k]);
                total++;
            }
            k++;
        }
        System.out.println("sales greater than:" + total);
    }
}