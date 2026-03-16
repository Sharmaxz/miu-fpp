package lesson11;

import java.util.*;
import java.util.Map.Entry;

public class HashCollection {
    int ct=0;
    public static void main(String[] args) {
        HashCollection hc = new HashCollection();

        //Map<String,Course> table = new Hashtable<>();
        // Hashtable<String, Course> table = new Hashtable<>();
        Hashtable<String, Course> table = new Hashtable<>();
        table.put("CS390", new Course("CS390", "FPP"));
        table.put("CS401", new Course("CS401", "MPP"));
        table.put("CS472", new Course("CS472", "Algorithms"));
        table.put("CS475", new Course("CS475", "Android"));
        table.put("CS572", new Course("CS572", "Advanced Algorithms"));

        // How to process the Map collection
        System.out.println("1. Key Set Approach");

        Set<String> keySet = table.keySet();
        for(String key : keySet) {
            Course course = table.get(key);

            if(course.getCname().startsWith("A")) {
                System.out.println(course);
            }
        }

        System.out.println("\n2. Iterator Approach");

        Iterator<String> it = table.keySet().iterator();
        while(it.hasNext()) {
            String key = it.next();
            Course course = table.get(key);

            if(course.getCname().startsWith("A")) {
                System.out.println(course);
            }
        }

        System.out.println("\n3. Entry Approach (Keys and Values)");
        Set<Entry<String, Course>> entrySet = table.entrySet();
        for(Entry<String, Course> entry : entrySet) {
            String key = entry.getKey();
            Course course = entry.getValue();
            if(course.getCname().startsWith("A")) {
                System.out.println(course);
            }
        }

        System.out.println("\n4. Only Accessing Values not depends on Key");
        Collection<Course> values = table.values(); // Return type is Collection
        for(Course course : values) {
            System.out.println(course);
            if(course.getCname().startsWith("A")) {
                System.out.println(course);
            }
        }

        System.out.println("\n5. Using Lambda");
        table.forEach((key, value) -> {
            if(value.getCname().startsWith("A")) {
                System.out.println(value);
            }
        });


        System.out.println("\n6. Enumaration only for Hashtable");
        Enumeration<Course> enu = table.elements();
        while(enu.hasMoreElements()) {
            Course course = enu.nextElement();
            if(course.getCname().startsWith("A")) {
                System.out.println(course);
            }
        }

        System.out.println("\nSorted Courses by reversed order:");
        List<Course> res = getCourseSorted(table);
        res.forEach(x -> System.out.println(x));

        System.out.println("\nSorted Courses by natural order:");
        List<Course> res1 = getCourseIds(table);
        res1.forEach(x -> System.out.println(x));
    }

    // Reserved sorted order by name
    public static List<Course> getCourseSorted(Hashtable<String, Course> ht) {
        List<Course> list = new ArrayList<>();
        ht.forEach((key, value) -> list.add(value));
        Collections.sort(list, (c1, c2) -> c2.getCname().compareTo(c1.getCname()));
        return list;
    }

    // Natural order by Id
    public static List<Course> getCourseIds(Hashtable<String, Course> ht) {
        List<Course> list = new ArrayList<>(ht.values());
        list.sort(Comparator.comparing(Course::getCid));
        return list;
    }
}
