package br.com.loja.cooffebreak.model;

public enum TipoProduto {

    COMIDA("Comida"),
    BEBIDA("Bebida"),
    SOBREMESA("Sobremesa"),
    NAO_PERECIVEIS("Nao Pereciveis");

    private String categoria;

    TipoProduto(String categoriaRecebida) {
        this.categoria = categoriaRecebida;
    }

    public static TipoProduto fromString(String text) {
        for (TipoProduto categoria : TipoProduto.values()) {
            if (categoria.categoria.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + text);
    }

}
