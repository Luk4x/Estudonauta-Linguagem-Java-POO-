package com.mycompany.aula04;
public class Caneta {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
    // construct
    public Caneta(String defaultC) {
        this.setModelo("REBNOK");
        this.setPonta(0.7f);
        this.setCor(defaultC);
        this.setTampa(true);
    }
    
    // getters
    public void status() {
        System.out.println("Verificando status da caneta.\nModelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta() + "\nCor: " + this.getCor());
        System.out.println("Tampada: " + this.getTampa() + "\n");
    }
    public String getCor() {
       return this.cor;
    }
    
    public String getTampa() {
        if (this.tampada == true) {
            return "Yes";
        } else {
            return "No";
        }
    }
    
    public String getModelo() {
        return this.modelo;
    }
    
    public float getPonta() {
        return this.ponta;
    }
    
    // setters
    public void setPonta(float newP) {
        this.ponta=newP;
    }
    
    public void setModelo(String newM) {
        this.modelo=newM;
    }
    
    public void setTampa(boolean newT) {
        this.tampada = newT;
    }
    
    public void setCor(String newC) {
        this.cor = newC;
    }
}
