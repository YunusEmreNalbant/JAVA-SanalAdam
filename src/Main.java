public class Main {

    public static void main(String[] args) {

        //Kimlik kimlik = new Kimlik(); Boş yapıcı metod

        Kimlik kimlik2=new Kimlik("Yunus Emre","Nalbant",21,47500793544L);

        kimlik2.kimlikBilgileriniGoster();

        System.out.println("**************************\n");

        //Aile aile = new Aile(); Aile sınıfının boş yapıcı metodu.
        Aile aile2= new Aile("İlhami","Sevgi");
        aile2.aileBilgileriGoster();

        System.out.println("**************************\n");

        //Egitim egitim = new Egitim(); Eğitim sınıfının boş yapıcı metodu.
        Egitim egitim2=new Egitim("Arif Nihat Asya İlköğretim Okulu","Yavuz Sultan Selim Lisesi","İstanbul Kültür Üniversitesi","Matematik-Bilgisayar");
        egitim2.egitimBilgileriGoster();

        System.out.println("**************************\n");

        //IlgiAlanlari ilgiAlanlari=new IlgiAlanlari(); İlgi Alanları sınıfının boş yapıcı metodu.
        IlgiAlanlari ilgiAlanlari2=new IlgiAlanlari("Java,C#,PHP","Futbol ve Basketbol","Hayatımızdaki Algoritmalar, Hayvanlardan Tanrılara","Fringe, Friends, Chuck, Prison Break, The Walking Dead ","Esaretin Bedeli, Yeşil Yol, Matrix");
        ilgiAlanlari2.ilgiAlanlarıBilgileriGoster();

        System.out.println("**************************\n");


        //Oyunlar oyunlar= new Oyunlar(); Oyunlar sınıfının boş yapıcı metodu
        Oyunlar oyunlar2 = new Oyunlar("Counter Strike Serisi, Far Cry, PUBG, PES Serisi, Fifa Serisi");
        oyunlar2.oyunlarBilgileriGoster();

        System.out.println("************************** \n" );

        //FizikselOzellikleri fizikselOzellikleri=new FizikselOzellikleri(); Fiziksel Özellikleri Sınıfının Boş Yapıcı metodu.
        FizikselOzellikleri fizikselOzellikleri2=new FizikselOzellikleri(1.78,70);
        fizikselOzellikleri2.fizikselOzellikleriBilgileriGoster();



        YemekYedir yemek = new YemekYedir(fizikselOzellikleri2.getBoy(),fizikselOzellikleri2.getKilo(),"Sebze"); // Yemek yedir fonksiyonuyla yemek yer. Ve kilosu artar.
        Spor spor = new Spor(fizikselOzellikleri2.getBoy(),fizikselOzellikleri2.getKilo(),"Yürüyüş"); // spor sınıfından nesne üretip spor yaptırdık. Ve kilo ile boy degisim gösterdi.

        CebindekiPara para= new CebindekiPara(100); // cebindeki para sınıfıyla parasını öğren veya ona para kazandır.
        para.paraKatla(40);

        DiziIzlet dizi = new DiziIzlet("Fringe");
        FilmIzlet film = new FilmIzlet("Yüzüklerin Efendisi");




    }
}
