package tugas.inheritance.js61;
public class DaftarGaji{
    private Pegawai[] listPegawai;

    public DaftarGaji(int total){
        listPegawai = new Pegawai[total];
    }
    public void addPegawai(Pegawai pegawai){
        for(int i=0; i<listPegawai.length; i++){
            if(listPegawai[i] == null){
                this.listPegawai[i] = pegawai;
                break;
            }
        }
    }
    public void printSemuaGaji(){
        for(int i=0; i<listPegawai.length; i++){
            System.out.println("=============================================");
            System.out.println("Nama               : " + listPegawai[i].getNama());
            System.out.println("NIP                : " + listPegawai[i].nip);
            System.out.println("Alamat             : " + listPegawai[i].alamat);
            System.out.println("Gaji yang diterima : " + listPegawai[i].getGaji());
            System.out.println("=============================================");
        }
    }
}