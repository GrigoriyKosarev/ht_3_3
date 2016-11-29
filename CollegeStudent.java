package ht_3_3;

/**
 * Created by admin on 28.11.2016.
 */
public class CollegeStudent extends Student {
    private String collegeName;
    private int rating;
    private long id;

    CollegeStudent(){

    }
    CollegeStudent(String collegeName, int rating, long id){
        setCollegeName(collegeName);
        setRating(rating);
        setId(id);
    }
    CollegeStudent(String lastName, Course[] coursesTaken){
        setLastName(lastName);
        setCoursesTaken(coursesTaken);
    }
    CollegeStudent(String firstName, String lastName, int group, Course[] coursesTaken, String collegeName, int rating, long id){
        setFirstName(firstName);
        setLastName(lastName);
        setGroup(group);
        setCoursesTaken(coursesTaken);

        setCollegeName(collegeName);
        setRating(rating);
        setId(id);
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
