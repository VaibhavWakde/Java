package java_task.numberpattern;

public class NumberPattern {
    public static void main(String[] args) {

        /**
                 1 2 3 4 5
                 1 2 3 4 5
                 1 2 3 4 5
                 1 2 3 4 5
                 1 2 3 4 5
         */
//        for(int i=0;i<5;i++){
//            for(int j=0;j<5;j++){
//                if(j==0){
//                    System.out.print(1);
//                    System.out.print(" ");
//                }
//                else if (j==1){
//                    System.out.print(2);
//                    System.out.print(" ");
//                }
//                else if (j==2){
//                    System.out.print(3);
//                    System.out.print(" ");
//                }
//                else if (j==3){
//                    System.out.print(4);
//                    System.out.print(" ");
//                }
//                else{
//                    System.out.print(5);
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }


        /**
                 1 1 1 1 1
                 2 2 2 2 2
                 3 3 3 3 3
                 4 4 4 4 4
                 5 5 5 5 5
         */
//        for(int i=0;i<5;i++){
//            for(int j=0;j<5;j++){
//                if(i==0){
//                    System.out.print(1);
//                    System.out.print(" ");
//                }
//                else if (i==1){
//                    System.out.print(2);
//                    System.out.print(" ");
//                }
//                else if (i==2){
//                    System.out.print(3);
//                    System.out.print(" ");
//                }
//                else if (i==3){
//                    System.out.print(4);
//                    System.out.print(" ");
//                }
//                else{
//                    System.out.print(5);
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }


        /**
                 * 5 5 5 5 5
                 * 4 4 4 4 4
                 * 3 3 3 3 3
                 * 2 2 2 2 2
                 * 1 1 1 1 1
         */

//        for(int i=0;i<5;i++){
//            for(int j=0;j<5;j++){
//                if(i==0){
//                    System.out.print(5);
//                    System.out.print(" ");
//                }
//                else if (i==1){
//                    System.out.print(4);
//                    System.out.print(" ");
//                }
//                else if (i==2){
//                    System.out.print(3);
//                    System.out.print(" ");
//                }
//                else if (i==3){
//                    System.out.print(2);
//                    System.out.print(" ");
//                }
//                else{
//                    System.out.print(1);
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        /**
                 * 5 4 3 2 1
                 * 5 4 3 2 1
                 * 5 4 3 2 1
                 * 5 4 3 2 1
                 * 5 4 3 2 1
         */


//        for(int i=0;i<5;i++){
//            for(int j=0;j<5;j++){
//                if(j==0){
//                    System.out.print(5);
//                    System.out.print(" ");
//                }
//                else if (j==1){
//                    System.out.print(4);
//                    System.out.print(" ");
//                }
//                else if (j==2){
//                    System.out.print(3);
//                    System.out.print(" ");
//                }
//                else if (j==3){
//                    System.out.print(2);
//                    System.out.print(" ");
//                }
//                else{
//                    System.out.print(1);
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }


        /**
                 * 1 2 3 4 5
                 * 6 7 8 9 10
                 * 11 12 13 14 15
                 * 16 17 18 19 20
                 * 21 22 23 24 25
         */



//            for(int j=0;j<5;j++){
//                if(j==0){
//                    System.out.print(1+" "+2+" "+3+" "+4+" "+5);
//                    System.out.print(" ");
//                }
//                else if (j==1){
//                    System.out.print(6+" "+7+" "+8+" "+9+" "+10);
//                    System.out.print(" ");
//                }
//                else if (j==2){
//                    System.out.print(11+" "+12+" "+13+" "+14+" "+15);
//                    System.out.print(" ");
//                }
//                else if (j==3){
//                    System.out.print(16+" "+17+" "+18+" "+19+" "+20);
//                    System.out.print(" ");
//                }
//                else{
//                    System.out.print(21+" "+22+" "+23+" "+24+" "+25);
//                    System.out.print(" ");
//                }
//                System.out.println();
//            }

//        int count = 0;
//        for(int i =0; i<5;i++){
//            for(int j=1;j<6;j++){
//                count = count+1;
//                System.out.print(count);
//                System.out.print(" ");
//            }
//            System.out.println();
//        }


        /**
                 * 2 4 6
                 * 8 10 12
                 * 14 16 18
                 * 20 22 24
                 * 26 28 30
         */


        int count = 0;
        for(int i =0; i<5;i++){
            for(int j=1;j<6;j++){
                if(j%2==1){
                    count = count+2;
                    System.out.print(count);
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
