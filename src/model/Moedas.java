package model;


public class Moedas {
    private float valor_bit, valor_rip, valor_eth;
     
    public Moedas() {
    }

    public Moedas(float valor_bit, float valor_rip, float valor_eth) {
        this.valor_bit = valor_bit;
        this.valor_rip = valor_rip;
        this.valor_eth = valor_eth;
    }

    public float getValor_bit() {
        return valor_bit;
    }

    public void setValor_bit(float valor_bit) {
        this.valor_bit = valor_bit;
    }

    public float getValor_rip() {
        return valor_rip;
    }

    public void setValor_rip(float valor_rip) {
        this.valor_rip = valor_rip;
    }

    public float getValor_eth() {
        return valor_eth;
    }

    public void setValor_eth(float valor_eth) {
        this.valor_eth = valor_eth;
    }
    
    
    
}
