// git commit -m "code: Solve programmers 12915 문자열마음대로정렬 (jaehyeok)"
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;

class Solution {

    public Set<String> solution(String[] strings, int n) {

        ArrayList<String> oneStringList = new ArrayList<>();
        ArrayList<String> originStrings = new ArrayList<>();

        for (String string : strings) {
            originStrings.add(string);
            char[] chars = string.toCharArray();
            char compareChar =chars[n];
            String stringAddData =String.valueOf(compareChar);
            oneStringList.add(stringAddData);
        }

        oneStringList.sort(Comparator.naturalOrder());
        originStrings.sort(Comparator.naturalOrder());

        Set<String> noRepeatAnswer = new LinkedHashSet<>();

        for (String s : oneStringList) {
            for (String originString : originStrings) {
                String compareString = String.valueOf(originString.charAt(n));
                if(s.equals(compareString)){
                    noRepeatAnswer.add(originString);
                }
            }
        }
        return noRepeatAnswer;
    }
}