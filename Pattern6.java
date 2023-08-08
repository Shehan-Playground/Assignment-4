public class Pattern6 {
    public static void main(String[] args) {
        

        /*
            Nested Loops
            Via + Space

                + 
              + + +
            + + + + + 
              + + + 
                + 
        */


        // Single loop

        int x=1;
        int y=1;
        int z;
        boolean u = true;;

        while (y<=5) {

            if (y<=3) {
                z = y - 1;

                if (x >= (3-z) && x <= (3+z)) u = true;
                else u = false;

            } else {
                z = y - 5;

                if (x >= (3+z) && x <= (3-z)) u = true;
                else u = false;
            }

            if (u) System.out.print("+ ");
            else  System.out.print("  ");
            
            x++;

            if (x>5) {
                x=1;
                System.out.println();
                u=true;
                y++;
            }
            
        }

        


    }
}
