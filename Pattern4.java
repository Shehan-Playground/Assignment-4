public class Pattern4 {
    public static void main(String[] args) {
        

        /* 
            Nested Loops
            Via + / \


            + + + + + +
            + + / \ + +
            + / / \ \ +
            + \ \ / / +
            + + \ / + +
            + + + + + +
        */

        // Nested loops

        int a =1;
        int b=1;
        float c;

        while (b<=6) {
            while (a <=6) {
                if (b!=1 && b!=6) {

                   if (b<=3.5) {
                    c = b - 1.5f;

                        if (a >= (3.5-c) && a <= 3.5) System.out.print("/ ");
                        else if (a >= 3.5 && a <= (3.5+c)) System.out.print("\\ ");
                        else System.out.print("+ ");

                    } else {
                        c = b - 6;

                        if (a >= (3.5+c) && a <= 3.5) System.out.print("\\ ");
                        else if (a >= 3.5 && a <= (3.5-c)) System.out.print("/ ");
                        else System.out.print("+ ");
                    }
                        

                } else System.out.print("+ ");

                a++;
                
            }
            b++;
            System.out.println();
            a=1;
        }

        System.out.println();

        // Single loop

        int x=1;
        int y=1;
        float z;

        while (y<=6) {

            if (y != 1 && y!= 6) {

                if (y<=3.5) {
                    z = y - 1.5f;

                    if (x >= (3.5-z) && x <= 3.5) System.out.print("/ ");
                    else if (x >= 3.5 && x <= (3.5+z)) System.out.print("\\ ");
                    else System.out.print("+ ");

                } else {
                    z = y - 6;

                    if (x >= (3.5+z) && x <= 3.5) System.out.print("\\ ");
                    else if (x >= 3.5 && x <= (3.5-z)) System.out.print("/ ");
                    else System.out.print("+ ");
                }
                
            } else System.out.print("+ ");
            
            x++;

            if (x>6) {
                x=1;
                System.out.println();
                y++;
            }
            
        }




    }
}
