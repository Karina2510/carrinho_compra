package projeto.carrinhoCompra.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CategoriaUpdateDTO {

    @JsonProperty("nome")
    private String nome;
}
