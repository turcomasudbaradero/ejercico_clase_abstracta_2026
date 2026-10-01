package act3_ejercicio1_clase_abstracta;

public class Triangulo extends FIGURA {
    
    //ATRIBUTO
    private double base;
    private double altura;
    
    //CONSTRUCTOR
    public Triangulo(String color, double base, double altura){
        super(color);
        this.base = base;
        this.altura = altura;
    }
    
    //GETTERS
    public double getBase(){
        return base;
    }
    
    public double getAltura(){
        return altura;
    }
    
    //SETTERS
    public void setBase(double base){
        this.base = base;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    //IMPLEMENTACIONS DEL METODO ABSTRACTO
    @Override
    public double calcularArea(){
        return (base*altura)/2;
    }
    
}