public class Donkey extends Equine{
    Donkey (String name, int age, int weight) {
        super(name, age, weight);
    }
    @Override
    public String getDosage ( ) {
        // return this.medicines;
        return "Eşeğe ilaç verildi.";
    }
    @Override
    public String setFeedSchedule (){
        return "Eşeğe yem  verildi.";
    }
}
