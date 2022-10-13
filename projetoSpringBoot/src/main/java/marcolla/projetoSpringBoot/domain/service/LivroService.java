package marcolla.projetoSpringBoot.domain.service;

import marcolla.projetoSpringBoot.domain.model.LivroModel;
import marcolla.projetoSpringBoot.domain.repository.LivroRepository;
import marcolla.projetoSpringBoot.rest.dto.LivroDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {

    @Autowired
    LivroRepository livroRepository;

    public void salvarLivro(LivroDto livroDto){

        LivroModel livroModel = new LivroModel();

        livroModel.setRegistro(livroDto.getRegistro());
        livroModel.setNome(livroModel.getNome());
        livroModel.setAutor(livroDto.getAutor());
        livroModel.setEditora(livroDto.getEditora());
        livroModel.setEdicao(livroDto.getEdicao());

        livroRepository.salvarLivro(livroModel);

    };

    public LivroDto buscaLivro(String registro){
        return livroRepository.getLivro(registro);
    }

}
