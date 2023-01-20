package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        String coffee1 = "coffee1";
        String coffee2 = "coffee2";
        String coffee3 = "coffee3";
        String coffee4 = "coffee4";

        String[] coffee_ary = {coffee1, coffee2, coffee3, coffee4};
        for (int i = 0; i < coffee_ary.length; i++) {
            System.out.println(coffee_ary[i]);
        }

        // enhanced for (for-each) 반복문
        for (String coffee : coffee_ary) {
            System.out.println(coffee);
        }
    }
}
