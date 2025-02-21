package com.controlefinanceiro.data.models

import android.annotation.SuppressLint
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
        require( valor > BigDecimal.ZERO) {"O valor não pode ser menor ou igual a zero"}
        require( qtdParcelas > 0) {"A quantidade de parcelas não pode ser menor ou igual a zero"}
        require( numParcela > 0) {"O número de parcela não pode ser menor ou igual a zero"}
        require( numParcela <= qtdParcelas) {"O número de parcela não pode ser maior que a quantidade de parcelas"}
    }
    public fun efetivarMovimentacao(dataPagamento: LocalDate){
        require(this._status == Status.Pendente) {"A movimentação já foi efetivada"}
        this._status = Status.Realizado
        this.dataPagamento = dataPagamento
    }
    // Getters e Setters para _tipo
    public fun getTipo(): Tipo {
        return this._tipo
    }

    public fun setTipo(tipo: Tipo) {
        this._tipo = tipo
    }

    // Getters e Setters para descricao
    public fun getDescricao(): String {
        return this.descricao
    }

    public fun setDescricao(descricao: String) {
        require(descricao.isNotBlank()) { "A descrição não pode ser vazia." }
        this.descricao = descricao
    }

    // Getters e Setters para valor
    public fun getValor(): BigDecimal {
        return this.valor
    }

    public fun setValor(valor: BigDecimal) {
        require(valor > BigDecimal.ZERO) { "O valor deve ser maior que zero." }
        this.valor = valor
    }

    // Getters e Setters para _formaPagamento
    public fun getFormaPagamento(): FormaPagamento {
        return this._formaPagamento
    }

    public fun setFormaPagamento(formaPagamento: FormaPagamento) {
        this._formaPagamento = formaPagamento
    }

    // Getters e Setters para qtdParcelas
    public fun getQtdParcelas(): Int {
        return this.qtdParcelas
    }

    public fun setQtdParcelas(qtdParcelas: Int) {
        require(qtdParcelas > 0) { "A quantidade de parcelas deve ser maior que zero." }
        this.qtdParcelas = qtdParcelas
    }

    // Getters e Setters para numParcela
    public fun getNumParcela(): Int {
        return this.numParcela
    }

    public fun setNumParcela(numParcela: Int) {
        require(numParcela > 0) { "O número da parcela deve ser maior que zero." }
        require(numParcela <= qtdParcelas) { "O número da parcela não pode ser maior que a quantidade de parcelas." }
        this.numParcela = numParcela
    }

    // Getters e Setters para dataVencimento
    public fun getDataVencimento(): LocalDate {
        return this.dataVencimento
    }

    public fun setDataVencimento(dataVencimento: LocalDate) {
        this.dataVencimento = dataVencimento
    }

    // Getters e Setters para dataPagamento
    public fun getDataPagamento(): LocalDate? {
        return this.dataPagamento
    }

    public fun setDataPagamento(dataPagamento: LocalDate?) {
        this.dataPagamento = dataPagamento
    }

    // Getters e Setters para _status
    public fun getStatus(): Status {
        return this._status
    }

    public fun setStatus(status: Status) {
        this._status = status
    }
    @SuppressLint("NewApi")
    public fun verificarStatus(){

        if(dataVencimento < LocalDate.now() && this._status == Status.Pendente){
            this._status = Status.Vencido
        }

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

