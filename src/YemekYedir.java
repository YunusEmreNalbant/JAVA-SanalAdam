import java.util.Scanner;

public class YemekYedir extends  FizikselOzellikleri{

        private String yemekAd;

    public YemekYedir(double boy, int kilo, String yemekAd) {
        super(boy, kilo);
        this.yemekAd = yemekAd;

        if(yemekAd.equals("Çorba") || yemekAd.equals("Sebze")) {
            System.out.println(yemekAd + "Yiyor..." + "\n" +
                    "Güncel kilo: " + (kilo + 1));
        } else if(yemekAd.equals("Et")|| yemekAd.equals("Makarna") || yemekAd.equals("Pilav")){
            System.out.println(yemekAd + "Yiyor..." + "\n" +
                    "Güncel kilo: " + (kilo + 2));
        }
    }

    public String getYemekAd() {
        return yemekAd;
    }

    public void setYemekAd(String  yemekAd) {
        this.yemekAd = yemekAd;
    }



}

