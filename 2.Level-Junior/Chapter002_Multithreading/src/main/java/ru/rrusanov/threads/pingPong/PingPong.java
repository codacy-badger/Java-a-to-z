package ru.rrusanov.threads.pingPong;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
/**
 * @author Roman Rusanov
 * @version 0.1
 * @since 06.08.2018
 *
 * This class describes app windows for animation.
 */
public class PingPong extends Application {
    /**
     * The field contain string with title window.
     */
    private static final String JOB4J = "Пинг-понг www.job4j.ru";
    /**
     * The method init window application.
     * @param stage current stage window
     */
    @Override
    public void start(Stage stage) {
        int limitX = 300;
        int limitY = 300;
        Group group = new Group();
        Rectangle rect = new Rectangle(50, 100, 10, 10);
        group.getChildren().add(rect);
        RectangleMove rectangleMove = new RectangleMove(rect);
        Thread t = new Thread(rectangleMove);
        t.start();
        stage.setScene(new Scene(group, limitX, limitY));
        stage.setTitle(JOB4J);
        stage.setResizable(false);
        stage.setOnCloseRequest(event -> t.interrupt());
        stage.show();
    }
}
