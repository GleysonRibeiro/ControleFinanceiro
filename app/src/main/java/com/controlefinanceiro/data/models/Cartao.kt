package com.controlefinanceiro.data.models

import java.math.BigDecimal

data class Cartao (
    private val id: String,
    private var nome: String,
    private var limite: BigDecimal,
    private var diaFechamento: Int,
    private var diaVencimento: Int
) {
    init{
        require(diaFechamento in 1..31) {"O dia de fechamento deve ser entre 1 e 31"}
        require(diaVencimento in 1..31) {"O dia de vencimento deve ser entre 1 e 31"}
        require(diaVencimento >= diaFechamento) {"O dia de vencimento deve ser maior ou igual ao dia de fechamento"}
        require(limite >= BigDecimal.ZERO) {"O limite deve ser maior ou igual a zero"}
    }
    public fun setNome(novoNome: String) {
        this.nome = novoNome
    }
    public fun setLimite(novoLimite: BigDecimal) {
        this.limite = novoLimite
    }
    public fun setDiaFechamento(novoDiaFechamento: Int) {
        this.diaFechamento = novoDiaFechamento
    }
    public fun setDiaVencimento(novoDiaVencimento: Int) {
        this.diaVencimento = novoDiaVencimento
    }
    public fun getNome(): String {
        return this.nome
    }
    public fun getLimite(): BigDecimal {
        return this.limite
    }
    public fun getDiaFechamento(): Int {
        return this.diaFechamento
    }
    public fun getDiaVencimento(): Int {
        return this.diaVencimento
    }


}