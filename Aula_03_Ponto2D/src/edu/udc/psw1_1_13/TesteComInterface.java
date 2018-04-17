package edu.udc.psw1_1_13;

public class TesteComInterface {

 public static void main(String[] args) {
 Ponto2D p1 = InterfaceConsolePonto.lerPonto();
 Ponto2D p2 = InterfaceConsolePonto.lerPonto();
 
 InterfaceConsolePonto.mostrarPonto(p1);
 InterfaceConsolePonto.mostrarPonto(p2);
 
 Linha l = InterfaceConsoleLinha.lerLinha();
 InterfaceConsoleLinha.mostrarLinha(l);
 }

}
