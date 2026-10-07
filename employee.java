package array;

class ProjectAllocation {

    int hours[][];

    ProjectAllocation(int hours[][]) {
        this.hours = hours;
    }

    void displayEmployeeReport() {

        System.out.println("Employee-wise Working Hours:");

        for (int i = 0; i < hours.length; i++) {

            System.out.print("Employee E" + (i + 1) + ": ");

            for (int j = 0; j < hours[i].length; j++) {
                System.out.print(hours[i][j] + " ");
            }

            System.out.println();
        }
    }

    void calculateEmployeeTotal() {

        System.out.println("\nEmployee Total Hours:");

        for (int i = 0; i < hours.length; i++) {

            int total = 0;

            for (int j = 0; j < hours[i].length; j++) {
                total = total + hours[i][j];
            }

            System.out.println("Employee E" + (i + 1) + " Total: " + total + " hours");
        }
    }

    void generateProjectReport() {

        System.out.println("\nProject-wise Report:");

        for (int j = 0; j < hours[0].length; j++) {

            System.out.print("Project P" + (j + 1) + ": ");

            for (int i = 0; i < hours.length; i++) {
                System.out.print(hours[i][j] + " ");
            }

            System.out.println();
        }
    }

    void calculateProjectTotal() {

        System.out.println("\nProject Total Hours:");

        for (int j = 0; j < hours[0].length; j++) {

            int total = 0;

            for (int i = 0; i < hours.length; i++) {
                total = total + hours[i][j];
            }

            System.out.println("Project P" + (j + 1) + " Total: " + total + " hours");
        }
    }

    void findMostWorkedProject() {

        int max = 0;
        int project = 0;

        for (int j = 0; j < hours[0].length; j++) {

            int total = 0;

            for (int i = 0; i < hours.length; i++) {
                total = total + hours[i][j];
            }

            if (total > max) {
                max = total;
                project = j;
            }
        }

        System.out.println("\nMost Worked Project: P" + (project + 1));
    }


    public static void main(String[] args) {

        int hours[][] = {
                {20, 15, 10},
                {12, 18, 14},
                {25, 10, 20},
                {15, 22, 12}
        };

        ProjectAllocation obj = new ProjectAllocation(hours);

        obj.displayEmployeeReport();

        obj.calculateEmployeeTotal();

        obj.generateProjectReport();

        obj.calculateProjectTotal();

        obj.findMostWorkedProject();
    }
}
