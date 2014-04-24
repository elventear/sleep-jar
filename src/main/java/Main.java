
public class Main {

    public static void main(String [] args) {
        try {
            Thread.sleep(1000 * Integer.valueOf(args[0]));
        } catch (InterruptedException e) {
            System.exit(0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("Specify the the sleep time in seconds as parameter");
            System.exit(-1);
        }
    }
}
