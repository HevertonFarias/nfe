package com.fincatto.nfe.classes.nota;

import java.math.BigDecimal;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

import com.fincatto.nfe.classes.NFBase;
import com.fincatto.nfe.validadores.BigDecimalParser;

public class NFNotaInfoCanaFornecimentoDiario extends NFBase {
    @Attribute(name = "dia", required = true)
    private int dia;

    @Element(name = "qtde", required = true)
    private String quantidade;

    @Element(name = "qTotMes", required = true)
    private String quantidadeTotalMes;

    @Element(name = "qTotAnt", required = true)
    private String quantidadeTotalAnterior;

    @Element(name = "qTotGer", required = true)
    private String quantidadeTotalGeral;

    public void setDia(final int dia) {
        if (dia > 31 || dia < 1) {
            throw new IllegalStateException("valor do dia invalido.");
        }
        this.dia = dia;
    }

    public void setQuantidade(final BigDecimal quantidade) {
        this.quantidade = BigDecimalParser.tamanho21ComAte10CasasDecimais(quantidade);
    }

    public void setQuantidadeTotalMes(final BigDecimal quantidadeTotalMes) {
        this.quantidadeTotalMes = BigDecimalParser.tamanho21ComAte10CasasDecimais(quantidadeTotalMes);
    }

    public void setQuantidadeTotalAnterior(final BigDecimal quantidadeTotalAnterior) {
        this.quantidadeTotalAnterior = BigDecimalParser.tamanho21ComAte10CasasDecimais(quantidadeTotalAnterior);
    }

    public void setQuantidadeTotalGeral(final BigDecimal quantidadeTotalGeral) {
        this.quantidadeTotalGeral = BigDecimalParser.tamanho21ComAte10CasasDecimais(quantidadeTotalGeral);
    }
}