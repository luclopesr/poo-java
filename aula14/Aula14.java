package aula14;

public class Aula14 {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("JAVASCRIPT DO ZERO");
        v[2] = new Video("HTML5 e CSS3");

        //v[0].status();
        //v[1].status();
        //v[2].status();

        Gafanhoto g[] = new Gafanhoto[3];
        g[0] = new Gafanhoto("Lucas", 19, 'M', "luclopesr");
        g[1] = new Gafanhoto("Clara", 32, 'F', "clara_luz");

        //g[0].status();
        //g[1].status();

        Vizualizacao vis[] = new Vizualizacao[5];
        vis[0] = new Vizualizacao(g[0], v[2]);
        vis[1] = new Vizualizacao(g[0], v[0]);
        //vis[0].status();
        //vis[1].status();
        //g[0].status();
        //v[2].status();
    }
}
