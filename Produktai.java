import org.w3c.dom.Text;



public class Produktai {
    private int produktoId;
    private char pavadinimas;
    private Text aprasymas;
    private int kaina;
    private int likutis;

    public Produktai(int produktoId, char pavadinimas, Text aprasymas, int kaina, int likutis) {
        this.produktoId = produktoId;
        this.pavadinimas = pavadinimas;
        this.aprasymas = aprasymas;
        this.kaina = kaina;
        this.likutis = likutis;
    }

    public int getProduktoId() {
        return produktoId;
    }

    public void setProduktoId(int produktoId) {
        this.produktoId = produktoId;
    }

    public char getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(char pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public Text getAprasymas() {
        return aprasymas;
    }

    public void setAprasymas(Text aprasymas) {
        this.aprasymas = aprasymas;
    }

    public int getKaina() {
        return kaina;
    }

    public void setKaina(int kaina) {
        this.kaina = kaina;
    }

    public int getLikutis() {
        return likutis;
    }

    public void setLikutis(int likutis) {
        this.likutis = likutis;
    }
}
