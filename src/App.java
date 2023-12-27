import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Toplam soru sayısı kaçtır?");
        int cevap=scan.nextInt();
        Random rnd=new Random();
        int sayac=0;
    
        String  matris [][]=new String[cevap][cevap];
        String cevaplar[]=new String[cevap];
        for(int i=0;i<cevap;i++){
            int a=rnd.nextInt(5);
        switch(a){
            case 0:cevaplar[i]="A"; break;
            case 1:cevaplar[i]="B"; break;
            case 2:cevaplar[i]="C"; break;
            case 3:cevaplar[i]="D"; break;
            case 4:cevaplar[i]="E"; break;                    
        }
      
    }
     for (String x : cevaplar) 
       {
        System.out.println(x);
       }

    for(int i=0;i<cevap;i++){
     
    for(int j=0;j<cevap;j++){
        int a=rnd.nextInt(5);
        switch(a){
            case 0:matris[i][j]="A"; break;
            case 1:matris[i][j]="B"; break;
            case 2:matris[i][j]="C"; break;
            case 3:matris[i][j]="D"; break;
            case 4:matris[i][j]="E";break;
    }
}   
}
System.out.println("*********************************");  

        for (int i=0; i<cevap;i++){
             System.out.print((i+1)+" . öğrencinin cevapları: ");
             
            for(int j=0;j<cevap;j++){
                System.out.print(matris[i][j]+ " ");
                if(matris[i][j]==cevaplar[j]){
                    sayac++;
                }
                
        }
            System.out.println();
            System.out.println("Öğrencinin doğru cevap sayısı= "+ sayac);
            sayac=0;
    }

        }
    }

