package chap_04;

public class _06_While {
    public static void main(String[] args) {
        // 반복문 while
        int distance = 25;
        int move = 0;
        while( move < distance ){
            System.out.println(move);
            move += 3;
        }
    }
}
