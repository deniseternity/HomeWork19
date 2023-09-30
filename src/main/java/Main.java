import java.util.*;

public class Main {

    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> words = new ArrayList<>(List.of("one", "two", "one", "three", "four", "one", "five"));

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " " + "Value: " + entry.getValue());
        }

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + " " + "Value: " + entry.getValue());
        }

    }

    private static void task1(List<Integer> nums) {
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num + " ");
            }
        }

        System.out.println();
    }

    private static void task2(List<Integer> nums) {
        nums = new ArrayList<>(new HashSet<>(nums));
        Collections.sort(nums);

        for (int num : nums) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }

        System.out.println();
    }

    private static void task3(List<String> words) {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);

        System.out.println();
    }

    private static void task4(List<String> words) {
        Map<String, Integer> wordsMap = new HashMap<>();

        for (String word : words) {
            if (wordsMap.containsKey(word)) {
                wordsMap.put(word, wordsMap.get(word) + 1);
            } else {
                wordsMap.put(word, 1);
            }
        }

        System.out.println(wordsMap);
    }
}