package com.controlefinanceiro.data.models

data class Categoria (
    private val id: String,
    private var nome: String,
    private var movimentacoes: List<Movimentacao>
){
}