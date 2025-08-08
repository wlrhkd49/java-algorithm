package chapter9.q1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static class Person implements Comparable<Person> {
        int weight, height;

        public Person(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }

        @Override
        public int compareTo(Person o) {
            return o.height-this.height;
        }
    }

    public static int solution(Person[] people) {
        int answer = 0;
        Arrays.sort(people);
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < people.length; i++) {
            if(people[i].weight > max) {
                answer++;
                max = people[i].weight;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        Person[] people = new Person[n];
        for (int i = 0; i < n; i++) {
            int weight = kb.nextInt();
            int height = kb.nextInt();
            people[i] = new Person(weight, height);
        }
        System.out.println(solution(people));
    }
}