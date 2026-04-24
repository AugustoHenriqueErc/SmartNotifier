package dev.augusto.controller;

import java.util.List;
import java.util.Random;

public class ColetaMock implements ColetaDadosStrategy {
    private static final double MIN_VALOR = 50000.0;
    private static final double MAX_VALOR = 60000.0;

    private final Random random = new Random();

    @Override
    public List<Double> coletarDados() {
        double valor = MIN_VALOR + (MAX_VALOR - MIN_VALOR) * random.nextDouble();
        return List.of(valor);
    }
}
