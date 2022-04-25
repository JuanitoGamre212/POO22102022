/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentahabiente;

/**
 *
 * @author Emiliano
 */
public class Cuentahabiente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     CuentaHabiente1 usuario1 = new CuentaHabiente1("SAID", 422938540, 50000);
     CuentaHabiente1 usuario2 = new CuentaHabiente1("PEDRO", 122222222, 20000);
     CuentaHabiente1 usuario3 = new CuentaHabiente1("YAMILET", 19191911, 30000);
       
      System.out.println(usuario1);
        
      usuario1.retirarDinero(50000);
      
      
      System.out.println(usuario2);

      
       usuario2.retirarDinero(20000);
       
       
       System.out.println(usuario3);
       
       usuario3.retirarDinero(30000);
    
    
       System.out.println("--------------LISTA DEL  ARREGLO----------- ");
      
      CuentaHabiente1[] lista=new CuentaHabiente1[5];
         
      lista[0]=new CuentaHabiente1("CRITRIAN", 34321111, 70000);
      
      lista[1]=new CuentaHabiente1("HUMBERTO", 0201010101, 12000);
      lista[2]=new CuentaHabiente1("ANDREA", 49678902, 45000);
      lista[3]=new CuentaHabiente1("XIMENA", 49678902, 75000);
      lista[4]=new CuentaHabiente1("ROGELIO", 49678902, 85000);
      
      
        for (CuentaHabiente1 cuentahabiente : lista) {
            cuentahabiente.retirarDinero(70000);
        }
        
    }
    
}
