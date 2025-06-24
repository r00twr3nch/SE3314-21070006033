package org.example;

/**
 * Represents a quest in Middle-Earth.
 */
public class Quest {

    /**
     * Completes the quest.
     * @param points The points earned.
     * @param isRingBearer Whether the character is the ring bearer.
     * @return True if the quest is successful, otherwise false.
     */
    public boolean completeQuest(int points, boolean isRingBearer) {
        boolean isQualified = (points > 0 && isRingBearer) || points < -100 || points == 42;

        if (points > 50 && points < 100 && points % 2 == 0 && isQualified) {
            System.out.println("Qualified");
        }

        return points >= 100;
    }
}
