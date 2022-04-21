import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JFrameAgenda extends JFrame implements ActionListener {
   JMenuBar barra;
   JMenu opciones;
   JMenuItem altas, consultar, buscar, eliminar, modificar;
   public JFrameAgenda() {
       iniciarMenu(); 
   }
   public void iniciarMenu(){
   
      setTitle("Proyecto Agenda");
      barra = new JMenuBar();
      opciones = new JMenu("Menu");
      altas = new JMenuItem("Altas");
      consultar = new JMenuItem("Consultar");
      buscar = new JMenuItem("Buscar");
      eliminar = new JMenuItem("Eliminar");
      modificar = new JMenuItem("Modificar");
      this.setJMenuBar(barra);
      barra.add(opciones);
      opciones.add(altas);
      opciones.add(consultar);
      opciones.add(eliminar);
      opciones.add(modificar);
      altas.addActionListener(this);
      consultar.addActionListener(this);
      eliminar.addActionListener(this);
      modificar.addActionListener(this);
      this.setBounds(500,100,475,335);
      this.setResizable(isMaximumSizeSet());
    	this.getContentPane().setBackground(Color.LIGHT_GRAY);
    	this.setVisible(true);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   public void actionPerformed(ActionEvent e) {
      if(e.getSource()==altas){
          new JFrameAltas();
      }
        if(e.getSource()==consultar){
            if(ZPersona.Arrpersona.size()>0){
                new JFrameConsultas();
            }else{
                JOptionPane.showMessageDialog(null, "NO SE TIENEN REGISTROS",
						"Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        if(e.getSource()==modificar){
            if(ZPersona.Arrpersona.size()>0){
                new JFrameModificar();
            }else{
                JOptionPane.showMessageDialog(null, "NO SE TIENEN REGISTROS",
						"Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        if(e.getSource()==eliminar){
            if(ZPersona.Arrpersona.size()>0){
                new JFrameEliminar();
            }else{
                JOptionPane.showMessageDialog(null, "NO SE TIENEN REGISTROS",
						"Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}