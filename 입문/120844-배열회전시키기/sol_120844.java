// git commit -m "code: Solve programmers 120844 배열회전시키기 (sol)"

import java.util.*;
class Solution {
    public static ArrayDeque<Integer> solution(int[] numbers, String direction) {
//        int[] answer = new int[numbers.length];
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for(int x : numbers) {
            deque.add(x); //numbers 의 원소를 모두 deque 에 넣어줌
        }
        if (direction.equals("right")) {
            deque.addFirst(deque.removeLast());
        }
        else {
            deque.addLast(deque.removeFirst());
        }
//        if(direction.equals("right")) {
//            answer[0] = numbers[numbers.length-1];
//            for(int i = 1; i < numbers.length; i++) {
//                answer[i] = numbers[i - 1];
//            }
//        }
//        else {
//            answer[answer.length-1] = numbers[0];
//            for(int i = 0; i < answer.length-1; i++) {
//                answer[i] = numbers[i + 1];
//            }
//        }

//        return answer;
        return deque;
    }
}