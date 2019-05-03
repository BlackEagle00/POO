/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

/**
 *
 * @author BOG-A406-E-002
 */
public class Familia {
 
 
 
 private int edad;
 private static String apellido;
 private String nombre;
 private double estatura;
 
 public Familia(int edad, String nombre, double estatura) {
  this.edad = edad;
  this.nombre = nombre;
  this.estatura = estatura;
  
 }
 
 public int getEdad() {
  return edad;
 }

 public void setEdad(int edad) {
  this.edad = edad;
 }

 public static String getApellido() {
  return apellido;
 }

 public  static void setApellido(String apellido) {
  Familia.apellido = apellido;
 }

 public String getNombre() {
  return nombre;
 }

 public void setNombre(String nombre) {
  this.nombre = nombre;
 }

 public double getEstatura() {
  return estatura;
 }

 public void setEstatura(double estatura) {
  this.estatura = estatura;
 }
 
 
 
}
