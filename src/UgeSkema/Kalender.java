package UgeSkema;

import java.util.Random;

public class Kalender {
    private UgeDage UgeDage;
    private int antalPersoner;
    private String dagIndeling[] = {"Morgen", "Middag", "Ulvetid", "Aften"};
//    private String[] brugerNavne = {"David", "Erik", "Johan", "Namirah"};
    private String citater[] = {"En kamæleon kan skifte farve for at skjule sig eller vise humør.",
            "Flodheste kan holde vejret under vand i hele 5 minutter.",
            "En kænguru kan hoppe op til 9 meter i ét spring.",
            "Dovendyr sover næsten hele dagen – op til 20 timer!",
            "Papegøjer kan lære at efterligne menneskers stemmer.",
            "En giraf har en tunge, der er næsten en halv meter lang.",
            "Elefanter kan genkende sig selv i et spejl – ligesom mennesker.",
            "En gepard er verdens hurtigste landdyr og kan løbe op til 110 km/t.",
            "Ildfluer kan lyse i mørket med deres egen krop.",
            "Pingviner kan glide på maven hen over sne og is som en rutchebane."
    };

    //Konstruktør til initialisering af Kalender uden arguments
    public Kalender(){
        this.antalPersoner = 4;

    }

    public void nyCitat(){
        System.out.println();
        Random rand = new Random();
        int rndInt = rand.nextInt(citater.length);
        System.out.println(citater[rndInt]);
    }

    private void dividerPrint() {
        int dividerCount = 161;
        String divider = "-";

        System.out.println();

        for (int i = 0; i < dividerCount; i++) {
            System.out.print(divider);
        }
        System.out.println();
    }




    public void bygKalender (){

//        System.out.println("Hvor mange skal med i kalenderen?");
//        Scanner scan = new Scanner(System.in);
//        int antal = Integer.valueOf(scan.nextInt());
//
//        String[] brugerNavne = new String[antal];
        String headerStart = "|\t\t\t"; //tabs i første kolonne
        String headerMid = "\t\t|\t\t"; //tabs mellem to kolonner
        String headerEnd = "\t\t|"; //tabs ved sidste kolonne
        String rowStart = "|\t\t"; //første række før dagIndeling tekst
        String rowMidText = "\t\t"; //tabs efter dagIndeling tekst
        String rowMidEmpty = "|\t\t\t\t\t"; //alle tomme rækker
        String rowEnd = "|";
        int columnCount = 0;


        //starter med divider
        dividerPrint();

        System.out.print(headerStart);



        //printer ugens dage med mellemrum i kolonner
        for (UgeDage dag : UgeDage.values()) {
            System.out.print(headerMid);
            System.out.print(dag);
            columnCount++;
        }

        System.out.print(headerEnd);
        dividerPrint();


        for (String dag : dagIndeling) {

            System.out.print(rowStart);
            System.out.print(dag);
            System.out.print(rowMidText);
            for (int i = 0; i < columnCount; i++) {
                System.out.print(rowMidEmpty);
            }
            System.out.print(rowEnd);
            dividerPrint();


        }


        System.out.println();
    }
}
