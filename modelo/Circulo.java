package modelo;

public class Circulo extends Figura
{

    //atributos
    private double radio ;
 
    public Circulo(double perimetro, double area) 
    {
        super(perimetro, area);
    }


    //metodos
    
    public void CalcularArea(double radio)
    {
        area = Math.PI * (radio*radio) ;
    }

    public void CalcularPerimetro(double radio)
    {
        perimetro = 2*Math.PI * radio ;
    }
    public double getRadio() 
    {
        return radio;

    }


    
    

   
}