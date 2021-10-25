package com.mycompany.aula07;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;

    Random al = new Random();
    
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && (l1!=l2)) {
            this.desafiado = l1;
            this.desafiante = l2;
            this.aprovado = true;
        } else {
            this.aprovado = false;
        }
    }
    
    public void lutar() {
        if (this.aprovado) {
            System.out.println("==== DESAFIADO ====");
            this.desafiante.apresentar();
            System.out.println("==== DESAFIANTE ====");
            this.desafiado.apresentar();
            int resultado = al.nextInt(3);
            System.out.println("===== RESULTADO =====");
            switch (resultado) {
                case 0:
                    System.out.println("Empate.\n");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println(desafiado.getNome() + " ganhou.\n");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println(desafiante.getNome() + " ganhou.\n");
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
                    break;
            }
        } else {
            System.out.println("Luta não pode ocorrer.\n");
        }
    }
    
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean Aprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    
}