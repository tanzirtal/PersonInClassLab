import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private int age;
    private List<String> listOfNames = new ArrayList<>();

    public Person() {
    }


    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }


    public void addName(String name){
        this.listOfNames.add(name);
    }

    public void removeName(String name){
        this.listOfNames.remove(name);
    }

    public int getSizeOfList(){
        int sizeOfList = listOfNames.size();
        return sizeOfList;

    }

    public List<String> getListOfNames() {
        return listOfNames;
    }

    public void setListOfNames(List<String> listOfNames) {
        this.listOfNames = listOfNames;
    }
}