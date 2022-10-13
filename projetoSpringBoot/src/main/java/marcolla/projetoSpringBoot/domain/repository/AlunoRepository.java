package marcolla.projetoSpringBoot.domain.repository;

import marcolla.projetoSpringBoot.domain.model.AlunoModel;
import marcolla.projetoSpringBoot.rest.dto.AlunoDto;
import org.springframework.stereotype.Repository;

@Repository
public class AlunoRepository {
    public void salvarAluno(AlunoModel alunoModel){

        System.out.println("Aluno cadastrado com Sucesso!");
    }

    public AlunoDto getAluno(String cpf){
        AlunoDto retornoAluno = new AlunoDto();
        retornoAluno.setNome("JOAO PEDRO DA SILVA");
        retornoAluno.setCpf("01548366056");
        retornoAluno.setMatricula("1234567-6");
        retornoAluno.setCurso("Futuro DEV");
        retornoAluno.setFase("3ª Fase");
        return retornoAluno;
    }
}