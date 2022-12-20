import java.util.Scanner;

public class Game {

    //color for text
    public static final String cyan = "\u001B[36m";

    // the sam array as the user, so i can easily print out
    public static String[][] clouds = new String[4][7];


    public static void game(){
        //to clear screen
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
        //for intaking inputs
        Scanner read = new Scanner(System.in);
        String input = "";

        //intro and explanation
        System.out.println(cyan + "Array[][] the Game ~ Demo\n");

        System.out.println("Welcome to the world of 2D arrays! In a final version there would be more levels, however this is a demo and a final version will probably never be made because I’m not getting paid so here you go. Also, it’s a pretty restricting game as to what is considered correct.");

        System.out.println("Traverse the first magical land of clouds! You must first create the 4 by 7 grid land! So create it! And make sure it is called clouds, or else it won’t be created correctly! And by the way, this time the god of arrays is making sure you don’t screw it up, so make sure to get it right! (Also, it should be a String array.)");
        System.out.println("Notes on entering code:");
        System.out.println("- Add spaces where they make sense.");
        System.out.println("- Go to new lines after a ;");
        System.out.println("- Name variables as listed in prompt");
        System.out.println("- Style for loops this way: (referring to the spaces and next lines)");
        System.out.println("for(int i = 0; i < 4; i++) {");
        System.out.println("code");
        System.out.println("}");
        System.out.println("- Please don't indent code, sorry.");
        System.out.println("- There are many ways to do each question, but try to follow the standards and the notes.");
        System.out.println("- To progress through intro of story, just press enter.");

        //taking input from user
        System.out.println("Input code now, it should be one line:");
        input = read.nextLine();

        //checking code is correct
        while(!input.equals("String[][] clouds = new String[4][7];")){
            System.out.println("\nThat isn't correct in some way...");
            input = read.nextLine();
        }

        System.out.println("\nNow, since the land is made of clouds, add the word “cloud” to every square! (Make sure to use a for loop, make the iterating number “i” and “j”, and just check that they are less than 4 and 7.)");

        //taking input from user
        System.out.println("Input code now, it should be five lines:");
        input = read.nextLine();
        input += read.nextLine();
        input += read.nextLine();
        input += read.nextLine();
        input += read.nextLine();

        //checking code is correct
        while(!input.equals("for(int i = 0; i < 4; i++) {for(int j = 0; j < 7; j++) {clouds[i][j] = \"cloud\";}}")){
            //for testing purposes: for(int i = 0; i < 4; i++) {for(int j = 0; j < 7; j++) {clouds[i][j] = "cloud";}}
            System.out.println(input);
            System.out.println("\nThat isn't correct in some way...");
            input = read.nextLine();
            input += read.nextLine();
            input += read.nextLine();
            input += read.nextLine();
            input += read.nextLine();
        }

        //to clear screen
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        //printing out clouds
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                clouds[i][j] = "☁️ ";
                System.out.print(clouds[i][j]);
            }
            System.out.println();
        }
        clouds[0][0] = "😎";

        System.out.println("\nyay");

        //waiting for user to continue
        read.nextLine();

        //to clear screen
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        //resetting clouds
        clouds[0][1] = "⛈️ ";
        clouds[0][6] = "📕";
        clouds[1][3] = "📙";
        clouds[1][4] = "⛈️ ";
        clouds[1][5] = "⛈️ ";
        clouds[2][1] = "⛈️ ";
        clouds[2][2] = "⛈️ ";
        clouds[2][5] = "⛈️ ";
        clouds[2][6] = "🌤️ ";
        clouds[3][0] = "📗";
        clouds[3][2] = "🎁";
        clouds[3][3] = "⛈️ ";
        clouds[3][4] = "🎁";
        clouds[3][6] = "⛈️ ";

        //function explained below, but same as in game, prints array without me having to retype it
        print(clouds);

        System.out.println("\noh no");

        //waiting for user to continue
        read.nextLine();
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        print(clouds);
        System.out.println("\nIt seems the land of clouds has changed! Whelp! It seems you need to get to the sun at the other end of the board! Well, since this is the land of clouds, the only way to get through is to type where you wish to go, and you can only move to an adjacent square that isn’t a lightning cloud.");
        System.out.println("\nAlso, by the way, here is a key:\n😎 = you\n☁️ = good clouds to walk on\n⛈️ = bad clouds can can’t walk on\n🎁 = presents that give points\n📗📙📕 = books that ask a question about arrays, they also give points\n🌤️ = the sunny end");
        System.out.println("\nHow to move: keep entering an index that is close to the square where 😎 is.\nFor example, if you are on the spot [7,3], you can only type [8,3], [6,3], [7,4], or [7,2]. \nBut movement must be formatted as: clouds[y][x] = “me”;");
        System.out.println("\nGood luck.");
        System.out.print("Type anything to continue: "); 
        read.nextLine();

        actualGameJeezThisTookWayTooLongAndIsMaybeABitMessyButAnOmeleteIsAnOmeleteSoBonAppetit();

    }

    //looping through and printing what the matrix looks like with the correct emoji in each spot, i copied the one from animation, but i felt it would be more organized to put it here
    static void print(String[][] map){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 7; j++){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }


    /*
    I'll be honest, going to a blue cloud crashes the program. No errors show up it just doesn't do anything. I spent forever just trying to make it move correctly and print the correct emoji behind it i can't deal with these problems anymore. may the user be smart enough not to break the program, cause i ain't got enough energy left to fix it. apologies - 1:44 AM me
    */
    /*
    Some of the indexing with locations and changing the emojis doesn't even completely make sense to me becuase it's too much to follow. when i was writing it, i and the program knew what it meant, now only the program knows.
    */
    /*
    Also, yes, i could have maybe used more classes, but i was doing this in replit so i wouldn't have to replay my whole program and thought it'd be easier to copy and paste and didn't want to deal with multiple files, so yes, it is a tiny bit of a mess, but I tried to add as many comments as i could
    */

    static void actualGameJeezThisTookWayTooLongAndIsMaybeABitMessyButAnOmeleteIsAnOmeleteSoBonAppetit(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
              clouds[i][j] = "cloud";
            }
        }
    
        // -----------
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                clouds[i][j] = "☁️ ";
                System.out.print(clouds[i][j]);
            }
            System.out.println();
        }
        clouds[0][0] = "😎";
        /*
        😎  ☁️  ☁️  ☁️  ☁️  ☁️  ☁️ 
        ☁️  ☁️  ☁️  ☁️  ☁️  ☁️  ☁️ 
        ☁️  ☁️  ☁️  ☁️  ☁️  ☁️  ☁️ 
        ☁️  ☁️  ☁️  ☁️  ☁️  ☁️  ☁️ 
        */
        
        // -----------
    
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        System.out.println();
        
        clouds[0][1] = "⛈️ ";
        clouds[0][2] = "⛈️ ";
        clouds[0][6] = "📕";
        clouds[1][3] = "📙";
        clouds[1][4] = "⛈️ ";
        clouds[1][5] = "⛈️ ";
        clouds[2][1] = "⛈️ ";
        clouds[2][2] = "⛈️ ";
        clouds[2][5] = "⛈️ ";
        clouds[2][6] = "🌤️ ";
        clouds[3][0] = "📗";
        clouds[3][2] = "🎁";
        clouds[3][3] = "⛈️ ";
        clouds[3][4] = "🎁";
        clouds[3][6] = "⛈️ ";
        /*
        😎  ⛈️  ⛈️  ☁️  ☁️  ☁️  📕 
        ☁️  ☁️  ☁️  📙  ⛈️  ⛈️  ☁️ 
        ☁️  ⛈️  ⛈️  ☁️  ☁️  ⛈️  🌤️ 
        📗  ☁️  🎁  ⛈️  🎁  ☁️  ⛈️ 
        */
        //------------------------------------------------------
        Scanner read = new Scanner(System.in);
        String input = "";
    
        print();
    
        boolean running = true; //is the loop that makes sure the game should be running
        boolean valid = false; //checks if user input is valid
        int[] current = {0,0}; //current location of player
        char[] checker = new char[20]; //is gonna check if user input is valid and where emoji should be placed
        String wasThere = "☁️ "; //the string value of what was in the spot before where the character was
        int[] stoodThere = {0,0}; // where was previously standing
        int points = 0; //the points the user gets for answering questions and getting the presents
        boolean askG = false; //the 3 books, checking if i had asked the question yet
        boolean askO = false; //g-green,o-orange,r-red
        boolean askR = false;
        boolean giftL = false; // checking if gifts taken
        boolean giftR = false;
    
        while(running == true){
        valid = false;
        System.out.println("Where would you like to go? (Enter as if resetting that spot to \"me\".): ");
        //clouds[y][x] = “me”;
        input = read.nextLine();
        
        while(valid == false){
            try{//try because should make sure length of input is correct
            for (int i = 0; i < 20; i++) {
                checker[i] = input.charAt(i); // making spots into char so can check just location
            }
            if(String.valueOf(checker[7]).equals(String.valueOf(current[0]))){ //making sure that at least y here is correct
                if(String.valueOf(checker[10]).equals(String.valueOf(current[1]+1)) && !clouds[Integer.valueOf(String.valueOf(checker[7]))][Integer.valueOf(String.valueOf(checker[10]))].equals("⛈️ ")){//making sure can move +1 and is not a blue cloud
                wasThere = clouds[stoodThere[0]][stoodThere[1]]; // symbol at previous location
                
                stoodThere[0] = current[0]; //remembering previous spot
                stoodThere[1] = current[1];
                
                current[0] = Integer.valueOf(String.valueOf(checker[7])); //y of new spot to move to
                current[1] = Integer.valueOf(String.valueOf(checker[10])); //x of new spot to move to
                clouds = move(clouds, wasThere, current, stoodThere); // calling function
                //to clear screen
                System.out.print("\033[H\033[2J");  
                System.out.flush();
                print();
                valid = true;
    
                //questions/chests/end i check to make sure index is correct
                if(current[0] == 1 && current[1] == 3 && askO == false){
                    System.out.println("A question: What is another name for a 2D array that begins with m? (all lowercase)");
                    input = read.nextLine();
                    if(input.equals("matrix")){
                    points += 1;
                    System.out.println("Good job.");
                    }
                    else{
                    System.out.println("Nope. It's matrix.");
                    }
                    System.out.println("Enter anything to continue.");
                    read.nextLine();
    
                    askO = true;
                }
                else if(current[0] == 0 && current[1] == 6 && askR == false){
                    System.out.println("A question: Do visualizations exist for 4D arrays? T or F");
                    input = read.nextLine();
                    if(input.equals("T")){
                    points += 1;
                    System.out.println("Good job.");
                    }
                    else{
                    System.out.println("Nope. It's true.");
                    }
                    System.out.println("Enter anything to continue.");
                    read.nextLine();
    
                    askR = true;
                }
                else if(current[0] == 3 && current[1] == 2 && giftL == false){
                    System.out.println("A chest: +3 points");
                    points += 3;
                    System.out.println("Enter anything to continue.");
                    read.nextLine();
    
                    giftL = true;
                }
                
                }
                else if(String.valueOf(checker[10]).equals(String.valueOf(current[1]-1)) && !clouds[Integer.valueOf(String.valueOf(checker[7]))][Integer.valueOf(String.valueOf(checker[10]))].equals("⛈️ ")){//making sure can move -1 and is not a blue cloud  
                wasThere = clouds[stoodThere[0]][stoodThere[1]]; // symbol at previous location
                
                stoodThere[0] = current[0]; //remembering previous spot
                stoodThere[1] = current[1];
                
                current[0] = Integer.valueOf(String.valueOf(checker[7])); //y of new spot to move to
                current[1] = Integer.valueOf(String.valueOf(checker[10])); //x of new spot to move to
                clouds = move(clouds, wasThere, current, stoodThere); // calling function
                //to clear screen
                System.out.print("\033[H\033[2J");  
                System.out.flush();
                print();
                valid = true;
                }
            }
            else if(String.valueOf(checker[10]).equals(String.valueOf(current[1]))){ //making sure that at least x here is correct
                
                if(String.valueOf(checker[7]).equals(String.valueOf(current[0]+1)) && !clouds[Integer.valueOf(String.valueOf(checker[7]))][Integer.valueOf(String.valueOf(checker[10]))].equals("⛈️ ")){//making sure can move +1 and is not a blue cloud0");
                if(current[0] == 0 && current[1] == 0){
                    wasThere = "☁️ "; //becuase in first iteraton, the player hasn't moved from anywher yet
                }
                else{
                    wasThere = clouds[stoodThere[0]][stoodThere[1]]; // symbol at previous location
                }  
    
                stoodThere[0] = current[0]; //remembering previous spot
                stoodThere[1] = current[1];
    
                current[0] = Integer.valueOf(String.valueOf(checker[7])); //y of new spot to move to
                current[1] = Integer.valueOf(String.valueOf(checker[10])); //x of new spot to move to
                clouds = move(clouds, wasThere, current, stoodThere); // calling function
                //to clear screen
                System.out.print("\033[H\033[2J");  
                System.out.flush();
                print();
                valid = true;
    
                //questions/chests/end i check to make sure index is correct
                if(current[0] == 3 && current[1] == 0 && askG == false){
                    System.out.println("A question: What is the largest amount of elements an array can have? (Don't add commas.)");
                    input = read.nextLine();
                    if(input.equals("2147483647")){
                    points += 1;
                    System.out.println("Good job.");
                    }
                    else{
                    System.out.println("Nope. It's 2147483647.");
                    }
                    System.out.println("Enter anything to continue.");
                    read.nextLine();
    
                    askG = true;
                }
                else if(current[0] == 3 && current[1] == 4 && giftR == false){
                    System.out.println("A chest: +5 points");
                    points += 5;
                    System.out.println("Enter anything to continue.");
                    read.nextLine();
    
                    giftL = true;
                }
                else if(current[0] == 2 && current[1] == 6){
                    System.out.println("Congrats, you're done.");
                    System.out.println("Points: " + String.valueOf(points));
                    read.nextLine();
                    System.exit(0);
                }
                }
                else if(String.valueOf(checker[7]).equals(String.valueOf(current[0]-1)) && !clouds[Integer.valueOf(String.valueOf(checker[7]))][Integer.valueOf(String.valueOf(checker[10]))].equals("⛈️ ")){//making sure can move -1 and is not a blue cloud  
                wasThere = clouds[stoodThere[0]][stoodThere[1]]; // symbol at previous location
                
                stoodThere[0] = current[0]; //remembering previous spot
                stoodThere[1] = current[1];
                
                current[0] = Integer.valueOf(String.valueOf(checker[7])); //y of new spot to move to
                current[1] = Integer.valueOf(String.valueOf(checker[10])); //x of new spot to move to
                clouds = move(clouds, wasThere, current, stoodThere); // calling function
                //to clear screen
                System.out.print("\033[H\033[2J");  
                System.out.flush();
                print();
                valid = true;
                }
                }
                else{
                    System.out.println("Not valid, make within bounds/next to you: (Enter as if resetting that spot to \"me\".):");
                    
                    input = read.nextLine();
                }
                
                }
                catch(Exception e){//catches any excpetion, out of bounds, cannot 
                System.out.println("\nError, invalid input length or cannot convert random letter to int, try again: (Enter as if resetting that spot to \"me\".): ");
                input = read.nextLine();
                }
        
                if(current[0] == 3 && current[1] == 6){
                running = false;
                }
            
            }
        
        }
    }

    public static String[][] move(String[][] clouds, String wasThere, int[] current, int[] stoodThere){

        System.out.println("in move function");
        
        clouds[current[0]][current[1]] = "😎";
        System.out.println("wasThere: ");
        System.out.println(wasThere);
        clouds[stoodThere[0]][stoodThere[1]] = wasThere;
        
        return clouds;
    }

    public static void print(){
        for (int i = 0; i < 4; i++) {
          for (int j = 0; j < 7; j++) {
            System.out.print(clouds[i][j]);
          }
          System.out.println();
        }
    }

}
