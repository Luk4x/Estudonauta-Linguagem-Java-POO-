package com.mycompany.aula13;
public class Aula13 {
    public static void main(String[] args) {
        Mamifero m1 = new Mamifero();
        m1.emitirSom();
        Lobo l1 = new Lobo();
        l1.emitirSom();
        Cachorro c1 = new Cachorro();
        c1.emitirSom();
        System.out.println("\n");
        
        c1.reagir("Olá");
        c1.reagir("Vai apanhar");
        c1.reagir(11, 45);
        c1.reagir(21, 00);
        c1.reagir(true);
        c1.reagir(false);
        c1.reagir(2, 12.5f);
        c1.reagir(17, 4.5f);
    }
}