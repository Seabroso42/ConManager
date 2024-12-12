package model;

import lombok.Data;

@Data
public abstract class Pagamento implements Processo {
    private long id;
    private Cliente pagador;
    private Double valor;
    private Boolean status;

    public Pagamento(){}
    public Pagamento(long id, Double valor, Boolean status) {
        this.id = id;
        this.valor = valor;
        this.status = status;
    }

    @Override
    public void sendRelatorio(){}

   
}
