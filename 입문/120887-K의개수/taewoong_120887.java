// git commit -m "code: Solve programmers 120887 K의개수 (taewoong)"
class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for(; i<=j; i++){
            String str = String.valueOf(i);
            //초기값 위에 정해져 있어서 ; 처리, 문자열로 바꿈
            for(int ii=0; ii<str.length(); ii++){
                if(str.charAt(ii) -'0' == k){
                    //문자 1개씩 비교해야 하니 char타입으로 만들어주는 charAt 사용.
                    //char가 아스키코드이기 때문에 -'0'을 해줘야 동일한 결과값 됨
                    //ex)char(0) -> 48 char(1) -> 49 따라서 -'0'해주면 char(1) = 1
                    answer++;
                }
            }
        }
        return answer;
    }
}