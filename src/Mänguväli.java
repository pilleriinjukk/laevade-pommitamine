public class Mänguväli {

    private String[][] list;

    public Mänguväli(int number) {
        switch (number) {
            case 0:
                list = new String[][]{
                        {"  ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"},
                        {"1 ", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                        {"2 ", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                        {"3 ", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                        {"4 ", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                        {"5 ", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                        {"6 ", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                        {"7 ", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                        {"8 ", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                        {"9 ", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                        {"10", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}
                };
                break;
            case 1:
                list = new String[][]{
                        {"  ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"},
                        {"1 ", "-", "-", "-", "-", "-", "-", "-", "-", "x", "-"},
                        {"2 ", "-", "-", "-", "-", "-", "-", "-", "-", "x", "-"},
                        {"3 ", "-", "-", "-", "x", "x", "x", "-", "-", "-", "-"},
                        {"4 ", "-", "x", "-", "-", "-", "-", "-", "-", "-", "x"},
                        {"5 ", "-", "-", "-", "-", "-", "-", "x", "x", "-", "-"},
                        {"6 ", "-", "-", "x", "-", "x", "-", "-", "-", "-", "-"},
                        {"7 ", "-", "-", "x", "-", "x", "-", "-", "-", "-", "-"},
                        {"8 ", "x", "-", "x", "-", "-", "-", "-", "x", "x", "x"},
                        {"9 ", "-", "-", "x", "-", "-", "-", "-", "-", "-", "-"},
                        {"10", "-", "-", "-", "-", "-", "x", "-", "-", "-", "-"}
                };
                break;
            case 2:
                list = new String[][]{
                        {"  ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"},
                        {"1 ", "-", "-", "-", "x", "-", "-", "-", "-", "-", "-"},
                        {"2 ", "-", "-", "-", "x", "-", "-", "-", "-", "-", "-"},
                        {"3 ", "x", "x", "-", "-", "-", "x", "x", "x", "x", "-"},
                        {"4 ", "-", "-", "-", "-", "x", "-", "-", "-", "-", "-"},
                        {"5 ", "-", "x", "-", "-", "-", "-", "-", "-", "-", "-"},
                        {"6 ", "-", "x", "-", "-", "x", "-", "x", "x", "-", "-"},
                        {"7 ", "-", "x", "-", "-", "x", "-", "-", "-", "-", "-"},
                        {"8 ", "-", "-", "-", "-", "x", "-", "-", "-", "-", "-"},
                        {"9 ", "-", "-", "x", "-", "-", "-", "-", "-", "-", "-"},
                        {"10", "-", "x", "-", "-", "-", "-", "-", "x", "-", "-"}
                };
                break;
            case 3:
                list = new String[][]{
                        {"  ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"},
                        {"1 ", "-", "-", "-", "-", "-", "x", "-", "-", "-", "-"},
                        {"2 ", "-", "-", "-", "-", "-", "x", "-", "-", "-", "-"},
                        {"3 ", "-", "x", "-", "-", "-", "x", "-", "x", "-", "-"},
                        {"4 ", "-", "-", "-", "-", "-", "-", "-", "-", "x", "-"},
                        {"5 ", "x", "x", "-", "-", "-", "-", "-", "-", "x", "-"},
                        {"6 ", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                        {"7 ", "-", "-", "-", "-", "x", "x", "-", "-", "-", "-"},
                        {"8 ", "-", "-", "-", "-", "-", "-", "-", "-", "x", "-"},
                        {"9 ", "-", "x", "-", "-", "-", "-", "x", "-", "x", "-"},
                        {"10", "-", "-", "x", "x", "x", "x", "-", "-", "x", "-"}
                };
                break;
        }


    }

    public String[][] kasLaevOnMaas(int[] koordinaadid, String[][] mängijaNäeb) {
        boolean onTerveLaev = false;
        int[] suurimKoordinaat = koordinaadid.clone();
        //kontrollib, kas mängija on maha pommitanud terve laeva
        for (int a = koordinaadid[0] - 1; a < koordinaadid[0] + 2; a++) { //veerg
            if (a < 1 || a > 10) continue;
            else
                for (int b = koordinaadid[1] - 1; b < koordinaadid[1] + 2; b++) { //rida
                    if (b < 1 || b > 10) continue;
                    else
                        if (list[b][a].equals("x") && mängijaNäeb[b][a].equals("x")) {
                            onTerveLaev = true;
                            suurimKoordinaat[0] = a;
                            suurimKoordinaat[1] = b;
                        }
                }
        }

        if (onTerveLaev) { //muudab laeva ümbruse tähistuse "o"-ks
            for (int i = koordinaadid[0] - 1; i < suurimKoordinaat[0] + 2; i++) { //veerg
                if (i < 1 || i > 10) continue;
                else
                    for (int j = koordinaadid[1] - 1; j < suurimKoordinaat[1] + 2; j++) { //rida
                        if (j < 1 || j > 10) continue;
                        else
                            if (!list[j][i].equals("x")) mängijaNäeb[j][i] = "o";
                    }
            }
        }
        return mängijaNäeb;
    }

    public void printimine() {
        for (String[] el : list) {
            for (String märk : el) {
                System.out.print(märk + "  ");
            }
            System.out.println();
        }
    }

        /*
        String[][] tühiList = {
                {"  ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"},
                {"1 ", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                {"2 ", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                {"3 ", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                {"4 ", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                {"5 ", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                {"6 ", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                {"7 ", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                {"8 ", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                {"9 ", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                {"10", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}
        };

        for (String[] el : list3) {
            //System.out.println(Arrays.toString(el));
            for (String märk : el) {
                System.out.print(märk + "  ");
            }
            System.out.println();
        }

        */



    public int[] koordinaadiTeisendus(String koordinaadid) {
        int rida = 0;
        if (koordinaadid.length() == 2) {
            rida = Character.getNumericValue(koordinaadid.charAt(1));
        }
        if (koordinaadid.length() == 3) {
            rida = 10;
        }

        Character veerg_tähena = koordinaadid.charAt(0);
        int veerg;
        switch (veerg_tähena) {
            case 'A': veerg = 1; break;
            case 'B': veerg = 2; break;
            case 'C': veerg = 3; break;
            case 'D': veerg = 4; break;
            case 'E': veerg = 5; break;
            case 'F': veerg = 6; break;
            case 'G': veerg = 7; break;
            case 'H': veerg = 8; break;
            case 'I': veerg = 9; break;
            case 'J': veerg = 10; break;
            default: veerg = 0;
        }

        int[] koordinaadipaar = {veerg, rida};
        return koordinaadipaar;
    }

    public void prindiMänguväli(String[][] mänguväli) {
        for (String[] el : mänguväli) {
            //System.out.println(Arrays.toString(el));
            for (String märk : el) {
                System.out.print(märk + "  ");
            }
            System.out.println();
        }
    }

    public void pommita(String sisestatudKoordinaadid) {
        int[] koordinaadid = koordinaadiTeisendus(sisestatudKoordinaadid);
        list[koordinaadid[1]][koordinaadid[0]] = "o";
        prindiMänguväli(list);
    }
}
