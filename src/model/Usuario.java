package model;

import java.util.ArrayList;

public class Usuario {
    private String nome, cpf, senha;
    private float reais, bit, rip, eth;
    private ArrayList<String> extrato = new ArrayList<>();
    
    public Usuario() {
    }

    public Usuario(String nome, String cpf, String senha, float reais, float bit, float rip, float eth) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.reais = reais;
        this.bit = bit;
        this.rip = rip;
        this.eth = eth;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public float getReais() {
        return reais;
    }

    public void setReais(float reais) {
        this.reais = reais;
    }

    public float getBit() {
        return bit;
    }
    
    public void setBit(float bit) {
        this.bit = bit;
    }

    public float getRip() {
        return rip;
    }

    public void setRip(float rip) {
        this.rip = rip;
    }

    public float getEth() {
        return eth;
    }

    public void setEth(float eth) {
        this.eth = eth;
    }

    public ArrayList<String> getExtrato() {
        return extrato;
    }

    public void setExtrato(ArrayList<String> extrato) {
        this.extrato = extrato;
    }
    
    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + ", cpf=" + cpf + ", senha=" + senha + ", reais=" + reais + ", bitcoin=" + bit +
                ", ripple=" + rip + ", ethereum=" + eth +'}';
    }
    
    
}