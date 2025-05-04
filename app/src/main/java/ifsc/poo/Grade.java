package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class Grade {

    private int posX;
    private int posY;
    private int lado;
    private int tamGrade;
    private Color color;

    public Grade(int posX, int posY, int lado, int tamGrade, Color color) {
        this.posX = posX;
        this.posY = posY;
        this.lado = lado;
        this.tamGrade = tamGrade;
        this.color = color;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public int getLado() {
        return lado;
    }

    public int getTamGrade() {
        return tamGrade;
    }

    public Color getColor() {
        return color;
    }

    public void desenhar (Draw draw) {
        draw.setPenColor(Color.BLACK);
        for (int j = 0; j < this.tamGrade; j++) {
            for (int i = 0; i < this.tamGrade; i++) {
                draw.square(posX, posY, lado);
                posX += (this.lado * 2);
            }
            posX -= (this.tamGrade * (this.lado * 2));
            posY += (this.lado * 2);
        }
        posX  -= (this.lado * 2);
        posY  -= (this.tamGrade * (this.lado * 2));

        draw.setPenColor(color);
        int n = 65;
        char rotY;
        for (int i = 0; i < tamGrade; i++) {
            rotY = (char) n;
            draw.text(posX, posY, "" + rotY);
            posY += (this.lado * 2);
            n++;
        }
        posX += (this.lado * 2);
        posY -= ((this.tamGrade + 1) * (this.lado * 2));
        n = 0;
        for (int i = 0; i < tamGrade; i++) {
            draw.text(posX, posY, "" + n);
            posX += (this.lado * 2);
            n++;
        }
        posX -= (this.tamGrade * this.lado * 2);
        posY += (this.lado * 2);
    }
}
