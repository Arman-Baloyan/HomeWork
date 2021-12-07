public interface Days {

   default void hello(){
       System.out.println("hello");
   }

   static String text(){
       return "text";
   }

   void callback();

   int age();
}
