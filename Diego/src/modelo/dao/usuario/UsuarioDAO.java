package modelo.dao.usuario;

import java.sql.SQLException;
import java.util.List;

public interface UsuarioDAO {
    Usuario crearUsuario(Usuario usuario) throws SQLException;
    boolean eliminarUsuarioPorDNI(String dni) throws SQLException;
    boolean actulizarUsuarioPorDNI(String dni, Usuario newUsuario)throws SQLException;
    Usuario buscarUsuario(String dni)throws  SQLException;

    boolean eliminarUsuario(String dni);

    boolean actualizarUsuario(String dni, Usuario newUsuario) throws SQLException;

    boolean actualizarUsuarioPorDNI(String dni, Usuario newUsuario) throws SQLException;

    Usuario buscarUsuarioPorDni(String dni) throws SQLException;

    List<Usuario> obtenerTodosUsuarios() throws SQLException;

    Usuario loguearUsuario (String email, String password) throws SQLException;

    Usuario loguearUsuarios(String email, String password) throws SQLException;

    boolean mandarDatosAFichero(String path);

    boolean guardarDatosBD(String path);

    int buscarIDUsuarioPorDni(String dniUsuario);

    Usuario buscarUsuarioPorId(int idUsuario);

/* Semana santa
    método de logueo: email, password: Usuario (SQL)

    método que vuelque los datos de la bd a un fichero csv, argumento nombre fichero
    método que vuelque los datos de un fichero csv a la BD, argumento nombre fichero
     */

}
