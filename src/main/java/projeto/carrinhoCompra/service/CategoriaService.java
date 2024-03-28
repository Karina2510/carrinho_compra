package projeto.carrinhoCompra.service;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projeto.carrinhoCompra.domain.entity.Categoria;
import projeto.carrinhoCompra.domain.repository.CategoriaRepository;
import projeto.carrinhoCompra.dto.CategoriaInputDTO;
import projeto.carrinhoCompra.dto.CategoriaResponseDTO;
import projeto.carrinhoCompra.dto.CategoriaUpdateDTO;

@Service
@AllArgsConstructor
@Slf4j
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;



    public CategoriaResponseDTO criaCategoria(CategoriaInputDTO input){
        Categoria categoria =
                Categoria.builder().nome(input.getNome()).build();

        categoria = categoriaRepository.save(categoria);

        return CategoriaResponseDTO.builder()
                .id(categoria.getId())
                .nome(categoria.getNome())
                .build();
    }


    public CategoriaResponseDTO buscarCategoriaPorId(Long id) {
        Categoria categoria = categoriaRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Categoria de id " + id + " não encontrada"));

        return CategoriaResponseDTO
                .builder()
                .id(categoria.getId())
                .nome(categoria.getNome())
                .build();
    }

    public CategoriaResponseDTO atualizaCategoria(Long id, CategoriaUpdateDTO categoriaUpdate){
        Categoria categoria = categoriaRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Categoria de id " + id + " não encontrada"));

        categoriaRepository.save(categoria);

        return CategoriaResponseDTO.builder()
                .id(categoria.getId())
                .nome(categoria.getNome())
                .build();
    }
}
