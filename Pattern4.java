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




    }
}
