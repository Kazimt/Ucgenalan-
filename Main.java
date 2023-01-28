import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double a,b,c,u,cevre,alan;
        Scanner input =new Scanner(System.in);
        System.out.println("a değerini giriniz:");
        a= input.nextDouble();
        System.out.println("b değerini giriniz:");
        b= input.nextDouble();
        System.out.println("c değerini giriniz:");
        c=input.nextDouble();
        u=(a+b+c)/2;
        cevre=2*u;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Alanı:"+alan);
    }
}