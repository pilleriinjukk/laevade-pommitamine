public class Mänguväli {

    private String[][] list;
    private int laevaruutudeArv = 0;

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
                        {"4 ", "-", "-", "-", "x", "-", "-", "-", "-", "-", "-"},
                        {"5 ", "-", "x", "-", "-", "-", "-", "-", "-", "-", "-"},
                        {"6 ", "-", "x", "-", "-", "x", "-", "x", "x", "-", "-"},
                        {"7 ", "-", "x", "-", "-", "x", "-", "-", "-", "-", "-"},
                        {"8 ", "-", "-", "-", "-", "x", "-", "-", "-", "-", "-"},
                        {"9 ", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                        {"10", "-", "x", "-", "x", "-", "-", "-", "x", "-", "-"}
                };
                break;
            case 3:
                list = new String[][]{
                        {"  ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"},
                        {"1 ", "-", "-", "-", "-", "-", "x", "-", "-", "-", "-"},
                        {"2 ", "-", "-", "-", "-", "-", "x", "-", "x", "-", "-"},
                        {"3 ", "-", "x", "-", "-", "-", "x", "-", "-", "-", "-"},
                        {"4 ", "-", "-", "-", "-", "-", "-", "-", "-", "x", "-"},
                        {"5 ", "x", "x", "-", "-", "-", "-", "x", "-", "x", "-"},
                        {"6 ", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                        {"7 ", "-", "-", "-", "-", "x", "x", "-", "-", "-", "-"},
                        {"8 ", "-", "-", "-", "-", "-", "-", "-", "-", "x", "-"},
                        {"9 ", "x", "-", "-", "-", "-", "-", "-", "-", "x", "-"},
                        {"10", "-", "-", "x", "x", "x", "x", "-", "-", "x", "-"}
                };
                break;
            case 4:
                list = new String[][]{
                        {"  ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"},
                        {"1 ", "x", "x", "x", "-", "-", "-", "-", "-", "-", "-"},
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
        }
        laevaruutudeArv = mituLaevaruutuOn();
    }

    public String[][] getList() {
        return list;
    }

    public int getLaevaruutudeArv() {
        return laevaruutudeArv;
    }

    public void setList(String[][] list) {
        this.list = list;
    }

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

    public void prindiMänguväli() {
        for (String[] el : list) {
            //System.out.println(Arrays.toString(el));
            for (String märk : el) {
                System.out.print(märk + "  ");
            }
            System.out.println();
        }
    }

    public void pommita(int[] koordinaadid, Mänguväli arvuti) {
        //int[] koordinaadid = koordinaadiTeisendus(sisestatudKoordinaadid);
        if (saiPihta(koordinaadid, arvuti)) {
            list[koordinaadid[1]][koordinaadid[0]] = "x";

        }
        else list[koordinaadid[1]][koordinaadid[0]] = "o";
    }

    public boolean saiPihta(int[] koordinaadid, Mänguväli arvuti) {
        if (arvuti.getList()[koordinaadid[1]][koordinaadid[0]] == "x") {
            muudaLaevaruutudeArvu(1);
            return true;
        }
        return false;
    }

    public boolean kasLaevOnMaas(int[] koordinaadid, Mänguväli arvutiMänguväli, boolean üleval, boolean all, boolean vasakul, boolean paremal, int i) {
        boolean laevOnMaas = false;
        int veerg = koordinaadid[0];
        int rida = koordinaadid[1];

        if (i > 4) return true;

       // if (Integer.parseInt(arvutiMänguväli.getList()[veerg] [rida - 1]) < 0)


        if (arvutiMänguväli.getList()[veerg] [rida - 1].equals("x") && (rida > 1))
            return kasLaevOnMaas(new int[] {veerg, rida - 1}, arvutiMänguväli, true, false, vasakul, paremal, i + 1);

        if (arvutiMänguväli.getList()[veerg] [rida + 1].equals("x") && (rida < 10))
            return kasLaevOnMaas(new int[] {veerg, rida + 1}, arvutiMänguväli, üleval, true, vasakul, paremal, i + 1);

        if (arvutiMänguväli.getList()[veerg - 1] [rida].equals("x") && (veerg > 1))
            return kasLaevOnMaas(new int[] {veerg - 1, rida}, arvutiMänguväli, üleval, all, true, paremal, i + 1);

        if (arvutiMänguväli.getList()[veerg + 1] [rida].equals("x") && (veerg < 10))
            return kasLaevOnMaas(new int[] {veerg + 1, rida}, arvutiMänguväli, üleval, all, vasakul, true, i + 1);



        return laevOnMaas;
    }

    //proovida siin erinevatel juhtudel üle
    public String[][] kasLaevOnhMaas(int[] koordinaadid, Mänguväli mängijaMänguväli) {
        boolean onTerveLaev = false;
        int[] suurimKoordinaat = koordinaadid.clone();
        //kontrollib, kas mängija on maha pommitanud terve laeva
        for (int a = koordinaadid[0] - 1; a < koordinaadid[0] + 2; a++) { //veerg
            if (a < 1 || a > 11) continue;
            else
                for (int b = koordinaadid[1] - 1; b < koordinaadid[1] + 2; b++) { //rida
                    if (b < 1 || b > 11) continue;
                    else
                        if (list[b][a].equals("x") && mängijaMänguväli.getList()[b][a].equals("x")) {
                            onTerveLaev = true;
                            suurimKoordinaat[0] = a;
                            suurimKoordinaat[1] = b;
                        }
                }
        }

        if (onTerveLaev) { //muudab laeva ümbruse tähistuse "o"-ks
            for (int i = koordinaadid[0] - 1; i < suurimKoordinaat[0] + 2; i++) { //veerg
                if (i < 1 || i > 11) continue;
                else
                    for (int j = koordinaadid[1] - 1; j < suurimKoordinaat[1] + 2; j++) { //rida
                        if (j < 1 || j > 11) continue;
                        else
                        if (!list[j][i].equals("x")) mängijaMänguväli.getList()[j][i] = "o";
                    }
            }
        }
        return mängijaMänguväli.getList();
    }

    public int mituLaevaruutuOn() {
        int ruute = 0;
        for (int i = 1; i < 11; i++)
            for (int j = 1; j < 11; j++)
                if (list[i][j] == "x") ruute++;
        return ruute;
    }

    public void muudaLaevaruutudeArvu(int arv) {
        laevaruutudeArv += arv;
    }
}
