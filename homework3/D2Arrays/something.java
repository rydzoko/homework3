package D2Arrays;

import java.util.Scanner;

public class something {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);





        //task1
        // int[][] a2d = {
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // };

        // for (int i =0; i<a2d.length; i++) {
            
        //     for (int j=0;j<a2d[i].length;j++ ){
        //         System.out.print(a2d[i][j]+" ");
                
        //     }
        //     System.out.println();

        // } 
        






        //task2

        // int[][] a3d = {
        //     {5,10,15,},
        //     {20,25,30}
        // };
        
        // System.out.println("Printing 1,2");
        // System.out.println(a3d[1][2]);
        // a3d[0][1] = 99;
        // System.out.println("Changed 0,1 to 99, then printing");
        // System.out.println(a3d[0][1]);    
        // System.out.println("Final matrix: ");
        // for (int i =0; i<a3d.length; i++) {
            
        //     for (int j=0;j<a3d[i].length;j++ ){
        //         System.out.print(a3d[i][j]+" ");
                
        //     }
        //     System.out.println();

        // }









        //task 3

        // int[][] arraydd = {
        //     {5,7,2},
        //     {1,6,4},
        //     {99,1,3}
        // };
        // int sum = 0;
        // for (int i =0; i<arraydd.length; i++) {
            
        //     for (int j=0;j<arraydd[i].length;j++ ){
        //         sum += arraydd[i][j];
                
        //     }
            

        // } 
        // System.out.println("The sum is: "+sum);





        //task4

        // int[][] arrayhey ={
        //     {6,2,1,4},
        //     {90,2,7,1},
        //     {76,88,21},
        //     {4,6,11,5}
        // };
        // int odd=0,eve=0;
        // for (int i =0; i<arrayhey.length; i++) {
            
        //     for (int j=0;j<arrayhey[i].length;j++ ){
        //         if (arrayhey[i][j]%2==0) {
        //             eve++;
        //         } else {
        //             odd++;
        //         }
                
        //     }
            

        // } 
        // System.out.println("Even numbers: "+eve+"\nOdd numbers: "+odd);






        //task5
        // int[][] helloarray = {
        //     {2,6,8},
        //     {3,5,1},
        //     {9,1,30},
        //     {8,1,5}
        // };

        // int max=helloarray[0][0], min=helloarray[0][0];
        // for (int i =0; i<helloarray.length; i++) {
            
        //     for (int j=0;j<helloarray[i].length;j++ ){
        //         if (helloarray[i][j]>max) {
        //             max = helloarray[i][j];
        //         } if (helloarray[i][j]<min) {
        //             min = helloarray[i][j];
        //         }

        //     }

        // } 
        // System.out.println("The largest value is: "+max);
        // System.out.println("The smallest value is: "+min);





        //task6
       
        // int[][] userMat = new int[2][3];
        // int userInp;
        // for (int i =0; i<userMat.length; i++) {
            
        //     for (int j=0;j<userMat[i].length;j++ ){
        //         System.out.println("Enter the number for ["+i+"] ["+j+"]: ");
        //         userInp = sc.nextInt();
        //         userMat[i][j] = userInp;
                
        //     }
            

        // } 
        // System.out.println("\nHere is what you got: ");
        // for (int i =0; i<userMat.length; i++) {
            
        //     for (int j=0;j<userMat[i].length;j++ ){
        //         System.out.print(userMat[i][j]+" ");
                
        //     }
        //     System.out.println();

        // }





        //task (example)
        // int[][] whatarray = {
        //     {4,1,5},
        //     {7,2,3},
        //     {0,9,6}
        // };
        
        // for (int i =0; i<whatarray.length; i++) {
        //     int rowSum=0;
        //     for (int j=0;j<whatarray[i].length;j++ ){
        //         rowSum+=whatarray[i][j];
                
        //     }

        //     System.out.println("Row "+i+": the sum is: "+rowSum);

        // }
        
        


        //task7
        // int[][] wherearray = {
        //     {4,1,5},
        //     {7,2,3},
        //     {0,9,6}
        // };
        
        // for (int j=0; j<wherearray[0].length; j++) {
        //     int collunmSum=0;
        //     for (int i=0;i<wherearray.length;i++ ){
        //         collunmSum+=wherearray[i][j];
                
        //     }

        //     System.out.println("Collunm "+j+": the sum is: "+collunmSum);

        // }




        //task 8
        // int[][] somearray = {
        //     {4,1,5},
        //     {7,2,3},
        //     {0,9,6}
        // };
        // System.out.println("Enter the number to calculate the amount of it being less than it in the matrix");
        // int userNum = sc.nextInt();
        // int userInd=0;

        // System.out.println("\nArray: ");
        // for (int i=0; i<somearray.length; i++) {
        //     for (int j=0;j<somearray[i].length; j++) {
        //         if (userNum < somearray[i][j]){
        //             userInd++;
        //         }
        //         System.out.print(somearray[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // System.out.println("\nThe numbers above your number: "+userInd);



        //task 9
        // int[][] heyarray = {
        //     {4,1,5},
        //     {7,2,3},
        //     {0,9,6}
        // };

        // System.out.println("Which number you'd like to search: ");
        // int userSearch = sc.nextInt();
        // int userAny=0;

        // System.out.println();
        // for (int i = 0; i<heyarray.length; i++) {
        //     for (int j =0; j<heyarray[i].length; j++){
        //         if (userSearch==heyarray[i][j]) {
        //             System.out.println("Found it! its index is: "+i+" | "+j);
        //             userAny++;
        //         }
        //     }
        // }
        // System.out.println("Array: ");
        // for (int i=0; i<heyarray.length; i++){
        //     for (int j=0; j<heyarray[i].length; j++) {
        //         System.out.print(heyarray[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // if (userAny==0) {
        //     System.out.println("\nNo value was found for: "+userSearch);
        // } 
        

        //task10
        // int[][] whyarray = {
        //     {4,1,5},
        //     {7,2,3},
        //     {0,9,6}
        // };

        // int sum =0;

        // System.out.println("Array: ");

        // for (int i =0; i<whyarray.length; i++) {
        //     sum += whyarray[i][i];
        //     for (int j=0; j<whyarray[i].length; j++) {
        //         System.out.print(whyarray[i][j]+" ");

        //     }
        //     System.out.println();
        // }


        // System.out.println("The sum of a diagonal values is: "+ sum);




        //task 11
        // int[][] howarray = {
        //     {4,1,-5},
        //     {-7,2,3},
        //     {0,9,-6}
        // };
        // System.out.println("\nOriginal array: ");
        // for (int i = 0; i<howarray.length; i++) {
        //     for (int j=0; j< howarray[i].length; j++) {
        //         System.out.print(howarray[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        // System.out.println("\nArray with negatives being replaced wiht zero: ");
        // for (int i = 0; i<howarray.length; i++) {
        //     for (int j=0; j< howarray[i].length; j++) {
        //         if (howarray[i][j]<0) {
        //             System.out.print("0 ");
        //         } else {
        //             System.out.print(howarray[i][j]+" ");
        //         }
        //     }
        //     System.out.println();
        // }



        //task 12
        int[][] scorearray = {
            {1,45,90,66},
            {2,99,100,70},
            {3,90,42,84}
        };

        for (int j = 0; j<scorearray[0].length; j++) {
            for (int i=0; i< scorearray.length; i++) {
                
            }
        }
        

        
        









        sc.close();
    }

}