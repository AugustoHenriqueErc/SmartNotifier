package dev.augusto.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ColetaRealApi implements ColetaDadosStrategy {
    private static final String DEFAULT_URL = "jdbc:mysql://localhost:3306/criptodb?serverTimezone=UTC";
    private static final String DEFAULT_USUARIO = "root";
    private static final String DEFAULT_SENHA = "";

    private final String url;
    private final String usuario;
    private final String senha;

    public ColetaRealApi() {
        this(DEFAULT_URL, DEFAULT_USUARIO, DEFAULT_SENHA);
    }

    public ColetaRealApi(String url, String usuario, String senha) {
        this.url = url;
        this.usuario = usuario;
        this.senha = senha;
    }

    @Override
    public List<Double> coletarDados() throws Exception {
        List<Double> precos = new ArrayList<>();
        String sql = "SELECT preco FROM cotacao";

        try (Connection conexao = DriverManager.getConnection(url, usuario, senha);
             PreparedStatement comando = conexao.prepareStatement(sql);
             ResultSet resultado = comando.executeQuery()) {

            while (resultado.next()) {
                precos.add(resultado.getDouble("preco"));
            }
        }

        return precos;
    }
}
