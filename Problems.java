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
    System.out.println("      (Note: Let's also clarify that these are 2D arrays, not arraylists.)");

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
    System.out.print("\033[H\033[2J");  
    System.out.flush();

    System.out.println(purple + "      Now you shall initialize and declare a 2D int array.\n");

    System.out.println(blue + "   Well now, " + name + ", you find yourself under the ocean. How? Idk. Looking around, you find all the fishes living in little coral homes. It’s rather sweet. In each home is a certain number of windows and a certain number of doors. You might ask, why would a fish want more than 1 or 2 doors? Well you aren’t a fish so you wouldn’t understand. ");
    System.out.println("   You count for 4 homes. Here are your numbers " + name + ":");
    System.out.println("   5 windows and 1 door\n   8 windows and 3 doors\n   200 windows and 5 doors\n   0 windows and 18 doors");
    
    System.out.println("\n   As you ponder how to write an array within another, a lionfish swims up and hands you a piece of waterproof paper that says: {{5,1}, …}\n");

    System.out.println(green + "   Now enter your code: (Write it as one line.)" + white);
    read.nextLine();

    System.out.println(purple + "\n      It should look something like this:");
    System.out.println(white + "int[][] fishHomes = {{5,1}, {8,3}, {200,5}, {0,18}};");

    System.out.println(purple + "\n      Enter y if completed correctly, else enter n: " + white);
    input = read.nextLine();

    while(!input.equals("y") && !input.equals("n")){
      System.out.println(purple + "Invalid, please enter y or n: " + white);
      input = read.nextLine();
    }

    return input;
  }
  
  public static String Q3(String name){
    System.out.print("\033[H\033[2J");  
    System.out.flush();

    System.out.println(purple + "      It is important to know how to call specific indexes of a 2D array.\n");

    System.out.println(blue + "   Ok so you remember the squirrel from before? Well apparently they were actually planning to rob their neighbors, but only wished to visit the house with the most acorns so they would be less likely to get caught. Anyways they got found out and ran to a different forest and would like you to visit them. They gave you the coordinates: 14, 19.");
    System.out.println("   You wanted to make a little map for the way there, so you wanted to initialize an array big enough so the squirrel’s house could be plotted. You also want to call and print out from this array the exact spot that the squirrel's house is.");
    System.out.println("   (Note: If you are testing somewhere else, you will get null when printing it.)");

    System.out.println(green + "\n   Now enter your code: (Write it as two lines.)" + white);
    read.nextLine();
    read.nextLine();

    System.out.println(purple + "\n      It should look something like this:");
    System.out.println(white + "String[][] squirrelForest = new String[15][20];");
    System.out.println("System.out.println(squirrelForest[14][19]);");

    System.out.println(purple + "\n      Enter y if completed correctly, else enter n: " + white);
    input = read.nextLine();

    while(!input.equals("y") && !input.equals("n")){
      System.out.println(purple + "Invalid, please enter y or n: " + white);
      input = read.nextLine();
    }

    return input;
  }
  
  public static String Q4(String name){
    System.out.print("\033[H\033[2J");  
    System.out.flush();

    System.out.println(purple + "      Alright " + name + ", next is learning how to loop through a 2D array and adding numbers. For this exercise, remember how for loops work and use them. You will have to put a for loop within a for loop.\n");

    System.out.println(blue + "   This time you are walking through a space station and a strange alien strolls up to you. They tell you that they like numbers with patterns. You ask them how they got onto a human space station. They tell you to make an array of 25 spots that looks like this:");
    System.out.println("   0 1 2 3 4\n   1 2 3 4 5\n   2 3 4 5 6\n   3 4 5 6 7\n   4 5 6 7 8\n");
    System.out.println("They also give you, what they say, is a hint: array[i][j] = i + j;\nThe most effective way to create this would be to have nested loops.");

    System.out.println(green + "\n   Now enter your code: (When you are done, add a line with the word done and enter.)" + white);
    String user = read.nextLine();
    while(!user.equals("done")){
      user = read.nextLine();
    }

    System.out.println(purple + "\n      It should look something like this:");
    System.out.println(white + "int[][] nums = new int[5][5];");
    System.out.println();
    System.out.println("for(int i = 0; i < 5; i++){");
    System.out.println("   for(int j = 0; j < 5; j++){");
    System.out.println("     nums[i][j] = i + j;");
    System.out.println("   }");
    System.out.println("}");
    System.out.println();
    System.out.println("for(int i = 0; i < 5; i++){");
    System.out.println("   for(int j = 0; j < 5; j++){");
    System.out.println("     System.out.print(String.valueOf(nums[i][j]) + \" \");");
    System.out.println("   }");
    System.out.println("     System.out.println();");
    System.out.println("}");

    System.out.println(purple + "\n      Enter y if completed correctly, else enter n (The printing out isn’t as important as long as you know the grid is the same): " + white);
    input = read.nextLine();

    while(!input.equals("y") && !input.equals("n")){
      System.out.println(purple + "Invalid, please enter y or n: " + white);
      input = read.nextLine();
    }
    
    return input;
  }
  
  public static String Q5(String name){
    System.out.print("\033[H\033[2J");  
    System.out.flush();

    System.out.println(purple + "      Let’s learn to better navigate through an array if you need to get to a specific spot.\n");

    System.out.println(blue + "   This time you find yourself in a fantasy cave. How is it different from a normal cave? Because now spooky scary spiders aren’t your only problem, it’s groovy spooky scary skeletons. On a pedestal is a map:");
    System.out.println("                              😃⬛⬛👾⬛");
    System.out.println("                              ⬛⬛🦴💎🦇");
    System.out.println("                              👾⬛⬛⬛⬛");
    System.out.println("                              ⬛⬛🦇⬛🦴");
    System.out.println("                              ⬛🦴⬛👾⬛");

    System.out.println("   Assuming you don’t know teleportation, you can only traverse in one direction at a time (not just 1 square), avoiding the skeletons, bats, and weird purple creatures to get the huge diamond.");

    System.out.println(purple + "\n      The way this shall work is you shall type in the indices of the spot you want the character to move. However, as you type in each set of indices, it must be an addition to the previous one, not a new spot. (Ex. [0,0] = [y,x] , and to move is [y+3, x] or [y,x-1].) You can assume that every round y and x are set to the previous value. (Ex. If you type [y+2, x], you can now assume that y += 2.)");

    System.out.println(green + "\n    Now enter your code: (When you are done, add a line with the word done and enter. Only 5 lines are needed, but add more for clarification if needed.)" + white);
    String user = read.nextLine();
    while(!user.equals("done")){
      user = read.nextLine();
    }

    System.out.println(purple + "\n      It should look something like this:");
    System.out.println(white + "// y = 0\n// x = 0\nmap[y,x]\nmap[y][x+1]\nmap[y+2][x]\nmap[y][x+2]\nmap[y-1][x]\n");

    System.out.println(purple + "\n      Enter y if completed correctly, else enter n: " + white);
    input = read.nextLine();

    while(!input.equals("y") && !input.equals("n")){
      System.out.println(purple + "Invalid, please enter y or n: " + white);
      input = read.nextLine();
    }

    System.out.println(blue + "\n   Would you like to see how the movements work? Enter y now, or the program will just continue: " + white);
    String see = read.nextLine();
    if(see.equals("y")){
      Animation.move();
    }
    
    return input;
  }
  
}
