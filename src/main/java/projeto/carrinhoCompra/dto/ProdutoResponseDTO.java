package projeto.carrinhoCompra.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import projeto.carrinhoCompra.domain.entity.Categoria;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoResponseDTO {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("categoria")
    private Categoria categoria;
}
