/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diasDaSemana;
/**
 *
 * @author jcarl
 */
public class Dia {
    
    public InterfaceSemana getInterfaceSemana(int diasDaSemana) {        
        switch(diasDaSemana)
    {
      case 1: return new Domingo();
      case 2: return new Segunda();
      case 3: return new Terca();
      case 4: return new Quarta();
      case 5: return new Quinta();
      case 6: return new Sexta();
      case 7: return new Sabado();
    }
        
  // Dia da semana invalido
    throw new IllegalArgumentException("'" + diasDaSemana + 
                                       "' É um argumento ilegal para o parâmetro semana!");
            
    }
    
    
    

   /* public InterfaceSemana getInterfaceSemana(String interfaceSemana) {
        try {
            // Obter a instancia da classe desejada
            return (InterfaceSemana) Class.forName(interfaceSemana).newInstance();
            
        } catch (Exception exception) {
            // Dia da semana invalido
            throw new IllegalArgumentException("'" + interfaceSemana + 
                    "' É um argumento ilegal para o parâmetro dia da semana!");
        }
    }*/
}




