package aula12;

import javax.swing.JOptionPane;

public class Cachorro extends Mamifero{
    public void enterrarOsso() {
        JOptionPane.showMessageDialog(null, "Enterrando osso");
    }
    
    public void abanarRabo() {
        JOptionPane.showMessageDialog(null, "Estou abanando o rabo");
    }

    @Override
    public void emitirSom() {
        JOptionPane.showMessageDialog(null, "AUAUAU");
    }
}
