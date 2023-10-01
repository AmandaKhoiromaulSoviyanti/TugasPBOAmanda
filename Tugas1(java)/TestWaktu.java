/**
 * Program Pengujian untuk kelas Waktu
 */
public class TestWaktu {
   public static void main(String[] args) {
      // Uji Konstruktor dan toString()
      Waktu w1 = new Waktu(1, 2, 3);
      System.out.println(w1);  // toString()
      //03:02:01
      Waktu w2 = new Waktu();    // Konstruktor default
      System.out.println(w2);
      //00:00:00

      // Uji Setter dan Getter
      w1.setJam(4);
      w1.setMenit(5);
      w1.setDetik(6);
      System.out.println(w1);  // menjalankan toString() untuk memeriksa instance yang dimodifikasi
      //04:05:06
      System.out.println("Jam: " + w1.getJam());
      //Jam: 4
      System.out.println("Menit: " + w1.getMenit());
      //Menit: 5
      System.out.println("Detik: " + w1.getDetik());
      //Detik: 6

      // Uji setWaktu()
      w1.setWaktu(58, 59, 23);
      System.out.println(w1);
      //23:59:58

      // Uji detikBerikutnya() dan berantai
      System.out.println(w1.detikBerikutnya()); // Mengembalikan sebuah instance Waktu. Memanggil toString() dari Waktu
      //23:59:59
      System.out.println(w1.detikBerikutnya().detikBerikutnya().detikBerikutnya());  // berantai
      //00:00:02
   }
}
