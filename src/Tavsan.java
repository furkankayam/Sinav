
public class Tavsan extends Hayvan {
    private int hiz;

    public Tavsan(String isim,String beslenme, int ayakSayisi, int hiz) {
        // TODO Auto-generated constructor stub
        super(isim,beslenme, ayakSayisi);
        this.hiz = hiz;
    }

    public int getHiz() {
        return hiz;
    }
    public void setHiz(int hiz) {
        this.hiz = hiz;
    }

    @Override
    public String toString() {
        return "Tavsan [hiz=" + hiz + "]";
    }

    public String hamYapti() {
        if (getHiz()>10) {
            return "Tavsan kacti...";
        }else {
            return "Tavsani yedi...";
        }
    }





}
