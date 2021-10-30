package com.mycompany.aula11;
public class Aula11 {
    public static void main(String[] args) {
        // exemplo de herança de implementação
        Visitante v1 = new Visitante();
        v1.setNome("Enma");
        v1.setIdade(17);
        v1.setSexo("F");
        System.out.println(v1.toString());
        System.out.println("\n\n");
        
        // exemplo de herança para diferença
        Aluno a1 = new Aluno();
        a1.setNome("Anna");
        a1.setIdade(17);
        a1.setSexo("F");
        a1.setMatricula(1111);
        a1.setCurso("Eletronica");
        a1.pagarMensalidade();
        System.out.println("\n\n");
        
        Professor p1 = new Professor();
        p1.setNome("Tamako");
        p1.setIdade(29);
        p1.setSexo("F");
        p1.setEspecialidade("Algebra");
        p1.setSalario(1700f);
        p1.receberAumento(199.9f);
        System.out.println(p1.toString());
        System.out.println("\n\n");
        
        // especialização de Aluno
        Bolsista b1 = new Bolsista();
        b1.setNome("Anko");
        b1.setBolsa(12.5f);
        b1.setIdade(16);
        b1.setSexo("F");
        b1.setMatricula(1122);
        b1.setCurso("Engenharia");
        b1.pagarMensalidade();
        System.out.println("\n\n");
        
        // especialização de Aluno 2
        Tecnico t1 = new Tecnico();
        t1.setNome("Yuri");
        t1.setRegistroProfissional(11111111);
        t1.setIdade(19);
        t1.setSexo("M");
        t1.setMatricula(1122);
        t1.setCurso("Análise e Desenvolvimento de Sistemas");
        t1.pagarMensalidade();
        System.out.println("\n\n"); 
    }
}
