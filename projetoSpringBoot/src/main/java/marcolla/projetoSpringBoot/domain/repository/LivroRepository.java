package marcolla.projetoSpringBoot.domain.repository;

import marcolla.projetoSpringBoot.domain.model.LivroModel;
import marcolla.projetoSpringBoot.rest.dto.LivroDto;
import org.springframework.stereotype.Repository;

@Repository
public class LivroRepository {

    public void salvarLivro (LivroModel livroModel) {
        System.out.println("Livro cadastrado com sucesso!");
    }

    public LivroDto getLivro(String registro){
        LivroDto retornoLivro = new LivroDto();
        retornoLivro.setRegistro("155455");
        retornoLivro.setNome("O Advogado");
        retornoLivro.setAutor("John Grisham");
        retornoLivro.setEdicao("1ª Edição");
        retornoLivro.setEditora("Arqueiro");
        return retornoLivro;
    }
}
