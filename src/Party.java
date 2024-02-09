import java.awt.*;
import java.awt.event.*;

public class Party {
    public static void main(String[] args) {
        Party party = new Party();
        party.buildInvite();
    }
    public void buildInvite() {

        Frame f = new Frame();
        Label l = new Label("Party at Ara's");
        Button b = new Button("You bet");
        Button c = new Button("Shoot me");
        Panel p = new Panel();
        p.add(l);

    }
}