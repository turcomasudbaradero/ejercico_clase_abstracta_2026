package act3_ejercidio1_clase_abstracta;

public class Cuadrado extends FIGURA {
    
    //ATRIBUTO
    private double lado;
    
    //CONSTRUCTOR
    public Cuadrado(String color, double lado){
        super(color);
        this.lado = lado;
    }
    
    //GETTER
    public double getLado(){
        return lado;
    }
    
    //SETTER
    public void setLado(double lado){
        this.lado = lado;
    }
    
    //IMPLEMENTACION DEL METODO ABSTRACTO
    @Override
    public double calcularArea(){
        return lado*lado;
    }

}