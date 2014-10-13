/**
 * author: Bartek
 */

class Rzut1 {
    void rzut() {
        System.out.println("Rzut1");
    }
}

class Rzut2 extends Rzut1 {
    void rzut() {
        System.out.println("Rzut2");
    }
}

class Rzut3 extends Rzut1 {
    void rzut() {
        System.out.println("Rzut3");
    }
}

public class Rzutowanie {

    public static void main(String[] args) {

        Rzut1 ob1 = new Rzut3();
        Rzut1 ob2 = new Rzut2();
        //Rzut2 ob3 = (Rzut2) new Rzut1();
        Rzut2 ob4 = new Rzut2();
        Rzut1 ob5 = new Rzut3();

        ob1.rzut();
        ob2.rzut();
        // ob3.rzut();
        ob4.rzut();
        ob5.rzut();
    }
}
