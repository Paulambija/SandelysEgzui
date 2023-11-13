
import java.util.Date;

public class Uzsakymai {
    private int uzsakymoId;
    private int klientoId;
    private Date data;
    private int bendraKaina;
    private int uzsakytuProduktuKiekis;

    public Uzsakymai(int uzsakymoId, int klientoId, Date data, int bendraKaina, int uzsakytuProduktuKiekis) {
        this.uzsakymoId = uzsakymoId;
        this.klientoId = klientoId;
        this.data = data;
        this.bendraKaina = bendraKaina;
        this.uzsakytuProduktuKiekis = uzsakytuProduktuKiekis;
    }

    public int getUzsakymoId() {
        return uzsakymoId;
    }

    public void setUzsakymoId(int uzsakymoId) {
        this.uzsakymoId = uzsakymoId;
    }

    public int getKlientoId() {
        return klientoId;
    }

    public void setKlientoId(int klientoId) {
        this.klientoId = klientoId;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getBendraKaina() {
        return bendraKaina;
    }

    public void setBendraKaina(int bendraKaina) {
        this.bendraKaina = bendraKaina;
    }

    public int getUzsakytuProduktuKiekis() {
        return uzsakytuProduktuKiekis;
    }

    public void setUzsakytuProduktuKiekis(int uzsakytuProduktuKiekis) {
        this.uzsakytuProduktuKiekis = uzsakytuProduktuKiekis;
    }
}
