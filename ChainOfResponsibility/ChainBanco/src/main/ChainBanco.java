/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import Modelo.Banco;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class ChainBanco {
    
    public static void main(String[] args) {
        
        int monto = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el monto a retirar"));
        
        Banco banco = new Banco();
        banco.peticion(monto);
        
        
    }
    
}
