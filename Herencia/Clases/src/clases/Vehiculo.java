/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author ESTUDIANTES
 */

public class Vehiculo {
    
    private String fechaFabricacion;
    private String VINChasis;
    private String VINMotor;

    public Vehiculo(String fechaFabricacion, String VINChasis, String VINMotor) {
        this.fechaFabricacion = fechaFabricacion;
        this.VINChasis = VINChasis;
        this.VINMotor = VINMotor;
    }

    public String getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(String fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public String getVINChasis() {
        return VINChasis;
    }

    public void setVINChasis(String VINChasis) {
        this.VINChasis = VINChasis;
    }

    public String getVINMotor() {
        return VINMotor;
    }

    public void setVINMotor(String VINMotor) {
        this.VINMotor = VINMotor;
    }
}
