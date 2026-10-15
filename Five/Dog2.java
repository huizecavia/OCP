package Five;

public class Dog2 {
   public static void main(String[] args) {
      var name = new StringBuilder("Webby");
      var two = speak(name);
      System.out.print(name);  
      System.out.print(two);   
      System.out.print(name == two);  
   }
   public static StringBuilder speak(StringBuilder s) {
      s.append("Georgette");
      return s;
   }
}