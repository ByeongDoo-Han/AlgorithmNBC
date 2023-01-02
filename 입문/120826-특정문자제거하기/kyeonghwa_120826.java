class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        String[] list = my_string.split("");
        for(int i = 0; i < list.length; i++) {
            if(!letter.equals(list[i])) {
                answer += list[i];
            }
        }
        return answer;
    }
}