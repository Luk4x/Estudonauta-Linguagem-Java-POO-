package com.mycompany.ex01;
public class Estudo {
    String curso;
    String site;
    String eventos;
    int horasPorDia;
    boolean estudando;
    
    int iniciar(int hora) {
        if (hora==4) {
            System.out.println("AVISO: Estudar " + this.curso + " no " + this.site + " durante as próximas 6 horas.\n");
            return hora+6;
        } else if (hora==10) {
            System.out.print("AVISO: Mudando foco dos estudos. ");
            if (this.eventos.equals("")) {
                System.out.println("Pesquise sobre assuntos ainda nebulosos como: versionamento de código mais avançado, SCRUM, etc.....\n");
            } else {
                System.out.println("Concentre-se no evento (" + this.eventos + ")\n");
            }
            return hora+2;
        } else {
            System.out.println("<ERROR>");
            return 0;
        }
    }
    
    int intensificar(int hora) {
        System.out.println("AVISO: Intensificando rotina atual. Estudar por mais 1 hora. Término de estudos remarcado para " + (hora+1) + " horas.");
        return hora+1;
    }
}
