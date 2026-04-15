package com.MauRempel.bootcamp.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> cursosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> cursosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.cursosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);

    }
    public void progredir(){
        Optional<Conteudo> conteudo = this.cursosInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.cursosConcluidos.add(conteudo.get());
            this.cursosInscritos.remove(conteudo.get());
        }else{
            System.err.println("Você não está matriculado em nenhum curso no momento.");
        }

    }
    public double totalXP(){
        return this.cursosConcluidos.stream().mapToDouble(Conteudo::calcularXP).sum();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(cursosInscritos, dev.cursosInscritos) && Objects.equals(cursosConcluidos, dev.cursosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cursosInscritos, cursosConcluidos);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getCursosInscritos() {
        return cursosInscritos;
    }

    public void setCursosInscritos(Set<Conteudo> cursosInscritos) {
        this.cursosInscritos = cursosInscritos;
    }

    public Set<Conteudo> getCursosConcluidos() {
        return cursosConcluidos;
    }

    public void setCursosConcluidos(Set<Conteudo> cursosConcluidos) {
        this.cursosConcluidos = cursosConcluidos;
    }
}
