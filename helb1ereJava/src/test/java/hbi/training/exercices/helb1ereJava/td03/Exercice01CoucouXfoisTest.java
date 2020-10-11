package hbi.training.exercices.helb1ereJava.td03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercice01CoucouXfoisTest {

    @Test
    void display_3_times_coucou() {

        String expected = "coucou\ncoucou\ncoucou\n";
        String result = Exercice01CoucouXfois.repeatStrNTimes("coucou", 3);

        assertEquals(expected, result);
    }


    @Test
    void display_5_times_salam() {

        String expected = "salam\nsalam\nsalam\nsalam\nsalam\n";
        String result = Exercice01CoucouXfois.repeatStrNTimes("salam", 5);

        assertEquals(expected, result);
    }
}

