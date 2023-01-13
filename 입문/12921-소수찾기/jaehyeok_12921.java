// git commit -m "code: Solve programmers 12921 소수찾기 (jaehyeok)"

class Solution {
    public int solution(int n) {
        int count = 0;

        int[] sosuNumber = new int[n+1]; //[0,0,,,,,,,,,,,0] //인덱스로 소수찾다고 했는데

        for (int i =2 ; i<sosuNumber.length;i++) {
            if(sosuNumber[i]==0){
                count++;
                for(int j = i ; j<sosuNumber.length;j+=i ){//[2,4,6,8....]
                    sosuNumber[j]=-1;
                }  //에레채 !
            }
        }
        return count;
    }

}