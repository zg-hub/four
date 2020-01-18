package collections;

import java.util.HashMap;

public class WordCounter {
//计数
    public static void main(String[] args) {
        Integer[] nums={10,8,25,32,68,68,10,68,28,2,2,32,68};
        HashMap<?,Integer> counts1=wordCount(nums);
        System.out.println(counts1);
        String str="Hi Hello Hello Hi Hi hi";
        String[] words=str.split(" ");
        HashMap<?,Integer> counts2=wordCount(words);
        System.out.println(counts2);
    }

    private static <T> HashMap<T,Integer> wordCount(T groups[]){
     HashMap<T,Integer> map=new HashMap<>();
     for(T key:groups){
         if(map.get(key)==null){map.put(key,1);

         }
         else{
             int value=(int) map.get(key)+1;
             map.put(key,value);
         }


     }
     return map;
    }
}
