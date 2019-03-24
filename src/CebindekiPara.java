import java.security.cert.TrustAnchor;
import java.util.Random;
import java.util.Scanner;

public class CebindekiPara {

    private double para;

    public CebindekiPara(double para) {
        this.para = para;
        System.out.println("Mevcut Para: "+this.para);
    }

    public void paraKatla(int yatirdiginMiktar){

        Scanner scanner = new Scanner(System.in);

        Random r = new Random();
        int sayi = r.nextInt(10);
        int tahmin=0;
        int sayac=0;
        while(tahmin<sayi) {
        System.out.println("Sayiyi Tahmin Et! :");
        tahmin= scanner.nextInt();
            if(tahmin==sayi){
                this.para+=yatirdiginMiktar;
                System.out.println("Bildin! Mevcut Bakiyen: " + this.para );

            }else {
                System.out.println("Bilemedin Tekrar Oyna!");
            }

        }





    }


    public double getPara() {
        return para;
    }

    public void setPara(double para) {
        this.para = para;
    }
}
