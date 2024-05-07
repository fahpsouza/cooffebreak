package br.com.loja.cooffebreak.controller;

import br.com.loja.cooffebreak.dto.CadastroProdutoDto;
import br.com.loja.cooffebreak.service.ProdutoService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cadastrar-produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("isAlive")
    public ResponseEntity<String> isAlive () {
        try {
            return ResponseEntity.ok("The application is UP and Running!");
        } catch (Exception exception) {
            return ResponseEntity.badRequest().body(exception.getMessage());
        }

    }

    @PostMapping
    @Transactional
    public ResponseEntity<String> cadastrar (@RequestBody @Valid CadastroProdutoDto dto){
        try {
            this.produtoService.cadastrar(dto);
            return ResponseEntity.ok("cadastrado com sucesso");
        } catch (Exception exception) {
            return ResponseEntity.badRequest().body(exception.getMessage());
        }
    }
}
