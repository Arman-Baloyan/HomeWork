package education;

public class Lesson {

    private String name;
    private int duration;
    private String lectureName;
    private double price;

    public Lesson(String name, int duraction, String lectureName, double price) {

        this.name = name;
        this.duration = duraction;
        this.lectureName = lectureName;
        this.price = price;

    }
    public Lesson(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuraction() {
        return duration;
    }

    public void setDuraction(int duraction) {
        this.duration = duraction;
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lesson lesson = (Lesson) o;

        if (duration != lesson.duration) return false;
        if (Double.compare(lesson.price, price) != 0) return false;
        if (name != null ? !name.equals(lesson.name) : lesson.name != null) return false;
        return lectureName != null ? lectureName.equals(lesson.lectureName) : lesson.lectureName == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + duration;
        result = 31 * result + (lectureName != null ? lectureName.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "name='" + name + '\'' +
                ", duraction=" + duration +
                ", lectureName='" + lectureName + '\'' +
                ", price=" + price +
                '}';
    }

}