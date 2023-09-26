package projeto.carrinhoCompra.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;
import projeto.carrinhoCompra.domain.entity.Categoria;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CategoriaInputDTO implements Serializable {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("nome")
    private String nome;
}
