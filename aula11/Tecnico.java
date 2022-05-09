package aula11;

import javax.swing.JOptionPane;

public class Tecnico extends Aluno {
    private String registroProfissional;

    public void praticar() {
        JOptionPane.showMessageDialog(null, "OK, vamos praticar!");
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    
}
