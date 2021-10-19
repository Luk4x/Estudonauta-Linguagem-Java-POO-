package com.mycompany.aula02;
public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Preto";
        c1.carga = 92;
        c1.ponta = 0.7f;
        c1.modelo = "REBNOK";
        c1.tampado = true;
        
        System.out.println("Verificando status de c1..");
        c1.status();
        System.out.println("Tentando rabiscar com c1...");
        c1.rabiscar();
        System.out.println("Tentando destampar c1");
        c1.destampar();
        System.out.println("Tentando rabiscar denovo com c1");
        c1.rabiscar();
        System.out.println("Tamapando c1.");
        c1.tampar();
        
        Caneta c2 = new Caneta();
        c2.cor = "Vermelho";
        c2.carga = 47;
        c2.ponta = 0.5f;
        c2.modelo = "JOCAROFFICE";
        c2.tampado = false;
        
        System.out.println("\n\nVerificando status de c2..");
        c2.status();
        System.out.println("Tentando rabiscar com c2...");
        c2.rabiscar();
        System.out.println("Tamapando c2.");
        c2.tampar();
    }
}
