package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapCompute
{
    public static void main(String[] args) {
        Map<String,String> data;
        data = new HashMap<>();
        data.put("1","1");
        data.put("2","2");
        data.put("null","0");
        data.put("10","null");
        System.out.println("map before compute="+data);

        for(String key:data.keySet()){
            data.compute(key,(k,v)->k+v);//字符串相加，如连接
        }

        System.out.println("map after first compute="+data);

        for(Entry entry:data.entrySet()){
            data.put((String)entry.getKey(),(String)entry.getKey()+(String)entry.getValue());
        }
        System.out.println("map after second compute="+data);

        data.compute("null",(k,v)->k+v+v+v+v);
        data.compute(null,(k,v)->k+v+v+v+v);
        System.out.println("map last compute="+data);
    }
}
