
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Kedi kedi = new Kedi("Kedi", "et", 4);
        Aslan aslan = new Aslan("Aslan", "tavsan", 4);
        Tavsan tavsan = new Tavsan("Tavsan", "ot", 4, 5);

        System.out.println("Isim: " + kedi.getIsim());
        System.out.println("Beslenme: " + kedi.getBeslenme());
        System.out.println("Ayak Sayisi: " + kedi.getAyakSayisi());
        System.out.println("Evcil mi: " + kedi.evcilMi());

        System.out.println();

        System.out.println("Isim: " + aslan.getIsim());
        System.out.println("Beslenme: " + aslan.getBeslenme());
        System.out.println("Ayak Sayisi: " + aslan.getAyakSayisi());
        System.out.println("Sonuc --> " + tavsan.hamYapti());

        System.out.println();

        System.out.println("Isim: " + tavsan.getIsim());
        System.out.println("Ayak Sayisi: " + tavsan.getAyakSayisi());
        System.out.println("Hizi: " + tavsan.getHiz());

        System.out.println();
        System.out.println("******************************");
        System.out.println();

        Tavsan tavsan1 = new Tavsan("Tavsan", "ot", 4, 11);

        System.out.println("Isim: " + kedi.getIsim());
        System.out.println("Beslenme: " + kedi.getBeslenme());
        System.out.println("Ayak Sayisi: " + kedi.getAyakSayisi());
        System.out.println("Evcil mi: " + kedi.evcilMi());

        System.out.println();

        System.out.println("Isim: " + aslan.getIsim());
        System.out.println("Beslenme: " + aslan.getBeslenme());
        System.out.println("Ayak Sayisi: " + aslan.getAyakSayisi());
        System.out.println("Sonuc --> " + tavsan1.hamYapti());

        System.out.println();

        System.out.println("Isim: " + tavsan1.getIsim());
        System.out.println("Ayak Sayisi: " + tavsan1.getAyakSayisi());
        System.out.println("Hizi: " + tavsan1.getHiz());
    }

}
