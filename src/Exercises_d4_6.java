public class Exercises_d4_6 {
    static class Integer2{
        int num;
        int getValue(){
            return num;
        }

        int setValue(int num){
            this.num = num;
            return num;
        }

        boolean isEven(){
            if (this.num % 2 == 0){
                return true;
            } else {
                return false;
            }
        }

        boolean isOdd(){
            return !this.isEven();
        }

        void prettyPrint(){
            System.out.println(num);
        }

        public String toString(){ // overrides existing toString method in java's default Object class
            String number = "";
            number += num;
            return number;
        }
    }


    public static void main(String[] args){
        Integer2 i2 = new Integer2();
        System.out.print("Enter a number: ");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int i = scan.nextInt();
        i2.setValue(i);
        System.out.print("The number you entered is ");
        if (i2.isEven()){
            System.out.println("even.");
        } else if (i2.isOdd()) {
            System.out.println("odd.");
        } else {
            System.out.println("undefined!! Your code is buggy!");
        }
        int parsedInt = Integer.parseInt(i2.toString());
        if (parsedInt == i2.getValue()) {
            System.out.println("Your toString() method seems to work fine.");
        }

    }
}
