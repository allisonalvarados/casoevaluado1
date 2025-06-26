/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoevaluado1;

/**
 *
 * @author 50672
 */
public class Datos {
    //Datos a solicitar
    private String nombreCliente;
    private String cedulaCliente;
    private String codigoFactura;
    private double montoFactura;
    private int mes;
    private String productosElectricos;
    private String productosAutomotrices;
    private String productosConstruccion;

    //Constructores
    public Datos(String nombreCliente, String cedulaCliente, String codigoFactura, double montoFactura, int mes, String productosElectricos, String productosAutomotrices, String productosConstruccion) {
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
        this.codigoFactura = codigoFactura;
        this.montoFactura = montoFactura;
        this.mes = mes;
        this.productosElectricos = productosElectricos;
        this.productosAutomotrices = productosAutomotrices;
        this.productosConstruccion = productosConstruccion;
    }
    
    //Setters and getters

    public String getProductosConstruccion() {
        return productosConstruccion;
    }

    public void setProductosConstruccion(String productosConstruccion) {
        this.productosConstruccion = productosConstruccion;
    }
    


    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public String getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public double getMontoFactura() {
        return montoFactura;
    }

    public void setMontoFactura(double montoFactura) {
        this.montoFactura = montoFactura;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public String getProductosElectricos() {
        return productosElectricos;
    }

    public void setProductosElectricos(String productosElectricos) {
        this.productosElectricos = productosElectricos;
    }

    public String getProductosAutomotrices() {
        return productosAutomotrices;
    }

    public void setProductosAutomotrices(String productosAutomotrices) {
        this.productosAutomotrices = productosAutomotrices;
    }
    
}

   