public class Tiger extends Felines{
    Tiger (String name, int age, int weight) {
        super(name, age, weight);
    }
    @Override
    public String getDosage ( ) {
        // return this.medicines;
        return "Kaplana ilaç verildi.";
    }
    @Override
    public String setFeedSchedule (){
        return "Kaplana et verildi.";
    }
}
