package org.example;

public class App 
{
   public static void main(String[] args) {
        // Creating students
        HogwartsStudent harry = new HogwartsStudent("Harry Potter", "Gryffindor", 5);
        HogwartsStudent draco = new HogwartsStudent("Draco Malfoy", "Slytherin", 5);
        HogwartsStudent luna = new HogwartsStudent("Luna Lovegood", "Ravenclaw", 4);

        // Teaching spells
        harry.learnSpell("Expelliarmus");
        harry.learnSpell("Lumos");
        draco.learnSpell("Serpensortia");
        luna.learnSpell("Lumos");

        // Checking spells
        System.out.println("Does Harry know Expelliarmus? " + harry.knowsSpell("Expelliarmus"));

        // Creating Spellbook
        Spellbook spellbook = new Spellbook();
        spellbook.addSpell("Expelliarmus");
        spellbook.addSpell("Lumos");
        spellbook.addSpell("Serpensortia");
        spellbook.addSpell("Expecto Patronum");

        // Searching by prefix
        System.out.println("Spells starting with 'Ex': " + spellbook.getSpellsByPrefix("Ex"));

        // Classroom setup
        MagicClassroom classroom = new MagicClassroom();
        classroom.addStudent(harry);
        classroom.addStudent(draco);
        classroom.addStudent(luna);

        System.out.println("Students in Gryffindor: " + classroom.getStudentsByHouse("Gryffindor").size());

        // Wizarding Exam
        WizardExam exam = new WizardExam();
        exam.addRequiredSpell("Expelliarmus");
        exam.addRequiredSpell("Lumos");

        exam.evaluate(harry); // Should pass
        exam.evaluate(draco); // Should fail

        // Duel Simulation
        Duel.start(harry, draco, "Expelliarmus");
        Duel.start(harry, luna, "Lumos");
    }
}