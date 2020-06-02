package phase3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Phase3 {
  public static void main(String[] args) {
    int five = 5;
    int ten = 10;
    int twenty = 20;
    int fifty = 50;
    int oneHundred = 100;
    int twoHundred = 200;
    int fiveHundred = 500;
    int totalFood = 0;

    String[] menuList = new String[5];
    int[] foodPriceList = new int[5];

    // Fill arrays
    for (int i = 0; i < menuList.length; i++) {
      String auxMenuList = "Escalivada,Coca recapte,Samfaina,Esqueixada,Trinxat";
      String[] partsMenuList = auxMenuList.split(",");
      menuList[i] = partsMenuList[i];

      String auxPriceList = "5,10,10,5,15";
      String[] partPriceList = auxPriceList.split(",");
      foodPriceList[i] = Integer.parseInt(partPriceList[i]);
    }

    // Menu request loop
    boolean keepAdding = true;
    ArrayList<String> menuSelected = new ArrayList<String>();
    do {
      printMenu(menuList);
      Scanner console = new Scanner(System.in);
      int chosenDish = console.nextInt();
      switch (chosenDish) {
        case 1:
          menuSelected.add("Escalivada");
          break;
        case 2:
          menuSelected.add("Coca recapta");
          break;
        case 3:
          menuSelected.add("Samfaina");
          break;
        case 4:
          menuSelected.add("Esqueixada");
          break;
        case 5:
          menuSelected.add("Trinxat");
          break;
        default:
          System.out.println("Sorry, try again");
      }

      System.out.print("Do you want to continue ordering? \t Yes / No \t");
      String answer = console.next();

      if (answer.toUpperCase().equals("NO")) {
        keepAdding = false;
      } else if (answer.toUpperCase().equals("YES")) {
        keepAdding = true;
      } else {
        System.out.println("Sorry, wrong answer");
      }

    }
    while (keepAdding);

    printOrden(menuSelected);
    getCheck(menuSelected, menuList, foodPriceList);

  }

  public static void printPrice(int[] arrayToPrint) {
    for (int actual : arrayToPrint) {
      System.out.println(actual + " - ");
    }
  }

  public static void printMenu(String[] arrayToPrint) {
    int cont = 0;
    System.out.println("What do you want to eat?");
    for (String actual : arrayToPrint) {
      System.out.print(++cont + ")" + actual + "\t");
    }
  }

  public static void printOrden(ArrayList<String> arrayToPrint) {
    Iterator<String> it = arrayToPrint.iterator();
    System.out.println("\n******* Your order *********");
    while (it.hasNext())
      System.out.println(it.next());
  }

  public static void getCheck(ArrayList<String> arrayToPrint, String[] menuList, int[] foodPriceList){
    int check = 0;
    Iterator<String> it = arrayToPrint.iterator();
    while (it.hasNext()){
      String actual = it.next();
      for (int i = 0; i < menuList.length; i++) {
        if(menuList[i].equals(actual)){
          check += foodPriceList[i];
        }
      }
    }
    System.out.println("\n******* Your check *********");
    System.out.println("Your check is: " + check);
  }

}
