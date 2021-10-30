package com.mycompany.aula12;
public class Aula12 { // polimorfismo de sobreposição
    public static void main(String[] args) {
        Mamifero m1 = new Mamifero();
        Ave a1 = new Ave();
        Reptil r1 = new Reptil();
        Peixe p1 = new Peixe();
        m1.locomover();
        m1.emitirSom();
        m1.alimentar();
        System.out.println("");
        a1.locomover();
        a1.emitirSom();
        a1.alimentar();
        System.out.println("");
        r1.locomover();
        r1.emitirSom();
        r1.alimentar();
        System.out.println("");
        p1.locomover();
        p1.emitirSom();
        p1.alimentar();
        System.out.println("\n");
        
        Canguru can1 = new Canguru();
        Cachorro cac1 = new Cachorro();
        Cobra cob1 = new Cobra();
        Tartaruga tar1 = new Tartaruga();
        Goldfish gol1 = new Goldfish();
        Arara ara1 = new Arara();
        can1.locomover();
        cac1.emitirSom();
        cob1.alimentar();
        tar1.locomover();
        gol1.locomover();
        ara1.emitirSom();
        
        
        
    }
}