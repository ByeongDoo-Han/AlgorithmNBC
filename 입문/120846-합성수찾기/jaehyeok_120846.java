// git commit -m "code: Solve programmers 120846 합성수찾기 (jaehyeok)"

class Solution {
    public int solution(int n) {
        int count = 0;

        for(int i =1; i<ints.length ;i++){

            if(ints[i]==0){   //여기서 합성수 로직을 걸어주면 참 좋겠는데 ;;; 추가로 4보다 작으면 바로 컷
                if(합성수(i)) {
                    count++;
                   /* for (int j = i; j < ints.length; j = j + i) {
                        ints[j] = 1;
                    }*/
                }
            }
        }

        return count;
    }
    public boolean 합성수 (int i){
        int count =0;
        for(int j =1;j<i+1;j++){
            if(i%j==0){
                count++;
            }
        }
        return count >= 3;
    }

}