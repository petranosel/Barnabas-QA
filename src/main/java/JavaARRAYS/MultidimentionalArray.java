package JavaARRAYS;

public class MultidimentionalArray {
    public static void main(String[] args) {
        // single dimen
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }


        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //prinitig arrays
        for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {

            System.out.print(arr1[i][j] + " ");
        }
        System.out.println();}

        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j]);
            }
            System.out.println();

        }

        // jagged array
        int[][] arr3 = {{1, 2, 3}, {1, 2}, {1, 2, 3, 4}};
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }

//print odd numbers from this array  {1,2,3,4,5,6,7,8,9,10}
        int[] numbArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("print odd numbers-------- ");

        for (int i = 0; i < numbArray.length; i++) {
            if (numbArray[i] % 2 != 0) {
                System.out.println(numbArray[i] + " ");


            }
        }

        //print even numbers


        for (int i = 0; i < numbArray.length; i++) {
            if (numbArray[i] % 2 == 0) {
                System.out.println(numbArray[i] + " ");
            }
        }


        // largest number
        int largest = numbArray[0];
        for (int i = 0; i < numbArray.length; i++)
            if (numbArray[i] > largest) {
                largest = numbArray[i];
            }
        System.out.println(largest);



            //print sum of all
                System.out.println("========Sum of all numbers===== ");
                int sum= 0;
                for (int i=0;i < numbArray.length;i++){
                    sum +=numbArray[i];
                }
                System.out.println(sum);

                //sort array in decednig order
                System.out.println("=======decednig order====== ");

                for (int i=0;i<numbArray.length -1;i++){
                    for (int j=0;j<numbArray.length-i-1;j++) {
                        if(numbArray[j]<numbArray[j]){
                        // sample elemnt
                        int temp = numbArray[j];
                        numbArray[j] = numbArray[j + 1];
                        numbArray[j + 1] = temp;

                    }}}

                    for (int i= 0;i<numbArray.length;i++){
                        System.out.println();}
/* homework
public static  boolean isSix(int[] nums){
                        return nums[0]==6 ||nums[nums.length-1]==6;

        }

public static  boolean (int[] middle(int []) a,int[])b{
                        int[] aa={a[1],b[1]};
                        for(int i=0;i<aa.length;i++)
        }


 public static  int maxValue(int[] nums){
                         int midIndex= nums.length/2;
            System.out.println(Math.max(nums[0],Math.max(nums[midIndex],nums[nums.length-1])));
            return Math.max(nums[0],Math.max(nums[midIndex],nums[nums.length-1] )));

        }

public static void bigTwo(int[] a,int[] b){
                        int sumA=a[0] +a[1];
            int sumB=b[0] +b[1];
            int[] result = sumA >= sumB ? a:b;
            System.out.println(Arrays.toString(result));*/







            }}


























