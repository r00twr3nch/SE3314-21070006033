package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for the Quest class.
 */
class QuestTest {

    @Test
    void testCompleteQuestReturnsTrueAt100() {
        Quest quest = new Quest();
        assertTrue(quest.completeQuest(100, true));
    }

    @Test
    void testCompleteQuestReturnsFalseUnder100() {
        Quest quest = new Quest();
        assertFalse(quest.completeQuest(42, false));
    }

    @Test
    void testQualifiedConditionLogic() {
        Quest quest = new Quest();
        // Qualified due to isRingBearer = true and points = 60 (even)
        assertFalse(quest.completeQuest(60, true)); // points < 100, so still returns false
    }
}
