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

        //lisasin oma asjad lihtsalt siia lõppu sest ei jaksa liiga palju mõelda :)
        Mänguväli mänguväli = new Mänguväli(1);
        String[][] tühiList = {
                {"  ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"},
                {"1 ", "-", "-", "-", "-", "-", "-", "-", "-", "x", "-"},
                {"2 ", "-", "-", "-", "-", "-", "-", "-", "-", "x", "-"},
                {"3 ", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                {"4 ", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                {"5 ", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                {"6 ", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                {"7 ", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                {"8 ", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                {"9 ", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                {"10", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}
        };

        String[][] mängijaNäeb = mänguväli.kasLaevOnMaas(new int[]{9, 1}, tühiList);

        for (String[] el : mängijaNäeb) {
            for (String märk : el) {
                System.out.print(märk + "  ");
            }
            System.out.println();
        }
    }
}