package marcolla.projetoSpringBoot.rest.dto;

public class LivroDto {
    private String registro;
    private String nome;
    private String autor;
    private String edicao;
    private String editora;

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "LivroDto{" +
                "nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", edicao='" + edicao + '\'' +
                ", editora='" + editora + '\'' +
                '}';
    }
}
