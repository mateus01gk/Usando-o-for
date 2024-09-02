import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
System.out.println("digite quantos números serão somados");
 int n = sc.nextInt();
 int soma = 0;
 for(int i = n; i<4;i++){
   System.out.println(" 0 é o numero a ser somado:");
   int y = sc.nextInt();
    soma += y;
 }
 System.out.println("o resultado da soma é:"+soma);

sc.close();
  }
}