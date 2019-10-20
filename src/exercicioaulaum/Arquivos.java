/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioaulaum;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

/**
 *
 * @author André Zanon
 */
public class Arquivos {

    public Arquivos() {}

    public void talkingToFiles(Scanner input) {
        
        String caminhoProjeto = System.getProperty("user.dir");

        System.out.println("Digite apenas o nome do arquivo: ");
        File file = new File(caminhoProjeto+ "\\" + input.nextLine() + ".txt");

        if (file.exists()) {
            System.out.println("Arquivo encontrado, Say your prayers to the Digital Gods:");
        } else {
            System.out.println("Este arquivo não eCxisste, Shout a curse to Digital Devil:");
        }

        String prayersandcurses;
        prayersandcurses = input.nextLine();

        try {
            FileOutputStream fos = new FileOutputStream(file.getName());
            fos.write(prayersandcurses.getBytes());
            fos.flush();
            fos.close();
        } catch (Exception e) {
            System.out.println("Oh by the angels and demons something bad happened!");
        }

        System.out.println("FAREWELL Traveller");
    }

}
