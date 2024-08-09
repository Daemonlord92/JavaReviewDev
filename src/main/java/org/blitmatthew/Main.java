package org.blitmatthew;

import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
//        People person1 = new People("Sayeed", 24);
//        System.out.println(People.getCount());
//        People person2 = new People("Joesph", 33);
//        System.out.println(People.getCount());
//        People person3 = new People("Nazi", 34);
//        System.out.println(People.getCount());
        //Loops

//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//
//        int[] nums = {1,2,3,4,5,6,7,8,9};
//
//        for(int i : nums) {
//            System.out.println(i);
//        }

//        List<PlayingCard> cards = List.of(
//                new PlayingCard("Diamond", "K"),
//                new PlayingCard("Diamond", "Q"),
//                new PlayingCard("Diamond", "J"),
//                new PlayingCard("Spade", "K"),
//                new PlayingCard("Spade", "Q"),
//                new PlayingCard("Spade", "J"),
//                new PlayingCard("Clubs", "K"),
//                new PlayingCard("Clubs", "Q"),
//                new PlayingCard("Clubs", "J"),
//                new PlayingCard("Hearts", "K"),
//                new PlayingCard("Hearts", "Q"),
//                new PlayingCard("Hearts", "J")
//        );
//
//        for (int i = 0; i < cards.size(); i++) {
//            System.out.println(cards.get(i).getSuit() + " " + cards.get(i).getType());
//        }
//
//        for (PlayingCard card : cards) {
//            if(card.getSuit().equals("Diamond")){
//                System.out.println(card);
////            }
////        }
////
////        cards.stream().filter(x -> x.getSuit().equals("Diamond")).forEach(System.out::println);
////
////        cards = null;
//
//        Boolean isRunning = true;
//        Integer milesRan = 0;
//        //
//        while(isRunning) {
//            if(milesRan < 5) {
//                milesRan++;
//                System.out.println("Running");
//            } else {
//                isRunning = false;
//                System.out.println("Gasping for Air");
//            }
//
//        }
//
//        Boolean isCashLight = false;
//        Integer cash = 100;
//        //Will run the code once regardless of the condition
//        do {
//            if(cash<10){
//                isCashLight = true;
//                System.out.println("Gah, Im a broke boy");
//            } else {
//                System.out.println("I'm rich I'm Rich");
//            }
//        } while (isCashLight == false);

        //Collections
        //List
//        List<Integer> nums;
//
//        nums = new LinkedList<>();
//
//        int[] num = new int[5];

        //Set
//        Set<String> names = new LinkedHashSet<>();
//        names.add("Bruce");
//        names.add("Sayeed");
//        names.add("Bhavani");
//        names.add("Sayeed");
//
//        names.stream().forEach(System.out::println);
//
//        names.stream().filter(x -> x.startsWith("B")).forEach(System.out::println);
//
//        Set<Integer> numSet = new HashSet<>();
//        numSet.addAll(List.of(
//                1, 2, 3, 5, 6, 7, 9, 10, 13, 15, 20, 25, 30, 40, 55
//        ));
//
//        for (Integer integer : numSet) {
//            if(integer >= 20 && integer < 30) {
//                System.out.println(integer);
//            }
//        }
//
//        numSet.stream().filter(x -> x >= 20)
//                .filter(x -> x < 30)
//                .forEach(System.out::println);
        //Stack

//        Stack<String> animals = new Stack<>();
//
//        animals.push("Dog");
//        animals.push("Cat");
//        animals.push("Hamster");
//        animals.push("Blue Ring Octopus");
//
//        for (String animal : animals) {
//            System.out.println(animal);
//        }
//
//        animals.pop();
//
//        for (String animal : animals) {
//            System.out.println(animal);
//        }
//
//        animals.remove("Dog");
//
//        for (String animal : animals) {
//            System.out.println(animal);
//        }
//
//        String top = animals.peek();
//        System.out.println(top);

        //ArrayDeque

        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
