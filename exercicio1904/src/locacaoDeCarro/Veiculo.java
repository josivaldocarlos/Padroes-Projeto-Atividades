/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locacaoDeCarro;

/**
 *
 * @author jcarl
 */
public class Veiculo {
    private double valor,  imposto;

    public Veiculo(double valor, double imposto) {
        this.valor = valor;
        this.imposto = imposto;
    }

    public Veiculo() {
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getImposto() {
        return this.imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
        
}
