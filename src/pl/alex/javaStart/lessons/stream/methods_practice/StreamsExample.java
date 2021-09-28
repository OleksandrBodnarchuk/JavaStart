package pl.alex.javaStart.lessons.stream.methods_practice;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsExample {
    static List<Employee> employees = createList();

    public static void main(String[] args) {
        printAll();
        printLine();
        mapOperation();
        printLine();
        flatMapOperation();
        printLine();
        filterOperation("C");
        printLine();
        sortedOperation();
        printLine();
        limitOperation();
        printLine();
        skipOperation();
        printLine();
        countOperation("B");
        printLine();
        minMaxOperation();
        printLine();
        findAnyFirstOperation();
        printLine();
        matchOperation();
        printLine();
        reduceOption();
        printLine();
        takeWhileOperation();
        printLine();
        dropWhileOperation();
        printLine();
        forEachOrderedOperation();
        printLine();
        peekOperation();
        System.out.println(employees); // changed as well

    }


    // 1. Print all elements
    public static void printAll() {
        employees
                .forEach(System.out::println);
    }

    // 2. Create concrete type of Stream
    public static void mapOperation() {
        employees
                .stream()
                .map(employee -> employee.getName() + " " + employee.getSkills())
                .forEach(System.out::println);
    }

    // 3. Create concrete type of List (distinct() -> removes duplicates)
    public static void flatMapOperation() {
        List<String> skills = employees
                .stream()
                .map(Employee::getSkills)
                .flatMap(Collection::stream)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(skills);

    }

    // 4. Filtered stream
    public static void filterOperation(String lang) {
        employees
                .stream()
                .filter(employee -> employee.getName().startsWith(lang))
                .forEach(System.out::println);
    }

    // 5. Sorted stream
    public static void sortedOperation() {
        employees
                .stream()
                .sorted(Comparator.comparing(Employee::getName))
                .forEach(System.out::println);
    }

    // 6. Limit objects that will be processed
    public static void limitOperation() {
        employees
                .stream()
                .sorted(Comparator.comparing(Employee::getSurname))
                .limit(3)
                .forEach(System.out::println);
    }

    // 7. Skip objects that will be processed
    public static void skipOperation() {
        employees
                .stream()
                .sorted(Comparator.comparing(Employee::getSurname))
                .skip(3)
                .limit(3)
                .forEach(System.out::println);
    }

    // 8. Count the number of objects in stream
    public static void countOperation(String letter) {
        long size = employees.stream()
                .filter(employee -> employee.getName().startsWith(letter))
                .count();
        System.out.println(size);
    }

    // 9. Min Max Operations
    public static void minMaxOperation() {
        employees.stream()
                .max(Comparator.comparing(Employee::getAge))
                .ifPresent(System.out::println);

    }

    // 10. Find some objects that are in stream
    public static void findAnyFirstOperation() {
        employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .filter(employee -> employee.getName().startsWith("B"))
                .findAny().ifPresent(System.out::println);
    }

    // 11. Find objects that matches Predicate
    private static void matchOperation() {
        boolean b = employees.stream()
                .noneMatch((employee -> employee.getName().startsWith("Z")));
        System.out.println(b);
    }

    // 12. Reduce all elements of stream to 1 result
    private static void reduceOption() {
        Integer sumOfAllAges = employees.stream()
                .map(Employee::getAge)
                .reduce(Integer::sum).get();
        System.out.println(sumOfAllAges);
        // -------------------------------
        Integer sumOfAllAges2 = employees.stream()
                .map(Employee::getAge)
                .reduce(0, Integer::sum);
        System.out.println(sumOfAllAges2);
        // -------------------------------
        Integer sumOfAllAges3 = employees.stream()
                .reduce(0, (age, employee) -> age + employee.getAge(), Integer::sum);
        System.out.println(sumOfAllAges3);
        String names = employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .map(Employee::getName)
                .reduce((name, name2) -> name + ", " + name2).get();
        System.out.println(names);
    }

    // 13. Process the elements until Predicate = true
    private static void takeWhileOperation() {
        employees
                .stream()
                .sorted(Comparator.comparing(Employee::getAge))
                .takeWhile(employee -> employee.getAge() < 30)
                .forEach(System.out::println);
    }

    // 13. Skip the elements until Predicate = true
    private static void dropWhileOperation() {
        employees
                .stream()
                .sorted(Comparator.comparing(Employee::getAge))
                .dropWhile(employee -> employee.getAge() < 30)
                .forEach(System.out::println);
    }

    // 14. Loop through the stream ordered
    private static void forEachOrderedOperation() {
        String sentence = "Jak nauczyć się programowania ";
        sentence.chars().forEach(c -> System.out.print((char) c));
        System.out.println();
        sentence.chars().parallel().forEach(c -> System.out.print((char) c));
        System.out.println();
        sentence.chars().parallel().forEachOrdered(c -> System.out.print((char) c));
        System.out.println();
    }

    // 15. Modifying elements of collections -> DEBUG ONLY !!!!!
    private static void peekOperation() {
        List<Employee> bob = employees
                .stream()
                .peek(employee -> employee.setName("Pupkina"))
                .peek(employee -> employee.setSurname("Zalupkina"))
                .collect(Collectors.toList());
        System.out.println(bob);
    }

    // Create list
    private static List<Employee> createList() {
        List<Employee> employees = new ArrayList<>();
        Employee employee1 = new Employee("Bumblebee", "Clobbersmash", 25, List.of("Java", "JS"));
        Employee employee2 = new Employee("Bonobo", "Curdledmilk", 35, List.of("PHP", "Ruby"));
        Employee employee3 = new Employee("Yeelzebub", "Cap’ncrunch", 43, List.of("Python", "Scala"));
        Employee employee4 = new Employee("Congarest", "Grumblesnore", 22, List.of("C", "C++"));
        Employee employee5 = new Employee("Brandybuck", "Thundercats", 34, List.of("Rust", "SQL"));
        Employee employee6 = new Employee("Loiledegg", "Snickersbar", 51, List.of("JS", "Apex"));
        Employee employee7 = new Employee("Bendydick", "Thundercats", 28, List.of("Java", "Haskel"));
        Employee employee8 = new Employee("Clarkingdog", "Monstermash", 39, List.of("Java", "Spring"));
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        employees.add(employee7);
        employees.add(employee8);
        return employees;
    }

    private static void printLine() {
        System.out.println("_____________________________");
    }
}
