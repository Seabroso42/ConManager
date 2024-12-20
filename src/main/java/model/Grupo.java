package model;

import lombok.Data;

import java.util.HashMap;
import java.util.LinkedList;

@Data
public class Grupo implements Processo {
    private Long Id;
    private int numeroParcelas;
    private double valorTotal;
    private Admin supervisor;
    private double taxaAdm;
    private Consorcio contemplacao;
    private double valorArrecadadoAtualizado;

    //lista de lances dados pelos clientes por fora das parcelas pagas.
    private HashMap<Cliente, Double> lances;
    //lista que armazena clientes em situação regular. LinkList pra otimizar alt.
    private LinkedList<Cliente> contribuintes;
    //lista que armazena quantas parcelas o Cliente deve
    private HashMap<Cliente, Integer> devedores;

    public Grupo(){
        this.lances = new HashMap<>();
        this.contribuintes = new LinkedList<>();
        this.devedores = new HashMap<>();
    }
    public Grupo( int numeroParcelas, double valorTotal, Admin supervisor, double taxaAdm) {
        this.numeroParcelas = numeroParcelas;
        this.valorTotal = valorTotal;
        this.supervisor = supervisor;
        this.taxaAdm = taxaAdm;
        this.lances = new HashMap<>();
        this.contribuintes = new LinkedList<>();
        this.devedores = new HashMap<>();
    }


    public void separarDevedores(){

    }
    public void cobrarParcela(){

    }

    @Override
    public void sendRelatorio() {

    }
}
