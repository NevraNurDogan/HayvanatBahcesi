public class Horse extends Equine{
    Horse(String name, int age, int weight) {
        super(name, age, weight);
    }
    @Override
    public String getDosage ( ) {
        // return this.medicines;
        return "Ata ilaç verildi.";
    }
    @Override
    public String setFeedSchedule (){
        return "Ata yem verildi.";
    }
}
