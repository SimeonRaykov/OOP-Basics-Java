package Box;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        double length = Double.parseDouble(bf.readLine());
        double width = Double.parseDouble(bf.readLine());
        double height = Double.parseDouble(bf.readLine());

        Box box = new Box(length, width, height);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Surface area - " + df.format(box.calcSurfaceArea()));
        System.out.println("Lateral Surface Area - " + df.format(box.calcLateralSurcace()));
        System.out.println("Volume - " + df.format(box.calcVolume()));
    }
}
