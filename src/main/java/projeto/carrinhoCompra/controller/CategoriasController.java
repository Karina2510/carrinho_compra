package projeto.carrinhoCompra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projeto.carrinhoCompra.dto.CategoriaInputDTO;
import projeto.carrinhoCompra.service.CategoriaService;

import javax.validation.Valid;

@RestController
@RequestMapping("/categorias")
public class CategoriasController {

    @Autowired
    CategoriaService service;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public ResponseEntity criaCategoria(@RequestBody @Valid CategoriaInputDTO categoria){
        return ResponseEntity.ok().body(service.criaCategoria(categoria));
    }

    @GetMapping("{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public ResponseEntity retornaCategoriaPorId(@PathVariable Long id){
        return ResponseEntity.ok().body(service.buscarCategoriaPorId(id));
    }

}
