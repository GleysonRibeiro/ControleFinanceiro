package com.controlefinanceiro.data.models

data class Categoria (
    private val id: String,
    private var nome: String,
){
    public fun setNome(novoNome: String) {
        this.nome = novoNome
    }
    public fun getNome(): String {
        return this.nome
    }
}