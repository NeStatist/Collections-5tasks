package com.company;

import com.company.task1.ListVsArray;
import com.company.task2.InsertAndRemove;
import com.company.task3.NameSurnameId;
import com.company.task3.NameSurnameId.User;
import com.company.task4.HashMapValue;
import com.company.task5.MapKeyValue;

import java.util.*;

import static com.company.task5.MapKeyValue.sortHashMapByValue;

public class Main {

    public static void main(String[] args) {
        InsertAndRemove insertAndRemove = new InsertAndRemove();
        ListVsArray listVsArray = new ListVsArray();
        HashMapValue hashMapValue = new HashMapValue();
        MapKeyValue mapKeyValue = new MapKeyValue();



        List<User> users = new ArrayList<User>(Arrays.asList(
                new User("Agatha ", "MacDonald"),
                new User("Albert ", "O’Connor"),
                new User("Adam ", "Gordon"),
                new User("Amanda ", "Brian"),
                new User("Alexander", "Chester"),
                new User("Andrew ", "Grant"),
                new User("Anna ", "Ross"),
                new User("Allan ", "Butler")));

        HashSet<User> hashSet = new HashSet<>(users);
        LinkedHashSet<User> linkedHashSet = new LinkedHashSet<>(users);

        NameSurnameId.UserComparator comparator = new NameSurnameId.UserComparator();
        TreeSet<User> treeSet = new TreeSet<User>(comparator);
        treeSet.addAll(users);

        System.out.println("HashSet");
        System.out.println(hashSet);

        System.out.println("\nLinkedHashSet");
        System.out.println(linkedHashSet);

        System.out.println("\nTreeSet");
        System.out.println(treeSet);
        {

            HashMap<MapKeyValue.MapKey, MapKeyValue.MapValue> map = new HashMap<>();
            map.put(new MapKeyValue.MapKey("Audi"), new MapKeyValue.MapValue(250));
            map.put(new MapKeyValue.MapKey("BMW"), new MapKeyValue.MapValue(300));
            map.put(new MapKeyValue.MapKey("Lexus"), new MapKeyValue.MapValue(279));
            map.put(new MapKeyValue.MapKey("Ford"), new MapKeyValue.MapValue(245));
            map.put(new MapKeyValue.MapKey("Jeep"), new MapKeyValue.MapValue(550));
            map.put(new MapKeyValue.MapKey("Toyota"), new MapKeyValue.MapValue(267));
            map.put(new MapKeyValue.MapKey("Honda"), new MapKeyValue.MapValue(201));
            map.put(new MapKeyValue.MapKey("Mazda"), new MapKeyValue.MapValue(121));
            map.put(new MapKeyValue.MapKey("Shkoda"), new MapKeyValue.MapValue(112));
            map.put(new MapKeyValue.MapKey("Mersedes-Benz"), new MapKeyValue.MapValue(278));
            map.put(new MapKeyValue.MapKey("Hyunday"), new MapKeyValue.MapValue(99));
            map.put(new MapKeyValue.MapKey("Acura"), new MapKeyValue.MapValue(279));
            map.put(new MapKeyValue.MapKey("Mazeratti"), new MapKeyValue.MapValue(179));
            map.put(new MapKeyValue.MapKey("Nissan"), new MapKeyValue.MapValue(121));
            map.put(new MapKeyValue.MapKey("Tesla"), new MapKeyValue.MapValue(701));
            System.out.println("-----------------------------------------------------------------------");
            System.out.println(sortHashMapByValue(map));
        }
        }


}

