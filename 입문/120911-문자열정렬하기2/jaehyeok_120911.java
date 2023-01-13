// git commit -m "code: Solve programmers 120911 문자열정렬하기2 (jaehyeok)"

import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    public StringBuffer solution(String my_string) {
        StringBuffer answer = new StringBuffer();

        char[] new_my_string = my_string.toCharArray();

        ArrayList<Character> lowerList = new ArrayList<>();

        for (char c : new_my_string) {
            if(c<97){
                lowerList.add((char)(c+32));
            }else{
                lowerList.add(c);
            }
        }
        //소문자 변경완료

        lowerList.sort();//어레이리스트쓸때

        for (Character character : lowerList) {
            answer.append(character);
        }
        return answer;
    }
}