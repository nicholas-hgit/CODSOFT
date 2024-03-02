package task5.course;

public class Course {

    private final long id;
    private long capacity;
    private long numberOfStudents;
    private String title;
    private String code;
    private String description;
    private String slot;

    public Course(long id, String title, String code, String slot, long capacity){
        this.id = id;
        this.title = title;
        this.code = code;
        this.slot = slot;
        this.capacity = capacity;
        this.numberOfStudents = 0;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }

    public  long getNumberOfRegisteredStudents() {
        return numberOfStudents;

    }
    public  void setNumberOfRegisteredStudents(long numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    @Override
    public String toString() {
        return "Course{" +
                id + '\n' +
                title + '\n' +
                code + '\n' +
                description + '\n' +
                slot + '\n' +
                '}';
    }
}
