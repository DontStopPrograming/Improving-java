package ExerciseTwo;

import java.util.Scanner;

public class MajorArray {
    public static void main(String[] args) {
        double num[] = new double[5];
        double biggest = num[0];
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert number for containt array:");

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextDouble();
            if (num[i] > biggest) {
                biggest = num[i];
            }
        }
        System.out.println("The number biggest is:" + biggest);
    }
}
