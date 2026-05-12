import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      ArrayList<Formas2D> listaFormas = new ArrayList<>();
      int option = 0;
      MenuFormas menuFormas = new MenuFormas(); 
      
      do{
        option = MenuFormas.exibirMenu();
        switch (option) {
            case 1:
                listaFormas.add(menuFormas.cadastraFormas2D());
                break;
            case 2:
                for (Formas2D formas2d : listaFormas) {
                    System.out.println(formas2d.toString());
                }
                break;
            case 3:
                for (Formas2D formas2d : listaFormas) {
                    System.out.println("area da Forma " + formas2d.getNome() + ": " + formas2d.area());
                }
                break;
            case 0:
                menuFormas.encerraSistema(); // encerrar o scanner
                break;
            default:

                break;
        }


      }while(option !=0);
      
    }
}
