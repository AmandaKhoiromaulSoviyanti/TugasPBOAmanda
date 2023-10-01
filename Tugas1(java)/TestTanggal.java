/**
 * Program Pengujian untuk kelas Tanggal.
 */
public class TestTanggal {
   public static void main(String[] args) {
      // Uji konstruktor dan toString()
      Tanggal t1 = new Tanggal(2020, 2, 8);
      System.out.println(t1);  // toString()
      //02/08/2020

      // Uji Setter dan Getter
      t1.setTahun(2012);
      t1.setBulan(12);
      t1.setHari(23);
      System.out.println(t1);
      //12/23/2012
      System.out.println("Tahun: " + t1.getTahun());
      //Tahun: 2012
      System.out.println("Bulan: " + t1.getBulan());
      //Bulan: 12
      System.out.println("Hari: " + t1.getHari());
      //Hari: 23

      // Uji setTanggal()
      t1.setTanggal(2988, 1, 2);
      System.out.println(t1);
      //01/02/2988
   }
}

