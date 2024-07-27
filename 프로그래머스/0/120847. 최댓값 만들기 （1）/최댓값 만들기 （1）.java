class Solution {
    public int solution(int[] numbers) {
        
        //1
        int x = 0;
        int index = 0;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] > x) {
                x = numbers[i];
                index = i;
            }
        }
        
        
        //2
        int y = 0;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] > y && i != index) {
                y = numbers[i];
            }
        }
        return x * y;
    }
}