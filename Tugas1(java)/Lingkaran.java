/**
 * Kelas Lingkaran merepresentasikan suatu objek lingkaran dengan radius dan warna.
 */
public class Lingkaran {
   // Variabel instance privat
   private double jariJari;
   private String warna;

   // Konstruktor (overloaded)
   /** Membuat sebuah instansi Lingkaran dengan radius dan warna default */
   public Lingkaran() {                   
      jariJari = 1.0;
      warna = "merah";
   }
   /** Membuat sebuah instansi Lingkaran dengan radius tertentu dan warna default */
   public Lingkaran(double r) {           
      jariJari = r;
      warna = "merah";
   }
   /** Membuat sebuah instansi Lingkaran dengan radius dan warna tertentu */
   public Lingkaran(double r, String c) { 
      jariJari = r;
      warna = c;
   }

   // Metode publik
   /** Mengambil nilai jari-jari */
   public double dapatkanJariJari() {
      return jariJari;
   }
   /** Mengambil warna */
   public String dapatkanWarna() {
      return warna;
   }
   /** Mengambil luas lingkaran ini */
   public double dapatkanLuas() {
      return jariJari * jariJari * Math.PI;
   }
}
