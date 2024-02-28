package JavaARRAYS;

public class Arrays {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};

        for (int i = 0; i <= myArray.length; i++) {

            //give space
            System.out.println(i + "");
        }
        System.out.println(" ");
        String[] myStringArray = {"h", "a", "l", "l", "o"};
        for (String s : myStringArray) {
            System.out.println(s + " ");
        }
        //print out arrays of colors
        String[] myColorArray = {"Red", "Green", "Blue"};

        System.out.println(myColorArray[1]);

        double[] tempratures = {98.6, 100.4, 97.5, 99.1};
        for ( double temp: tempratures){
        System.out.println(temp);
    }

char[] vowles = { 'a' ,'e','l','0','e' };
        for(double vow: vowles){
            System.out.println(vow);}




    //count how many vowels are there in a sentence
     String str ="hello this is java language bootcamp";
     int count=0;
     for(int i=0;i< str.length();i++){
    char ch =str.charAt(1);
    if(ch=='a'||ch=='e'||ch=='1'||ch=='o'||ch=='u'||ch=='A' || ch==
    'E'|| ch=='1'||ch=='o'||ch=='u'){count++;}}

        System.out.println("number of vowles in sentence is:"+count);
}


















}




























