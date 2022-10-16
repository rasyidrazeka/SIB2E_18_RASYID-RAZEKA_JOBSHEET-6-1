package tugas.inheritance.js61;
public class Dosen extends Pegawai{
    private int jumlahSKS, TARIF_SKS;

    public Dosen(String nip, String nama, String alamat, int TARIF_SKS){
        super(nip, nama, alamat);
        this.TARIF_SKS = TARIF_SKS;
    }
    public void setSKS(int sks){
        this.jumlahSKS = sks;
    }
    public int getGaji(){
        return jumlahSKS*TARIF_SKS;
    }
}