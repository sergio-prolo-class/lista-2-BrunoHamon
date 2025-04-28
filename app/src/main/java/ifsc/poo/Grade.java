package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

public class Grade {

    private int posX;
    private int posY;
    private int lado;
    private int tamGrade;
    private char rotY;
    private int rotX;

    public Grade (Draw draw) {
        this.posX = 60;
        this.posY = 60;
        this.lado = 20;
        this.tamGrade = 10;
        for (int j = 0; j < this.tamGrade; j++) {
            for (int i = 0; i < this.tamGrade; i++) {
                draw.square(posX, posY, lado);
                posX += 40;
            }
            posX = 60;
            posY += 40;
        }
        int n = 0;
        for (int i = 0; i < 100; i++)
        draw.text(posX, posY, "" + rotY);
        posX += 40;
        n++;
        this.rotY = (char) n;
    }
}
