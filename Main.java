import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int aYil, hesap1, hesap2;
        Scanner imp = new Scanner(System.in);

        System.out.print("Yıl Giriniz: ");
        aYil = imp.nextInt();
        hesap1 = aYil % 4;
        hesap2 = aYil % 100;

        if(hesap2 == 0){
            if(aYil %400 == 0){
                System.out.println(aYil + " bir artık yıldır");
            }else{
                System.out.println(aYil + " bir artık yıl değildir!");
            }
        }else if (hesap1 == 0){
            System.out.println(aYil + " bir artık yıldır");

        }else{
            System.out.println(aYil + " bir artık yıl değildir!");
        }

    }
}