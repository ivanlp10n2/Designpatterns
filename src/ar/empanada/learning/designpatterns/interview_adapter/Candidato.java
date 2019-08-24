package ar.empanada.learning.designpatterns.interview_adapter;

public class Candidato implements CandidatoInterface{
    private String name;
    private int age;
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public void cocinar() {
        System.out.println("cocinanding");
    }
}
