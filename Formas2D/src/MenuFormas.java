// Esta classe serve p/ implementar rotinas de menu

import java.util.Scanner;

public class MenuFormas {
   private Scanner teclado;

   public MenuFormas(){
    teclado = new Scanner(System.in);
   }

   public void encerraSistema(){
    teclado.close();
}
    public int exibirMenu(){
        String texto = "--- FORMAS 2D --- \n" + 
                       "1 - Cadastrar Formas \n"+
                       "2 - Lista Formas \n"+
                       "0 - Sair \n"+
                       "Digite uma das opções \n" +
                       "------------------- \n";
        System.out.println(texto);
        return teclado.nextInt();
    }
   
    public Formas2D cadastraFormas2D(){
    System.out.println("Qual forma deseja cadastrar? \n"+
                       "1 - Circulo \n"+
                       "2 - Retangulo \n"+
                       "3 - Triangulo \n");    
    int optionForma = teclado.nextInt();

     System.out.println("digite o nome da forma: ");
     String nome = teclado.next();
     System.out.println("digite a altura da forma: ");
     String altura = teclado.next();
     System.out.println("digite a largura da forma: ");
     String largura = teclado.next();
    switch (optionForma) {
        case 1:
         Circulo c = new Circulo(altura, nome);
        return c;
        case 2:
            if(altura == largura){
            Retangulo r = new Retangulo(largura);
            return r;
            }else{
                Retangulo r = new Retangulo(altura, largura);
                return r;
            }

            case 3:
                System.out.println("Digite o estilo do triangulo:");
                String estilo = teclado.next();
                Triangulo t = new Triangulo(nome, largura, altura);
                return t;
        default:
            break;

    }
    return null;
    }
}
