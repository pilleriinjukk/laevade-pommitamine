package oop;

import java.util.Arrays;

public class Mänguväli {

    private String[][] list; // hoiab mälus mänguvälja listina
    private int laevaruutudeArv = 0; // loendab, mitu ruutu on pihta saadud


    // konstruktor, mis võimaldab vastavalt numbrile valida juhuslikult mänguvälja
    public Mänguväli(int number) {
        switch (number) {
            case 0: // mänguväli mängija tarbeks (mängija hakkab sellel mänguväljal pommitama)
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
                        {"1 ", "x", "x", "x", "-", "-", "-", "-", "-", "x", "-"},
                        {"2 ", "-", "-", "-", "-", "x", "-", "-", "-", "-", "-"},
                        {"3 ", "-", "-", "-", "-", "-", "-", "-", "x", "-", "-"},
                        {"4 ", "-", "-", "-", "-", "x", "-", "-", "x", "-", "-"},
                        {"5 ", "-", "-", "-", "-", "x", "-", "-", "-", "-", "-"},
                        {"6 ", "x", "-", "x", "-", "-", "-", "-", "-", "x", "-"},
                        {"7 ", "-", "-", "x", "-", "-", "-", "-", "-", "x", "-"},
                        {"8 ", "-", "-", "x", "-", "-", "-", "-", "-", "-", "-"},
                        {"9 ", "-", "-", "x", "-", "-", "-", "x", "x", "x", "-"},
                        {"10", "-", "-", "-", "-", "x", "-", "-", "-", "-", "-"}
                };

                break;
            case 5: // see siin on testimiseks
                list = new String[][]{
                        {"  ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"},
                        {"1 ", "x", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                        {"2 ", "x", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                        {"3 ", "x", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
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
        laevaruutudeArv = mituLaevaruutuOn(); // määrab isendivälja laevaruutudeArv väärtuse vastavalt sellele, mitu x-i mänguuväljal on
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

    public int mituLaevaruutuOn() { // meetod, mis loendab kõik listis olevad x-sümbolid (st ruudud, kus on laev)
        int ruute = 0;
        for (int i = 1; i < 11; i++)
            for (int j = 1; j < 11; j++)
                if (list[i][j] == "x") ruute++;
        return ruute;
    }

    public void muudaLaevaruutudeArvu(int arv) { // muudab isendivälja laevaruutudeArv väärtust
        laevaruutudeArv += arv;
    }



    // teisendab "A2" (String) kujul koordinaadid numbrite paariks (int[])
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
            case 'A':
                veerg = 1;
                break;
            case 'B':
                veerg = 2;
                break;
            case 'C':
                veerg = 3;
                break;
            case 'D':
                veerg = 4;
                break;
            case 'E':
                veerg = 5;
                break;
            case 'F':
                veerg = 6;
                break;
            case 'G':
                veerg = 7;
                break;
            case 'H':
                veerg = 8;
                break;
            case 'I':
                veerg = 9;
                break;
            case 'J':
                veerg = 10;
                break;
            default:
                veerg = 0;
        }
        int[] koordinaadipaar = {veerg, rida};
        return koordinaadipaar;
    }


    // prindib mänguvälja ekraanile (mitte aknasse)
    public void prindiMänguväli() {
        for (String[] el : list) {
            for (String märk : el) {
                System.out.print(märk + "  ");
            }
            System.out.println();
        }
    }


    // pommitab etteantud koorinaatidega ruutu
    public void pommita(int[] koordinaadid, Mänguväli arvuti) {
        if (saiPihta(koordinaadid, arvuti)) { // kui mängija saab laevale pihta
            list[koordinaadid[1]][koordinaadid[0]] = "x"; // muudab mängija listis vastava elemendi pihtasaanuks
            kasLaevOnMaas3(koordinaadid, arvuti, new int[][]{koordinaadid, {}, {}, {}}, 0); // kontrollib, kas laev sai põhja pommitatud
        } else
        if (list[koordinaadid[1]][koordinaadid[0]] == "-" || list[koordinaadid[1]][koordinaadid[0]] == "o") { // et vältida juba pommitatud ruutude ülepommitamist
            list[koordinaadid[1]][koordinaadid[0]] = "o";
        }
    }


    // kontrollib, kas mängija sai laevale pihta
    public boolean saiPihta(int[] koordinaadid, Mänguväli arvuti) {
        if (arvuti.getList()[koordinaadid[1]][koordinaadid[0]] == "x" && (list[koordinaadid[1]][koordinaadid[0]] == "-" || list[koordinaadid[1]][koordinaadid[0]] == "o")) {
            muudaLaevaruutudeArvu(1); // suurendab argumendi väärtust ühe võrra
            return true;
        }
        return false;
    }


    // kontrollib, kas tabamusega saadi laev põhja või mitte
    public boolean kasLaevOnMaas3(int[] koordinaadid, Mänguväli arvutiMänguväli, int[][] tabamusteKoordinaadid, int mitmes) {
        if (Arrays.equals(koordinaadid, new int[] {}) || mitmes >= 3) return true;

        boolean laevOnPõhjas = true;
        for (int veerg = koordinaadid[0] - 1; veerg <= koordinaadid[0] + 1; veerg++) {
            if (veerg < 1 || veerg > 10) continue;
            else {
                for (int rida = koordinaadid[1] - 1; rida <= koordinaadid[1] + 1; rida++) {
                    if (rida < 1 || rida > 10) continue;
                    else {
                        if (arvutiMänguväli.getList()[rida][veerg].equals("x") && !(list[rida][veerg].equals("x"))) {
                            return false;
                        }
                        if (arvutiMänguväli.getList()[rida][veerg].equals("x") && list[rida][veerg].equals("x")) {

                            boolean onOlemas = false;
                            int[] vaadeldavadKoordinaadid = new int[]{veerg, rida};

                            for (int i = 0; i < tabamusteKoordinaadid.length; i++) {
                                if (Arrays.equals(tabamusteKoordinaadid[i], vaadeldavadKoordinaadid)) {
                                    onOlemas = true;
                                    //laevOnPõhjas = true;
                                }
                            }

                            if (!onOlemas) {
                                boolean onLisatud = false;
                                for (int i = 0; i < tabamusteKoordinaadid.length; i++) {
                                    if (!onLisatud) {
                                        if (Arrays.equals(tabamusteKoordinaadid[i], new int[]{})) {
                                            tabamusteKoordinaadid[i] = vaadeldavadKoordinaadid;
                                            onLisatud = true;
                                        }
                                    }
                                }
                                //laevOnPõhjas = kasLaevOnMaas3(vaadeldavadKoordinaadid, arvutiMänguväli, tabamusteKoordinaadid);
                            }
                        }
                    }
                }
            }
        }
        // rekursiivne väljakutse
        laevOnPõhjas = laevOnPõhjas && kasLaevOnMaas3(tabamusteKoordinaadid[mitmes + 1], arvutiMänguväli, tabamusteKoordinaadid, mitmes + 1);

        if (laevOnPõhjas) {
            pommitaÜmbert(tabamusteKoordinaadid);
        }
        return laevOnPõhjas;
    }


    // märgib kõik laeva ümber olevad ruudud pommitatuks
    public void pommitaÜmbert(int[][] tabamustekoordinaadid) {
        int[] vähim;
        int[] suurim;
        int[] summad = new int[tabamustekoordinaadid.length];

        for (int i = 0; i < tabamustekoordinaadid.length; i++) {
            int vahesumma = 0;
            for (int el : tabamustekoordinaadid[i]) {
                vahesumma += el;
            }
            summad[i] = vahesumma;
        }

        int vähimaIndeks = 0;
        int suurimaIndeks = 0;
        for (int i = 1; i < summad.length; i++) {
            if (summad[i] < summad[vähimaIndeks] && summad[i] > 0) vähimaIndeks = i;
            if (summad[i] > summad[suurimaIndeks]) suurimaIndeks = i;
        }

        vähim = tabamustekoordinaadid[vähimaIndeks];
        suurim = tabamustekoordinaadid[suurimaIndeks];

        for (int i = vähim[0] - 1; i < suurim[0] + 2; i++) { //veerg
            if (i < 1 || i > 10) continue;
            else {
                for (int j = vähim[1] - 1; j < suurim[1] + 2; j++) { //rida
                    if (j < 1 || j > 10) continue;
                    else if (!list[j][i].equals("x")) list[j][i] = "o";
                }
            }
        }
    }

}




// KATSETUSED (mida võib veel kunagi vaja minna)

    /*public String[][] kasLaevOnMaas1(int[] koordinaadid, Mänguväli mängijaMänguväli) {
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
                            if (suurimKoordinaat[0] < a || suurimKoordinaat[1] < b)
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
    }*/

    /*public boolean kasLaevOnMaas2(int[] koordinaadid, Mänguväli arvutiMänguväli, boolean üleval, boolean all, boolean vasakul, boolean paremal, int i) {
        boolean laevOnMaas = false;
        int veerg = koordinaadid[0];
        int rida = koordinaadid[1];

        if (i > 4) return true;

       // if (Integer.parseInt(arvutiMänguväli.getList()[veerg] [rida - 1]) < 0)


        if (arvutiMänguväli.getList()[veerg] [rida - 1].equals("x") && (rida > 1))
            return kasLaevOnMaas2(new int[] {veerg, rida - 1}, arvutiMänguväli, true, false, vasakul, paremal, i + 1);

        if (arvutiMänguväli.getList()[veerg] [rida + 1].equals("x") && (rida < 10))
            return kasLaevOnMaas2(new int[] {veerg, rida + 1}, arvutiMänguväli, üleval, true, vasakul, paremal, i + 1);

        if (arvutiMänguväli.getList()[veerg - 1] [rida].equals("x") && (veerg > 1))
            return kasLaevOnMaas2(new int[] {veerg - 1, rida}, arvutiMänguväli, üleval, all, true, paremal, i + 1);

        if (arvutiMänguväli.getList()[veerg + 1] [rida].equals("x") && (veerg < 10))
            return kasLaevOnMaas2(new int[] {veerg + 1, rida}, arvutiMänguväli, üleval, all, vasakul, true, i + 1);
        return laevOnMaas;
    }*/



// -- meetodi kasOnMaas3() lõpust võetud kõik katsetused:

    /* if (koordinaate == 4) return laevOnPõhjas;

            laevOnPõhjas = laevOnPõhjas && kasLaevOnMaas3(tabamusteKoordinaadid[mitmes + 1], arvutiMänguväli, tabamusteKoordinaadid, mitmes + 1);

        *//*laevOnPõhjas = laevOnPõhjas && kasLaevOnMaas3(tabamusteKoordinaadid[1], arvutiMänguväli, tabamusteKoordinaadid) &&
                kasLaevOnMaas3(tabamusteKoordinaadid[2], arvutiMänguväli, tabamusteKoordinaadid) &&
                kasLaevOnMaas3(tabamusteKoordinaadid[3], arvutiMänguväli, tabamusteKoordinaadid);*//*

 *//*for (int[] el : tabamusteKoordinaadid) {
            if (!Arrays.equals(koordinaadid, el) && !Arrays.equals(new int[] {}, el))
                laevOnPõhjas = kasLaevOnMaas3(el, arvutiMänguväli, tabamusteKoordinaadid);
        }*//*
            if (laevOnPõhjas) {
            //System.out.println("laev on põhjas");
            pommitaÜmbert(tabamusteKoordinaadid);
            }
            return laevOnPõhjas;*/
