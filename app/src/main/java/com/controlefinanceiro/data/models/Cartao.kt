package com.controlefinanceiro.data.models

import java.math.BigDecimal

data class Cartao (
    private val id: String,
    private var nome: String,
    private var limite: BigDecimal,
    private var diaFechamento: Int,
    private var diaVencimento: Int
) {

    public fun alterarLimite(novoLimite: BigDecimal) {
        limite = novoLimite
    }

    public fun alterarDiaFechamento(novoDiaFechamento: Int) {
        diaFechamento = novoDiaFechamento

    }

    public fun alterarDiaVencimento(novoDiaVencimento: Int) {
        diaVencimento = novoDiaVencimento
    }

    public fun alterarNome(novoNome: String) {
        nome = novoNome
    }


}