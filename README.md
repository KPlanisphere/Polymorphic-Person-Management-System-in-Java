# Polymorphic Person Management System in Java

This repository contains a Java project that demonstrates the concept of polymorphism through a person management system. The project includes classes for defining different types of people, such as athletes and computer scientists, handling user input, and performing operations such as displaying and manipulating person data.

## Features

- **Polymorphism**: Demonstrates the concept of polymorphism by using a base class `TPersonaPolimorfica` and derived classes `TDeportista` and `TComputologo`.
- **Person Attributes**: Defines attributes for different types of people, including common attributes in the base class and specific attributes in derived classes.
- **User Interaction**: Handles user input to create and manage different types of people.
- **Data Display**: Outputs the details of the people managed by the system.

### Code Snippets

#### Main Class
The main class initializes the program, handles user input, and invokes methods for managing person data.

```java
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<TPersonaPolimorfica> people = new ArrayList<>();

        // Input for Athlete
        System.out.print("Enter athlete name: ");
        String athleteName = scanner.nextLine();
        System.out.print("Enter athlete age: ");
        int athleteAge = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter sport: ");
        String sport = scanner.nextLine();
        TDeportista athlete = new TDeportista(athleteName, athleteAge, sport);
        people.add(athlete);

        // Input for Computer Scientist
        System.out.print("Enter computer scientist name: ");
        String compScientistName = scanner.nextLine();
        System.out.print("Enter computer scientist age: ");
        int compScientistAge = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter field of expertise: ");
        String expertise = scanner.nextLine();
        TComputologo compScientist = new TComputologo(compScientistName, compScientistAge, expertise);
        people.add(compScientist);

        // Display data
        System.out.println("List of people:");
        for (TPersonaPolimorfica person : people) {
            System.out.println(person);
        }
    }
}
```

#### Polymorphic Person Base Class

The `TPersonaPolimorfica` class represents a generic person with common attributes such as name and age.

```java
public class TPersonaPolimorfica {
    protected String name;
    protected int age;

    public TPersonaPolimorfica(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
```

#### Athlete Class

The `TDeportista` class extends `TPersonaPolimorfica` and adds attributes specific to an athlete, such as the sport they play.

```java
public class TDeportista extends TPersonaPolimorfica {
    private String sport;

    public TDeportista(String name, int age, String sport) {
        super(name, age);
        this.sport = sport;
    }

    @Override
    public String toString() {
        return super.toString() + ", Sport: " + sport;
    }
}
```

#### Computer Scientist Class

The `TComputologo` class extends `TPersonaPolimorfica` and adds attributes specific to a computer scientist, such as their field of expertise.

```java
public class TComputologo extends TPersonaPolimorfica {
    private String expertise;

    public TComputologo(String name, int age, String expertise) {
        super(name, age);
        this.expertise = expertise;
    }

    @Override
    public String toString() {
        return super.toString() + ", Field of Expertise: " + expertise;
    }
}
```

### Usage

1.  Compile the Java files using a Java compiler (e.g., `javac`).
2.  Run the main class (`Main`) to start the program.
3.  Follow the prompts to enter the details of athletes and computer scientists.
4.  The program will display the list of people with their details.

### Classes and Methods

-   `Main`: The main class that handles user input and program execution.
    -   `main(String[] args)`: The entry point of the program.
-   `TPersonaPolimorfica`: A base class representing a generic person with attributes and methods for displaying details.
    -   `TPersonaPolimorfica(String name, int age)`: Constructor that initializes the person's attributes.
    -   `toString()`: Method that returns the string representation of the person's details.
-   `TDeportista`: A derived class representing an athlete, extending `TPersonaPolimorfica` and adding additional attributes.
    -   `TDeportista(String name, int age, String sport)`: Constructor that initializes the athlete's attributes.
    -   `toString()`: Method that returns the string representation of the athlete's details, including inherited attributes.
-   `TComputologo`: A derived class representing a computer scientist, extending `TPersonaPolimorfica` and adding additional attributes.
    -   `TComputologo(String name, int age, String expertise)`: Constructor that initializes the computer scientist's attributes.
    -   `toString()`: Method that returns the string representation of the computer scientist's details, including inherited attributes.