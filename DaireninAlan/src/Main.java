

import java.util.Scanner;

    public class Main {
  /*  public static void main(String[] args)
    {
        int r;
        double pi = 3.14;
        Scanner inp = new Scanner(System.in);
        r = inp.nextInt();
        double alan = pi*r*r;
        double cevre = 2*pi*r;

        System.out.println("Dairenin Alanı : " + alan);
        System.out.println("Dairenin Çevresi : " + cevre);



    }*/


        public static  void main(String [] args){
            Scanner inp = new Scanner(System.in);
            double yariCap, pi, aci, alan, dilimAlani,cevre;

            System.out.print("Yarı Çapı Giriniz: ");
            yariCap = inp.nextDouble();

            System.out.print("Açı Değerini Giriniz: ");
            aci = inp.nextDouble();

            pi = 3.14;
            alan = pi * yariCap * yariCap;
            dilimAlani = (alan * aci) / 360;
            cevre = 2 * pi * yariCap;

            System.out.println("Dairenin Çevresi: " + cevre);
            System.out.println("Dairenin Dilim Alanı: " + dilimAlani);
            System.out.println("Dairenin Toplam Alanı: " + alan);

        }
    }

}