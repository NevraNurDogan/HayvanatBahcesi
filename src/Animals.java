

public class Animals {
    String name;
    private  int age;
    private double weight;
    Animals(String name,int age,double weight){//constructor
        this.name=name;
        this.age=age;
        this.weight=weight;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getDosage ( ) {
        return "ilaç verildi.";
    }
    public String setFeedSchedule (){
        return "Yem verildi.";
    }
}
