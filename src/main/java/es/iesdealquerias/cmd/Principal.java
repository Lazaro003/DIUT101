/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.iesdealquerias.cmd;

import java.text.NumberFormat;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

/**
 *
 * @author Lazaro
 */
public class Principal {
    
    public static void main(String[] args) throws ParseException{
        // create Options object
        Options options = new Options();

        // add t option
        options.addOption("w","hello-world", false, "Imprime hola mundo");
        //options.addOption("c","cruel", false, "Imprime hola mundo cruel");
        //options.addOption("n","nice", false, "Imprime hola mundo bonito");
        options.addOption("y","years", true, "Imprime frase con los años");
        options.addOption("h","help", false, "Imprime frase con los años");
        
        OptionGroup group =  new OptionGroup();  
        group.addOption(new Option("n","Imprime hola mundo bonito"));  
        group.addOption(new Option("c","Imprime hola mundo cruel"));  
        options.addOptionGroup(group); 


        
        
        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, args);
        
        if(cmd.hasOption("w")) {
            System.out.println("Hola mundo");
        }
        if(cmd.hasOption("n")) {
            System.out.println("Hola mundo bonito");
        }
        if(cmd.hasOption("c")) {
            System.out.println("Hola mundo cruel");
        }
        if(cmd.hasOption("y")) {
            String anios;
            anios = cmd.getOptionValue("y");
            System.out.println("Tras " + anios + " años de vida");
        }
        if(cmd.hasOption("h")) {
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp("h", options);
        }
        

    } 
}
