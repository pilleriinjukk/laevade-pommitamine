package oop;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.NumberBinding;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Kasutajaliides extends Application {

    private String kasutajanimi; // mängija nimi, mille ta ise sisestab

    public static void main(String[] args) {
        launch(args);
    }

    public void salvestaKasutajanimi(String nimi) {
        kasutajanimi = nimi;
    }

    // salvestab ruutude isendid massiivi (võimaldab hiljem nende värvi muuta)
    public Rectangle[][] looRuudud(Mänguväli mängija) {
        Rectangle[][] ruudud = new Rectangle[11][11];
        for (int i = 0; i < mängija.getList().length; i++) {
            for (int j = 0; j < mängija.getList()[i].length; j++) {
                Rectangle ruut = new Rectangle(603 / 11.0, 603 / 11.0, Color.LIGHTGRAY);
                if (mängija.getList()[i][j].equals("-") || mängija.getList()[i][j].equals("x") || mängija.getList()[i][j].equals("o")) {
                    ruut.setFill(Color.SLATEGREY);
                }
                ruudud[i][j] = ruut;
            }
        }
        return ruudud;
    }

    // loob StackPane'ina mängulaua, kuhu on lisatud kõik ruudud õigete värvide ja mõõtmetega ning ka veeru- ja reatähised
    public StackPane looMängulaud(Mänguväli mängija, Rectangle[][] ruudud) {
        GridPane ruudustik = new GridPane();
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (!mängija.getList()[i][j].equals("x") && !mängija.getList()[i][j].equals("-") && !mängija.getList()[i][j].equals("o")) {
                    // ehk kui tegemist on tähe või numbriga
                    Text tekst = new Text(mängija.getList()[i][j]);
                    StackPane stack = new StackPane();
                    stack.getChildren().addAll(ruudud[i][j], tekst);
                    ruudustik.addRow(i, stack);
                } else {
                    ruudustik.addRow(i, ruudud[i][j]);
                }
            }
        }
        return new StackPane(ruudustik);
    }

    // leiab, milliste koordinaatidega ruudule vajutati st millist ruutu pommitati
    public int[] vajutatiRuudule(double x, double y, StackPane sp) {
        double mänguväljaLaius = sp.getWidth();
        double mänguväljaKõrgus = sp.getHeight();
        int veeruNr = leiaRuut(x, mänguväljaLaius);
        int reaNr = leiaRuut(y, mänguväljaKõrgus);
        int[] koordinaadid = {veeruNr, reaNr};
        return koordinaadid;
    }

    // leiab pommitatud ruudu x või y koordinaadi (vastavalt mänguvälja mõõtmetele)
    public int leiaRuut(double koordinaat, double suurus) {
        double ruuduLaius = suurus / 11.0;
        double hetkeLaius = ruuduLaius;
        int ruuduNr = -1;

        for (int i = 0; i < 11; i++) {
            if (koordinaat < hetkeLaius) {
                ruuduNr = i;
                break;
            }
            hetkeLaius += ruuduLaius;
        }
        return ruuduNr;
    }

    // värvib kõik ruudud vastavalt sellele, millises olekus need on
    public void värviRuudud(Rectangle[][] ruudud, Mänguväli mängija) {
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (mängija.getList()[j][i].equals("x")) {
                    ruudud[j][i].setFill(Color.DARKRED);
                }
                if (mängija.getList()[j][i].equals("o")) {
                    ruudud[j][i].setFill(Color.MEDIUMBLUE);
                }
            }
        }
    }

    // kirjutab tulemuste faili juurde ühe rea kujul "mängija_nimi mängija_käikude_arv"
    public void kirjutaTulemusFaili(Mänguväli mängija) throws IOException {
        String nimi = kasutajanimi;
        int punktid = mängija.getTehtudKäigud();
        // kirjutab faili "tulemused.txt", aga kui sellist faili ei ole, siis loob selle
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("tulemused.txt", true))) {
            bw.write(nimi + " " + punktid + "\n");
        }
        //throw new IOException("viga");  // erinditöötluse testimiseks (muidu ei tekkinud erindeid)
    }

    // muudab pealava suurust nii, et stseeni kõrgus ja laius oleksid kogu aeg peaaegu võrdsed
    public void muudaAknaSuurust(Stage peaLava) {
        if (peaLava.getHeight() > peaLava.getWidth()) {
            peaLava.setHeight(peaLava.getWidth() + 25);
        } else {
            peaLava.setWidth(peaLava.getHeight() - 25);
        }
    }

    @Override
    public void start(Stage peaLava) throws IOException {

        Mänguväli mängija = new Mänguväli("0.txt");
        //Mänguväli arvuti = new Mänguväli(Math.round(Math.random() * 9 + 1.0) + ".txt");
        Mänguväli arvuti = new Mänguväli(5); // see on testimiseks

        Text algusTekst = new Text("Tere tulemast mängima mängu \"Laevade pommitamine\"! \n\n\n" +
                "Mänguväljal on kokku 10 laeva: \n" +
                "    pikkusega 4 ruutu  -  1 laev \n" +
                "    pikkusega 3 ruutu  -  2 laeva \n" +
                "    pikkusega 2 ruutu  -  3 laeva \n" +
                "    pikkusega 1 ruut    -  4 laeva \n\n" +
                "Võitmiseks pead tabama kõik arvuti laevad.\n\n" +
                "Tähistus: \n" +
                "    hall - pommitamata ruut \n" +
                "    sinine - pommitatud ruut, millel pole laeva \n" +
                "    tumepunane - pommitatud ruut, millel on laev \n\n" +
                "Mängu alustamiseks vajuta ENTER.");

        StackPane sp = new StackPane();
        sp.getChildren().addAll(algusTekst);
        Scene algusStseen = new Scene(sp, 500, 400);
        peaLava.setScene(algusStseen);
        peaLava.setTitle("Laevade pommitamine");

        Rectangle[][] ruudud = looRuudud(mängija);
        StackPane interaktiivneRuudustik = looMängulaud(mängija, ruudud);
        Scene stseen = new Scene(interaktiivneRuudustik, 603, 603);

        // kui kasutaja vajutab esimeses aknas ENTERit, siis küsitakse kasutajanime ja seejärel alustatakse mängu
        algusStseen.setOnKeyPressed(event2 -> {
            if (event2.getCode().equals(KeyCode.ENTER)) {
                String sisestatakse = "";
                // kasutajanime küsitakse seni, kuni kasutaja midagi sisestab
                while (sisestatakse.equals("")) {
                    sisestatakse = JOptionPane.showInputDialog("\nSisesta oma nimi: ");
                    salvestaKasutajanimi(sisestatakse); // kasutajanimi salvestatakse isendiväljale
                }
                // kuvatakse mängulaud
                peaLava.setScene(stseen);
                peaLava.sizeToScene();
            }
        });

        // kui kasutaja muudab akna suurust ja liigub uuesti aknasse, siis muudetakse pikkus ja laius automaatselt võrdseteks
        interaktiivneRuudustik.setOnMouseMoved(event -> muudaAknaSuurust(peaLava));

        // kui kasutaja klikib mänguväljale, siis tehakse kindlaks, millisele ruudule ta klikkis, ja vastavalt vajadusele
        // pommitatakse ruutu ning muudetakse ruudu värv ära
        interaktiivneRuudustik.setOnMouseClicked(event -> {

            // leitakse hiirega klikitud punktile vastavad koordinaadid, pommitatakse mänguvälja ja värvitakse ruudustik üle
            int[] koordinaadid = vajutatiRuudule(event.getSceneX(), event.getSceneY(), interaktiivneRuudustik);
            mängija.pommita(koordinaadid, arvuti);
            värviRuudud(ruudud, mängija);

            if (mängija.getLaevaruutudeArv() - arvuti.getLaevaruutudeArv() == 0) { // kui mängija on kõik laevad põhja saanud
                Text tekst;

                try {
                    kirjutaTulemusFaili(mängija); // tulemus proovitakse lisada tulemusfaili
                    tekst = new Text("                    Võitsid! \n\n\nAkna sulgemiseks vajuta ENTER.");
                } catch (IOException e) {
                    tekst = new Text("Võitsid mängu, aga sinu tulemust ei õnnestunud kahjuks salvestada. \n\n\n" +
                            "                       Akna sulgemiseks vajuta ENTER.");
                }

                // uus aken valmistatakse ette ja seda näidatakse
                StackPane stack = new StackPane();
                stack.getChildren().addAll(tekst);
                stack.setAlignment(Pos.CENTER);
                Scene lõppStseen = new Scene(stack);
                peaLava.setWidth(500);
                peaLava.setHeight(250);
                peaLava.setScene(lõppStseen);
                peaLava.setTitle("Võitsid");

                // viimasest aknast saab väljuda, kui vajutad ENTER
                lõppStseen.setOnKeyPressed(event1 -> {
                    if (event1.getCode().equals(KeyCode.ENTER)) {
                        peaLava.close();
                    }
                });
            }
        });

        // muudab interaktiivse ruudustiku (StackPane) mõõtmeid vastavalt stseeni suurusele
        NumberBinding suurus = Bindings.min(stseen.widthProperty().divide(stseen.getHeight()), stseen.heightProperty().divide(stseen.getWidth()));
        interaktiivneRuudustik.scaleXProperty().bind(suurus);
        interaktiivneRuudustik.scaleYProperty().bind(suurus);

        // määrab pealavale minimaalse ja maksimaalse suuruse
        peaLava.minWidthProperty().setValue(300);
        peaLava.minHeightProperty().setValue(320);
        peaLava.maxWidthProperty().setValue(630);
        peaLava.maxHeightProperty().setValue(650);

        peaLava.show();
    }
}