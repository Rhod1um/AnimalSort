package comparablefun;

public class Animal implements Comparable<Animal>{ //implementer interfacet Comparable som skal
    // bruges til at sortere/sammenligne attributter
    //det er den der indeholder metoden compareTo, vi implementere den her. Den står som
    //tom abstract metode i Comparable interfacet
    //Comparable er en indbygget interface i java som har compareTo metoden som kan bruges til at sammenligne ting

    private String name;
    private int dangerLevel;
    private int topSpeed;
    private int weight;

    public Animal (String name, int dangerLevel, int topSpeed, int weight){
        this.name = name;
        this.dangerLevel = dangerLevel;
        this.topSpeed = topSpeed;
        this.weight = weight;
    }

    public int compareTo (Animal animal){
        return this.weight - animal.weight; //tager første dyr og sammenligner med næste dyr og rykker
        //letteste dyr først.
        //return animal.weight - this.weight; sætter det tungeste dyr først
        //der er indbygget for loop i Comparable. Collections.sort(animal) (i AnimalSort) looper
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", dangerLevel=" + dangerLevel +
                ", topSpeed=" + topSpeed +
                ", weight=" + weight +
                '}';
    }
}
