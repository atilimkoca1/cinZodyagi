import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int yil;
        System.out.println("Doğum yılınızı giriniz :");
        yil=scanner.nextInt();
        int sonuc=yil%12;
        if (sonuc==0){
            System.out.println("Çin Zodyağı Burcunuz : Maymun");
        }
        if (sonuc==1){
            System.out.println("Çin Zodyağı Burcunuz : Horoz");
        }
        if (sonuc==2){
            System.out.println("Çin Zodyağı Burcunuz : Köpek");
        }
        if (sonuc==3){
            System.out.println("Çin Zodyağı Burcunuz : Domuz");
        }
        if (sonuc==4){
            System.out.println("Çin Zodyağı Burcunuz : Fare");
        }
        if (sonuc==5){
            System.out.println("Çin Zodyağı Burcunuz : Öküz");
        }
        if (sonuc==6){
            System.out.println("Çin Zodyağı Burcunuz : Kaplan");
        }
        if (sonuc==7){
            System.out.println("Çin Zodyağı Burcunuz : Tavşan");
        }
        if (sonuc==8){
            System.out.println("Çin Zodyağı Burcunuz : Ejderha");
        }
        if (sonuc==9){
            System.out.println("Çin Zodyağı Burcunuz : Yılan");
        }
        if (sonuc==10){
            System.out.println("Çin Zodyağı Burcunuz : At");
        }
        if (sonuc==11){
            System.out.println("Çin Zodyağı Burcunuz : Koyun");
        }

    }
}
