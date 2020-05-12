package sample;

import javafx.event.Event;
import javafx.event.EventTarget;
import javafx.event.EventType;

import static javafx.application.Application.launch;

public class Main extends Event {

    public Main(EventType<? extends Event> eventType) {
        super(eventType);
    }

    public Main(Object source, EventTarget target, EventType<? extends Event> eventType) {
        super(source, target, eventType);
    }

    public static void main(String[] args) {
        System.out.println();
        launch(args);
        System.out.println("test dzialania");
        //test krzysiek;
        //test
        //test2
    }
}
