/**
 * Sebuah Pengujian untuk kelas Akun.
 */
public class TestAkun {
   public static void main(String[] args) {
      // Uji Konstruktor dan toString()
      Akun a1 = new Akun(5566);
      System.out.println(a1);
      //Akun[nomor=5566,saldo=$0.00]
      Akun a2 = new Akun(1234, 99.9);
      System.out.println(a2);
      //Akun[nomor=1234,saldo=$99.90]

      // Uji getter
      System.out.println("Nomor akun adalah: " + a2.dapatkanNomor());
      //Nomor akun adalah: 1234
      System.out.println("Saldo adalah: " + a2.dapatkanSaldo());
      //Saldo adalah: 99.9

      // Uji kredit(), debit(), dan transferKe()
      a1.kredit(11.1);
      System.out.println(a1);
      //Akun[nomor=5566,saldo=$11.10]
      a1.debit(5.5);
      System.out.println(a1);
      //Akun[nomor=5566,saldo=$5.60]
      a1.debit(500);   // Uji debit() error
      //jumlah melebihi saldo
      System.out.println(a1);
      //Akun[nomor=5566,saldo=$5.60]

      a2.transferKe(1.0, a1);
      System.out.println(a1);
      //Akun[nomor=5566,saldo=$6.60]
      System.out.println(a2);
      //Akun[nomor=1234,saldo=$98.90]
    }
}
