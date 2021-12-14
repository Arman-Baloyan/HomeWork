package lesson13;
/*
public class Explore {
    void explore() {
        try {
            fall();
            System.out.println("never get here");
        } catch (RuntimeException e) {
            getUp();
        }
        seeAnimals();
    }

    void fall() {
        throw new RuntimeException();
        try { // DOES NOT COMPILE
            fall();
catch(Exception e)
            System.out.println("get up");

        }
        try {
            fall();
        } catch (Exception e) {
            System.out.println("get up");
        }

    }
    try {// DOES NOT COMPILE

        fall();

    }
    void explore() {
         try {
             seeAnimals();
             fall();
             } catch (Exception e) {
             getHugFromDaddy();
             } finally {
             seeMoreAnimals();
             }
         goHome();
         }


try { // DOES NOT COMPILE
         fall();
         } finally {
         System.out.println("all better");
         } catch (Exception e) {
         System.out.println("get up");
         }

         try { // DOES NOT COMPILE
         fall();}

         try {
         fall();
         } finally {
         System.out.println("all better");
         }


    String s = "";
try {
        s += "t";
    } catch(Exception e) {
        s += "c";
    } finally {
        s += "f";
    }
    s += "a";
System.out.print(s)
}
class AnimalsOutForAWalk extends RuntimeException { }
class ExhibitClosed extends RuntimeException { }
class ExhibitClosedForLunch extends ExhibitClosed { }
    public void visitPorcupine() {
        try {
            seeAnimal();
        } catch (AnimalsOutForAWalk e) {// first catch block
            System.out.print("try back later");
        } catch (ExhibitClosed e) {// second catch block
            System.out.print("not today");
        }
    }
    public void visitMonkeys() {
        try {
            seeAnimal();
        } catch (ExhibitClosedForLunch e) {// subclass exception
            System.out.print("try back later");
        } catch (ExhibitClosed e) {// superclass exception
            System.out.print("not today");
        }
    }
    public void visitMonkeys() {
        try {
            seeAnimal();
        } catch (ExhibitClosed e) {
            System.out.print("not today");
        } catch (ExhibitClosedForLunch e) {// DOES NOT COMPILE
            System.out.print("try back later");
        }
    }
    public void visitSnakes() {
        try {
            seeAnimal();
        } catch (RuntimeException e) {
            System.out.print("runtime exception");
        } catch (ExhibitClosed e) {// DOES NOT COMPILE
            System.out.print("not today");
        } catch (Exception e) {
            System.out.print("exception");
        }
    }
}


*/


