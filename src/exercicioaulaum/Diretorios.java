/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioaulaum;

import java.io.File;

/**
 *
 * @author André Zanon
 */
public class Diretorios {

    public Diretorios() {
    }
    
    public void mostraAbsoluto(){
      File arquivo = new File("c:\\");

        File[] arquivos = arquivo.listFiles();

        for (int i = 0; i < arquivos.length; i++) {
            
            File novo = new File(arquivos[i].toString());
                        
            if (novo.isFile()) {
                System.out.println("**Arquivo**  : " + novo.getName());
            } else if (novo.isDirectory()) {
                System.out.println("--Diretório--  : " + novo.getName());
            } 
            
        }
    }
    
}
