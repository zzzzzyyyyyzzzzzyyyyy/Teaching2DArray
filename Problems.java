import java.util.Scanner;
import java.util.Arrays;

class Problems{

  public static final String purple = "\u001B[35m";
  public static final String blue = "\u001B[34m";
  public static final String green = "\u001B[32m";
  public static final String white = "\u001B[37m";
  public static final Scanner read = new Scanner(System.in);
  public static String input = "";

  public static String Q0(String name){
    System.out.print("\033[H\033[2J");  
    System.out.flush(); 
    
    System.out.println(purple + "      Let’s first try initializing and declaring a usual array, " + name + ".\n      (As a reminder, the way to do it (in one line at least) is: int[] name = {0, 1, 2, 3, 4}; )");

    System.out.println(blue + "\n   As you are taking a nice walk, a squirrel runs up to you and asks you to make an array of 6 numbers. These numbers need to correspond to the amount of acorns in each of their neighbors homes. After asking the squirrel’s neighbors how many acorns they have, you realize that you have no clue why you can all of a sudden talk to squirrels, but then you write down 6, 18, 3, 14, -2. (The last one is in debt.)");

    System.out.println(green + "\n   Now enter your code: (Write it as one line.)" + white);
    read.nextLine();

    System.out.println(purple + "\n      It should look something like this: " + white);
    System.out.println(white + "int[] acorns = {6, 18, 3, 14, -2};");

    System.out.println(purple + "\n      Now this is gonna be a test of faith, but enter y if your code is similar/the same. If you have doubts, check somewhere else. If not, enter n.\n      (This is how the program will mark if you finished a section incorrectly.):" + white);
    input = read.nextLine();
    
    while(!input.equals("y") && !input.equals("n")){
      System.out.println(purple + "Invalid, please enter y or n: " + white);
      input = read.nextLine();
    }
    
    return input;
    
  }
  
  public static String Q1(String name){
    System.out.print("\033[H\033[2J");  
    System.out.flush(); 

    System.out.println(purple + "      Now, "+ name + ", you are going to initialize (only initialize!) an empty 2D array.");

    System.out.println(blue + "\n   This time you find yourself in a grass field. How’d you get here, you don’t know. The sun is shining, Cotton Eye Joe. This field is super empty. You decide to count how big the field is, and it is 3 by 3 miles. As you finish counting, a goat with glowing horns walks up to you to impart wisdom, “Add an extra [ ] when initializing a 2D array.”");

    System.out.println(green + "\n   Now enter your code: (Write it as one line.)" + white);
    read.nextLine();

    System.out.println(purple + "\n      It should look something like this:");
    System.out.println(white + "String[][] field = new String[3][3];");

    System.out.println(purple + "\n      Enter y if completed correctly, else enter n:" + white);
    input = read.nextLine();

    while(!input.equals("y") && !input.equals("n")){
      System.out.println(purple + "Invalid, please enter y or n: " + white);
      input = read.nextLine();
    }

    return input;
  }
  
  public static String Q2(String name){
    return input;
  }
  
  public static String Q3(String name){
    return input;
  }
  
  public static String Q4(String name){
    return input;
  }
  
  public static String Q5(String name){
    return input;
  }
  
}

/*
    System.out.println("   (Note: Let's also clarify that these are 2D arrays, not arraylists.)");
*/

