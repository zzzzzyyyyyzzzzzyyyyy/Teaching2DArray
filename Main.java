import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner read = new Scanner(System.in);
    
    //Intro
    System.out.print("\nHi. So you have come here to learn 2D arrays. Fabulous. However, what is your name? Or not your name. Just input something: ");
      
    String name = read.nextLine();
    while(name.equals("") || name.equals(" ")){
      System.out.print("No. : ");
      name = read.nextLine();
    }

    System.out.println("-------------------------");

    Menu.printMenu(name);
    
  }
}