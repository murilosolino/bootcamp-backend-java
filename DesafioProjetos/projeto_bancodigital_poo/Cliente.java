package DesafioProjetos.projeto_bancodigital_poo;

public class Cliente {
    
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String email;

    
    public Cliente(String nome, String cpf, String endereco, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }


    public String getNome() {
        return nome;
    }


    public String getCpf() {
        return cpf;
    }


    public String getEndereco() {
        return endereco;
    }


    public String getTelefone() {
        return telefone;
    }


    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", telefone=" + telefone
                + ", email=" + email + "]";
    }

    

    
}
