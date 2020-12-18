package Lesson_001;

import Lesson_001.obstacle.Track;
import Lesson_001.obstacle.Wall;
import Lesson_001.participant.Cat;
import Lesson_001.participant.Person;
import Lesson_001.participant.Robot;
import Lesson_001.participant.Participant;

import java.util.Random;

public class Task_A1 {

    public static void main(String[] args) {
        System.out.println("Подготовительный этап...");
        Competition competition = createAndPrepareCompetition();

        System.out.println("Начинаем соревнование!");
        competition.startCompetition();

        System.out.println("Соревнование окончено! Победители:");
        for (Participant winner : competition.getLastWinners()) {
            System.out.println(winner);
        }
    }

    private static Competition createAndPrepareCompetition() {
        Participant person = new Person("Oleg", 50, 500);
        Participant cat = new
                Cat("Barsik", 200, 1500);
        Participant robot = new Robot("Altron", 150, 5000);

        Random random = new Random();

        Wall wall = new Wall(random.nextInt(200));
        Track track = new Track(random.nextInt(1500));

        Competition competition = new Competition("Infinity War");
        competition.setParticipants(person, cat, robot);
        competition.setObstacles(wall, track);
        return competition;
    }
}