package PointinRectangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        final List<Integer> numsList = Arrays.stream(bf.readLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Rectangle rectangle = new Rectangle(numsList.get(0), numsList.get(1), numsList.get(2), numsList.get(3));

        int rows = Integer.parseInt(bf.readLine());
        for (int i = 0; i < rows; i++) {
            String tokens[] = bf.readLine().split("\\s+");
            Point point = new Point(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]));
            System.out.println(rectangle.contains(point));

        }


    }
}
