/**
 * Kelas Titik memodelkan sebuah titik 2D di (x, y).
 */
public class Titik {
   // Variabel instance privat
   private int x, y;

   // Konstruktor (di-overload)
   /** Membuat instance Titik dengan nilai default */
   public Titik() {  // Konstruktor default
      this.x = 0;
      this.y = 0;
   }
   /** Membuat instance Titik dengan nilai x dan y yang diberikan */
   public Titik(int x, int y) {
      this.x = x;
      this.y = y;
   }

   // Getter dan setter publik
   /** Mengembalikan nilai x */
   public int getAbsis() {
      return this.x;
   }
   /** Menetapkan nilai x */
   public void setAbsis(int x) {
      this.x = x;
   }
   /** Mengembalikan nilai y */
   public int getOrdinat() {
      return this.y;
   }
   /** Menetapkan nilai y */
   public void setOrdinat(int y) {
      this.y = y;
   }

   /** Mengembalikan string deskriptif dalam bentuk "(x,y)" */
   public String toString() {
      return "(" + this.x + "," + this.y + ")";
   }

   /** Mengembalikan array int dengan 2 elemen yang berisi x dan y */
   public int[] getXY() {
      int[] hasil = new int[2];
      hasil[0] = this.x;
      hasil[1] = this.y;
      return hasil;
   }

   /** Menetapkan baik x maupun y */
   public void setXY(int x, int y) {
      this.x = x;
      this.y = y;
   }

   /** Mengembalikan jarak dari instance ini ke titik yang diberikan di (x,y). Panggil dengan p1.jarak(1,2) */
   public double jarak(int x, int y) {
      int xSelisih = this.x - x;
      int ySelisih = this.y - y;
      return Math.sqrt(xSelisih*xSelisih + ySelisih*ySelisih);
   }
   /** Mengembalikan jarak dari instance ini ke instance Titik yang diberikan. Panggil dengan p1.jarak(p2) */
   public double jarak(Titik lain) {
      int xSelisih = this.x - lain.x;
      int ySelisih = this.y - lain.y;
      return Math.sqrt(xSelisih*xSelisih + ySelisih*ySelisih);
   }
   /** Mengembalikan jarak dari instance ini ke (0,0). Panggil dengan p1.jarak() */
   public double jarak() {
      return Math.sqrt(this.x*this.x + this.y*this.y);
   }
}
