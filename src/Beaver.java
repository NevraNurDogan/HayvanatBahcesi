public class Beaver extends Reptiles{
    Beaver (String name, int age, int weight) {
        super(name, age, weight);
    }
    @Override
    public String getDosage ( ) {
        // return this.medicines;
        return "Kunduza ilaç verildi.";
    }
    @Override
    public String setFeedSchedule (){
        return "Kunduza yem verildi.";
    }
}
