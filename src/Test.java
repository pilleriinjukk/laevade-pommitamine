import javax.swing.JOptionPane;

public class Test {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog( null,
                "Laevade pommitamine \n\n" +
                        "Võitmiseks pead tabama kõik arvuti laevad.\n" +
                        "Mänguväljal on 10 laeva pikkustega 4 (1 tk), 3 (2 tk), 2 (3 tk), 1 (4 tk).\n" +
                        "Mängima asumiseks vajuta OK." );
        //System.exit(0);

        String sisestatakse =
        JOptionPane.showInputDialog(
                "Sisesta koordinaat, mida soovid pommitada (näiteks A3).");

        Mänguväli mängija = new Mänguväli(0);
        Mänguväli arvuti = new Mänguväli(1);

        //mängija.pommita(sisestatakse);


        //String[][] mängijaNäeb = mänguväli.kasLaevOnMaas(new int[]{9, 1}, mängijaMänguväli);
/*
        for (String[] el : mängijaNäeb) {
            for (String märk : el) {
                System.out.print(märk + "  ");
            }
            System.out.println();
        }*/

        int mängukäik = 1;
        //while (mängukäik < arvuti.mituLaevaruutuOn())
        //lisada uue koordinaadi küsimine
        mängija.prindiMänguväli();
        int[] koordinaadid = arvuti.koordinaadiTeisendus("A3");
        arvuti.pommita("A3");
        if (arvuti.saiPihta(koordinaadid)) {
            mängija.setList(arvuti.kasLaevOnMaas(koordinaadid, mängija));
            //ja saab siin uuesti pommitada, lisada teine while tsükkel?
        }
    }
}