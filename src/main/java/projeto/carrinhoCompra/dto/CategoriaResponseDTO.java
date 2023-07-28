package projeto.carrinhoCompra.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.NotEmpty;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class CategoriaResponseDTO {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("nome")
    @NotEmpty(message = "Nome da categoria é obrigatório")
    private String nome;
}
