package com.mycompany.aula10;
public class ProjetoPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Anna");
        p2.setNome("Lucas");
        p3.setNome("Nome3");
        p4.setNome("Nome4");
        
        p1.setIdade(17);
        p2.setIdade(17);
        
        p1.setSexo("F");
        p2.setSexo("M");
        
        p2.setCurso("Programação");
        p3.setSalario(2600f);
        p4.mudarTrabalho("Estoque");
        
        p3.receberAumen(235f);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
