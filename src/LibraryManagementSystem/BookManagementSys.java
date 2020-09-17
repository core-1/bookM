package LibraryManagementSystem;

import java.util.Scanner;

public class BookManagementSys {
    public static void main(String[] args) {
        Book user = new Book();
        user.control_1();
        Scanner scanner = new Scanner(System.in);
        int num= scanner.nextInt();
        user.order_1(num);



    }
}
