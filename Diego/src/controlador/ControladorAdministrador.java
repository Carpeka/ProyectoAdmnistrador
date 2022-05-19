package controlador;

import ProyectoADM.vista.Administrador;
import modelo.dao.usuario.UsuarioDAO;
import javax.swing.*;

public class ControladorAdministrador {
    private Administrador vista;
    private UsuarioDAO modelo;

    public ControladorAdministrador(Administrador vista, UsuarioDAO modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }

    public void initController() {
        vista.getSalirButton().addActionListener(actionEvent -> salirAplicacion());
    }

    private static final String[] nombreColumnas =
                    {"Nombre",
                    "Apellidos",
                    "Teléfono",
                    "DNI",
                    "Email",
                    "Password"};

    private static final Object[][] insertarDatos = {
    };

    private void salirAplicacion(){
        int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de salir?",
                "SALIR", JOptionPane.YES_NO_OPTION);
        if (opcion == 0)
            System.exit(0);
    }
}
