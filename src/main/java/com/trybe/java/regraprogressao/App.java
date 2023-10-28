package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */
public class App {
  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a quantidade de atividades para cadastrar: ");
    int activities = scanner.nextInt();
    scanner.nextLine();

    double totalSumWeight = 0;
    double[ ] weightActivityArray = new double[activities];
    String[] activitiesNameArray = new String[activities];
  
    for (int index = 0; index < activities; index++) {
      System.out.println("Digite o nome da atividade " + (index + 1) + ": ");
      activitiesNameArray[index] = scanner.nextLine();
            
      System.out.println("Digite o peso da atividade " + (index + 1) + ": ");
      //int weightActivity = Integer.parseInt(scanner.nextLine());
      weightActivityArray[index] = scanner.nextDouble();
      scanner.nextLine();
      
      totalSumWeight += weightActivityArray[index];
    }
    scanner.close();
  }
}