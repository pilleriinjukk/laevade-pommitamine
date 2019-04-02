import javax.swing.JOptionPane;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        Mänguväli mängija = new Mänguväli(0);

        /*int arv = (int) Math.round(Math.random() * 3 + 1.0);

        for (int i = 0; i < 20; i++) {
            System.out.println((int) Math.round(Math.random() * 3 + 1.0));
        }*/

        Mänguväli arvuti = new Mänguväli((int) Math.round(Math.random() * 3 + 1.0));

        JOptionPane.showMessageDialog( null,
                "Laevade pommitamine \n\n" +
                        "Võitmiseks pead tabama kõik arvuti laevad.\n" +
                        "Mänguväljal on 10 laeva pikkustega 4 (1 tk), 3 (2 tk), 2 (3 tk), 1 (4 tk).\n" +
                        "Mängima asumiseks vajuta OK." );

        mängija.prindiMänguväli();

        while (mängija.getLaevaruutudeArv() < arvuti.getLaevaruutudeArv()) {
            //arvuti.prindiMänguväli(); // selle kommenteerime pärast välja, et mäng põnev oleks :)

            String sisestatakse =
                    JOptionPane.showInputDialog(

                            // Võiks printida mänguvälja sisestamise aknasse. ********* MÕELDA *********

                            "\nSisesta koordinaat, mida soovid pommitada (näiteks A3).");

            int[] koordinaadid = mängija.koordinaadiTeisendus(sisestatakse.toUpperCase());
            mängija.pommita(koordinaadid, arvuti);

            mängija.prindiMänguväli();
            System.out.println();
        }

        JOptionPane.showMessageDialog(null,
                "VÕITSID!!!!!!");
        System.exit(0);




        /*mängija.pommita(new int[] {3, 9}, arvuti);
        //boolean mängijaNäeb = mängija.kasLaevOnMaas3(new int[]{3, 6}, arvuti, new int[][] {{3, 6},{},{},{}});
        //System.out.println(mängijaNäeb);

        mängija.prindiMänguväli();*/

    }
}