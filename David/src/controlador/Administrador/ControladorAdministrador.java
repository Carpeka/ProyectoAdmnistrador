package controlador.Administrador;

import modelo.dao.usuario.UsuarioDAO;
import vista.Administrador.Administrador;

import javax.swing.*;

public class ControladorAdministrador {
    private Administrador vista;
    private UsuarioDAO modelo;

    public ControladorAdministrador(Administrador vista, UsuarioDAO modelo) {
        this.vista = vista;
        this.modelo = modelo;
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
        int o = JOptionPane.showConfirmDialog(null, "¿Estás seguro de salir?",
                "SALIR", JOptionPane.YES_NO_OPTION);
        if (o == 0)
            System.exit(0);
    }
}


