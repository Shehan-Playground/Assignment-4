public class Pattern1 {
    public static void main(String[] args) {
        
        /* 
            Single Loop, Nested Loops
            Via +

            + + + + +
            + + + +
            + + +
            + +
            +                           
            + +
            + + +
            + + + +
            + + + + +
         */


        // Single loop
        int x = 1;
        int y = 5;
        boolean z = false;

        while (y<=5) {
            System.out.print("+ ");

            if (x==y) {
                System.out.println();
                x=0;

                if (y==1) z = true;

                if (z) y++;
                else y--;
            
            }
            x++;
        }

        // Nested loop




    }
}