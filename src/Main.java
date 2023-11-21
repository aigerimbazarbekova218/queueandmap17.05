import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main  {
    public static void main(String[] args) {

       /* Map<String,Integer> map=new TreeMap<>();
        map.put("Dilnaz", 12);
        map.put("Aidai" , 12);
        map.put("Nuri", 12);
        map.put("Nelya", 13);
        map.put("Aigerim", 18);
        System.out.println(map);

        for (Map.Entry<String,Integer> i:map.entrySet()){
            System.out.println(i.getKey());
            System.out.println(i.setValue(6));

        }
        System.out.println("-----------------------------------------");
        System.out.println(map);*/


        Map<User,Integer> map=new TreeMap<>();
        map.put( new User("Aigerim"),4);
        map.put( new User("Meerim"),2);
        map.put( new User("Aidai"),3);
        map.put( new User("Dilnaz"),1);

        System.out.println(map);
        try {
            if (map.isEmpty()) {
                throw new MyException();
            }
        }catch (MyException e){
            e.printStackTrace();
            }


        for (Map.Entry<User,Integer>i:map.entrySet()){
            System.out.println(i.getValue());
            System.out.println(i.getKey());
        }


    }
}