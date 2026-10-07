package array;

public class batch {

    int[][] marks;
    int m;
    int n;

    batch(int m, int n) {
        marks = new int[m][n];
    }

    void setStudentmarks(int student, int[] m) {
        for (int i = 0; i < m.length; i++) {
            marks[student][i] = m[i];
        }
    }

    int[][] getMarks() {
        return marks;
    }

    void DisplayMarks() {
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }

    void DisplayMarks(int student) {
        for (int j = 0; j < marks[student].length; j++) {
            System.out.print(marks[student][j] + " ");
        }
        System.out.println();
    }

    int CalculateTotalMarks(int student) {
        int total = 0;

        for (int j = 0; j < marks[student].length; j++) {
            total += marks[student][j];
        }

        return total;
    }

    void FindTopper() {
        int topper = 0;
        int highest = CalculateTotalMarks(0);

        for (int i = 1; i < marks.length; i++) {
            int total = CalculateTotalMarks(i);

            if (total > highest) {
                highest = total;
                topper = i;
            }
        }

        System.out.println(topper + 1);
        System.out.println(highest);
    }

    public static void main(String[] args) {
        batch b1 = new batch(3, 6);

        int m[] = {10, 20};

        b1.setStudentmarks(2, m);
        b1.DisplayMarks();
        b1.DisplayMarks(1);
    }
}