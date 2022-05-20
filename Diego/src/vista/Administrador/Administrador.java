package vista.Administrador;

import javax.swing.*;
import java.awt.*;

public class Administrador {
    private static Font fuenteBotones = new Font("Sherif",Font.ITALIC,20);

    private JPanel panelPrincipal;
    private JPanel panelSuperior;
    private JTextField administradorTextField;
    private JPanel panelInferior;
    private JButton crearUsuarioButton;
    private JButton buscarUsuarioButton;
    private JButton modificarUsuarioButton;
    private JButton salirButton;
    private JTable Tabla;
    private JScrollPane scrollPane1;

    public Administrador (){
        JFrame ventana = new JFrame("Administrador");
        ventana.setSize(500, 500);
        createUIComponents();
        ventana.setContentPane(panelPrincipal);
        ventana.setContentPane(panelInferior);
        ventana.setContentPane(panelSuperior);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //ventana.pack();
        GridLayout layout = new GridLayout(4,4, 4,4);
        Container contenedor = ventana.getContentPane();
        contenedor.setLayout(new BorderLayout());
        contenedor.setLayout(layout);
        JPanel panelCentral = crearPanelCentral();
        contenedor.add(panelCentral, BorderLayout.CENTER);
        JPanel panelSuperior = crearPanelSuperior();
        contenedor.add(panelSuperior, BorderLayout.NORTH);
        JPanel panelInferior = crearPanelInferior();
        contenedor.add(panelInferior, BorderLayout.SOUTH);

        ventana.setVisible(true);
        }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        scrollPane1 = new JScrollPane();

    }
    private JPanel crearPanelInferior(){
        JPanel panel = new JPanel();
        crearUsuarioButton.setFont(fuenteBotones);
        modificarUsuarioButton.setFont(fuenteBotones);
        buscarUsuarioButton.setFont(fuenteBotones);
        salirButton.setFont(fuenteBotones);
        crearUsuarioButton = new JButton("Crear");
        panel.add(crearUsuarioButton);
        buscarUsuarioButton = new JButton("Buscar");
        panel.add(buscarUsuarioButton);
        modificarUsuarioButton = new JButton("Modificar");
        panel.add(modificarUsuarioButton);
        salirButton = new JButton("Salir");
        panel.add(salirButton);
        return panel;
    }
    private static JPanel crearPanelSuperior() {
        JPanel panel = new JPanel();


        return panel;
    }

    private static JPanel crearPanelCentral() {
        JPanel panel = new JPanel();
        return panel;
    }
    public static void main(String[] args) {
        new Administrador();
    }

    public JButton getCrearUsuarioButton() {
        return crearUsuarioButton;
    }

    public JButton getBuscarUsuarioButton() {
        return buscarUsuarioButton;
    }

    public JButton getModificarUsuarioButton() {
        return modificarUsuarioButton;
    }

    public JButton getSalirButton() {
        return salirButton;
    }
}
