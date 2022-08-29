package POO_Programacion.PruebaFiguras;

public class TrianguloRectangulo {

  private  int base; // Atributo que define la base de un triángulo rectángulo
   private  int altura; // Atributo que define la altura de un triángulo rectángulo

   
    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    
    double calcularArea() {
        return (base * altura / 2);
    }

   
    double calcularPerímetro() {
        return (base + altura + calcularHipotenusa());
        
    }

    double calcularHipotenusa() {
        return Math.pow(base * base + altura * altura, 0.5);
    }

  
    void determinarTipoTriángulo() {
        if ((base == altura) && (base == calcularHipotenusa()) && (altura== calcularHipotenusa())) {
            
          System.out.println("Es un triángulo equilátero");
                    } else if  ((base != altura) && (base != calcularHipotenusa()) &&(altura != calcularHipotenusa())) {
                       System.out.println("Es un triángulo escaleno");
                       
                       
        }else 
                        System.out.println("Es un triángulo isósceles");
                                
    }  
}
