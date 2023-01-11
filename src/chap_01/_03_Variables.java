package chap_01;

public class _03_Variables {
    public static void main(String[] args) {

        String name = "임광훈";    // 문자형
        int hour = 15;  // 정수형

        System.out.println(name + "님, 배송이 시작 됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료 되었습니다.");

        double score = 90.5;    // 실수형
        char grace = 'A';       // 작은 문자형
        name = "강백호";       // 변수 값을 update

        System.out.println(name + "님, 평군 점수는 " + score + " 점 입니다.");
        System.out.println(name + "님, 학점은 " + grace + " 입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격 했을가요? " + pass);

        float f = 3.14F;    // F 를 적적어줘야 float 형 사용 가능

        long l = 1_000_000_000_000L;    // L 를 적어줘야 한다
        System.out.println(l);

    }
}
