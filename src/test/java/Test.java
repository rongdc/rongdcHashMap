import com.util.MyHashMap;

public class Test {

    public static void main(String[] args) {
        MyHashMap<String, String> myHashMap = new MyHashMap<String, String>();
        for (int i = 0; i < 500; i++) {
            myHashMap.put("key" + i, "value" + i);
        }
        for (int i = 0; i <500 ; i++) {
            System.out.println("key"+i+",value is:"+myHashMap.get("key"+i));
        }
    }
}
