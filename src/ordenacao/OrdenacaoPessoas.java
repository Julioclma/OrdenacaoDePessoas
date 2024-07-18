package ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    public List<Pessoa> pessoas;

    public OrdenacaoPessoas() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        this.pessoas.add(new Pessoa(nome, idade, altura));
        //adiciona
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
        //ordena
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoas);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
        //ordena
    }

     public static void main(String[] args) {
      OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
      ordenacaoPessoas.adicionarPessoa("Julio", 23, 1.80);
         ordenacaoPessoas.adicionarPessoa("Maira", 13, 1.20);
         ordenacaoPessoas.adicionarPessoa("Manoel", 25, 1.70);
         ordenacaoPessoas.adicionarPessoa("Miriam", 22, 1.60);

         System.out.println(ordenacaoPessoas.ordenarPorIdade());
     }
}
