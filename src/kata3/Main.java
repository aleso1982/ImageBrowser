package kata3;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        CalculateMailDomainHistogramControl control = new CalculateMailDomainHistogramControl(args[0]);
        control.execute();
    }
}
