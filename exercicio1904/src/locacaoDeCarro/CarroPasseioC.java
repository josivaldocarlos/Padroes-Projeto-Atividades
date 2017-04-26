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
public class CarroPasseioC implements Contrato{
    
     @Override
     public double locacao(Veiculo veiculo){
        double valor = 69.99 * 1.10;
        System.out.println("Locação de carro tipo C");
        System.out.println("Valor da locação : 69,99");
        System.out.println("Valor do Imposto : 10%");
        return valor;
    }
    
}
