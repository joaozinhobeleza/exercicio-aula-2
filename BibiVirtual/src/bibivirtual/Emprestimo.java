package bibivirtual;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Emprestimo {
    
    private Livro livro;
    private Usuario usuario;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucaoPrevista;
    private LocalDate dataDevolucaoReal;

    public Emprestimo(Livro livro, Usuario usuario) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = LocalDate.now();
        this.dataDevolucaoPrevista = this.dataEmprestimo.plusDays(14); 
    }

    public void devolverLivro() {
        this.dataDevolucaoReal = LocalDate.now();
        this.livro.devolver();
    }

    public double calcularMulta() {
        if (dataDevolucaoReal != null && dataDevolucaoReal.isAfter(dataDevolucaoPrevista)) {
            long diasAtraso = ChronoUnit.DAYS.between(dataDevolucaoPrevista, dataDevolucaoReal);
            return diasAtraso * 2.50; 
        }
        return 0.0;
    }

    
    public Livro getLivro() {
        return livro;
    }
    
}
