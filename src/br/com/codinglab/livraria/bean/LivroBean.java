package br.com.codinglab.livraria.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class LivroBean {

    private Livro livro = new Livro();

    public Livro getLivro() {
        return livro;
    }

    public void salvar() {
        System.out.println("Salvando o livro: " +this.livro.getTitulo());
    }
}
