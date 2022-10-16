package tugas.inheritance.js61;
public class Main {
    public static void main(String[] args) {
        DaftarGaji dg = new DaftarGaji(2);
        Dosen ds = new Dosen("1234", "Rasyid Razeka", "Kediri", 200000);
        Dosen ds1 = new Dosen("5678", "Bangkit Chaniago", "Tulungagung", 300000);
        ds.setSKS(20);
        ds1.setSKS(10);
        dg.addPegawai(ds);
        dg.addPegawai(ds1);
        dg.printSemuaGaji();
    }
}