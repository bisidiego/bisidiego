import java.util.Scanner;

public class TestMax {
    private int minNum=1;
    private int maxNum=5;

//    public int getMinNum() {
//        return minNum;
//    }
//
//    public void setMinNum(int minNum) {
//        this.minNum = minNum;
//    }
//
//    public int getMaxNum() {
//        return maxNum;
//    }
//
//    public void setMaxNum(int maxNum) {
//        this.maxNum = maxNum;
//    }

    public TestMax() {

    }
    public TestMax(int minNum, int maxNum) {
        this.minNum = minNum;
        this.maxNum = maxNum;
    }

    public int inputNum(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = input.nextInt();

        return number;

    }

    public void displayNum(int userNum){
        if( userNum>this.minNum && userNum<this.maxNum){
            System.out.println("your new number is  : "+ (userNum+1));
        }
        else if(userNum<this.minNum){
            System.out.println( "your new number is : "+(this.minNum+2));
        }
        else if(userNum>this.maxNum){
            System.out.println("your new number is : "+(this.maxNum-3));
        }
        else if(userNum==this.maxNum || userNum==this.minNum){
            System.out.println("your new number is : "+(this.maxNum-3));
        }
        else{
            System.out.println("your new number is : "+ Math.min(userNum, this.maxNum));
        }


       // int max = Math.max();


    }

    public static void main(String[] args) {
        TestMax test = new TestMax();

       int  num = test.inputNum();
        test.displayNum(num);


    }
}
