package com.jasper.collect;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Map<String, Object>> listOfMaps = new ArrayList<>();

        // 添加一些示例数据
        Map<String, Object> map1 = new HashMap<>();
        map1.put("field1", 5);
        map1.put("field2", "apple");
        listOfMaps.add(map1);

        Map<String, Object> map2 = new HashMap<>();
        map2.put("field1", 3);
        map2.put("field2", "orange");
        listOfMaps.add(map2);

        Map<String, Object> map3 = new HashMap<>();
        map3.put("field1", 7);
        map3.put("field2", "banana");
        listOfMaps.add(map3);

        Map<String, Object> map4 = new HashMap<>();
        map4.put("field1", 7);
        map4.put("field2", "aaa");
        listOfMaps.add(map4);

//        Map<String, Object> map4 = new HashMap<>();
//        map3.put("field1", 7);
//        map3.put("field2", "aaa");
//        listOfMaps.add(map4);
//
//        // 根据字段1升序，字段2降序排序
//        Collections.sort(listOfMaps, Comparator
//                .comparingInt(map -> (int) map.get("field1"))
//                .thenComparing(Comparator.comparing(map -> (String) map.get("field2")).reversed()));

        listOfMaps.sort(new Comparator<Map<String, Object>>() {
            @Override
            public int compare(Map<String, Object> map1, Map<String, Object> map2) {
                int field1Comparison = Integer.compare((int) map1.get("field1"), (int) map2.get("field1"));
                if (field1Comparison != 0) {
                    return field1Comparison;
                }
                // 如果field1相等，使用field2降序排序
                return ((String) map1.get("field2")).compareTo((String) map2.get("field2"));
            }
        });


        // 打印排序后的结果
        for (Map<String, Object> map : listOfMaps) {
            System.out.println(map);
        }
    }
}
