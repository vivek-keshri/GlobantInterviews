package designpatterns;

import java.util.HashMap;
import java.util.Map;

public final class ImmutableClass {

    private final String name;
    private final int roll_number;
    private final int age;
    private final Map<String, String> metadata;

    /**
     *
     * @param name
     * @param roll_number
     * @param age
     * @param metadata
     */
    public ImmutableClass(String name, int roll_number, int age, Map<String, String> metadata) {
        this.name = name;
        this.roll_number = roll_number;
        this.age = age;
        Map<String, String> tempMap = new HashMap<>();
        for (Map.Entry<String, String> entry :
                metadata.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        this.metadata = tempMap;
    }


    @Override
    public String toString() {
        return "ImmutableClass{" +
                "name='" + name + '\'' +
                ", roll_number=" + roll_number +
                ", age=" + age +
                ", metadata=" + metadata +
                '}';
    }

    public int getRoll_number() {
        return roll_number;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getMetadata() {
        Map<String, String> tempMap = new HashMap<>();
        for (Map.Entry<String, String> entry :
                this.metadata.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        return tempMap;
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "first");
        map.put("2", "second");
        ImmutableClass ic = new ImmutableClass("class1",111,21,map);
        //ic.name = "Class2";
        System.out.println(ic.getMetadata());

        // Uncommenting below line causes error
        // s.regNo = 102;

        map.put("3", "third");
        System.out.println(ic.getMetadata()); // Remains unchanged due to deep copy in constructor

        ic.getMetadata().put("4", "fourth");
        System.out.println(ic.getMetadata()); // Remains unchanged due to deep copy in getter
    }


}
