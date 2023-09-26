package projeto.carrinhoCompra.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import projeto.carrinhoCompra.domain.entity.Categoria;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProdutoInputDTO {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("categoria")
    private Categoria categoria;
}
