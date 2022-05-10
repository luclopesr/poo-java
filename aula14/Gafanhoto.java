package aula14;

import javax.swing.JOptionPane;

public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;

    public void viuMaisUm() {
        this.setTotAssistido(this.getTotAssistido() + 1);
    }

    @Override
    public void status() {
        JOptionPane.showMessageDialog(null, "--- STATUS GAFANHOTO ---\n\nNOME: " + this.getNome() + "\nLOGIN: " + this.getLogin() + "\nIDADE: " + this.getIdade() + " anos\nSEXO: " + this.getSexo() + "\nEXPERIÊNCIA: " + this.getExperiencia() + "\nVÍDEOS ASSISTIDO: " + this.getTotAssistido());
    }

    public Gafanhoto(String nome, int idade, char sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    
}
