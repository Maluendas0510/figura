package ejecutable;
import javax.swing.JOptionPane;

import modelo.Circulo;
import modelo.Rectangulo;

public class Test 
{
    public static void main(String[] args) 
    {
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la base "));
        double base = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la altura "));
        double radio = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del radio  "));

        Circulo miCirculo = new Circulo(radio, radio) ;
        miCirculo.CalcularArea(radio);
        miCirculo.CalcularPerimetro(radio);
        JOptionPane.showMessageDialog( null, "El area del ciruculo es :" + miCirculo.getArea() + "\nEl perimetro es :  "+ miCirculo.getPerimetro());

        Rectangulo miRectangulo = new Rectangulo(base,altura);
        miRectangulo.CalcularArea();
        miRectangulo.CalcularPerimetro();
        JOptionPane.showMessageDialog( null, "El area del rectangulo es :" + miRectangulo.getArea()+ "\nEl perimetro es :  "+ miRectangulo.getPerimetro());




        
    }


    
}
