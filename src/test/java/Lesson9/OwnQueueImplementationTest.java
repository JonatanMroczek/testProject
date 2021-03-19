package Lesson9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnQueueImplementationTest {
    OwnQueueImplementation ownQueueImplementation;


    @BeforeEach
    void setup() {
        ownQueueImplementation = new OwnQueueImplementation();

    }

    @Test
    void shouldAddElementsToArray() {
        //given

        int numberToAdd = 5;
        int counter = 0;
        //when
        ownQueueImplementation.add(numberToAdd);
        counter++;
        ownQueueImplementation.add(numberToAdd);
        counter++;
        ownQueueImplementation.add(numberToAdd);
        counter++;
        ownQueueImplementation.add(numberToAdd);
        counter++;
        ownQueueImplementation.add(numberToAdd);
        counter++;
        ownQueueImplementation.add(numberToAdd);
        counter++;

        //then

        Assertions.assertEquals(ownQueueImplementation.size, counter);


    }

    @Test
    void shouldAddAndThenRemoveElementsFromArray() {
        //given
        int numberToAdd = 5;
        int counter = 0;
        //when
        ownQueueImplementation.add(numberToAdd);
        counter++;
        ownQueueImplementation.add(numberToAdd);
        counter++;

        ownQueueImplementation.remove();
        counter--;
        ownQueueImplementation.remove();
        counter--;


        //then

        Assertions.assertEquals(ownQueueImplementation.size, counter);


    }

    @Test
    void shouldThrowException() {
        Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            //given
            int numberToAdd = 5;

            //when
            ownQueueImplementation.add(numberToAdd);
            ownQueueImplementation.add(numberToAdd);

            ownQueueImplementation.remove();
            ownQueueImplementation.remove();
            ownQueueImplementation.remove();


        });
        //then
        String expectedMessage = "Can't remove element from an empty array!";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }


}
