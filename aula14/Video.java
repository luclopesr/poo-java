package aula14;

import javax.swing.JOptionPane;

public class Video implements AcoesVideo{
    private String titulo;
    private int avaliacao, views, curtidas;
    private boolean reproduzindo;

    public void status() {
        JOptionPane.showMessageDialog(null, "--- STATUS VÍDEO ---\n\nTÍTULO: " + this.getTitulo() + "\nVIEWS: " + this.getViews() + "\nCURTIDAS: " + this.getCurtidas() + "\nAVALIAÇÃO: " + this.getAvaliacao() + "\nREPRODUZINDO? " + this.getReproduzindo());
    }

    @Override
    public void play() {
        this.setReproduzindo(true);
        this.setViews(this.getViews() + 1);
    }

    @Override
    public void pause() {
        this.setReproduzindo(false);
    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas() + 1);
    }
    
    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.curtidas = 0;
        this.views = 0;
        this.reproduzindo = false;
        }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova = 0;
        nova = (int) (this.avaliacao + avaliacao)/this.views;
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }


    
}
