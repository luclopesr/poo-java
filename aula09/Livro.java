package aula09;

import javax.swing.JOptionPane;

public class Livro implements Publicacao {
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public void detalhes() {
        JOptionPane.showMessageDialog(null, "--- DETALHES DO LIVRO ---\n\nTÍTULO: " + this.getTitulo() + "\nAUTOR: " + this.getAutor() + "\nTOTAL DE PÁGINAS: " + this.getTotPaginas() + "\nPÁGINA ATUAL: " + this.getPagAtual() + "\nESTÁ ABERTO? " + this.getAberto() + "\n\nLEITOR: " + this.leitor.getNome());
    }

    @Override
    public void abrir() {
        if (this.getAberto()) {
            JOptionPane.showMessageDialog(null, "O livro já está aberto");
        } else {
            this.setAberto(true);
            JOptionPane.showMessageDialog(null, "Abrindo livro...");
        }
        
    }

    @Override
    public void fechar() {
        if (this.getAberto()==false) {
            JOptionPane.showMessageDialog(null, "O livro já está fechado");
        } else {
            this.setAberto(false);
            JOptionPane.showMessageDialog(null, "Fechando livro...");
        }
        
    }

    @Override
    public void folhear() {
        int confirmacao = 0;
        if(this.getAberto()) {
            do {
                if (this.getPagAtual()==this.getTotPaginas()) {
                    JOptionPane.showMessageDialog(null, "Você chegou na última página!");
                    confirmacao = JOptionPane.NO_OPTION;
                } else {
                    this.setPagAtual(this.getPagAtual() + 1);

                    confirmacao = JOptionPane.showConfirmDialog(null, "Deseja passar mais uma página?", "Folhear livro", JOptionPane.YES_NO_OPTION);
                }
            } while (confirmacao == JOptionPane.YES_OPTION);
        } else {
            JOptionPane.showMessageDialog(null, "O livro está fechado!");
        }     
    }

    @Override
    public void avançarPag() {
        if(this.getAberto()) {
            this.setPagAtual(this.getPagAtual() + 1);
        } else {
            JOptionPane.showMessageDialog(null, "O livro está fechado!");
        }
    }

    @Override
    public void voltarPag() {
        if(this.getAberto()) {
            this.setPagAtual(this.getPagAtual() - 1);
        } else {
            JOptionPane.showMessageDialog(null, "O livro está fechado!");
        }
        
    }

    // CONSTRUTOR
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    // GETTERS E SETTERS
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    
}
