class jieun_00123 {
    public int[] solution(int[] num_list) {
        int[] reverseArray = new int[num_list.length];
//        for (int i = num_list.length - 1; i >= 0; i--) {
//            for (int j = 0; j <= i; j++) {
//                reverseArray[i] = num_list[j];
//            }
//        }
        int index = num_list.length -1;
        for (int i = 0; i < reverseArray.length; i++) {
            reverseArray[index] = num_list[i];
            index -= 1;
        }
        return reverseArray;

    }
