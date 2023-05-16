import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class angka_random {
    public static void main(String[] args) {
         int angka_input,frekuensi;
         int a,j;
         int duplikat=0;
         Scanner input = new Scanner(System.in);
         
         ArrayList<Integer> angka = new ArrayList<Integer>();
         for(int i=0 ; i < 20 ; i++){
             System.out.print("Masukkan Angka Ke-"+(i+1)+" \t=");
             angka_input = input.nextInt();
             angka.add(angka_input);
         }
        Collections.sort(angka);
        for( a=0; a < angka.size(); a++){
            for( j=a+1; j<angka.size(); j++){
                if(angka.get(j) == angka.get(a)){
                   duplikat=1;
                }
            }
        }
        if(duplikat>0){
            System.out.println("\n\n\nAda Angka Yang Sama\n\n\n");
            for( a=0; a < angka.size(); a++){
                 frekuensi = 1;
                 for( j=a+1; j<angka.size(); j++){
                    if(angka.get(j) == angka.get(a)){
                       frekuensi++;
                    } 
                    else {
                      break;
                    }
                 }
                 a=j-1;
                 if(frekuensi > 1){
                    System.out.print(angka.get(a) + " ada " + frekuensi+"\n");
                 }
             }
        }
        else{
            System.out.println("\n\n\nTidak Ada Angka Yang Sama\n\n\n");
        }
     }
        
}
    
    
    
    
