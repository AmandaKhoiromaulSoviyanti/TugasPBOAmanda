/**
 * Program Pengujian untuk kelas "Lingkaran"
 */
public class TestLingkaran {    
   public static void main(String[] args) {   
      // Mendeklarasikan dan membuat instance dari kelas Lingkaran yang disebut c1
      Lingkaran c1 = new Lingkaran(2.0, "biru");  
      System.out.println("Jari-jari adalah: " + c1.dapatkanJariJari());  
      //Jari-jari adalah: 2.0
      System.out.println("Warnanya adalah: " + c1.dapatkanWarna());
      //Warnanya adalah: biru
      System.out.printf("Luasnya adalah: %.2f%n", c1.dapatkanLuas());
      //Luasnya adalah: 12.57

      // Mendeklarasikan dan membuat instance lain dari kelas Lingkaran yang disebut c2
      Lingkaran c2 = new Lingkaran(2.0);  
      System.out.println("Jari-jari adalah: " + c2.dapatkanJariJari());
      //Jari-jari adalah: 2.0
      System.out.println("Warnanya adalah: " + c2.dapatkanWarna());
      //Warnanya adalah: merah
      System.out.printf("Luasnya adalah: %.2f%n", c2.dapatkanLuas());
      //Luasnya adalah: 12.57

      // Mendeklarasikan dan membuat instance lain dari kelas Lingkaran yang disebut c3
      Lingkaran c3 = new Lingkaran();  
      System.out.println("Jari-jari adalah: " + c3.dapatkanJariJari());
      //Jari-jari adalah: 1.0
      System.out.println("Warnanya adalah: " + c3.dapatkanWarna());
      //Warnanya adalah: merah
      System.out.printf("Luasnya adalah: %.2f%n", c3.dapatkanLuas());
      //Luasnya adalah: 3.14
   }
}
