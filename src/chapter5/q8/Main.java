package chapter5.q8;

import java.util.*;

public class Main {

    public static class Person {
        int id;
        int priority;

        public Person(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }
    }

    public static int solution(int n, int m, int[] list) {
        int result = 0;
        Queue<Person> queue = new LinkedList<>();
        for (int i = 0; i < list.length; i++) {
            queue.add(new Person(i, list[i]));
        }
        while (!queue.isEmpty()) {
            Person person = queue.poll();
            for (Person tmp : queue) {
                if (tmp.priority > person.priority) {
                    queue.offer(person);
                    person = null;
                    break;
                }
            }
            if (person != null) {
                result++;
                if (person.id == m) {
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = kb.nextInt();
        }
        System.out.println(solution(n, m, list));
    }
}