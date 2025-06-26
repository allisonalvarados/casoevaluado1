
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 50672
 */
public class Factura {
  
    private double monto;
    private int electrico;
    private int automotriz;
    private int construccion;

    public Factura(double monto, int electrico, int automotriz, int construccion) {
        this.monto = monto;
        this.electrico = electrico;
        this.automotriz = automotriz;
        this.construccion = construccion;
    }

    public double getMonto() {
        return monto;
    }

    public int getElectrico() {
        return electrico;
    }

    public int getAutomotriz() {
        return automotriz;
    }

    public int getConstruccion() {
        return construccion;
    }
}


