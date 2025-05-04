package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class Navio {

    private int tamanho;
    private int posicaoX;
    private int posicaoY;
    private boolean orientacao;
    private Grade grade;

    public Navio (int tamanho, int posicaoX, int posicaoY, boolean orientacao, Grade grade) {
        this.tamanho = tamanho;
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
        this.orientacao = orientacao;
        this.grade = grade;
    }

    public void desenhar (Draw draw) {
        draw.setPenColor(grade.getColor());
        int x, y;
        for (int i = 0; i < tamanho; i++) {
            x = grade.getPosX() + (this.posicaoX * grade.getLado() * 2);
            y = grade.getPosY() + (this.posicaoY * grade.getLado() * 2);
            draw.filledSquare(x, y, grade.getLado());
            if (orientacao) {
                posicaoX++;
            } else {
                posicaoY++;
            }
            if ((posicaoX >= grade.getTamGrade()) || (posicaoY >= grade.getTamGrade())) {
                break;
            }
        }
    }
}
