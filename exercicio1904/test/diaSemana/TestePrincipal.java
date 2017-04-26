/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diaSemana;
import diasDaSemana.Dia;
import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author jcarl
 */
public class TestePrincipal {
    
    public static void main(String[] args){
        Dia dia = new Dia();
        
        Calendar calendario = Calendar.getInstance();
        System.out.println(dia.getInterfaceSemana(calendario.get(Calendar.DAY_OF_WEEK)).mensagem());
        
       /* System.out.println(dia.getInterfaceSemana(calendario.getDisplayName(Calendar.DAY_OF_WEEK, 
           Calendar.LONG, Locale.ENGLISH)).mensagem()); */      
    }
    
}
