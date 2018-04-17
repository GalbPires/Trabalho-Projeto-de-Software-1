package edu.udc.psw1_1_13;

import java.util.Scanner;

import edu.udc.psw1_1_13.Linha;
import edu.udc.psw1_1_13.Ponto2D;

public class InterfaceConsoleLinha {
 static public Linha lerLinha()
 {
 double x, y;
 Scanner scanner = new Scanner(System.in);
 
 System.out.println("Digie o valor de x do primeiro ponto: ");
 x = scanner.nextDouble();
 System.out.println("Digie o valor de y do primeiro ponto: ");
 y = scanner.nextDouble();
 
 Ponto2D pontoA = new Ponto2D(x, y);
 
 System.out.println("Digie o valor de x do segundo ponto: ");
 x = scanner.nextDouble();
 System.out.println("Digie o valor de y do segundo ponto: ");
 y = scanner.nextDouble();
 
 Ponto2D pontoB = new Ponto2D(x, y);
 
 Linha linha = new Linha(pontoA, pontoB);
 
 return linha;
 }
 
 static public void mostrarLinha(Linha l){
 System.out.println("Ponto A: " + l.getA());
 System.out.println("Ponto B: " + l.getB());
 }

}