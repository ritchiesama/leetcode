

```java
//my solution
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int nlen = numbers.length;
        int l_pointer = 0;
        int r_pointer = nlen - 1;
        int[] res = new int[2];
        int sum = numbers[l_pointer] + numbers[r_pointer];
        while(sum != target){
            if( sum > target ){
                r_pointer--;
            }else{
                l_pointer++;
            }
            sum = numbers[l_pointer] + numbers[r_pointer];
        }
        res[0] = l_pointer + 1;
        res[1] = r_pointer + 1;
        return res;
    }
}
```
