package ht_3_3;

/**
 * Created by admin on 28.11.2016.
 */
public class SpecialStudent extends CollegeStudent {

    private long secretKey;
    private String email;

    SpecialStudent(long secretKey){
        setSecretKey(secretKey);
    }
    SpecialStudent(String firstName, String lastName, int group){
        setFirstName(firstName);
        setLastName(lastName);
        setGroup(group);
    }
    SpecialStudent(String lastName, Course[] coursesTaken){
        setLastName(lastName);
        setCoursesTaken(coursesTaken);
    }

    public long getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
