// Plik: AnimalTest.java
package pl.example.animals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AnimalTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testDogSoundAndSwim() {
        Dog dog = new Dog("Buddy");
        assertEquals("Woof", dog.sound());

        dog.swim();
        assertEquals("Dog is swimming", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testEagleSoundAndFly() {
        Eagle eagle = new Eagle("Bald Eagle");
        assertEquals("Screech", eagle.sound());

        eagle.fly();
        assertEquals("Eagle is flying", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testPenguinSoundSwimAndFly() {
        Penguin penguin = new Penguin("Emperor Penguin");
        assertEquals("Squawk", penguin.sound());

        penguin.swim();
        assertEquals("Penguin is swimming", outputStreamCaptor.toString().trim());

        // Czyszczenie bufora przed kolejnym sprawdzeniem
        outputStreamCaptor.reset();
        penguin.fly();
        assertEquals("Penguin cannot fly", outputStreamCaptor.toString().trim());
    }
}
