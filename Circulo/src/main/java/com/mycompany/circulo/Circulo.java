/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.circulo;
//Yulieth Natalia Quiroga Alape
public class Circulo {
 double radio = 5;
 public void mostrar (){
     System.out.println("Circulo de radio" +radio+ "area de "+getArea ());
 }
 public double getArea(){
 return  2* Math.PI * radio;
 }
}