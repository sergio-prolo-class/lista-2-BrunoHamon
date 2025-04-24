package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

public class Grade {

    private int posX;
    private int posY;

    public Grade (Draw draw) {
        this.posX = 30;
        this.posY = 30;
        draw.square(posX, posY, 10);
    }
}
