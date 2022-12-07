/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class CajeroSucursal implements IManejador {
    private IManejador sucesor;

    @Override
    public void peticion(int monto) {
        if(monto > 100 && monto < 500){
            JOptionPane.showMessageDialog(null, "La peticion a sido atendida por el cajero de la sucursal");
    }else{
    sucesor.peticion(monto);
}
        
}
    @Override
    public IManejador getSucesor() {
        return sucesor;
    }
    

    @Override
    public void setSucesor(IManejador sucesor) {
        this.sucesor = sucesor;
        
    
    
}
}

