import java.util.Scanner;
class ortalama {
public static void main(String[] args) {
Scanner inp = new Scanner(System.in);      
        
System.out.print("mat Notunuz : ");
int mat = inp.nextInt(); 
System.out.print("Fizik Notunuz : "); 
int fizik = inp.nextInt(); 
System.out.print("Kimya Notunuz : "); 
int kimya = inp.nextInt(); 
System.out.print("TUrkqe Notunuz : ");
int turkce = inp.nextInt(); 
System.out.print("IHnih Notunuz : ");
int tarih = inp.nextInt(); 
System.out.print("Muzik Notunuz : ");
int muzik = inp.nextInt(); 
int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
double sonuc = toplam / 6.0; 
System.out.println(sonuc);
    }
}
