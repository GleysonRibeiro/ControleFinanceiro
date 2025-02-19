package com.controlefinanceiro.data.models

import java.math.BigDecimal

data class Conta (
    private val id: String,
    private var nome: String,
    private var saldoInicial: BigDecimal,
    private var saldoAtual: BigDecimal,
){
    public fun alterarNome(novoNome: String) {
        nome = novoNome

    }

    public fun alterarSaldoInicial(novoSaldoInicial: BigDecimal) {
        saldoInicial = novoSaldoInicial
    }

}