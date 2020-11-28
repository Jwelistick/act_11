package Main;

import java.util.Scanner;

interface Shape{
    double getarea=0;
    double getperimetro=0;

    void circle();
    void triangle();
    void square();
}

public class Act implements Shape{
    public static void main(String[] args) {
        Act sheip = new Act();
        Scanner sc = new Scanner(System.in);
        int res = 0;

        System.out.println("" +
                "Programa para mostrar área de figura\n" +
                "Escribe un número\n" +
                "1-Circulo\n" +
                "2-Triángulo\n" +
                "3-Cuadrado");
        res = sc.nextInt();
        if(res == 1){
            sheip.circle();
        }else if(res == 2){
            sheip.triangle();
        }else if(res == 3){
            sheip.square();
        }
    }

    @Override
    public void circle() {
        double radio;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el  radio de tu circulo");
        radio = sc.nextInt();
        radio = (Math.PI*radio*radio);
        System.out.println("El área es: "+radio);
    }

    @Override
    public void triangle() {
        double a=0, b=0, c=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Para mostrar el área por favor\n" +
                "Introduce el lado 1");
        a = sc.nextInt();
        System.out.println("Introduce el lado 2");
        b = sc.nextInt();
        System.out.println("Introduce el lado 3");
        c = sc.nextInt();
        double s = (a+b+c)/2;
        s = (Math.sqrt(s * (s-a) * (s-b) * (s-c)));
        System.out.println("El área es: "+s);
    }

    @Override
    public void square() {
        double h;
        double b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la altura");
        h = sc.nextInt();
        System.out.println("Escribe  la  base");
        b = sc.nextInt();
        b  = b*h;
        System.out.println("El área  es: "+b);
    }
}
