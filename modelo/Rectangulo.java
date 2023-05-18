package modelo;

public class Rectangulo extends Figura
{
    private double base;
    private double altura;

    public Rectangulo(double perimetro, double area)
    {
        super(perimetro, area);
        
    }
    //metodos  
    public void CalcularArea()
    {
        area= base*altura;

    }
    public void CalcularPerimetro()
    {
        perimetro= 2*(altura+base);

    }
    
    

    

    
}
