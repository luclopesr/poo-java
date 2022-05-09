import javax.swing.JOptionPane;

public class Peixes extends Animal{
    private String corEscama;

    @Override
    public void locomover() {
        JOptionPane.showMessageDialog(null, "Nadando");
    }

    @Override
    public void alimentar() {
        JOptionPane.showMessageDialog(null, "Comendo substâncias");
    }

    @Override
    public void emitirSom() {
        JOptionPane.showMessageDialog(null, "Peixe não faz som");
    }

    public void soltarBolha() {
        JOptionPane.showMessageDialog(null, "Soltando bolha...");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    
}