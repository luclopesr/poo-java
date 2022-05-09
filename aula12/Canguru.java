import javax.swing.JOptionPane;

public class Canguru extends Mamifero{
    public void usarBolsa() {
        JOptionPane.showMessageDialog(null, "Usando bolsa");
    }

    @Override
    public void locomover() {
        JOptionPane.showMessageDialog(null, "Saltando");
    }
}
