import java.util.Scanner;

class Main {

    static int size = 0;

    // Insert at end
    static void insertionAtEnd(int marks[], int mark) {
        marks[size] = mark;
        size++;
    }

    // Insert at beginning
    static void insertionAtBeg(int marks[], int mark) {
        for (int i = size; i > 0; i--) {
            marks[i] = marks[i - 1];
        }
        marks[0] = mark;
        size++;
    }

    // Insert at position
    static void insertionAtRandPos(int marks[], int mark, int pos) {
        for (int i = size; i > pos; i--) {
            marks[i] = marks[i - 1];
        }
        marks[pos] = mark;
        size++;
    }

    // Delete at end
    static void deletion() {
        size--;
    }

    // Delete at beginning
    static void deletionAtBeg(int marks[]) {
        for (int i = 0; i < size - 1; i++) {
            marks[i] = marks[i + 1];
        }
        size--;
    }

    // Delete at position
    static void deletionAtPos(int marks[], int pos) {
        for (int i = pos; i < size - 1; i++) {
            marks[i] = marks[i + 1];
        }
        size--;
    }

    // Display array
    static void display(int marks[]) {
        for (int i = 0; i < size; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }

    // MAIN METHOD (needed to run program)
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int marks[] = new int[100];

        insertionAtEnd(marks, 10);
        insertionAtEnd(marks, 20);
        insertionAtEnd(marks, 30);

        insertionAtBeg(marks, 5);

        insertionAtRandPos(marks, 15, 2);

        deletion();

        deletionAtBeg(marks);

        deletionAtPos(marks, 1);

        display(marks);
    }
}
