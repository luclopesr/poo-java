package aula12;

import javax.swing.JOptionPane;

public class Mamifero extends Animal{
    private String corPelo;

    @Override
    public void locomover() {
        JOptionPane.showMessageDialog(null, "Correndo");
    }

    @Override
    public void alimentar() {
        JOptionPane.showMessageDialog(null, "Mamando");
    }

    @Override
    public void emitirSom() {
        JOptionPane.showMessageDialog(null, "som de Mamífero");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    
}
