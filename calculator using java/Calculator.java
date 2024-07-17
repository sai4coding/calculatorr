import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter value num1:");
        double num1=sc.nextDouble();
        System.out.print("enter value of num2:");
        double num2=sc.nextDouble();
        System.out.println("enter operation to perform (+,-,*,%):");
        char operator =sc.next().charAt(0);

        double result=0;
        switch(operator){
            case '+':
             result=   num1+num2;
             System.out.println(result);
             break;
            case '-':
                result=num1-num2;
                System.out.print(result);
                break;
            case '*':
                result=num1*num2;
                System.out.print(result);
                break;
            case '/' :
                result=num1/num2;
                System.out.print(result);
                break;
            case '%':
                result=num1%num2;
                System.out.print(result);
                break;
            default:
                System.out.print("enter the valid operation");
        }
        int res=(int)  result;
        System.out.println("result is converted into int:"+res);







    }
}
