package controlador.Administrador;

import modelo.dao.usuario.Usuario;
import modelo.dao.usuario.UsuarioDAO;
import modelo.dao.usuario.UsuarioDAOImpl;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.sql.SQLException;
import java.util.List;

public class ModeloTablaUsuario extends AbstractTableModel {
    private static final UsuarioDAO dao = new UsuarioDAOImpl();
    private static List<Usuario> listaUsuario = null;
    static {
        try {
            listaUsuario = dao.obtenerTodosUsuarios();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static final String[] nombreColumnas =
            {"Nombre",
                    "Apellidos",
                    "Teléfono",
                    "DNI",
                    "Email",
                    "Rol"};

    private static final Object[][] data = new Object[listaUsuario.size()][nombreColumnas.length];

    public ModeloTablaUsuario() {
        for (int i = 0; i < listaUsuario.size(); i++){
            for(int j = 0; j < nombreColumnas.length; j++){
                switch (j){
                    case 0:
                        data[i][0] = listaUsuario.get(i).getNombre();
                        break;
                    case 1:
                        data[i][1] = listaUsuario.get(i).getApellidos();
                        break;
                    case 2:
                        data[i][2] = listaUsuario.get(i).getTelefono();
                        break;
                    case 3:
                        data[i][3] = listaUsuario.get(i).getDni();
                        break;
                    case 4:
                        data[i][4] = listaUsuario.get(i).getEmail();
                        break;
                    case 5:
                        data[i][5] = listaUsuario.get(i).getRol();
                        break;
                }
            }
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
        return data.length;
    }

    @Override
    public int getColumnCount() {
        return data[6].length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        return data[row][column];
    }
}
