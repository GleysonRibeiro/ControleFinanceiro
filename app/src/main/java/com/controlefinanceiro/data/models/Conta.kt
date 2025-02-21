package com.controlefinanceiro.data.models

import java.math.BigDecimal

data class Conta (
    private val id: String,
    private var nome: String,
    private var saldoInicial: BigDecimal,
    private var saldoAtual: BigDecimal,
){
    public fun setNome(novoNome: String) {
        this.nome = novoNome
    }
    public fun getNome(): String {
        return this.nome
    }
    public fun getSaldoInicial(): BigDecimal {
        return this.saldoInicial
    }
    public fun setSaldoInicial(novoSaldoInicial: BigDecimal) {
        this.saldoInicial = novoSaldoInicial
    }
    public fun getSaldoAtual(): BigDecimal {
        return this.saldoAtual
    }
    public fun setSaldoAtual(novoSaldoAtual: BigDecimal) {
        this.saldoAtual = novoSaldoAtual
    }



}