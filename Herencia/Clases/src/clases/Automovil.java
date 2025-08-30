/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author ESTUDIANTES
 */

public class Automovil extends Vehiculo {

    private String marca;
    private String modelo;
    private double precio;

    public Automovil(String fechaFabricacion, String VINChasis, String VINMotor, String marca, String modelo, double precio) {
        
        super(fechaFabricacion, VINChasis, VINMotor);
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void mostrarDatos() {
        System.out.println("Datos del Automóvil:");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Precio: $" + String.format("%.2f", getPrecio()));
        System.out.println("Fecha de Fabricación: " + getFechaFabricacion());
        System.out.println("VIN Chasis: " + getVINChasis());
        System.out.println("VIN Motor: " + getVINMotor());
    }
}
