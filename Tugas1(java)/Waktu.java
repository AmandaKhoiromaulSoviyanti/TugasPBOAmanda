/**
 * Kelas Waktu memodelkan instan waktu dengan detik, menit, dan jam.
 * Kelas ini tidak melakukan validasi input untuk detik, menit, dan jam.
 */
public class Waktu {
   // Variabel instance privat
   private int detik, menit, jam;

   // Konstruktor (di-overload)
   /** Membuat instance Waktu dengan detik, menit, dan jam yang diberikan. Tidak ada validasi input */
   public Waktu(int detik, int menit, int jam) {
      this.detik = detik;
      this.menit = menit;
      this.jam = jam;
   }
   /** Membuat instance Waktu dengan nilai default */
   public Waktu() {  // konstruktor default
      this.detik = 0;
      this.menit = 0;
      this.jam = 0;
   }

   // Getter/setter publik untuk variabel privat
   /** Mengembalikan detik */
   public int getDetik() {
      return this.detik;
   }
   /** Mengembalikan menit */
   public int getMenit() {
      return this.menit;
   }
   /** Mengembalikan jam */
   public int getJam() {
      return this.jam;
   }
   /** Menetapkan detik. Tidak ada validasi input */
   public void setDetik(int detik) {
      this.detik = detik;
   }
   /** Menetapkan menit. Tidak ada validasi input */
   public void setMenit(int menit) {
      this.menit = menit;
   }
   /** Menetapkan jam. Tidak ada validasi input */
   public void setJam(int jam) {
      this.jam = jam;
   }

   /** Mengembalikan string deskriptif dalam format "jj:mm:dd" dengan leading zero */
   public String toString() {
      // Menggunakan fungsi bawaan String.format() untuk membentuk String yang diformat
      return String.format("%02d:%02d:%02d", jam, menit, detik);
      // Pengatur "0" untuk mencetak leading zeros, jika tersedia.
   }

   /** Menetapkan detik, menit, dan jam ke nilai yang diberikan */
   public void setWaktu(int detik, int menit, int jam) {
      // Tidak ada validasi input
      this.detik = detik;
      this.menit = menit;
      this.jam = jam;
   }

   /** Maju satu detik, dan mengembalikan instance ini untuk mendukung operasi berantai */
   public Waktu detikBerikutnya() {
      ++detik;
      if (detik >= 60) {
         detik = 0;
         ++menit;
         if (menit >= 60) {
            menit = 0;
            ++jam;
            if (jam >= 24) {
               jam = 0;
            }
         }
      }
      return this;   // Mengembalikan instance "this", untuk mendukung operasi berantai
                     // contoh, w1.detikBerikutnya().detikBerikutnya()
   }
}

