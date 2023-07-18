package projeto.carrinhoCompra.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projeto.carrinhoCompra.domain.entity.Categoria;
import projeto.carrinhoCompra.domain.repository.CategoriaRepository;
import projeto.carrinhoCompra.dto.CriaCategoriaInputDTO;
import projeto.carrinhoCompra.dto.CriaCategoriaResponseDTO;

@Service
@AllArgsConstructor
@Slf4j
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;


    public CriaCategoriaResponseDTO criaCategoria(CriaCategoriaInputDTO input){
        Categoria categoria =
                Categoria.builder().nome(input.getNome()).build();

        categoria = categoriaRepository.save(categoria);

        return CriaCategoriaResponseDTO.builder()
                .id(categoria.getId())
                .nome(categoria.getNome())
                .build();
    }
}
