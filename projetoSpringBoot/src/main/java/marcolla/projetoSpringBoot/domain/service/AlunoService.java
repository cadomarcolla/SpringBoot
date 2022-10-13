package marcolla.projetoSpringBoot.domain.service;

import marcolla.projetoSpringBoot.domain.model.AlunoModel;
import marcolla.projetoSpringBoot.domain.repository.AlunoRepository;
import marcolla.projetoSpringBoot.rest.dto.AlunoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    @Autowired
    AlunoRepository alunoRepository;

    public void salvarAluno(AlunoDto alunoDto){

        AlunoModel alunoModel = new AlunoModel();

        alunoDto.setNome(alunoDto.getNome());
        alunoDto.setCpf(alunoDto.getCpf());
        alunoDto.setMatricula(alunoDto.getMatricula());
        alunoDto.setCurso(alunoDto.getCurso());
        alunoDto.setFase(alunoDto.getFase());

        alunoRepository.salvarAluno(alunoModel);
    }

    public AlunoDto buscaALuno(String cpf){
        return alunoRepository.getAluno(cpf);
    }
}
