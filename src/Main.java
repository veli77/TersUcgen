import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int satir;
        Scanner giris = new Scanner(System.in);
        System.out.println("Satır Sayısı Giriniz : ");
        satir = giris.nextInt();

        for(int i = satir; i > 0 ; i--){
           for(int b = 0;b<satir-i;b++){
               System.out.print(" ");
           }
           for(int y = 1; y<= (i*2)-1;y++){
               System.out.print("*");
           }
            System.out.println();
        }


    }
}
