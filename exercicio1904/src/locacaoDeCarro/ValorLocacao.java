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
public class ValorLocacao {
    public void mostarCalculo(Veiculo  veiculo, Contrato Veiculo){
        double valorTotal = Veiculo.locacao(veiculo);
        String resultado = String.format("%.2f", valorTotal);
        
        System.out.println("Valor Total: " + resultado + "\n" + "_________________________");
        
    }
    
}
