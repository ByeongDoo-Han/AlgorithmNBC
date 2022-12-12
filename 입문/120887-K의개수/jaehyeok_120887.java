// git commit -m "code: Solve programmers 120887 K의개수 (jaehyeok)"

public class jaehyeok_120887 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(3,10,2));
    }
}
class Solution {
    public int solution(int i, int j, int k) {
        int count = 0;
        int startValue;
        int endValue = j;
        String replaceValue = "" + k;2
        for (startValue = i; startValue < endValue + 1; startValue++) {
            String stringValue = "" + startValue;

            String minusValue = stringValue.replaceAll(replaceValue,"");

            count = count +(stringValue.length() -minusValue.length());

        }
        return count;
    }
}