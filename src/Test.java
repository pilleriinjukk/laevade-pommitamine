import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

public class Test {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog( null, "Tere" );
        //System.exit(0);

        String sisestatakse =
        JOptionPane.showInputDialog(
                "Sisesta koordinaat, mida soovid pommitada (näiteks A3)");

        System.out.println(sisestatakse);

        String[][] list = {{"x", "-", "-", "-"}, {"x", "-", "o", "-"}, {"o", "o","-","o"}, {"x", "-", "o", "-"}};

        for (String[] el : list) {
            for (String märk : el) {
                System.out.print(märk);
            }
            System.out.println();
        }
    }
}
