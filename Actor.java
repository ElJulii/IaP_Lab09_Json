import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

@JsonAutoDetect
public class Actor {
    private String name;
    private String address;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate birthday;
    private boolean crime;
    private int prisoners;

    Actor(){}
    Actor(String name, String address, LocalDate birthday, boolean crime, int prisoners) {
        this.name = name;
        this.address = address;
        this.birthday = birthday;
        this.crime = crime;
        this.prisoners = prisoners;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public boolean isCrime() {
        return crime;
    }

    public void setCrime(boolean crime) {
        this.crime = crime;
    }

    public int getPrisoners() {
        return prisoners;
    }

    public void setPrisoners(int prisoners) {
        this.prisoners = prisoners;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                ", crime=" + crime +
                ", prisoners=" + prisoners +
                '}';
    }
}
