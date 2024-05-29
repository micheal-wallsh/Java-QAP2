public class TestMyLine {
    public static void main(String[] args) {

        // Initial line

        MyLine line = new MyLine(1, 2, 4, 6);

        System.out.println("Begin Point: " + line.getBegin());
        System.out.println("End Point: " + line.getEnd());
        System.out.println("Length: " + line.getLength());
        System.out.println("Gradient: " + line.getGradient());
        System.out.println(line);

        line.setBeginXY(3, 3);
        line.setEndXY(6, 7);

        // New line

        System.out.println("Line has been updated!");
        System.out.println("Updated Line: " + line);
        System.out.println("Updated Length: " + line.getLength());
        System.out.println("Updated Gradient: " + line.getGradient());
    }
}
