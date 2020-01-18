package collections;

import java.util.HashMap;

public class map1 {
    public static int[] sumTwo(int[] nums, int target) {
        int len = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < len; i++) {
            final Integer value = map.get(nums[i]);
            if(value != null) {
                return new int[] { value, i};
            }
            map.put(target - nums[i], i);
        }
        return null;
    }
    public static  void main(String[] args){
        int []a=new int[]{1,2,3,4,5};
          int r[]=sumTwo(a,9);
          for(int i:r){
              System.out.println(i);
          }
    }
}
