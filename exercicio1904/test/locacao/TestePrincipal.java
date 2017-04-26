/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locacao;
import locacaoDeCarro.*;

/**
 *
 * @author jcarl
 */
public class TestePrincipal {
    public static void main(String[]args){
        
        CarroPasseioA carroTipoA = new CarroPasseioA();
        CarroPasseioB carroTipoB = new CarroPasseioB();
        CarroPasseioC carroTipoC = new CarroPasseioC();
        Caminhao caminhao = new Caminhao();
        Moto moto = new Moto();
        
        Veiculo veiculo = new Veiculo();
        ValorLocacao locacao = new ValorLocacao();
        
        locacao.mostarCalculo(veiculo, carroTipoA);
        locacao.mostarCalculo(veiculo, carroTipoB);
        locacao.mostarCalculo(veiculo, carroTipoC);
        locacao.mostarCalculo(veiculo, caminhao);
        locacao.mostarCalculo(veiculo, moto);
     }
        
}
