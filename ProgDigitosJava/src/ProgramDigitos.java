    import java.math.*;
    import java.util.Scanner;
    
    public class ProgramDigitos {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int num, cont , digito, num_orig;
    
    System.out.println(" Ingresa un numero ");
    num = teclado.nextInt();
    num_orig = num;
    cont = 1;
    System.out.println(" Los digitos de: " + num + " son ");
    while (num >= 9){ //
        digito = num % 10;
        System.out.println(" digito " +digito);
        cont += 1;
        num = (int)Math.floor(num/10); //método de trunc
    }
    System.out.println(" num  " + num);
    System.out.println(" tiene " + cont +" digitos ");

    }
  }
