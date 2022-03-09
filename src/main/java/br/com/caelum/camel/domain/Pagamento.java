package br.com.caelum.camel.domain;

import java.math.BigDecimal;

public class Pagamento {

    private StatusEnum status;
    private BigDecimal valor;
    private String titular;
    private String emailTitular;

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getEmailTitular() {
        return emailTitular;
    }

    public void setEmailTitular(String emailTitular) {
        this.emailTitular = emailTitular;
    }
}
