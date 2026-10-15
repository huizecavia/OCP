package Seven;

class Penguin {
   public int getHeight() { return 3; }
   public void printInfo() {
      System.out.print(this.getHeight());
   } }
 
public class EmperorPenguin extends Penguin {
   public int getHeight() { return 8; }
   public int getSuperH() {
    return super.getHeight();
   }
   public static void main(String []fish) {

    Penguin p = new Penguin();
    System.out.println(p.getHeight());
    
    // EmperorPenguin ep = (EmperorPenguin) p;
    // System.out.println(ep.getHeight());

    Penguin pe = new EmperorPenguin();
    System.out.println(pe.getHeight());


    EmperorPenguin e = (EmperorPenguin) pe;
    System.out.println(e.getHeight());
    System.out.println(e.getSuperH());
    

   } }