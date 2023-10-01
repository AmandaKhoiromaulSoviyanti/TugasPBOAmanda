/**
* Kelas Tanggal memodelkan sebuah tanggal kalender dengan hari, bulan, dan tahun.
* Kelas ini tidak melakukan validasi input untuk hari, bulan, dan tahun.
*/
public class Tanggal {
  // Variabel instance privat
  private int tahun, bulan, hari;

  /** Membuat sebuah instance Tanggal dengan tahun, bulan, dan hari yang diberikan. Tidak ada validasi input */
  public Tanggal(int tahun, int bulan, int hari) {
     this.tahun = tahun;
     this.bulan = bulan;
     this.hari = hari;
  }

  // Getter/setter publik untuk variabel privat
  /** Mengembalikan tahun */
  public int getTahun() {
     return this.tahun;
  }
  /** Mengembalikan bulan */
  public int getBulan() {
     return this.bulan;
  }
  /** Mengembalikan hari */
  public int getHari() {
     return this.hari;
  }
  /** Menetapkan tahun. Tidak ada validasi input */
  public void setTahun(int tahun) {
     this.tahun = tahun;
  }
  /** Menetapkan bulan. Tidak ada validasi input */
  public void setBulan(int bulan) {
     this.bulan = bulan;
  }
  /** Menetapkan hari. Tidak ada validasi input */
  public void setHari(int hari) {
     this.hari = hari;
  }

  /* Mengembalikan String deskriptif dalam format "MM/DD/YYYY" dengan leading zero */
  public String toString() {
       // Menggunakan fungsi bawaan String.format() untuk membentuk String yang diformat
       return String.format("%02d/%02d/%4d", bulan, hari, tahun);
             // Pengatur "0" untuk mencetak leading zeros
  }

  /** Menetapkan tahun, bulan, dan hari. Tidak ada validasi input */
  public void setTanggal(int tahun, int bulan, int hari) {
     this.tahun = tahun;
     this.bulan = bulan;
     this.hari = hari;
  }
}