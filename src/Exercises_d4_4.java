// The program must offer a menu to the user with two options. The first one takes a binary number
// from the user and returns the corresponding decimal number. The second one does the opposite:
// takes a decimal number and returns a binary number. The program should use the methods that you
// have defined.
public class Exercises_d4_4 {

    static double power(int b, int e){
        double result = b;
        if (e == 0) return 1;
        for (int i = 1; i < e; i++){
            result = result * b;
        }
        return result;
    }
    static double power2(int e){
        return power(2,e);
    }

    static int binary2decimal(String binaryNum) {
        int decimalNum = 0;
        int strSize = binaryNum.length();
        for (int i = 0; i < strSize; i++) {
            char c = binaryNum.charAt(i);
            int num = c - '0';
            int power = (int) power2(strSize - 1 - i); // (int) is casting - converting double into type int
            decimalNum = decimalNum + power * num;
            // decimalNum += power2(strSize - 1 -i)*(binaryNum.charAt(i) - '0');
        }
        return decimalNum;
    }

    static String decimal2binary(int decimalNum){
//        The opposite of the previous one: takes a decimal number and returns the corresponding binary number. Hint: instead of multiplying by 2, you will need to divide by 2 this
//        time (the quotients and the last remainder will give you the binary number).
                        /* binary to decimal
        if even = you have 0; if odd = you have 1
        Do modulo
        */
        String binaryNum = "";
        while (decimalNum > 0){
            binaryNum = (decimalNum % 2) + binaryNum;
            decimalNum /= 2;
        }
        return binaryNum;
    }
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);

                /* binary to decimal
        if even = you have 0; if odd = you have 1
        Do modulo
        */
//      Converting decimal to binary:
        int decimal = 35;
        System.out.println(decimal2binary(decimal));



//        Converting binary to decimal:
//        String binary = "100011";
//        System.out.println(binary2decimal(binary));

//        Calculating Exponent:
//        int base = 4;
//        int exp = 5;
//        System.out.println(power(base,exp));

//         Calculating Exponent of 2:
//        int exp = 10;
//        System.out.println(power2(exp));


    }
}