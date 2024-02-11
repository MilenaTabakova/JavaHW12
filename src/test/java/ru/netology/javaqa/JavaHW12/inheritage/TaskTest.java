package ru.netology.javaqa.JavaHW12.inheritage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    @Test

    public void simpleTaskMatch() {
        SimpleTask task = new SimpleTask(1, "Позвонить домой");

        boolean expected = true;
        boolean actual = task.matches("Позвонить");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void simpleTaskNoMatch() {
        SimpleTask task = new SimpleTask(1, "Позвонить домой");

        boolean expected = false;
        boolean actual = task.matches("Написать");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void epicMatch() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(12, subtasks);


        boolean expected = true;
        boolean actual = epic.matches("Хлеб");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void epicNoMatch() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(12, subtasks);

        boolean expected = false;
        boolean actual = epic.matches("Кофе");

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void meetingMatchedTopic() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = true;
        boolean actual = meeting.matches("Выкатка 3й версии приложения");

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void meetingMatchedProject() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = true;
        boolean actual = meeting.matches("Приложение НетоБанка");

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void meetingDoesntMatchProject() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = false;
        boolean actual = meeting.matches("Приложение Сбера");

        Assertions.assertEquals(expected, actual);

    }


}