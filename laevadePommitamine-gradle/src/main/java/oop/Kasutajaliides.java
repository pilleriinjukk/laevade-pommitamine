package oop;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.canvas.Canvas;
import javafx.stage.WindowEvent;

public class Kasutajaliides extends Application {

    @Override
    public void start(Stage peaLava) throws Exception {

        Group juur = new Group();
        GridPane ruudustik = new GridPane();
        Scene stseen = new Scene(ruudustik, 550, 550);

        Mänguväli mängija = new Mänguväli(0);
        Mänguväli arvuti = new Mänguväli((int) Math.round(Math.random() * 3 + 1.0));


        for (int i = 0; i < mängija.getList().length; i++) {
            for (int j = 0; j < mängija.getList()[i].length; j++) {
                Rectangle ruut = new Rectangle(50, 50, Color.LIGHTGRAY);

                if (mängija.getList()[i][j] == "-" || mängija.getList()[i][j] == "x" || mängija.getList()[i][j] == "o") {
                    ruut.setFill(Color.SLATEGREY);
                }

                Text tekst = new Text(mängija.getList()[i][j]);
                StackPane stack = new StackPane();
                stack.getChildren().addAll(ruut, tekst);


                //Label tekst = new Label(mängija.getList()[i][j]);
                //tekst.setLabelFor(ruut);
                //ruut.setAccessibleText("x");
                ruudustik.addRow(i, stack);
            }
        }

        peaLava.setScene(stseen);
        peaLava.setResizable(false);
        peaLava.show();
    }

    /**
     * Teisendab mängulaua x-koordinaadi lõuendi y-koordinaadiks leides antud
     * mänguvälja keskme y-koordinaadi.
     *
     * @param boardY Mänguvälja y-koordinaat [0..2]
     * @return Lõuendi koordinaat vastavalt kanvase suurusele.
     */
    private double boardToCanvasY(int boardY) {
        return (stseen.getHeight() / 22 * (1 + boardY * 2));
    }

    /**
     * Teisendab mängulaua x-koordinaadi lõuendi x-koordinaaiks leides antud
     * mänguvälja keskme x-koordinaadi.
     *
     * @param boardX Mänguvälja x-koordinaat [0..2]
     * @return Lõuendi koordinaat vastavalt lõuendi suurusele.
     */
    private double boardToCanvasX(int boardX) {
        return stseen.getWidth() / 22 * (1 + boardX * 2);
    }

    /**
     * See funktsioon kutsutakse välja, kui kasutaja klikib mängulaual.
     *
     * @param clickX Kasutaja klikitud koha x-koordinaat.
     * @param clickY Kasutaja klikitud koha y-koordinaat.
     */
    private void handleClickOnBoard(double clickX, double clickY) {
        double minDisdance = Double.MAX_VALUE;
        int nearestBoardX = 0;
        int nearestBoardY = 0;
        // Arvutame, millise mänguvälja keskpunktile kõige lähemale klikk tehti.
        for (int boardX = 0; boardX < 3; boardX++)
            for (int boardY = 0; boardY < 3; boardY++) {
                double centerX = boardToCanvasX(boardX);
                double centerY = boardToCanvasY(boardY);
                double distance = Math.sqrt(Math.pow(centerX - clickX, 2)
                        + Math.pow(centerY - clickY, 2));

                if (distance < minDisdance) {
                    minDisdance = distance;
                    nearestBoardX = boardX;
                    nearestBoardY = boardY;
                }
            }

        react(nearestBoardX, nearestBoardY);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
