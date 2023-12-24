import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {


        System.out.println("Sayi Giriniz");

        Scanner scanner = new Scanner(System.in);
        
       int n= scanner.nextInt();

      
        for(int i=1; i<=n; i*=5){
            
            System.out.println(i);
            
        }
        
        for(int j=1; j<=n; j*=4){
            
            System.out.println(j);
            
        }


System.out.println("Sayi 4 ve 5 kuvveti :");
        

       
        scanner.close();
	}
}
