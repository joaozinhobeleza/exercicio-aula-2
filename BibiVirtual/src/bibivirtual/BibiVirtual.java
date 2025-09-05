package bibivirtual;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BibiVirtual {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Autor autor1 = new Autor("George Orwell");
        Autor autor2 = new Autor("J.K. Rowling");
        
        Livro livro1 = new Livro("1984", autor1, 5);
        Livro livro2 = new Livro("Harry Potter", autor2, 3);

        
        Usuario usuario1 = new Usuario("Porto");
        
        
        List<Emprestimo> emprestimos = new ArrayList<>();
        if (livro1.estaDisponivel()) {
            livro1.emprestar();
            emprestimos.add(new Emprestimo(livro1, usuario1));
            System.out.println("Livro '" + livro1.getTitulo() + "' emprestado para " + usuario1.getNome());
        }

        
        List<Livro> todosOsLivros = new ArrayList<>();
        todosOsLivros.add(livro1);
        todosOsLivros.add(livro2);

        
        livro1.emprestar();
        livro2.emprestar();
        livro1.emprestar();

        System.out.println("\n--- Livros mais populares ---");
        todosOsLivros.sort(Comparator.comparingInt(Livro::getTotalEmprestimos).reversed());
        for (Livro livro : todosOsLivros) {
            System.out.println(livro.getTitulo() + " - " + livro.getTotalEmprestimos() + " empréstimos.");
        }
        
    }
    
}
