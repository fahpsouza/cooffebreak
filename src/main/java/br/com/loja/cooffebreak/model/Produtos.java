package br.com.loja.cooffebreak.model;

import br.com.loja.cooffebreak.dto.CadastroProdutoDto;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "produtos")
public class Produtos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Double valor;

    @Enumerated(EnumType.STRING)
    private TipoProduto tipoProduto;

    private LocalDateTime createdDate;

    public Produtos() {
    }

    public Produtos(CadastroProdutoDto dto) {
        this.nome = dto.nome();
        this.valor = dto.valor();
        this.tipoProduto = TipoProduto.fromString(dto.tipoProduto());
        this.createdDate = LocalDateTime.now();
    }

}
