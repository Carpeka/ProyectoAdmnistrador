package controlador.Administrador;

import modelo.dao.usuario.UsuarioDAO;

import javax.swing.*;

public class ControladorAdministrador {
    private UsuarioDAO modelo;
    public ControladorAdministrador(UsuarioDAO modelo) {
        this.modelo = modelo;
        inicializarVista();
    }

    private void inicializarVista() {
    }
    public void inicializarControlador() {
    }
    private void salirApp() {
        JButton botonSalir = new JButton("SALIR");
        //usando una expresión labmda
        botonSalir.addActionListener( actionEvent -> {
            int opcion = JOptionPane.showInternalConfirmDialog(null,"¿Realmente quieres salir?",
                    "CONFIRMACIÓN", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            System.out.println(opcion);
            if (opcion == 1)
                return;
            System.exit(0);
            //(si/no)
        });
    }
}