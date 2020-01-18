package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class BasicMap {
    public static void main(String[] args) {
        Map<String,String> data=new HashMap<>();
        data.put("B","B");
        data.put("D",null);
        data.put(null,"C");
        data.put("A","A");
        data.put("D","D");

        System.out.println(data);

        String value =data.get(null);
        System.out.println("key=null,value="+value);

        value=data.get("M");
        System.out.println("key=M,value="+value);

        value =data.getOrDefault("L","defalut");
        System.out.println("key=L,value="+value);



        boolean keyExists=data.containsKey(null);
        boolean valueExists=data.containsValue(null);
        System.out.println(keyExists+" "+valueExists);


        System.out.println("data map size is"+data.size());


        Set<Entry<String,String>> entrySet=data.entrySet();
        System.out.println(entrySet);


        Set<String> keySet=data.keySet();
        System.out.println("data keys:"+keySet);


        Collection<String> values=data.values();
        System.out.println("data values:"+values);
        data.clear();
        System.out.println("data map is empty="+data.isEmpty());
    }
}
