package projeto.carrinhoCompra.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.NotEmpty;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class CriaCategoriaResponseDTO {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("nome")
    @NotEmpty(message = "Nome da categoria é obrigatório")
    private String nome;
}
