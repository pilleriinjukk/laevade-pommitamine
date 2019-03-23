import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //ArrayList<ArrayList<String>> list = {{"-", "-"}};
        String[][] list = {{"x", "-", "-", "-"}, {"x", "-", "o", "-"}, {"o", "o","-","o"}, {"x", "-", "o", "-"}};

        for (String[] el : list) {
            //System.out.println(Arrays.toString(el));
            for (String märk : el) {
                System.out.print(märk);
            }
            System.out.println();
        }
    }
}
