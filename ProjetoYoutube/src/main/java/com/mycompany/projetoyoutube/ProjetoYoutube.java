package com.mycompany.projetoyoutube;
public class ProjetoYoutube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Video 1");
        v[1] = new Video("Video 2");
        v[2] = new Video("Video 3");
        
        System.out.println(v[0].toString() + "\n");
        
        Usuario u[] = new Usuario[2];
        u[0] = new Usuario("Lucas", 17, "M", "Kiy0u");
        u[1] = new Usuario("Anna", 17, "F", "Anna");
        
        Visualizacao vi[] = new Visualizacao[4];
        vi[0] = new Visualizacao(u[0], v[0]);
        vi[0].avaliar();
        System.out.println(vi[0].toString() + "\n");
        vi[1] = new Visualizacao(u[1], v[0]);
        vi[1].avaliar(7);
        System.out.println(vi[1].toString() + "\n");
        vi[2] = new Visualizacao(u[0], v[1]);
        vi[0].avaliar(69.0f);
        System.out.println(vi[2].toString() + "\n");
        vi[3] = new Visualizacao(u[0], v[2]);
        System.out.println(vi[3].toString() + "\n");
        
        System.out.println(u[0].toString() + "\n");
        System.out.println(u[1].toString() + "\n");
    }
}
