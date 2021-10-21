package com.mycompany.ex01;
public class Mouse {
    String modelo;
    String cor;
    boolean rgb;
    int pollingRate;
    String sensor;
    int maxDpi;
    
    void status() {
        System.out.println("AVISO: mostrando status do mouse.");
        System.out.print("Modelo: " + this.modelo + "\nCor: " + this.cor + "\nrgb: ");
        System.out.print(this.rgb + "\nPolling Rate: " + this.pollingRate + "\nSensor: ");
        System.out.println(this.sensor + "\nDPI máximo: " + this.maxDpi + "\n");
    }
    
    int jogar(int dpi, String game) {
        if ("osu".equals(game)) {
            System.out.println("AVISO: Ajudando DPI para 5000");
            dpi-=7000;
            return dpi;
        } else if ("MinecraftPotPvp".equals(game)){
            System.out.println("AVISO: Ajustando DPI para 7400");
            dpi-=4600;
            return dpi;
        } else {
            System.out.println("<ERROR>");
            return 0;
        }
    }
}