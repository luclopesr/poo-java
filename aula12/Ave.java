import javax.swing.JOptionPane;

public class Ave extends Animal{
    private String corPena;

    @Override
    public void locomover() {
        JOptionPane.showMessageDialog(null, "Voando");
    }

    @Override
    public void alimentar() {
        JOptionPane.showMessageDialog(null, "Comendo frutas");
    }

    @Override
    public void emitirSom() {
        JOptionPane.showMessageDialog(null, "som de Ave");
    }

    public void fazerNinho() {
        JOptionPane.showMessageDialog(null, "Construindo ninho...");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    
}