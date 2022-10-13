package marcolla.projetoSpringBoot.rest.controller;

import marcolla.projetoSpringBoot.domain.service.AlunoService;
import marcolla.projetoSpringBoot.rest.dto.AlunoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlunoController {

    @Autowired
    AlunoService alunoService;

    @PostMapping("/alunocadastro")
       public String alunocadastro(@RequestBody AlunoDto alunoDto){
           System.out.println(alunoDto.toString());
           return "Aluno cadastrado com sucesso!";
    }

    @GetMapping("/alunocadastro")
    public AlunoDto buscaAluno(){
        AlunoDto localizaAlunoDto = alunoService.buscaALuno("cpf");
        return localizaAlunoDto;
    }


}
