package act3_ejercidio1_clase_abstracta;

public abstract class FIGURA {
    
    //ATRIBUTO
    private String color;
    
    //CONSTURCTOR
    public FIGURA(String color){
        this.color = color;
    }
    
    //GETTER
    public String getColor(){
        return color;
    }
    
    //METODO ABSTRACTO QUE CALCULA EL AREA
    public abstract double calcularArea();
}