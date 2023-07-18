package projeto.carrinhoCompra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projeto.carrinhoCompra.dto.CriaCategoriaInputDTO;
import projeto.carrinhoCompra.service.CategoriaService;

import javax.validation.Valid;

@RestController
@RequestMapping("/categorias")
public class CategoriasController {

    @Autowired
    CategoriaService service;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public ResponseEntity criaCategoria(@RequestBody @Valid CriaCategoriaInputDTO categoria){
        return ResponseEntity.ok().body(service.criaCategoria(categoria));
    }
}
