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

        System.out.println();

        // Nested loop

        int a =1;
        int b=1;
        int c;

        while (b<=5) {
            while (a <=5) {

                if (b<=3) {
                c = b - 1;

                if (a >= (3-c) && a <= (3+c)) System.out.print("+ ");
                else System.out.print("  ");

                } else {
                    c = b - 5;

                    if (a >= (3+c) && a <= (3-c)) System.out.print("+ ");
                    else System.out.print("  ");
                }

                a++;  
            }
            b++;
            System.out.println();
            a=1;
        }


    }
}
