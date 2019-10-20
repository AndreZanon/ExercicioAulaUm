/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioaulaum;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import jdk.nashorn.internal.objects.NativeArray;

/**
 *
 * @author André Zanon
 */
public class ExercicioAulaUm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Diretorios demoUm = new Diretorios();
        demoUm.mostraAbsoluto();

        Arquivos arq = new Arquivos();
        arq.talkingToFiles(input);
    }
}
