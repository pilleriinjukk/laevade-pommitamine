package oop;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.NumberBinding;
import javafx.scene.Group;
import javafx.scene.layout.*;
import javafx.scene.shape.Shape;
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
       /* ruudustik.setMinSize(600, 600);
        ruudustik.setMaxSize(600, 600);*/
        StackPane interaktiivneRuudustik = new StackPane(ruudustik);
        Scene stseen = new Scene(interaktiivneRuudustik, 850, 850);
        peaLava.setHeight(stseen.getHeight());

        Mänguväli mängija = new Mänguväli(0);
        Mänguväli arvuti = new Mänguväli((int) Math.round(Math.random() * 3 + 1.0));


        for (int i = 0; i < mängija.getList().length; i++) {
            for (int j = 0; j < mängija.getList()[i].length; j++) {
                //Rectangle ruut = new Rectangle(50, 50, Color.LIGHTGRAY);
                Rectangle ruut = new Rectangle(stseen.getWidth()/11, stseen.getHeight()/11, Color.LIGHTGRAY);

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

        //interaktiivneRuudustik.setAlignment(Pos.TOP_LEFT);
        //interaktiivneRuudustik.autosize();
        NumberBinding suurus = Bindings.min(stseen.widthProperty().divide(stseen.getHeight()), stseen.heightProperty().divide(stseen.getWidth()));
        interaktiivneRuudustik.scaleXProperty().bind(suurus);
        interaktiivneRuudustik.scaleYProperty().bind(suurus);
        //interaktiivneRuudustik.setShape(new Shape());

        /*ruudustik.scaleXProperty().setValue(stseen.getHeight());
        ruudustik.scaleYProperty().setValue(stseen.getWidth());*/

        peaLava.setScene(stseen);
        //peaLava.setResizable(false);
        peaLava.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
