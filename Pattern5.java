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




    }
}
