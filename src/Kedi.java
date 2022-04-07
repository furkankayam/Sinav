
public class Kedi extends Hayvan {
    private boolean isEvcil;

    public Kedi(String isim, String beslenme, int ayakSayisi) {
        super(isim, beslenme,ayakSayisi);
    }

    public boolean isEvcil() {
        return isEvcil;
    }

    public boolean evcilMi() {
        return false;
    }

    @Override
    public String toString() {
        return "Kedi [isEvcil=" + isEvcil + "]";
    }

    public void setEvcil(boolean isEvcil) {
        this.isEvcil = isEvcil;
    }



}
