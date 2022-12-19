public class Animation {
    public static void move(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();


        System.out.println();

        String[][] map = new String[5][5];
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                map[i][j] = "⬛";
            }
        }
        
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

        print(map);

        int y = 0;
        int x = 0;

        System.out.println("y: " + String.valueOf(y) + " , x: " + String.valueOf(x));

        try{ 
            Thread.sleep(3000);
            System.out.print("\033[H\033[2J");  
            System.out.flush();
            System.out.println();
            //  0   1
            map[y][x+1] = "😃";
            x += 1;
            map[0][0] = "⬛";
            print(map);
            System.out.println("y: " + String.valueOf(y) + " , x: " + String.valueOf(x));
            System.out.println("x += 1"); 
        
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
        
            Thread.sleep(3000);

        }
        catch(Exception e){
            System.out.println("Error");
        }


        
    }

    static void print(String[][] map){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }

}
