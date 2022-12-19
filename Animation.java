public class Animation {
    public static void move(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        System.out.println();

        //creating 5x5 2D array with only ⬛, which are meant to represent empty spots in the cave
        String[][] map = new String[5][5];
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                map[i][j] = "⬛";
            }
        }
        
        //setting specific indices in the array to have the emoji
        map[0][0] = "😃";
        map[0][3] = "👾";
        map[1][0] = "🦇";
        map[1][2] = "🦴";
        map[1][3] = "💎";
        map[1][4] = "🦇";
        map[2][0] = "👾";
        map[3][2] = "🦇";
        map[3][4] = "🦴";
        map[4][1] = "🦴";
        map[4][3] = "👾";

        //function explained below again, but it is for looping through and printing what the matrix looks like. it's just so I don't have to retype it every time
        print(map);

        //the coordinates, which work kinda backwards here
        int y = 0;
        int x = 0;

        System.out.println("y: " + String.valueOf(y) + " , x: " + String.valueOf(x));

        //try is here because the Thread wants it.
        try{ 
            //comments in first section can just be repeated per each section since nearly same thing
            // -------------------------------------------------------------------------- //
            Thread.sleep(3000); // so image stays
            //clearing screen
            System.out.print("\033[H\033[2J");  
            System.out.flush(); 
            System.out.println();
            //  0   1
            map[y][x+1] = "😃"; // sets new spot for the face
            x += 1; //honestly coudle set before previous line
            map[0][0] = "⬛"; // sets previous spot to be "empty"
            print(map);
            // typing out below info so user knows what is happenign with the indices
            System.out.println("y: " + String.valueOf(y) + " , x: " + String.valueOf(x));
            System.out.println("x += 1"); 
            // -------------------------------------------------------------------------- //
            Thread.sleep(3000);
            System.out.print("\033[H\033[2J");  
            System.out.flush();
            System.out.println();
            //  2    1
            map[y+2][x] = "😃";
            y += 2;
            map[0][1] = "⬛";
            print(map);
            System.out.println("y: " + String.valueOf(y) + " , x: " + String.valueOf(x));
            System.out.println("y += 2");
            // -------------------------------------------------------------------------- //
            Thread.sleep(3000);
            System.out.print("\033[H\033[2J");  
            System.out.flush();
            System.out.println();
            //  2  3
            map[y][x+2] = "😃";
            x += 2;
            map[2][1] = "⬛";
            print(map);
            System.out.println("y: " + String.valueOf(y) + " , x: " + String.valueOf(x));
            System.out.println("x += 2");
            // -------------------------------------------------------------------------- //
            Thread.sleep(3000);
            System.out.print("\033[H\033[2J");  
            System.out.flush();
            System.out.println();
            //  1    3
            map[y-1][x] = "😃";
            y -= 1;
            map[2][3] = "⬛";
            print(map);
            System.out.println("y: " + String.valueOf(y) + " , x: " + String.valueOf(x));
            System.out.println("y -= 1");
            // -------------------------------------------------------------------------- //
            //so last image still stays before going back to menu
            Thread.sleep(3000);

        }
        catch(Exception e){ //catches any error, but specifically put for the timer
            System.out.println("Error");
        }


        
    }

    //looping through and printing what the matrix looks like with the correct emoji in each spot
    static void print(String[][] map){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }

}
