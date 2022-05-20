package controlador.Administrador;

import modelo.dao.usuario.Usuario;
import modelo.dao.usuario.UsuarioDAO;
import modelo.dao.usuario.UsuarioDAOImpl;
import vista.Administrador.Administrador;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class ModeloTablaUsuario extends AbstractTableModel {
    private static final UsuarioDAO dao = new UsuarioDAOImpl();
    private static final String[] nombreColumnas =
            {"Nombre",
            "Apellidos",
            "Teléfono",
            "DNI",
            "Email",
            "Password"};

    private static final Object[][] insertarDatos = null;

    public ModeloTablaUsuario() {
        try {
            List<Usuario> listaUsuario = dao.obtenerTodosUsuarios();
            System.out.println(listaUsuario);
            for (int i = 0; i < listaUsuario.size(); i++){
                for(int j = 0; j < 6; j++){
                    //
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void salirAplicacion(){
        int o = JOptionPane.showConfirmDialog(null, "¿Estás seguro de salir?",
                "SALIR", JOptionPane.YES_NO_OPTION);
        if (o == 0)
            System.exit(0);
    }
    public static void main(String[] args) {
        new ModeloTablaUsuario();
    }

    @Override
    public int getRowCount() {
        return insertarDatos.length;
    }

    @Override
    public int getColumnCount() {
        return insertarDatos[6].length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        return insertarDatos[row][column];
    }
}


