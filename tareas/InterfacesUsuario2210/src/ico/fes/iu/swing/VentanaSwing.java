/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.iu.swing;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Emiliano
 */
public class VentanaSwing extends JFrame{
   private FlowLayout layaut;
   private JTextField cuadroTexto;

    public VentanaSwing() throws HeadlessException {
        this.setTitle("Mi Ventana Swing");
        this.setSize(300,220);
        this.setVisible(true);
        layaut=new FlowLayout();
        this.setLayout(layaut);
        cuadroTexto=new JTextField(15);
        this.getContentPane().add(cuadroTexto);
        this.validate();
        
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
                //((JFrame)e.getSource()).setVisible(false);
                
            }
            
        });
      
        
    }
    
    
}
