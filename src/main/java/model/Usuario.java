package model;

import lombok.Data;

@Data
public abstract class Usuario {
    private String nome;
    private String CPF;
    private String telefone;
    private String email;

    public Usuario(){}

    public Usuario(String nome, String CPF, String telefone, String email) {
        this.nome = nome;
        this.CPF = CPF;
        this.telefone = telefone;
        this.email = email;
    }
}
