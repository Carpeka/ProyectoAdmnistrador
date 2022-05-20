package controlador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class buscarUsuarioButton extends JFrame{

    public buscarUsuarioButton(){

        super("Botón");
        setSize(200,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        JButton boton = new JButton();
        boton.addActionListener(new EventoBotonPulsado());
        cp.add(boton);

    }

    public List<String> listaNombres = new ArrayList<>();

    public class EventoBotonPulsado implements ActionListener {
        public void actionPerformed(ActionEvent e) {



        }
    }

}
