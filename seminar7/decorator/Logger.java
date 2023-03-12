package seminar7.decorator;

public class Logger implements Logable {
    @Override
    public void log(String logOutput) {
        System.out.println(logOutput);
    }
}
