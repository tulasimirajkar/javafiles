package corejava;

import java.util.Scanner;

class program {
    public static void main(String[] args) {
        Mobile mobileObj = new Mobile();
        mobileObj.model = "M101";
        mobileObj.Dial();
        mobileObj.Recieve();
        int output = mobileObj.GetImeNumber(101);
        System.out.print(output);
        // product p = new product();
        // p.AddProduct();
        // p.DeleteProduct();
        // String result = p.GetProductName();
        // System.out.print(result);
        // Scanner s = new Scanner(System.in);
        // System.out.print("Enter number: ");
        // boolean a = s.nextBoolean();
        // System.out.println("You entered number: " + a);
        // for (int i = 0; i < 5; i++) {
        // System.out.print(i);
        // }
    }
}


