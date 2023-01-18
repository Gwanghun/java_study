package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals("Java"));

        System.out.println(s2.equals("python"));
        System.out.println(s2.equalsIgnoreCase("python"));  // 대소문자 구분 없이 문자열 내용이 같은지 여부를 체크

        // 심화
        s1 = "1234";    // 메모지 정보, "1234"가 메모리에 할당된 값을 참조함
        s2 = "1234";    // 위 아래 같은 메모리를 참조 함
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        s1 = new String("1234");    // 서로 다른 메모리에 저장된 값을 참조
        s2 = new String("1234");    // 서로 다른 메모리에 저장된 값을 참조
        System.out.println(s1.equals(s2));  // true
        System.out.println(s1 == s2);       // false, 서로 다른 메모리를
    }
}
