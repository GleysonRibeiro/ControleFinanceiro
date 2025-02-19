package com.controlefinanceiro.data.models

data class Categoria (
    private val id: String,
    private var nome: String,
){
    public fun alterarNome(novoNome: String) {
        nome = novoNome
    }
}