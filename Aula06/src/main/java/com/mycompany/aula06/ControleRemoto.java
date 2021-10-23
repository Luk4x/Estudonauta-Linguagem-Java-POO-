package com.mycompany.aula06;
public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    
    private int getVolume() {
        return this.volume;
    }
    
    private boolean getLigado() {
        return this.ligado;
    }
    
    private boolean getTocando() {
        return this.tocando;
    }
    
    private void setVolume(int v) {
        this.volume = v;
    }
    
    private void setLigado(boolean l) {
        this.ligado = l;
    }
    
    private void setTocando(boolean t) {
        this.tocando = t;
    }
    
    // métodos abstratos sobreescritos.
    @Override
    public void ligar() {
       this. setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Ligado: " + this.getLigado() + "\nTocando: " + this.getTocando());
        System.out.print("Volume: " + this.getVolume() + " [");
        for (int i=0;i<this.getVolume();i+=10) {
            System.out.print("|");
        }
        System.out.println("]\n");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu.. ");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume()+1);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume()-1);
        }
    }

    @Override
    public void Mutar() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desmutar() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        }
    }
}
