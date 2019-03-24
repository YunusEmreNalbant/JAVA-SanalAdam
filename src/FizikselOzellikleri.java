public class FizikselOzellikleri {

    private double boy;
    private int kilo;


    public FizikselOzellikleri(double boy, int kilo) {
        this.boy = boy;
        this.kilo = kilo;

    }

    public void fizikselOzellikleriBilgileriGoster() {

        System.out.println("Fiziksel Özellikleri Gösteriliyor... ");

        System.out.println("Boy: " + this.boy + "\n"+
                            "Kilo: "+this.kilo);
    }

    public FizikselOzellikleri() {
        System.out.println("Fiziksel Özellikleri Gösterilemiyor...");
    }


    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }


}

