package br.com.loja.cooffebreak.repository;

import br.com.loja.cooffebreak.model.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produtos, Long> {
    boolean existsByNome(String nome);

}
