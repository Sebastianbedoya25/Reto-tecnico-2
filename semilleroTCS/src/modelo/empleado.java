package modelo;

/**
 * @author Bedoya
 */
public class empleado {
    private String nombre;
    private int edad;
    private int salario;
    private int bonificacion;

    public empleado(){
        
    }
    
    public empleado(String nombre, int edad, int salario, int bonificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.bonificacion = bonificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(int bonificacion) {
        this.bonificacion = bonificacion;
    }

    public void setZona(String zona){
        
    }
    
    public int getComision(){
        return 0;
    }
    
    public void setComision(int comision){
        
    }
    
    public String getZona(){
        return "";
    }
    
   public void calcularBonificacion(int edad, int comision, String zona){
   }
}
