class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] list = my_string.split("");
        for(int i=0; i<my_string.length(); i++){
            answer += list[i].repeat(n); //반복은 repeat()
        }
        return answer;
    }
}