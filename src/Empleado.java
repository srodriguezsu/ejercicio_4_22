public class Empleado {
    /* nombre, salario basico por hora, numero de horas trabajadas en el mes */
    private String nombre;
    private float salarioBase, horasMes, salarioMensual;
    public Empleado(String nombre, float salarioBase, float horasMes){
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.horasMes = horasMes;
        calcularSalarioMensual();
    }
    private void calcularSalarioMensual(){
        this.salarioMensual = salarioBase * horasMes;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setSalarioBase(float salarioBase){
        this.salarioBase = salarioBase;
        calcularSalarioMensual();
    }

    public void setHorasMes(float horasMes) {
        this.horasMes = horasMes;
        calcularSalarioMensual();
    }

    public String getNombre() {
        return nombre;
    }

    public float getHorasMes() {
        return horasMes;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public float getSalarioMensual() {
        return salarioMensual;
    }


}
