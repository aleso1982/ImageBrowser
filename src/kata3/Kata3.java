package kata3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kata3 {

    public static void main(String[] args) throws IOException {
        
        HistogramBuilder<Integer> builder = new HistogramBuilder<>();
        builder.calculate(new Integer [] {1,2,3,1,4,1,4,4,6,6,4,2,2,34,45,5,6,5,3,21,3,5});
        HistogramViewer viewer = new HistogramViewer(builder.getHistogram());
        viewer.show();
        /*BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
        String text = input.readLine();*/
        
        
    }
}
