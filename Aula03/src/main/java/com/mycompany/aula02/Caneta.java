package com.mycompany.aula02;
public class Caneta {
    private String modelo;
    private String cor;
    protected float ponta;
    private int carga;
    public boolean tampado;
    
    public void status() {
        System.out.println("AVISO: Mostrando status da caneta.");
        System.out.print("Modelo: " + this.modelo + "\nCor: " + this.cor + "\nPonta: ");
        System.out.println(this.ponta + "\nCarga: " + this.carga + "\nTampada: " + this.tampado + "\n");
    }
    protected void rabiscar() {
        if (this.tampado==false) {
        System.out.println("AVISO: Rabiscando:\n__________ _____________ ________\n_______________\n_ _______ ___ __ _  _ __ ___________\n");
        } else {
            System.out.println("AVISO: Destampe a caneta para rabiscar.\n");
        }
    }
    public void tampar() {
        System.out.println("AVISO: Tampando caneta.\n");
        this.tampado = true;
    }
    
    public void destampar() {
        System.out.println("AVISO: Destampando caneta.\n");
        this.tampado = false;
    }
}
