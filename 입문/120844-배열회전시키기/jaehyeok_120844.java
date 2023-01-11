// git commit -m "code: Solve programmers 120844 배열회전시키기 (jaehyeok)"

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] newNums =new int[numbers.length];

        if(direction.equals("right")){
            for(int i =1; i<numbers.length;i++){
                newNums[i]=numbers[i-1];
            }
            newNums[0]=numbers[numbers.length-1];
        }else{
            for(int i=0;i<numbers.length-1;i++){
                newNums[i]=numbers[i+1];
            }
            newNums[numbers.length-1]=numbers[0];
        }


        return newNums;
    }
}