public class Pattern5 {
    public static void main(String[] args) {
        /*
            Nested Loops
            Via + / \

            + + + + + 
            + / + \ +
            + + + + +
            + \ + / +
            + + + + +

        */


        // Nested loops

        int a =1;
        int b=1;
        int c;

        while (b<=5) {
            while (a <=5) {
                if (b%2==0) {

                   if (b<=3) {
                        c = b - 1;

                        if (a == (3-c)) System.out.print("/ ");
                        else if (a == (3+c)) System.out.print("\\ ");
                        else System.out.print("+ ");

                    } else {
                        c = b - 5;

                        if (a == (3+c)) System.out.print("\\ ");
                        else if (a == (3-c)) System.out.print("/ ");
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
        int z;

        while (y<=5) {

            if (y%2==0) {

                if (y<=3) {
                    z = y - 1;

                    if (x == (3-z)) System.out.print("/ ");
                    else if (x == (3+z)) System.out.print("\\ ");
                    else System.out.print("+ ");

                } else {
                    z = y - 5;

                    if (x == (3+z)) System.out.print("\\ ");
                    else if (x == (3-z)) System.out.print("/ ");
                    else System.out.print("+ ");
                }
                
            } else System.out.print("+ ");
            
            x++;

            if (x>5) {
                x=1;
                System.out.println();
                y++;
            }
            
        }


    }
}
