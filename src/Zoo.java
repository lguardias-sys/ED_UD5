import java.util.List;

public class Zoo {

    public String Name;
    public String City;
    public int Capacity;
    public List<Animal> Animals;

    public Zoo(String name, String city, int capacity) {
        Name = name;
        City = city;
        Capacity = capacity;
    }

    public void addAnimal(Animal animal){
        Animals.add(animal);
    }
    public void removeAnimal(){
        Animals.removeLast();
    }
    public void printMembers(){
        System.out.println(Animals);
    }

}
