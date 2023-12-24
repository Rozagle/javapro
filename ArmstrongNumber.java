import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    
 Scanner scanner = new Scanner(System.in);
        
        System.out.print("sayi değerini giriniz: ");
        int number= scanner.nextInt();
        
        int lastindex=0;
        int tempNumber = number;
        int basamaksayisi=0;
        int basamakdegeri;
        int result = 0;
        int basPow=1;
        
        
        while(tempNumber!=0){
            tempNumber/=10;
            basamaksayisi++;
        //System.out.print(basamaksayisi);
        }
        
        tempNumber = number;
        while(tempNumber!=0){
            basamakdegeri=tempNumber%10;
            //System.out.print(basamakdegeri);
             basPow =1;
          for (int i=1;i<=basamaksayisi ;i++ ) {
            
            basPow *=  basamakdegeri;            
            }
            result +=basPow;
            tempNumber/=10;
        }
        
        System.out.print(result);
        scanner.close();
}

}
