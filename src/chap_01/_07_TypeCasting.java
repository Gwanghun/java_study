package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 정수형에서 실수형으로
        int score = 93;
        System.out.println(score);  // 93
        System.out.println((float) score);      // 93.0
        System.out.println((double) score);      // 93.0

        // 실수형에서 정수형으로
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println(score_f);
        System.out.println((int) score_f);  // 93
        System.out.println(score_d);
        System.out.println((int) score_d);  // 98

        score = 93 + (int) 98.8;    // 93 + 98
        System.out.println(score);


        // 숫자를 문자열로
        String s1 = String.valueOf(93);
        System.out.println(s1);
        s1 = Integer.toString(93);
        System.out.println(s1);

        String s2 = String.valueOf(98.8);
        System.out.println(s2);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        // 문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);
        double d = Double.parseDouble("98.8");
        System.out.println(d);

    }
}
