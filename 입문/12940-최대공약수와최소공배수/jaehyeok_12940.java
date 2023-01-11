// git commit -m "code: Solve programmers 12940 최대공약수와최소공배수 (jaehyeok)"
class Solution {
    public int[] solution(int n, int m) {

        int[] answer = new int[2];

        int big = 0;
        int small = 0;

        if (n>m){
            big = n;
            small =m;
        }else{
            big = m;
            small = n;
        }

        //int max = 0;
        //최대공약수 구하기
        for(int i =1; i<big+1;i++) {
            if(big%i==0 && small%i==0){
                answer[0]=i;
            }
        }

        //최소 공배수 구하기
        answer[1]=n*m/answer[0];

        return answer;
    }

}