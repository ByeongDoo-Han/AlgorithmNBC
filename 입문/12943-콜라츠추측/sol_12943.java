// git commit -m "code: Solve programmers 12943 콜라츠추측 (sol)"

public class Collatz { //프로그래머스 연습문제 <콜라츠 추측>
    // https://school.programmers.co.kr/learn/courses/30/lessons/12943
    static int count = 0;
    public static int collatz(long n) {
        if(n%2 == 0) {
            collatz(n/2);
            count++;
        }
        else if(n == 1) {
            return count;
        }
        else if(n%2 == 1) {
            collatz(n*3 + 1);
            count++;
        }

        return count;
    }

    public static int solution(long num) {
        if(num == 1) {
            return count;
        }
        else {
            collatz(num);
            if (count >= 500)
                return -1;
            else
                return count;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(626331));
    }
}