// git commit -m "code: Solve programmers 120884 치킨쿠폰 (taewoong)"

class Solution {
    public int solution(int chicken) {

        int restCoupon = 0;
        int serviceChiken = 0;
        while(chicken>=10){
            serviceChiken += chicken / 10;  //몫은 서비스치킨
            restCoupon = (chicken % 10);      //나머지는 나머지 쿠폰
            chicken = (chicken/10)+restCoupon; // 조건이 되는 갯수는 다시 몫+나머지
        }
        return serviceChiken;
    }
}