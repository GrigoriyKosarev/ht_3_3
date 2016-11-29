package ht_3_3;

/**
 * Created by admin on 28.11.2016.
 */
public class Solution {

    public static void main(String[] args) {
        /*Course[] course = new Course[5];*/

        Course course1 = new Course(1, new String("course1"), new String("Ivan"));
        Course course2 = new Course(2, new String("course2"), new String("Ivan"));
        Course course3 = new Course(3, new String("course3"), new String("Ivan"));
        Course course4 = new Course(4, new String("course4"), new String("Ivan"));
        Course course5 = new Course(5, new String("course5"), new String("Ivan"));

        Course[] course = {course1, course2, course3, course4, course5};

        Student student1 = new Student(new String("Ivanov"), new String("Ivan"), 1);
        Student student2 = new Student(new String("Ivan"), course);


        CollegeStudent college1 = new CollegeStudent(new String("college Name 1"), 1, 1L);
        CollegeStudent college2 = new CollegeStudent(new String("Ivan1"), course);
        CollegeStudent college3 = new CollegeStudent(new String("Ivanov2"), new String("Ivan2"), 1, course,
                new String("college Name 2"), 2, 2L);

        SpecialStudent student3 = new SpecialStudent(3L);
        SpecialStudent student4 = new SpecialStudent(new String("Ivanov3"), new String("Ivan3"), 4);
        SpecialStudent student5 = new SpecialStudent(new String("Ivan4"), course);

    }

}
