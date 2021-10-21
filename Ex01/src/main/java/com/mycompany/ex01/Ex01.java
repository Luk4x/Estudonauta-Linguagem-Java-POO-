package com.mycompany.ex01;
/* Exercício com o objetivo apenas de me familiarizar com os conceitos de 
classes e objetos abordados na aula teórica (Classificar 1 objeto concreto e 1
objeto conceitual) */
public class Ex01 {
    public static void main(String[] args) {
        // objeto concreto
        Mouse x5 = new Mouse();
        x5.modelo = "Cougar Minos x5";
        x5.cor = "Preto";
        x5.maxDpi = 12000;
        x5.pollingRate = 2000;
        x5.rgb = true;
        x5.sensor = "PMW3360";
        
        System.out.println("Verificando status do mouse..");
        x5.status();
        
        System.out.println("Preparando para jogar potpvp..");
        int pvpdpi = x5.jogar(x5.maxDpi, "MinecraftPotPvp");
        System.out.println("DPI ajustado para " + pvpdpi + " com sucesso.\n");
        
        System.out.println("Preparando para jogar osu..");
        int osudpi = x5.jogar(x5.maxDpi, "osu");
        System.out.println("DPI ajustado para " + osudpi + " com sucesso.\n\n\n");
        
        // objeto conceitual
        Estudo rotina = new Estudo();
        rotina.curso = "Java e C#";
        rotina.site = "estudonauta.com";
        rotina.estudando = true;
        rotina.eventos = "NLW/heat";
        rotina.horasPorDia = 8;
        
        System.out.println("4AM. Começar a estudar..");
        int hora = rotina.iniciar(4);
        System.out.println("começando próxima etapa..");
        hora = rotina.iniciar(10);
        hora = rotina.intensificar(hora);
        
    }
}
