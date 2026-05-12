public class Circulo extends Formas2D { // necessario impletar area
    
    public Circulo (double altura, String nome){
        super(altura, nome);
    }

    public double area(){
        double pi = 3.14;
        double raio = getAltura()/2;
        return (raio * raio)*pi;
    }

    public String toString(){
        return "Circulo: [raio: "+ (getAltura()/2) + ", diametro: "+ getAltura()+ "]";
    }
}
