public abstract class Formas2D {
    private double largura;
    private double altura;
    private String nome;

    public Formas2D(){
        this.altura = this.largura = 0.0;
        this.nome = "nada";
    }

    public Formas2D(double w, double h, String n) {
        this.largura = w;
        this.altura = h;
        this.nome = n;
    }

    //Todos os lados iguais
    public Formas2D(double x, String nome) {
        this.altura = this.largura = x;
        this.nome = nome;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Metodo abstrato
    public abstract double area();

    @Override
    public String toString() {
        return "Formas2D [largura=" + largura 
        + ", altura=" + altura 
        + ", nome=" + nome 
        + ", Largura()=" + getLargura() 
        + ", Altura()=" + getAltura()
        + ", Nome()=" + getNome() 
        + ", Class()="  + getClass() 
        + ", toString()=" + super.toString() + "]";
    }

    

}
