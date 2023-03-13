class Animals{
    public void makeNoise() {
        System.out.println("generic noise");
    }

    class pig extends Animals{
        public void makeNoise() {
            System.out.println("The pig says :oink");
        }
    }

    class dog extends Animals{
        public void makeNoise() {
            System.out.println("The dog says :woof");
        }
    }

}

public class Main {
    public static void main(String[] args) {
        Animals pig = new Animals().new pig();
        Animals dog = new Animals().new dog();
        pig.makeNoise();
        dog.makeNoise();
    }
}