package br.com.loja.cooffebreak.dto;

import jakarta.validation.constraints.NotBlank;

public record CadastroProdutoDto (
        @NotBlank
        String nome,

        @NotBlank
        String tipoProduto,

        Double valor) {

}
