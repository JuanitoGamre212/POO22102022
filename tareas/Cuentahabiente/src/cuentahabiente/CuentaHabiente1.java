/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentahabiente;

/**
 *
 * @author Emiliano
 */
public class CuentaHabiente1 {
    
   private String NombreCliente;
   private int ide;
   private int Balance;
   
 public CuentaHabiente1() {
    }
   
    public CuentaHabiente1(String NombreCliente, int ide, int Balance) {
        this.NombreCliente = NombreCliente;
        this.ide = ide;
        this.Balance = Balance;
    }
   
    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public int getIde() {
        return ide;
    }

    public void setIde(int ide) {
        this.ide = ide;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int Balance) {
        this.Balance = Balance;
    }

    @Override
    public String toString() {
        return "CuentaHabiente1{" + "NombreCliente=" + NombreCliente + ", ide=" + ide + ", Balance=" + Balance + '}';
    }
    
    public void retirarDinero( float monto ){
          
          System.out.println("el balance totoal es de : " );
         
          System.out.println(this.Balance - 10000); 
          
          if(Balance < 50000){
              
              System.out.println("cliente regular y el nombre del usuario es : " + this.NombreCliente);
              
          }else{
              
              System.out.println("cliente premium y su nombre es "+ this.NombreCliente);
              
              
          }
         // System.out.println("el nombre del cliente premium es es  "+this.NombreCliente);
      
       
      
      
  }
    
}
