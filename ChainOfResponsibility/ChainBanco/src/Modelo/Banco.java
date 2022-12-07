/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author ASUS
 */
public class Banco implements IManejador{
    private IManejador sucesor;

    @Override
    public void peticion(int monto) {
        CajeroAutomatico ca = new CajeroAutomatico();
        setSucesor(ca);
        
        CajeroSucursal cs = new CajeroSucursal();
        ca.setSucesor(cs);
        
        AsesorFinanciero af = new AsesorFinanciero();
        cs.setSucesor(af);
        
        sucesor.peticion(monto);
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
