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
public class Caminhao  implements Contrato{
    
    @Override
    public double locacao(Veiculo veiculo){
        double valor = 149.99 * 1.20;
        System.out.println("Locação de caminhão");
        System.out.println("Valor da locação : 149,99");
        System.out.println("Valor do Imposto : 20%");
        return valor;
    }

    
    }
    
    
