package JavaChallenges;

public class testExamples {

    public static int addition(int a,int b) {

        return (a+b);
    }

    public static String checkString() {

        return "Hello World";
    }

    public static int div(int a, int b) {
        int c = 0;
        try {
            c= (a / b);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }
        return c;
        }

    }


