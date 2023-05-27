public class Main {
    public static void main(String[] args) {
        Reptiles beaver=new Beaver("Kunduz",2,7 );
        System.out.println(Reptiles.class);
        System.out.println("Adı: "+beaver.name+"\n"+"Yaş: "+beaver.getAge()+"\nKilo: "+ beaver.getWeight());
        System.out.println("Yemek durumu:"+beaver.setFeedSchedule());
        System.out.println("İlaç durumu:"+beaver.getDosage());
        Reptiles maus =new Maus("Fare",1,1 );
        System.out.println("Adı: "+maus.name+"\n"+"Yaş: "+maus.getAge()+"\nKilo:"+ maus.getWeight());
        System.out.println("Yemek durumu:"+maus.setFeedSchedule());
        System.out.println("İlaç durumu:"+maus.getDosage());
        Felines tiger=new  Tiger("Kaplan",3,70);
        System.out.println(Felines.class);
        System.out.println("Adı: "+tiger.name+"\n"+"Yaş: "+tiger.getAge()+"\nKilo: "+ tiger.getWeight());
        System.out.println("Yemek durumu:"+tiger.setFeedSchedule());
        System.out.println("İlaç durumu:"+tiger.getDosage());
        Felines lion=new Lion("Aslan",4,100);
        System.out.println("Adı: "+lion.name+"\n"+"Yaş: "+lion.getAge()+"\nKilo: "+ lion.getWeight());
        System.out.println("Yemek durumu:"+lion.setFeedSchedule());
        System.out.println("İlaç durumu:"+lion.getDosage());
        Equine horse=new Horse("At",6,120);
        System.out.println(Equine.class);
        System.out.println("Adı: "+horse.name+"\n"+"Yaş: "+horse.getAge()+"\nKilo: "+ horse.getWeight());
        System.out.println("Yemek durumu:"+horse.setFeedSchedule());
        System.out.println("İlaç durumu:"+horse.getDosage());
        Equine donkey=new Donkey("Eşek",2,25);
        System.out.println("Adı: "+donkey.name+"\n"+"Yaş: "+donkey.getAge()+"\nKilo: "+ donkey.getWeight());
        System.out.println("Yemek durumu:"+donkey.setFeedSchedule());
        System.out.println("İlaç durumu:"+donkey.getDosage());
        Equine zebra=new Zebra("Zebra",5,110);
        System.out.println("Adı: "+zebra.name+"\n"+"Yaş: "+zebra.getAge()+"\nKilo: "+ zebra.getWeight());
        System.out.println("Yemek durumu:"+zebra.setFeedSchedule());
        System.out.println("İlaç durumu:"+zebra.getDosage());
    }
}