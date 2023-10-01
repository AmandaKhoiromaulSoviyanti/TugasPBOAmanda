/**
 * Program Pengujian untuk kelas Titik.
 */
public class TestTitik {
   public static void main(String[] args) {
      // Uji konstruktor dan toString()
      Titik t1 = new Titik(1, 2);
      System.out.println(t1);  // toString()
      //(1,2)
      Titik t2 = new Titik();  // konstruktor default
      System.out.println(t2);
      //(0,0)

      // Uji Setter dan Getter
      t1.setAbsis(3);
      t1.setOrdinat(4);
      System.out.println(t1);  // jalankan toString() untuk memeriksa instance yang dimodifikasi
      //(3,4)
      System.out.println("Absis: " + t1.getAbsis());
      //Absis: 3
      System.out.println("Ordinat: " + t1.getOrdinat());
      //Ordinat: 4

      // Uji setXY() dan getXY()
      t1.setXY(5, 6);
      System.out.println(t1);  // toString()
      //(5,6)
      System.out.println("Absis: " + t1.getXY()[0]);
      //Absis: 5
      System.out.println("Ordinat: " + t1.getXY()[1]);
      //Ordinat: 6

      // Uji 3 versi overloaded dari jarak()
      t2.setXY(10, 11);
      System.out.printf("Jarak adalah: %.2f%n", t1.jarak(10, 11));
      //Jarak adalah: 7.07
      System.out.printf("Jarak adalah: %.2f%n", t1.jarak(t2));
      //Jarak adalah: 7.07
      System.out.printf("Jarak adalah: %.2f%n", t2.jarak(t1));
      //Jarak adalah: 7.07
      System.out.printf("Jarak adalah: %.2f%n", t1.jarak());
      //Jarak adalah: 7.81
   }
}
