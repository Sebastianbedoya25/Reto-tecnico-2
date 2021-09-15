package modelo;

/**
 *
 * @author Bedoya
 */
public class comercial extends empleado{
    private int comision;

    public comercial() {
    }
    
    public comercial(String nombre, int edad, int salario, int bonificacion, int comision) {
        super(nombre, edad, salario, bonificacion);
        this.comision = comision;
    }
    
    public int getComision() {
        return comision;
    }

    
    public void setComision(int comision) {
        this.comision = comision;
    }
    
    
    public void calcularBonificacion(int edad, int comision, String zona){
        if ((edad > 30) && (comision > 400000)){
            setBonificacion(150000);
        }else{
            setBonificacion(0);
        }
    }
}
