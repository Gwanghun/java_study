package chap_05;

public class _01_array {
    public static void main(String[] args) {
        // 배열 : 같은 자료형의 값 여러개를 저정하는 연속된 공간
        String coffee1 = "coffee1";
        String coffee2 = "coffee2";
        String coffee3 = "coffee3";
        String coffee4 = "coffee4";

        // 배열로 변경
        // 선언 방법
        // 1
        /*String[] coffee_ary_1 = new String[4];
        coffee_ary_1[0] = coffee1;
        coffee_ary_1[1] = coffee2;
        coffee_ary_1[2] = coffee3;
        coffee_ary_1[3] = coffee4;

        System.out.println( coffee_ary_1 );*/
        // 2
//        String coffee_ary_2[] = new String[4];

        // 3
//        String[] coffee_ary_3 = new String[]{coffee1, coffee2, coffee3, coffee4};

        // 4
        String[] coffee_ary_4 = {coffee1, coffee2, coffee3, coffee4};
        System.out.println(coffee_ary_4[0]);
        System.out.println(coffee_ary_4[1]);
        coffee_ary_4[2] = "coffee5";
        System.out.println(coffee_ary_4[2]);
        System.out.println(coffee_ary_4[3]);


        // 다른 자료형의 배열
        int[] i = new int[3];
        double[] doubles = new double[3];


    }
}
