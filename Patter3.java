public class Patter3 {
    public static void main(String[] args) {
        
        /*
            Nested Loops
            Via + (Space)


            + + + + + + +
            + + +   + + +
            + +       + +
            +           +
            + +       + +
            + + +   + + +
            + + + + + + +
        */

        // Single loop

        int x=1;
        int y=1;
        int z;
        boolean u = false;;

        while (y<=7) {

            if (y != 1 && y!= 7) {

                if (y<=4) {
                    z = y - 2;

                    if (x >= (4-z) && x <= (4+z)) u = false;
                    else u = true;

                } else {
                    z = y - 6;

                    if (x >= (4+z) && x <= (4-z)) u = false;
                    else u = true;
                }
                
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
        

    }
}