package marcolla.projetoSpringBoot.rest.controller;

import marcolla.projetoSpringBoot.rest.dto.AlunoDto;
import marcolla.projetoSpringBoot.rest.dto.LivroDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlunoController {

        @PostMapping("/alunocadastro")
        public String alunocadastro(@RequestBody AlunoDto alunoDto){
            System.out.println(alunoDto.toString());
            return "Aluno cadastrado com sucesso!";
        }
}
