package pl.jakubkrys;

import pl.jakubkrys.repos.NotesRepo;

import java.util.Scanner;

public class NotesApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in,"UTF-8");
        NotesRepo notesRepo = new NotesRepo();
        int option;

        do {
            System.out.println("----- Notes App -----");
            System.out.println("1 - add note");
            System.out.println("2 - display all");
            System.out.println("0 - stop");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Phone: ");
                    String phoneNumber = scanner.nextLine();

                    System.out.print("Date and time: ");
                    String dateTime = scanner.nextLine();

                    System.out.print("Description: ");
                    String description = scanner.nextLine();

                    Note note = new Note(phoneNumber, dateTime, description);
                    notesRepo.add(note);
                    break;
                case 2:
                    System.out.println(notesRepo);
                    break;
            }
        } while (option != 0);
    }
}
