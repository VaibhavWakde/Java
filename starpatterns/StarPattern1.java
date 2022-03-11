package java_task.starpatterns;

import java.util.Scanner;

public class StarPattern1 {


    public static void main(String[] args) {
        int i, j, k;
        /**
         *
         * *
             * * *
             * * * *
             * * * * *
        */

//        for(i=1;i<=5;i++){
//            for(j=0;j<i;j++){
//                System.out.print(" *");
//            }
//            System.out.println();
//        }





        /**    * * * *
         *     * * *
         *     * *
         *     *
         */



//        for (i =0;i<=4;i++){
//            for(j=4;j>i;j--){
//                System.out.print(" *");
//            }
//            System.out.println();
//        }

        /**
             *
             **
             ***
             ****
         */
//        for(i=0;i<4;i++){
//            for(j=4;j>i;j--){
//                System.out.print(" ");
//            }
//            for(k=0;k<=i;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /**     * * * *
         *        * * *
         *          * *
         *            *
         */

//        for(i=0;i<4;i++){
//            for(j=0;j<=i;j++){
//                System.out.print(" ");
//            }
//            for(k=4;k>i;k--){
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }




        /**      *
         *      * *
         *     * * *
         *    * * * *
         */

//        for(i=0;i<=4;i++){
//            for(j=4;j>=i;j--){
//                System.out.print(" ");
//            }
//            for(k=0;k<=i;k++){
//                System.out.print(" *");
//            }
//            System.out.println();
//
//        }


        /**
                 * * * *
                  * * *
                   * *
                    *
         */


//        for(i=0;i<5;i++){
//            for(j=0;j<=i;j++){
//                System.out.print(" ");
//            }
//            for(k=5;k>i;k--){
//                if(i%2==0) {
//                    System.out.print(" *");
//                }
//                else{
//                    System.out.print("");
//                }
//            }
//            System.out.println();
//
//        }



        /**
                      *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
         */

//        for(i=0;i<=4;i++){
//            for(j=4;j>i;j--){
//                System.out.print(" ");
//            }
//            for(k=0;k<=i;k++){
//
//                    System.out.print(" *");
//
//
//            }
//            System.out.println();
//        }
//        for(i=0;i<4;i++){
//            for(j=0;j<=i;j++){
//                System.out.print(" ");
//            }
//            for(k=4;k>i;k--){
//
//                    System.out.print(" *");
//
//            }
//            System.out.println();
//
//        }

        /**      *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
         *
         *
         */

//        for(i=1;i<=5;i++){
//            for(j=0;j<i;j++){
//                System.out.print(" *");
//            }
//            System.out.println();
//        }
//
//        for (i =0;i<=4;i++){
//            for(j=4;j>i;j--){
//                System.out.print(" *");
//            }
//            System.out.println();
//        }



        /**
         *              *
         *             **
         *            ***
         *           ****
         *          *****
         *           ****
         *            ***
         *             **
         *              *
         */

//        for(i=0;i<4;i++){
//            for(j=4;j>=i;j--){
//                System.out.print(" ");
//            }
//            for(k=0;k<=i;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(i=0;i<5;i++){
//            for(j=0;j<=i;j++){
//                System.out.print(" ");
//            }
//            for(k=4;k>=i;k--){
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = scanner.nextInt();

        for (i = 0; i < n; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (k = n; k > i; k--) {
                System.out.print("#");
            }
            System.out.println("");
        }

    }
}
