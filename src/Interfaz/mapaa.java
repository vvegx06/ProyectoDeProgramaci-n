/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author gaort
 */
public class mapaa {
    private String[] zona1 = {"Oso polar"};
    private String[] zona2 = {"Jirafa", "Zebra", "Camello", "Leopardo", "avestruz", "Tigre"};
    private String[] zona3 = {"Leon",};
    private String[] zona4 = {"Lemur", "Congo", "Cabra"};
    
    public void mostrar1() {
        String muestra = "";
        for (int i = 0; i < zona1.length; i++) {
            muestra += "Animales en esta zona: " + zona1[i];
            
        }
        JOptionPane.showMessageDialog(null, muestra);
    }
    
    public void mostrar2() {
        String muestra2 = "";
        for (int i = 0; i < zona2.length; i++) {
            muestra2 += "Animales en esta zona: " + zona2[i] + "\n";
            
        }
        JOptionPane.showMessageDialog(null, muestra2);
    }
    
    public void mostrar3() {
        String muestra3 = "";
        for (int i = 0; i < zona3.length; i++) {
            muestra3 += "Animales en esta zona:" + zona3[i];
            
        }
        JOptionPane.showMessageDialog(null, muestra3);
   
    }
    
    public void mostrar4() {
        String muestra4 = "";
        for (int i = 0; i < zona4.length; i++) {
            muestra4 += "Animales en esta zona: " + zona4[i] + "\n";
            
        }
        JOptionPane.showMessageDialog(null, muestra4);
    }
    
    }
    

