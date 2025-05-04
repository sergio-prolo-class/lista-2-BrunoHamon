package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

public class Grade {

    private int posX;
    private int posY;
    private int lado;
    private int tamGrade;

    public void desenhar (Draw draw) {
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
        posX = 20;
        posY = 60;
        int n = 65;
        char rotY;
        for (int i = 0; i < tamGrade; i++) {
            rotY = (char) n;
            draw.text(posX, posY, "" + rotY);
            posY += 40;
            n++;
        }
        posX = 60;
        posY = 20;
        n = 0;
        for (int i = 0; i < tamGrade; i++) {
            draw.text(posX, posY, "" + n);
            posX += 40;
            n++;
        }
    }
}
