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
public class CarroPasseioA implements Contrato{
    
     @Override
     public double locacao(Veiculo veiculo){
        double valor = 49.99 * 1.10;
        System.out.println("Locação de carro tipo A");
        System.out.println("Valor da locação : 49,99");
        System.out.println("Valor do Imposto : 10%");
        return valor;
    }
    
}
