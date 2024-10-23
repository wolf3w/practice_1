public class Main {
    public static void main(String[] args) {
        for (int i = 99; i > 0; i--) {
            System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer!");
            System.out.println("Take one down, pass it around");
            System.out.println((i - 1) + " bottles of beer on the wall!\n");
        }
        System.out.println("If that one bottle should happen to fall, what a waste of alcohol!");
    }
}