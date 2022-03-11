import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    String nama[] = new String[5]; // [0,1,2,3,4]
    nama[0]       = "Alifia";
    nama[1]       = "Amalia";
    nama[2]       = "Aqil";
    nama[3]       = "Aulia";
    nama[4]       = "Ayu";
    //nama[5]       = "Wahyu";

    ArrayList<String> daftarNama = new ArrayList<>();
    daftarNama.add("Alifia");
    daftarNama.add("Amalia");
    daftarNama.add("Aqil");
    daftarNama.add("Aulia");
    daftarNama.add("Ayu");
     daftarNama.add("Wahyu");
    //for namaOrang in nama:
    //  print(namaOrang)
    for(String namaOrang: daftarNama){
      System.out.println(namaOrang);
    }  

    int daftarNim[] = new int[5];
    daftarNim[0] = 1;
    daftarNim[1] = 2;
    daftarNim[2] = 3;
    daftarNim[3] = 4;
    daftarNim[4] = 5;

    ArrayList<Integer> listNim = new ArrayList<>();
    listNim.add(1);
    for(int nim: listNim){
      System.out.println(nim);
    } 

    /*
        0  1  2
        ________
    0  |A |B |C |
    1  |D |E |F |
    2  |G |H |I | 
    3  |J |K |L |
        __________
    */
    String[][] A = new String[4][3];
    A[0][0] = "A";
    A[0][1] = "B";
    A[0][2] = "C";

    A[1][0] = "D";
    A[1][1] = "E";
    A[1][2] = "F";

    A[2][0] = "G";
    A[2][1] = "H";
    A[2][2] = "I";

    A[3][0] = "J";
    A[3][1] = "K";
    A[3][2] = "L";

    for(String[] baris: A){
      for(String huruf: baris){
        System.out.print(huruf);
      }
    }
    System.out.println("-------------------");

    Mahasiswa gusnita = new Mahasiswa();
    gusnita.setNama("Gusnita");
    gusnita.setNim(12345);
    
    Mahasiswa ika = new Mahasiswa();
    ika.setNama("Ika");
    ika.setNim(54321);

    ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();
    listMahasiswa.add(gusnita);
    listMahasiswa.add(ika);
    
    for(Mahasiswa mhs: listMahasiswa){
      System.out.println(
        "Nama mahasiswa adalah : " + mhs.getNama() +
        " dengan nim : " + mhs.getNim()
      );
    }
        
  }
}