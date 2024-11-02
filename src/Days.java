import java.time.LocalDate;

public enum Days {
    MONDAY("Дуйшөмбү күнү жава окуйм"),//Кундордун enum мин туздук.
    TUESDAY("Шейшемби күнү англис тили сабагын окуйм"),
    WEDNESDAY("Шаршемби күнү математика окуйм"),
    THURSDAY("Бейшемби күнү тарых окуйм"),
    FRIDAY("Жума күнү химия окуйм"),
    SATURDAY("Ишемби күнү физика окуйм"),
    SUNDAY("Жекшемби күнү эс алам");

private  final String message;

    Days(String message) {
        this.message = message;
    }
    public String getMessage(){
        return message;
    }
}

