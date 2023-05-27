public class Zebra extends Equine{
    Zebra(String name, int age, int weight) {
        super(name, age, weight);
    }
    @Override
    public String getDosage ( ) {
        // return this.medicines;
        return "Zebraya ilaç verildi.";
    }
    @Override
    public String setFeedSchedule (){
        return "Zebraya yem verildi.";
    }
}
