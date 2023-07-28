package projeto.carrinhoCompra.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CategoriaInputDTO implements Serializable {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("nome")
    private String nome;
}
