/**
 * Kelas Akun memodelkan sebuah rekening bank dengan saldo tertentu.
 */
public class Akun {
   // Variabel instance privat
   private int nomor;
   private double saldo;

   // Konstruktor (overloaded)
   /** Membuat instance Akun dengan nomor tertentu dan saldo awal 0 */
   public Akun(int nomor) {
      this.nomor = nomor;
      this.saldo = 0.0;  // "this." adalah opsional
   }
   /** Membuat instance Akun dengan nomor dan saldo awal tertentu */
   public Akun(int nomor, double saldo) {
      this.nomor = nomor;
      this.saldo = saldo;
   }

   // Getter/setter publik untuk variabel instance privat.
   // Tidak ada setter untuk nomor karena tidak dirancang untuk diubah.
   // Tidak ada setter untuk saldo karena diubah melalui kredit() dan debit()
   /** Mengembalikan nomor akun */
   public int dapatkanNomor() {
      return this.nomor;  // "this." adalah opsional
   }
   /** Mengembalikan saldo akun */
   public double dapatkanSaldo() {
      return this.saldo;  // "this." adalah opsional
   }

   /** Mengembalikan deskripsi string dari instance ini */
   public String toString() {
      // Menggunakan fungsi bawaan System.format() untuk membentuk String yang diformat
      return String.format("Akun[nomor=%d,saldo=$%.2f]", nomor, saldo);
   }

   /** Menambahkan jumlah tertentu ke saldo */
   public void kredit(double jumlah) {
      saldo += jumlah;
   }

   /** Mengurangi jumlah tertentu dari saldo, jika saldo >= jumlah */
   public void debit(double jumlah) {
      if (saldo >= jumlah) {
         saldo -= jumlah;
      } else {
         System.out.println("jumlah melebihi saldo");
      }
   }

   /** Mentransfer jumlah tertentu ke Akun lain, jika saldo >= jumlah */
   public void transferKe(double jumlah, Akun lain) {
      if (saldo >= jumlah) {
         this.saldo -= jumlah;
         lain.saldo += jumlah;
      } else {
         System.out.println("jumlah melebihi saldo");
      }
   }
}
