public class Spor extends FizikselOzellikleri {

    private String spor;

    public Spor(double boy, int kilo,String spor) {
        super(boy, kilo);
        this.spor=spor;

        if(spor.equals("Yürüyüş")) {
            System.out.println(spor + "Yapılıyor..." + "\n" +
                    "Güncel kilo: " + (kilo -1));
        }
        else if(spor.equals("Basketbol")){
            System.out.println(spor+ "Oynanıyor..."+ "\n"+
                    "Güncel Kilo: "+ (kilo-1) + "\n" +
                    "Güncel Boy: " + (boy+1));
        }
        else if(spor.equals("Burpee")){
            System.out.println(spor + "Yapılıyor..." + "\n" +
                    "Güncel kilo: " + (kilo -1));
        }
    }

    public String getSpor() {
        return spor;
    }

    public void setSpor(String spor) {
        this.spor = spor;
    }
}
