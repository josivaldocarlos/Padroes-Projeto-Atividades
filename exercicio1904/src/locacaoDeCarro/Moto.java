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
public class Moto implements Contrato{
    
     @Override
     public double locacao(Veiculo veiculo){
        double valor = 19.99 * 1.05;
        System.out.println("Locação de moto");
        System.out.println("Valor da locação : 19,99");
        System.out.println("Valor do Imposto : 5%");
        return valor;
    }
    
}
