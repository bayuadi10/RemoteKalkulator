
package remotekalkulator;

import java.rmi.Naming;
import java.util.Scanner;
public class CalciClient{
    public static void main(String arg[]){
Scanner s = new Scanner(System.in);
try{
    CalciInterface c = (CalciInterface)Naming.lookup("rmi://localhost:1099/Calci");
    System.out.println("Client terhubung ke Server");
    System.out.println("Masukan operasi penghitungan :\n"
            + "1. Penjumlahan \n"
            + "2. Pengurangan \n"
            + "3. Perkalian \n"
            + "4. Pembagian ");
    int co = s.nextInt();
    int a,b;
    switch(co)
    {
        case 1:
        {
            System.out.println("Masukan Angka");
            
            a=s.nextInt();
            System.out.println("+");
            b=s.nextInt();
            System.out.println("Hasil dari "+a+ " ditambah "+b+" adalah : "+ c.add(a,b));
            break;
        }
          case 2:
          {
            System.out.println("Masukan Angka");
            a=s.nextInt();
            System.out.println("-");
            b=s.nextInt();
            
           
            System.out.println("Hasil dari "+a+ " dikurang "+b+" adalah : " + c.sub(a,b));
            break;
           }
      case 3:
      {
            System.out.println("Masukan Angka");
            a=s.nextInt();
            System.out.println("*");
            b=s.nextInt();
            System.out.println("Hasil dari "+a+ " dikali "+b+" adalah : " + c.mul(a,b));
            break;
    }
      case 4:
      {
            System.out.println("Masukan Angka");
            a=s.nextInt();
            System.out.println("/");
            b=s.nextInt();
            System.out.println("Hasil dari "+a+ " dibagi "+b+" adalah : " + c.div(a,b));
            break;
   
        }
       }
}catch (Exception e)
    {
        
    System.out.println("exception :"+e);
    
    }
}
}