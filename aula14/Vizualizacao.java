package aula14;

import javax.swing.JOptionPane;

public class Vizualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public void status() {
        JOptionPane.showMessageDialog(null, "--- STATUS VIZUALIZAÇÃO ---\n\nESPECTADOR: " + this.espectador.getNome() + "\nVÍDEO: " + this.filme.getTitulo());
    }

    public void avaliar() {
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }
    

    public void avaliar(float porc) {
        int tot = 0;
        if (porc <= 20.0f) {
            tot = 3;
        } else if (porc <= 50.0f) {
            tot = 5;
        } else if (porc <= 90.0f) {
            tot = 8;
        } else {
            tot = 10;
        }

        this.filme.setAvaliacao(tot);
    }

    public Vizualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;

        this.filme.play();
        this.espectador.viuMaisUm();
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    
}
