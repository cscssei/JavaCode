//  input: two lines of String. The first line is model predicted value, and the second line is the true value.
// like: N P N P P P
//       P N N P P N
// compute recall and precision value.
// for example: precision = 2 / (2 + 2) = 1 / 2;   recall = 2 / (2 + 1) = 2 / 3;
// output: the bigger value of recall and precision.
// if the denominator is o: return -1;
import java.io.*;
import java.nio.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Precision {
    public static  void main(String[] args) throws IOException {
//        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
//        BufferedReader in = new BufferedReader(reader);
//        String line;
//        List<String> NPList = new ArrayList<String>();
//        while ((line = in.readLine()) != null) {
//            System.out.println(line);
//            NPList.addAll(new ArrayList<String>(Arrays.asList(List(line.splie(" ")))
//        }
        String line1 = "N P N P P P";
        String line2 = "P N N P P N";

        List<String> NPList = new ArrayList<String>(Arrays.asList(line1.split(" ")));
        NPList.addAll(new ArrayList<String>(Arrays.asList(line2.split(" "))));
        precision(NPList);
    }

    public static void precision(List NPList) {
        System.out.println(NPList);
        int len = NPList.size();
        double true_positive = 0.0;
        double true_negative = 0.0;
        double false_positive = 0.0;
        double false_negative = 0.0;

        for(int i = 0, j = len / 2; i < len / 2; i++, j++) {
            if (NPList.get(i).equals("P") && NPList.get(j).equals("P")) {
                true_positive++;
            }
            if (NPList.get(i).equals("P") && NPList.get(j).equals("N")) {
                false_positive++;
            }
            if (NPList.get(i).equals("N") && NPList.get(j).equals("P")) {
                true_negative++;
            }
            if (NPList.get(i).equals("N") && NPList.get(j).equals("N")) {
                false_negative++;
            }
        }
        double precision = true_positive / (true_positive + false_positive);
        double recall = true_positive / (true_positive + false_negative);
        if (precision == 0.0 && recall == 0.0) {
            System.out.println(-1);
        }
        if (precision > recall) {
            System.out.println(String.format("%.2f", precision));
        }
        else {
            System.out.println(String.format("%.2f", recall));
        }
    }
}
