package UgeSkema;

public class KalenderTest {
    public static void main(String[] args) {
        lavKalender();
    }

    public static void lavKalender() {
        //opretter elementer til Legend
        Legend l1 = new Legend("Erik", "blue");
        Legend l2 = new Legend("Namirah", "red");
        Legend l3 = new Legend("Johan", "orange");
        Legend l4 = new Legend("David", "lilla");

        Kalender k = new Kalender();


        System.out.println();

        //printer rnd citat
         k.nyCitat();
         k.bygKalender();



        //new comment


    }
}