//        arrayDeque.addFirst("Aboubieda");
//        arrayDeque.addFirst("Syed");
//        arrayDeque.addLast("Joesph");
//        arrayDeque.addLast("Nazi");
//        arrayDeque.addFirst("Amir");
//
//        arrayDeque.forEach(System.out::println);
//        System.out.println();
//
//        arrayDeque.removeFirst();
//        arrayDeque.removeLast();
//        arrayDeque.forEach(System.out::println);
//
//        System.out.println(arrayDeque.getFirst());
//        System.out.println(arrayDeque.getLast());
//        arrayDeque.addFirst("Nazi");
//        System.out.println();
//        arrayDeque.forEach(System.out::println);
//
//        Iterator<String> iterator = arrayDeque.iterator();
//
////        while (iterator.hasNext()){
////            if(iterator.equals("Syed")){
////                System.out.println(iterator.next());
////            }
////        }
//
//        for (String s : arrayDeque) {
//            if(s.equalsIgnoreCase("syed")){
//                System.out.println(s);
//            }
//        }

        //Functional Interface


//        Predicate<Integer> isEven = (number -> number % 2 == 0 );
//        System.out.println(isEven.test(9));
//        System.out.println();
//        System.out.println(isEven.test(4));
//
//        BiPredicate<String, String> isSame = (String::equalsIgnoreCase);
//
//        System.out.println(isSame.test("Hello", "hElLo"));
//
//

//        Function<Double, String> convertToString = (Object::toString);
//
//        System.out.println(convertToString.apply(4.5).getClass());
//
//        Function<String, Animal> animalFactory = (x -> {
//            if(x.equalsIgnoreCase("dog")){
//                return new Dog();
//            } else if (x.equalsIgnoreCase("cat")) {
//                return new Cat();
//            }
//            return null;
//        });
//
//        Animal animal1 = animalFactory.apply("Dog");
//
//        animal1.speak();

//        Consumer<PlayingCard> changePlayingCard = (x -> x.setSuit("Clubs"));
//
//        PlayingCard heartsNine = new PlayingCard("Hearts", "9");
//
//        System.out.println(heartsNine);
//
//        System.out.println();
//        changePlayingCard.accept(heartsNine);
//        System.out.println(heartsNine);
//
//        Integer capacity = 15;
//
//        Consumer<List<Integer>> fillArrayList = (x -> {
//            for (int i = 0; i < capacity; i++) {
//                x.add(new Random().nextInt(50));
//            }
//        });
//
//        List<Integer> emptyList = new ArrayList<>(capacity);
//
//        System.out.println(emptyList);
//
//        System.out.println();
//        fillArrayList.accept(emptyList);
//        System.out.println(emptyList);

//        Supplier<Float> randomFloat = (() -> new Random().nextFloat(100));
//
//        System.out.println(randomFloat.get());
//        System.out.println(randomFloat.get());
//        System.out.println(randomFloat.get());
//        System.out.println(randomFloat.get());
//        System.out.println(randomFloat.get());

//        TriFunction<Integer, Integer, Integer, Integer> sum = ((x,y,z) -> x+y+z);
//
//        System.out.println(sum.apply(5, 6, 1));

//        Map<String, Object> map = new LinkedHashMap<>();
//
//
//        map.put("Us", 1);
//        map.put("Jp", 81);
//        map.put("Afgan", 93);
//        map.put("Morocco", 212);
//        map.put("Poland", 48);
//        map.put("Peru", 51);
//        map.put(null, null);
//        map.put(null, "Hell of a place");
//        System.out.println(map);
//
//        map.put("us", 2);
//        System.out.println(
//        );
//        System.out.println(map);
        String name = "Bhavani";

        System.out.println(removeVowels(name));
    }

    public static String removeVowels(String string){
        String vowel = "AEIOUaeiou";
        char[] stringArr = string.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stringArr.length; i++) {
            if(vowel.indexOf(stringArr[i]) == -1){
                sb.append(stringArr[i]);
            }
        }

        return sb.toString();
    }
}