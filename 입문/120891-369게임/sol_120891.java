// git commit -m "code: Solve programmers 120891 369게임 (sol)"
class Solution {
    public int solution(int order) {
        int answer = 0;
        String tmp = String.valueOf(order);
        //String tmp = ""+order;
        for(int i = 0; i < tmp.length(); i++) {
            if(tmp.charAt(i) == '3')
                answer++;
            else if(tmp.charAt(i) == '6')
                answer++;
            else if(tmp.charAt(i) == '9')
                answer++;
        }

        return answer;
    }
}