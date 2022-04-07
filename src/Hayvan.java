
public class Hayvan {
    private String isim;
    private int ayakSayisi;
    private String beslenme;

    public Hayvan(String isim,String beslenme, int ayakSayisi) {
        this.isim = isim;
        this.ayakSayisi = ayakSayisi;
        this.beslenme = beslenme;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getAyakSayisi() {
        return ayakSayisi;
    }

    public void setAyakSayisi(int ayakSayisi) {
        this.ayakSayisi = ayakSayisi;
    }

    public String getBeslenme() {
        return beslenme;
    }

    public void setBeslenme(String beslenme) {
        this.beslenme = beslenme;
    }



}
