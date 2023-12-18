
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int X;

        System.out.println("Veja se seu valor é par ou ímpar");
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nDigite um número inteiro:  ");
        X = sc.nextInt();
        
        if (X == 0) {
        	System.out.println("Número nulo :(");
        }
        
        else if (X % 2 == 0 ) {
        	 System.out.print("\nO número é par!");
        }
        
        else if (X % 2 != 0) {
        	 System.out.print("\nO número é Ímpar!"); 
        }
        
        else {
        	System.out.print("\nO número é nulo!");
        }
     
        	sc.close();
        	
        }
        
    }
