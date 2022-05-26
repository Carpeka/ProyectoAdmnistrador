package controlador.Administrador;

import modelo.dao.reserva.Reserva;
import modelo.dao.reserva.ReservaDAO;
import modelo.dao.usuario.UsuarioDAO;
import modelo.dao.usuario.UsuarioDAOImpl;
import vista.Administrador.Administrador;
import vista.logueo.Login;

import javax.swing.*;

public class ControladorAdministrador {
    private Administrador modelo;
    private Login vista;
    private Administrador administrador;

    public ControladorAdministrador(Administrador modelo, Login vista, Administrador administrador) {
        this.modelo = modelo;
        this.vista = vista;
        this.administrador = administrador;
        inicializarVista();
    }

    private void inicializarVista() {
        vista.getLabelError().setText("");
        vista.getVentanaLogin().setVisible(true);
    }
    public void inicializarControlador() {
        vista.getBotonSalir().addActionListener(actionEvent -> salirApp());
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
