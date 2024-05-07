package br.com.loja.cooffebreak.service;

import br.com.loja.cooffebreak.dto.CadastroProdutoDto;
import br.com.loja.cooffebreak.model.Produtos;
import br.com.loja.cooffebreak.repository.ProdutoRepository;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public void cadastrar(CadastroProdutoDto dto) {
        boolean jaCadastrado = produtoRepository.existsByNome(dto.nome());
        if (jaCadastrado) {
            throw new ValidationException("Dados já cadastrados para outro produto!");
        }
        produtoRepository.save(new Produtos(dto));
    }
}
