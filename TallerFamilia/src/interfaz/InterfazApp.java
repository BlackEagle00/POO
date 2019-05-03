/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package interfaz;
import mundo.Familia;

/**
 *
 * @author BOG-A406-E-002
 */
public class InterfazApp {
 
 private Familia mif;
 
 InterfazApp(){
   
  
 
 }
 
 public static void main(String []args){
   
  System.out.println();
  
  Familia obj1= new Familia(15,"Oscar",1.65);
  Familia obj2= new Familia(17,"Pedro",1.75);
  Familia obj3= new Familia(20,"Ana",1.55);
  
  System.out.println(obj1.getNombre());
  System.out.println(obj2.getEdad());
  System.out.println(obj3.getEstatura());
  
  obj2.setEdad(16);
  System.out.println(obj1.getNombre());
  System.out.println(obj2.getEdad());
  System.out.println(obj3.getEstatura());
  
  //Cambiar apellido por medio de objeto
  obj1.setApellido("Alvarez");
  System.out.println(obj1.getApellido());
  System.out.println(obj2.getApellido());
  System.out.println(obj3.getApellido());
 
  //Cambiar apellido por medio de clase
  Familia.setApellido("Gomez");
  System.out.println(obj1.getApellido());
  System.out.println(obj2.getApellido());
  System.out.println(obj3.getApellido());
  
 }
}
