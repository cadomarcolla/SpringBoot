package marcolla.projetoSpringBoot.rest.controller;

import marcolla.projetoSpringBoot.domain.service.LivroService;
import marcolla.projetoSpringBoot.rest.dto.LivroDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivroController {

    @Autowired
    LivroService livroService;

    @PostMapping("/livrocadastro")
    public String livrocadastro(@RequestBody LivroDto livroDto) {
        System.out.println(livroDto.toString());
        return "Livro cadastrado com sucesso!";
    }

    @GetMapping("/livrocadastro")
    public LivroDto buscaLivro(){
        LivroDto localizaLicroDtoRegistro = livroService.buscaLivro("registro");
        return localizaLicroDtoRegistro;
    }
}

