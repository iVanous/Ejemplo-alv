package poo_columba;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Columba Martínez
 * @description Métodos para capturar variables
 */

//Clase
public class CapturarVariables {
    public static float capturarFlotante (){
      Scanner cad = new Scanner (System.in);
      float n;
      try{
        n = cad.nextFloat();
        return (n);
      }catch(InputMismatchException e){
          System.out.println("\nNo es un número.");
          return -1;
      }
    }
    public static int capturarEntero (){
      Scanner cad = new Scanner (System.in);
      int n;
      try{
        n = cad.nextInt();
        return (n);
      }catch(InputMismatchException e){
          System.out.println("\nNo es un número.");
          return -1;
      }
    }
    public static String capturasting (){
      Scanner cad = new Scanner (System.in);
      String n;
      n =cad.nextLine();
      return (n);
    } 
    public static boolean capturaboolean(){
      Scanner cad = new Scanner (System.in);
      boolean n;
      n=cad.nextBoolean();
      return (n);
    }
    public static double capuradouble(){
      Scanner cad = new Scanner (System.in);
      double n;
      try{
        n=cad.nextDouble();
        return (n);
      }catch(InputMismatchException e){
          System.out.println("\nNo es un número.");
          return -1;
      }
    }
    public static long capturalong(){
      Scanner cad = new Scanner (System.in);
      long n;
      n=cad.nextLong();
      return (n);
    }
    public static short capturashort(){
      Scanner cad = new Scanner (System.in);
      short n;
      n=cad.nextShort();
      return (n);
    }
    public static byte capturabyte(){
      Scanner cad = new Scanner (System.in);
      byte n;
      n=cad.nextByte();
      return (n);
    }
    public static char capturachar(){
      Scanner cad = new Scanner (System.in);
      char n;
      n=cad.next().charAt(0);
      return (n);
    }
}