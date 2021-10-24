package com.mycompany.aula07;
public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    public void apresentar() {
        System.out.println("Lutador: " + this.getNome() + "\nOrigem: " + this.getNacionalidade() + "\n" + this.getIdade() + " anos");
        System.out.println(this.getAltura() + "m de altura\nPesando " + this.getPeso() + "Kg\nGanhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas() + "\nEmpatou: " + this.getEmpates() + "\n");
    }
    
    public void status() {
        System.out.println(this.getNome() + "\né um peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " vitorias\n" + this.getDerrotas() + " derrotas\n" + this.getEmpates() + " empates\n");
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias()+1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas()+1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates()+1);
    }
    
    protected Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setEmpates(empates);
        this.setDerrotas(derrotas);
    }
    
    private String getNome() {
        return this.nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private String getNacionalidade() {
        return this.nacionalidade;
    }

    private void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    private int getIdade() {
        return this.idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    private float getAltura() {
        return this.altura;
    }

    private void setAltura(float altura) {
        this.altura = altura;
    }

    private float getPeso() {
        return this.peso;
    }

    private void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    private String getCategoria() {
        return this.categoria;
    }

    private void setCategoria() {
        if (this.peso<52.2 || this.peso>120.2) {
            this.categoria = "Inválido";
        } else if (this.peso<=70.3) {
            this.categoria = "Leve";
        } else if (this.peso<=83.9) {
            this.categoria = "Médio";
        } else {
            this.categoria = "Pesado";
        }
    }

    private int getVitorias() {
        return this.vitorias;
    }

    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    private int getDerrotas() {
        return this.derrotas;
    }

    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    private int getEmpates() {
        return this.empates;
    }

    private void setEmpates(int empates) {
        this.empates = empates;
    }
}