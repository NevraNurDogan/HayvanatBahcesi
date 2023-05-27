public class Maus extends Reptiles{
    Maus (String name, int age, int weight) {
        super(name, age, weight);
    }
    @Override
    public String getDosage ( ) {
        // return this.medicines;
        return "Fareye ilaç verildi.";
    }
    @Override
    public String setFeedSchedule (){
        return "Fareye yem  verildi.";
    }
}
