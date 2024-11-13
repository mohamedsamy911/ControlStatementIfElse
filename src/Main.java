public class Main {
    private static void task1(int age) {
        if (age >= 1 && age < 13) {
            System.out.println("Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teenager");
        } else if (age >= 20 && age < 60) {
            System.out.println("Adult");
        } else if (age >= 60) {
            System.out.println("Senior");
        } else {
            System.out.println("Not a valid age!");
        }
    }

    private static void task2(double grade) {
        if (grade <= 100 && grade >= 90) {
            System.out.println('A');
        } else if (grade < 90 && grade >= 80) {
            System.out.println('B');
        } else if (grade < 80 && grade >= 70) {
            System.out.println('C');
        } else if (grade < 70 && grade >= 60) {
            System.out.println('D');
        } else if (grade < 60 && grade >= 0) {
            System.out.println('F');
        } else {
            System.out.println("Not a valid grade!");
        }
    }

    private static void task3(int age, boolean isCitizen) {

        if (isCitizen) {
            if (age >= 18) {
                System.out.println("Person is eligible to vote");
            } else {
                System.out.println("Person isn't eligible to vote");
            }
        } else {
            System.out.println("Person isn't eligible to vote");
        }
    }

    public static void main(String[] args) {
        task1(25);
        task2(70);
        task3(20, true);
    }
}