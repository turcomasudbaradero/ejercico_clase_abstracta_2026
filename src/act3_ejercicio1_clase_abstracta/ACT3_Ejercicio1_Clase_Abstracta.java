package act3_ejercicio1_clase_abstracta;

import java.util.Scanner;

public class ACT3_Ejercicio1_Clase_Abstracta {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        //CUADRADO
        System.out.println("==== CUADRADO ====");
        
        System.out.println("Ingrese el color: ");
        String colorCuadrado = teclado.nextLine();
        
        System.out.println("Ingrese el lado: ");
        double lado = teclado.nextDouble();
        
        Cuadrado cuadrado = new Cuadrado(colorCuadrado, lado);
        
        System.out.println("Color: " + cuadrado.getColor());
        System.out.println("Area del cuadrado: " + cuadrado.calcularArea());

        //LIMPIA EL BUFFER
        teclado.nextLine();
        
        
        //TRIANGULO
        System.out.println();
        System.out.println("==== TRIANGULO ====");
        
        System.out.println("Ingrese el color: ");
        String colorTriangulo = teclado.nextLine();
        
        System.out.println("Ingrese la base: ");
        double base = teclado.nextDouble();
        
        System.out.println("Ingrese la altura: ");
        double altura = teclado.nextDouble();
        
        Triangulo triangulo = new Triangulo(colorTriangulo, base, altura);
        
        System.out.println("Color: " + triangulo.getColor());
        System.out.println("Area del triangulo: " + triangulo.calcularArea());
        
        teclado.close();
        
        //prueba git
    }
    
}