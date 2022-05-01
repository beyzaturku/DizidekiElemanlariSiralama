
package dizininelemanlarinisiralama;
import java.util.*;
public class DizininElemanlariniSiralama {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dizinin boyutunu giriniz:");
        int boyut = input.nextInt();
        
        int[] dizi = new int[boyut];
        
        System.out.println("Dizinin elemanlarını giriniz:");
        
        for(int i=0; i<dizi.length;i++)
        {
            System.out.print((i+1) + ".elemanı:" );
            dizi[i] = input.nextInt();
        }
        
        System.out.print("Sıralama:");
        
        /*for(int i=0;i<dizi.length;i++){
            System.out.print(dizi[i] + " ");
        } */
        
        Arrays.sort(dizi);
        System.out.println();
        System.out.println(Arrays.toString(dizi));
    }
    
}
