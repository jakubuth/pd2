# Zadanie: Klasy Abstrakcyjne i Dziedziczenie w Java

Twoim zadaniem jest utworzenie hierarchii klas reprezentujących różne typy zwierząt. Skoncentruj się na dziedziczeniu oraz wykorzystaniu klas abstrakcyjnych, aby stworzyć struktury umożliwiające różne zachowania zwierząt. Zadanie obejmuje implementację klas oraz przejście dostarczonych testów JUnit.

## Wymagania

### 1. Utwórz pakiet `pl.example.animals`.

### 2. Utwórz klasę abstrakcyjną `Animal`:
- Pole `String name`, przechowujące nazwę zwierzęcia.
- Konstruktor przyjmujący `name` i przypisujący go do pola `name`.
- Metodę `String getName()`, która zwraca nazwę zwierzęcia.
- Abstrakcyjną metodę `String sound()`, która zwraca odgłos, jaki wydaje zwierzę.

### 3. Utwórz klasy `Dog`, `Eagle` i `Penguin`, które dziedziczą po klasie `Animal`:
- **Klasa `Dog`**:
    - Dziedziczy po `Animal`.
    - Metoda `sound()` zwraca `"Woof"`.
    - Metoda `swim()` wyświetla `"Dog is swimming"`.

- **Klasa `Eagle`**:
    - Dziedziczy po `Animal`.
    - Metoda `sound()` zwraca `"Screech"`.
    - Metoda `fly()` wyświetla `"Eagle is flying"`.

- **Klasa `Penguin`**:
    - Dziedziczy po `Animal`.
    - Metoda `sound()` zwraca `"Squawk"`.
    - Metoda `swim()` wyświetla `"Penguin is swimming"`.
    - Metoda `fly()` wyświetla `"Penguin cannot fly"`.

### 4. Przetestuj klasy przy użyciu dostarczonego pliku testowego `AnimalTest` w pakiecie `pl.example.animals`.
- Testy weryfikują, czy klasy `Dog`, `Eagle` i `Penguin` działają zgodnie z założeniami, sprawdzając ich odgłosy oraz wywołania metod `swim()` i `fly()` tam, gdzie jest to wymagane.

Twoim zadaniem jest zaimplementowanie klas w taki sposób, aby przejść podane testy.

### Przykład Użycia

Przykładowy kod testowy może wyglądać następująco:

```java
Dog dog = new Dog("Buddy");
assertEquals("Woof", dog.sound());
dog.swim(); // powinno wyświetlić "Dog is swimming"

Eagle eagle = new Eagle("Bald Eagle");
assertEquals("Screech", eagle.sound());
eagle.fly(); // powinno wyświetlić "Eagle is flying"

Penguin penguin = new Penguin("Emperor Penguin");
assertEquals("Squawk", penguin.sound());
penguin.swim(); // powinno wyświetlić "Penguin is swimming"
penguin.fly(); // powinno wyświetlić "Penguin cannot fly"
