package dev.augusto.controller;

import java.util.List;

public interface ColetaDadosStrategy {
    /**
     * Coleta dados do sistema e retorna uma lista de preços.
     *
     * @return Lista de valores coletados
     * @throws Exception se ocorrer erro na coleta
     */
    List<Double> coletarDados() throws Exception;
}
