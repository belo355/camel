package br.com.caelum.camel.domain;

import java.math.BigDecimal;

public class Livro {
    private String codigo;
    private String titulo;
    private String tituloCurto;
    private String nomeAutor;
    private BigDecimal valorEbook;
    private BigDecimal valorImpresso;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTituloCurto() {
        return tituloCurto;
    }

    public void setTituloCurto(String tituloCurto) {
        this.tituloCurto = tituloCurto;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public BigDecimal getValorEbook() {
        return valorEbook;
    }

    public void setValorEbook(BigDecimal valorEbook) {
        this.valorEbook = valorEbook;
    }

    public BigDecimal getValorImpresso() {
        return valorImpresso;
    }

    public void setValorImpresso(BigDecimal valorImpresso) {
        this.valorImpresso = valorImpresso;
    }
}
