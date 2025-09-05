package bibivirtual;

public class Livro {
    
    private String titulo;
    private Autor autor;
    private int exemplaresDisponiveis;
    private int totalEmprestimos;

    public Livro(String titulo, Autor autor, int exemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.exemplaresDisponiveis = exemplares;
        this.totalEmprestimos = 0;
    }

    public void emprestar() {
        if (exemplaresDisponiveis > 0) {
            exemplaresDisponiveis--;
            totalEmprestimos++;
        }
    }

    public void devolver() {
        exemplaresDisponiveis++;
    }

    
    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }
    
    public int getTotalEmprestimos() {
        return totalEmprestimos;
    }

    public boolean estaDisponivel() {
        return exemplaresDisponiveis > 0;
    }
    
}
