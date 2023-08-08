public class Pattern2 {
    public static void main(String[] args) {
        
        /*
            Single Loop, Nested Loops
            Via +

            + + + + + + +
            + + +   + + +
            + +       + +
            +           +

        */

        // Single loop

        int x=1;
        int y=1;
        int z;
        boolean u = false;;

        while (y<=4) {

            if (y != 1) {
                z = y - 2;

                if (x >= (4-z) && x <= (4+z)) u = false;
                else u = true;

            } else u = true;

            if (u) System.out.print("+ ");
            else  System.out.print("  ");
            
            x++;

            if (x>7) {
                x=1;
                System.out.println();
                u=false;
                y++;
            }
            
        }
        

        // Nested loop
        


    }
}
