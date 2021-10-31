package com.mycompany.projetoyoutube;
public class Visualizacao {
    private Usuario espectador;
    private Video filme;

    public Visualizacao(Usuario espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
        this.espectador.ganharExperiencia();
        this.filme.setViews(this.filme.getViews()+1);
        
    }
    
    public void avaliar() {
        this.filme.setAvaliacao(5);
    }
    
    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }
    
    public void avaliar(float porcen) {
        if (porcen<=20) {
            this.filme.setAvaliacao(3);
        } else if (porcen<=50) {
            this.filme.setAvaliacao(5);
        } else if (porcen<=90) {
            this.filme.setAvaliacao(8);
        } else {
            this.filme.setAvaliacao(10);
        }
    }

    public Usuario getEspectador() {
        return espectador;
    }

    public void setEspectador(Usuario espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
}
