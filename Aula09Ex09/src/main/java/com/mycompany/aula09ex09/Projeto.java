package com.mycompany.aula09ex09;
public class Projeto {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Lucas", 17, "M");
        p[1] = new Pessoa("Ana", 18, "F");
        
        l[0] = new Livro("Estrutura de dados e Algoritmos com JavaScript", "Loiane Groner", 408, p[0]);
        l[1] = new Livro("JavaScript: O Guia Definitivo", "David Flanagan", 1080, p[0]);
        l[2] = new Livro("Lógica de Programação e Algoritmos com JavaScript: uma Introdução à Programação de Computadores com Exemplos e Exercícios Para Iniciantes", "Edécio Fernando Iepsen", 320, p[1]);
        
        l[0].abrir();
        l[0].folhear(182);
        System.out.println(l[0].detalhes());
        l[1].abrir();
        l[1].folhear(21);
        System.out.println(l[1].detalhes());
        l[2].abrir();
        l[2].folhear(247);
        System.out.println(l[2].detalhes());
    }
}
