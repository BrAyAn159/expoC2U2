/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelo;

/**
 *
 * @author ASUS
 */
public interface IManejador {
    public void peticion(int monto);
    public IManejador getSucesor();
    public void setSucesor(IManejador sucesor);
    
    
}
