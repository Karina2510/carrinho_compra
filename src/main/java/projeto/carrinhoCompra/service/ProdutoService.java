package projeto.carrinhoCompra.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projeto.carrinhoCompra.domain.entity.Produto;
import projeto.carrinhoCompra.domain.repository.ProdutoRepository;
import projeto.carrinhoCompra.dto.CategoriaInputDTO;
import projeto.carrinhoCompra.dto.ProdutoInputDTO;
import projeto.carrinhoCompra.dto.ProdutoResponseDTO;

@Service
@Data
@AllArgsConstructor
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;


    public ProdutoResponseDTO criaProduto(ProdutoInputDTO produtoInputDTO){
        Produto produto = Produto.builder()
                .id(produtoInputDTO.getId())
                .nome(produtoInputDTO.getNome())
                .categoria(produtoInputDTO.getCategoria())
                .build();

        produto = produtoRepository.save(produto);

        return ProdutoResponseDTO.builder()
                .id(produtoInputDTO.getId())
                .nome(produtoInputDTO.getNome())
                .categoria(produtoInputDTO.getCategoria())
                .build();
    }
}
