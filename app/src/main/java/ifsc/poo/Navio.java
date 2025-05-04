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

    }
}
