import java.util.Date;


public class Klientai {
    private int klientoId;
    private char vardas;
    private char pavarde;
    private char elPastas;
    private char telNumeris;
    private Date registracijosData;

    public Klientai(int klientoId, char vardas, char pavarde, char elPastas, char telNumeris, Date registracijosData) {
        this.klientoId = klientoId;
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.elPastas = elPastas;
        this.telNumeris = telNumeris;
        this.registracijosData = registracijosData;
    }

    public int getKlientoId() {
        return klientoId;
    }

    public void setKlientoId(int klientoId) {
        this.klientoId = klientoId;
    }

    public char getVardas() {
        return vardas;
    }

    public void setVardas(char vardas) {
        this.vardas = vardas;
    }

    public char getPavarde() {
        return pavarde;
    }

    public void setPavarde(char pavarde) {
        this.pavarde = pavarde;
    }

    public char getElPastas() {
        return elPastas;
    }

    public void setElPastas(char elPastas) {
        this.elPastas = elPastas;
    }

    public char getTelNumeris() {
        return telNumeris;
    }

    public void setTelNumeris(char telNumeris) {
        this.telNumeris = telNumeris;
    }

    public Date getRegistracijosData() {
        return registracijosData;
    }

    public void setRegistracijosData(Date registracijosData) {
        this.registracijosData = registracijosData;
    }
}
