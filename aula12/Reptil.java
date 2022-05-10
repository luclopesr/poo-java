package aula12;

import javax.swing.JOptionPane;

public class Reptil extends Animal {
    private String corEscama;

    @Override
    public void locomover() {
        JOptionPane.showMessageDialog(null, "Rastejando");
    }

    @Override
    public void alimentar() {
        JOptionPane.showMessageDialog(null, "Comendo vegetais");
    }

    @Override
    public void emitirSom() {
        JOptionPane.showMessageDialog(null, "som de Reptil");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    
}