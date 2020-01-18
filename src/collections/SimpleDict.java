package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleDict
{
    public static void main(String[] args) {
        Map<String, List<String>> dict=new HashMap<>();


        List<String> a=new ArrayList<>();
        a.add("Apple");
        a.add("Aeroplane");
        dict.put("a",a);

        List<String> b=new ArrayList<>();
        b.add("Bat");
        b.add("Banana");
        dict.put("B",b);

        List<String> c=new ArrayList<>();
        c.add("Car");
        c.add("Cat");
        dict.put("C",c);
        for(String key:dict.keySet()){
            System.out.println(key+":");
            System.out.println(dict.get(key));
        }

    }

}
