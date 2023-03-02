package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a:");
        double a = scanner.nextDouble();
        System.out.println("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập c: ");
        double c = scanner.nextDouble();

        Discriminant discriminant = new Discriminant(a,b,c);
        double delta = discriminant.getDiscriminant();
        if (delta >= 0) {
            double x1 = (-discriminant.getB() + Math.sqrt(delta)) / (2 * discriminant.getA());
            double x2 = (-discriminant.getB() - Math.sqrt(delta)) / (2 * discriminant.getA());
            if (delta == 0) {
                System.out.println("phương trình có 1 nghiệm duy nhất x = " + x1);
            } else {
                System.out.println("phương trình có hai nghiệm phân biệt: "+"x1 = " + x1 + " , x2 = " + x2);
            }
        } else {
            System.out.println("Vô nghiệm");
        }
    }
}