public class Lion extends Felines{
    Lion (String name, int age, int weight) {
        super(name, age, weight);
    }
    @Override
    public String getDosage ( ) {
        // return this.medicines;
        return "Aslana ilaç verildi.";
    }
    @Override
    public String setFeedSchedule (){
        return "Aslana et verildi.";
    }
}
