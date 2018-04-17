package edu.udc.psw1_1_13;

import java.util.Scanner;

import edu.udc.psw1_1_13.Ponto2D;;

public class InterfaceConsolePonto {
 
 static public Ponto2D lerPonto()
 {
 double x, y;
 Scanner scanner = new Scanner(System.in);
 
 System.out.println("Digie o valor de x: ");
 x = scanner.nextDouble();
 System.out.println("Digie o valor de y: ");
 y = scanner.nextDouble();
 
 Ponto2D ponto = new Ponto2D(x, y);
 return ponto;
 }
 
 static public void mostrarPonto(Ponto2D p){
 System.out.println("O valor de x: " + p.getX());
 System.out.println("O valor de y: " + p.getY());
 }
}