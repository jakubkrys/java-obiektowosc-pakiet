package pl.jakubkrys;

public class Note {
    private String phoneNumber;
    private String dateTime;
    private String description;

    public Note(String phoneNumber, String dateTime, String description) {
        this.phoneNumber = phoneNumber;
        this.dateTime = dateTime;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Note{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", dateTime='" + dateTime + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
