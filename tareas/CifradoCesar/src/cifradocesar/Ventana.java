
package cifradocesar;

import java.awt.Color;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Ventana extends JFrame {
    
    public Ventana(){
    this.setSize(500, 300);// tamaño de la ventana
        setLocation(500, 250);
    this.setTitle("CIFRADO CESAR");
    
    setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    this.getContentPane().setBackground(Color.GREEN);//establecemos color}
    componentes ();
    }
    
    private void componentes (){
        
        
        JPanel panel=new JPanel(); // creacion de un panel
    this.getContentPane().add(panel);
    panel.setBackground(Color.YELLOW);
   
    
        JLabel etiqueta=new JLabel("Bienvenido al mejor Traductor de codigo Cesar");       
        panel.add(etiqueta);
        
        JLabel vacio= new JLabel("                                     ");
        panel.add(vacio);
        
        JLabel etiqueta3 =new JLabel("Ingrese palabra");
        panel.add(etiqueta3);
        
        
        JTextField texto=new JTextField(15);
        panel.add(texto);

           JLabel vacio2= new JLabel("                                     ");
        panel.add(vacio2);
        
        JLabel clave =new JLabel("Cantidad de Desplasamiento");
        panel.add(clave);
        
        JTextField cl=new JTextField(15);
        panel.add(cl);
        

        JButton boton = new JButton("Codificar");
        JTextField resultado=texto;
        panel.add(boton);

        
        JLabel etiqueta2=new JLabel("Palabra codificada");
        panel.add(etiqueta2);
                
        JTextField texto2= new JTextField(20);
        panel.add(texto2);
        
        
                
    }
    
   
    
    
}
