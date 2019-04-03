import javax.swing.JOptionPane;

public class Test {
    public static void main(String[] args) {

        Mänguväli mängija = new Mänguväli(0);
        Mänguväli arvuti = new Mänguväli((int) Math.round(Math.random() * 3 + 1.0));

        JOptionPane.showMessageDialog( null,
                " --  Laevade pommitamine -- \n\n" +
                        "Mänguväljal on kokku 10 laeva: \n" +
                        "    pikkusega 4 ruutu  -  1 laev \n" +
                        "    pikkusega 3 ruutu  -  2 laeva \n" +
                        "    pikkusega 2 ruutu  -  3 laeva \n" +
                        "    pikkusega 1 ruut    -  4 laeva \n\n" +
                        "Võitmiseks pead tabama kõik arvuti laevad.\n" +
                        "Kui saad laeva põhja, muutuvad kõik laeva ümbritsevad ruudud pommitatuks. \n\n" +
                        "Tähistus: \n" +
                        "    -   pommitamata ruut \n" +
                        "    o  pommitatud ruut, millel pole laeva \n" +
                        "    x  pommitatud ruut, millel on laev \n\n" +
                        "Mängima asumiseks vajuta OK." );

        mängija.prindiMänguväli();

        while (mängija.getLaevaruutudeArv() < arvuti.getLaevaruutudeArv()) {
            //arvuti.prindiMänguväli(); // testimiseks

            String[][] mänguväli = mängija.getList();
            String väli = ""; // selleks, et mänguvälja ekraanile kuvada

            for (String[] el : mänguväli) {
                for (String märk : el) {

                    if (märk.equals("-")) {
                        väli += märk + "     ";
                    }
                    else if (märk.equals("o") || märk.equals("x")) {
                        väli += märk + "    ";
                    }
                    else if (märk.equals("10")){
                        väli += märk + "   ";
                    }
                    else väli += märk + "    ";
                }
                väli += "\n";
            }

            String sisestatakse =
                    JOptionPane.showInputDialog(
                            väli + "\nSisesta koordinaat, mida soovid pommitada (näiteks A3).");

            int[] koordinaadid = mängija.koordinaadiTeisendus(sisestatakse.toUpperCase());
            mängija.pommita(koordinaadid, arvuti);

            // mängija.prindiMänguväli(); // testimiseks - prindib välja
            // System.out.println(); // testimiseks - prindib välja
        }

        JOptionPane.showMessageDialog(null,
                "Võitsid mängu! \n\nTäname, et mängisid. ");
        System.exit(0);



        // testimiseks

        /*mängija.pommita(new int[] {3, 9}, arvuti);
        //boolean mängijaNäeb = mängija.kasLaevOnMaas3(new int[]{3, 6}, arvuti, new int[][] {{3, 6},{},{},{}});
        //System.out.println(mängijaNäeb);
        mängija.prindiMänguväli();*/
    }
}