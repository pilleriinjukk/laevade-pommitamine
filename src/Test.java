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

        mängija.pommita(sisestatakse);
    }
}
