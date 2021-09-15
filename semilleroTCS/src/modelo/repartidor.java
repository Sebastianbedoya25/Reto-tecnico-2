/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Bedoya
 */
public class repartidor extends empleado{
    private String zona;

    public repartidor(String nombre, int edad, int salario, int bonificacion, String zona) {
        super(nombre, edad, salario, bonificacion);
        this.zona = zona;
    }

    public repartidor() {
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
    
    
    public void calcularBonificacion(int edad, int comision, String zona){
        if ((zona.equals("Zona 3")) && (edad < 25)){
            setBonificacion(150000);
        }else{
            setBonificacion(0);
        }
    }
    
}
