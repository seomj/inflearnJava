package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
//        StringTokenizer tokens = new StringTokenizer(text);
//
//        Map<String, Integer> map = new HashMap<>();
//        while (tokens.hasMoreTokens()){
//            String string = tokens.nextToken();
//
//            if (map.containsKey(string)){
//                map.put(string, map.get(string)+1);
//            } else {
//                map.put(string, 1);
//            }
//        }
//
//        System.out.println(map);

        Map<String, Integer> map = new HashMap<>();
        String[] words = text.split(" ");
//        for (String word : words) {
//            Integer cnt = map.get(word);
//            if (cnt == null){
//                cnt = 0;
//            }
//            cnt++;
//            map.put(word, cnt);
//        }
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
    }
}
