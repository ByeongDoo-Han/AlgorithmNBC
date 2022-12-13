
// git commit -m "code: Solve programmers 120907 OX퀴즈 (byeongdoo)"
import java.util.*;

class OxQuiz2 {
    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        String[] a = {};
        List<String> newList = new ArrayList<>(Arrays.asList(a));
        for (int i = 0; i < quiz.length; i++) {
            String[] string = quiz[i].split(" ");
            String firstNum = string[0];
            String m = string[1];
            String secondNum = string[2];
            String result = string[4];
            Integer f = Integer.parseInt(firstNum);
            Integer s = Integer.parseInt(secondNum);
            Integer r = Integer.parseInt(result);
            if (m.equals("-")) {
                if ((f - s) == r) {
                    newList.add("O");
                } else {
                    newList.add("X");
                }
            } else if (m.equals("+")) {
                if ((f + s) == r) {
                    newList.add("O");
                } else {
                    newList.add("X");
                }
            }
        }
        String[] n = newList.toArray(new String[a.length]);
        return n;
    }
}