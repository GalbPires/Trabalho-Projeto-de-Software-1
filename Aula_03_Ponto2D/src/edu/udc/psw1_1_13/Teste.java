package edu.udc.psw1_1_13;

public class Teste {

 public static void main(String[] args) {
 //FormaGeometrica f = new FormaGeometrica();
 
 Ponto2D p1 = new Ponto2D(33.444478, 4);
 Ponto2D p2 = new Ponto2D(5, 4);
 
 System.out.println(p1);
 System.out.println(p2);
 
 System.out.printf("Distancia = %.3f\n", p1.distancia(p2));
 
 Linha l = new Linha(p1, p2);
 System.out.println(l);
 p1.setX(5);
 System.out.println(p1);
 System.out.println(l);
 
 double x = 2;
 Ponto2D aux = l.getA();
 aux.setX(x);
 x = 25;
 l.setA(aux);
 System.out.println(l);
 aux.setX(x);
 System.out.println(l);
 }

 // continuar com exercício 8.5
}