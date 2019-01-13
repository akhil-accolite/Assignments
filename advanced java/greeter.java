public class greeter{

    public static void main(String[] args) {
        greeter g = new greeter();

        greeter.greet(new englishgreeting());
    }

    public static void greet(greeting gtng){
        gtng.perform();
    }
}

interface greeting{
    public void perform();
}

class englishgreeting implements greeting{
    
    @Override
    public void perform() {
        System.out.println("printing in english");
    }
}