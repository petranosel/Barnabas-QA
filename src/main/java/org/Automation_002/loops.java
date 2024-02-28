package org.Automation_002;
//for loop,for each loop//while loop
//for print from 0-9
public class loops {
    public static void main(String[] args) {

       //print from 0 to 10
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
       //print from 10 to 0
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        //prints even number from 0 to 10
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }

        //prints every line
        //  System.out.println("-------4--------");
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum is: " + sum);

        //printing in multipication table
        int number = 3;
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + "*" + i + "=" + (number * i));
        }
// print with pattern *
        for(int i = 1; i <= 5; i++) {
          //  for (int i=1; i <= 1;i++);
            {
                System.out.println("*");
            }
            System.out.println();
        }

        /*java for each loop for iteration arrays or collections.user friendly.based on elements
         */

        int arr[] = {1, 2, 3, 4, 5};
        for (int arrs : arr) {
            System.out.println(arrs);


        }

        System.out.println(("------while "));

        int count =1;
        while (count<=5){
            System.out.println(count);
            count++;}
        int sums =0,i=1;
        while(i<=10) {
            sums += i;//add i to sum
            i++;
        }
        System.out.println("sum is:+sums");

int times =0;
while (times<3) {
    System.out.println("Hello World");
    times++;
}
//example of do
        int counter =0;
do{
    System.out.println("counter"+counter);
    counter++;}

while (counter<=5);}}

// public static void doublex(String str) {
//     for (int i = 0; i <= str.length(); i++) {
//
//         if (str.charAt(i))=="x" && str.charAt(i + 1) == 'x' {
//             System.out.println(true);
//         }else{
//             System.out.println(false);
//         }
//     }
// }
//
////given three int values a,b,c return the largest,
//
//     public staitc void max(int a int b int c){
//    if (a>b && a>c);{
//        System.out.println(a);}
//    else if (b>a)






























































