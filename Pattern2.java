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

        System.out.println();

        // Nested loop

        int a =1;
        int b=1;
        int c;

        while (b<=4) {
            while (a <=7) {
                if (b!=1) {

                    c = b - 2;

                    if (a >= (4-c) && a <= (4+c)) System.out.print("  ");

                    else System.out.print("+ ");
                        

                } else System.out.print("+ ");

                a++;
                
            }
            b++;
            System.out.println();
            a=1;
        }

    }
}
