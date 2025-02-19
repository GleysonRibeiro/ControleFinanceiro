package com.controlefinanceiro.data.models

import java.math.BigDecimal
import java.time.LocalDate

data class Movimentacao (
    private val id: String,
    private var _tipo: Tipo,
    private var descricao: String,
    private var valor: BigDecimal,
    private var _formaPagamento: FormaPagamento,
    private var qtdParcelas: Int,
    private var numParcela: Int,
    private var dataVencimento: LocalDate,
    private var dataPagamento: LocalDate?,
    private var _status: Status,
    private var categoria: Categoria,
    private var cartao: Cartao,
    private var conta: Conta
) {
    init {
        require( numParcela <= qtdParcelas) {"O número de parcela não pode ser maior que a quantidade de parcelas"}
    }
}

enum class Tipo{
    Receita,
    Despesa
}

enum class FormaPagamento{
    A_vista,
    A_vista_no_cartão,
    Parcelado
}

enum class Status{
    Pendente,
    Vencido,
    Realizado
}

