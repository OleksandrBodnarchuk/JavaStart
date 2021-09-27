package pl.alex.javaStart.lessons.lambda_functional.Practice.HOME;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class WithLambda {
    public static void main(String[] args) {
        List<Animal> animals = getAnimals();

        // Filter
        List<Animal> predators = animals.stream()
                .filter(animal -> animal.getClassification()
                        .equals(Classification.PREDATOR))
                .collect(Collectors.toList());
        //predators.forEach(System.out::println);

        // Sort
        List<Animal> sorted = animals.stream()
                .sorted(Comparator.comparing(Animal::getAge)
                        .thenComparing(Animal::getClassification)
                        .reversed())
                .collect(Collectors.toList());

        // sorted.forEach(System.out::println);

        // All match
        boolean allMatch = animals.stream()
                .allMatch(animal -> animal.getAge() > 10);
//        System.out.println(allMatch);

        // Any match
        boolean anyMatch = animals.stream()
                .anyMatch(animal -> animal.getAge() > 10);
//        System.out.println(anyMatch);

        // None match
        boolean noneMatch = animals.stream()
                .noneMatch(animal -> animal.getAge() == 34);
//        System.out.println(noneMatch);
        // Max
//        animals.stream()
//                .max(Comparator.comparing(Animal::getAge))
//                .ifPresent(System.out::println);
        // Min
//        animals.stream()
//                .min(Comparator.comparing(Animal::getAge))
//                .ifPresent(System.out::println);
        // Group
        Map<Classification, List<Animal>> collect = animals.stream()
                .collect(Collectors.groupingBy(Animal::getClassification));

//        collect.forEach(((classification, animals1) -> {
//            System.out.println(classification);
//            animals1.forEach(System.out::println);
//            System.out.println();
//        }));

        Optional<String> oldestPredatorAnimal = animals.stream()
                .filter(animal -> animal.getClassification().equals(Classification.PREDATOR))
                .max(Comparator.comparing(Animal::getAge))
                .map(Animal::getName);

        oldestPredatorAnimal.ifPresent(System.out::println);


    }

    private static List<Animal> getAnimals() {
        return List.of(
                new Animal("Koala", 20, Classification.HERBIVORE),
                new Animal("Tiger", 15, Classification.PREDATOR),
                new Animal("Gorilla", 25, Classification.OMNIVOROUS),
                new Animal("Monkey", 22, Classification.OMNIVOROUS),
                new Animal("Shark", 4, Classification.PREDATOR),
                new Animal("Horse", 12, Classification.HERBIVORE),
                new Animal("Wolf", 33, Classification.PREDATOR),
                new Animal("Elephant", 40, Classification.HERBIVORE),
                new Animal("Dinosaur", 200, Classification.PREDATOR)
        );
    }


}
