package dev.augusto.controller;

public class Configuracao {
    private static Configuracao instance;

    private String fonteDados;
    private double limiteVariacao;

    private Configuracao() {
        // Construtor privado para implementar Singleton
    }

    public static Configuracao getInstance() {
        if (instance == null) {
            instance = new Configuracao();
        }
        return instance;
    }

    public String getFonteDados() {
        return fonteDados;
    }

    public void setFonteDados(String fonteDados) {
        this.fonteDados = fonteDados;
    }

    public double getLimiteVariacao() {
        return limiteVariacao;
    }

    public void setLimiteVariacao(double limiteVariacao) {
        this.limiteVariacao = limiteVariacao;
    }
}
