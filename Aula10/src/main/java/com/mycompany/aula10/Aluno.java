package com.mycompany.aula10;
public class Aluno extends Pessoa {
    private String matricula;
    private String curso;
    
    public void cancelarMatricula() {
        this.matricula="Cancelada";
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
