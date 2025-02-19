package com.controlefinanceiro.data.models

import java.math.BigDecimal
import java.util.Date

data class Cartao (
    private val id: String,
    private var nome: String,
    private var limite: BigDecimal,
    private var movimentacoes: List<Movimentacao>,
    private var diaFechamento: Int,
    private var diaVencimento: Int
) {

    public fun alterarLimite(novoLimite: BigDecimal) {
        limite = novoLimite

    }

}