import java.time.LocalDate;
import java.time.MonthDay;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Күндөргө enum түзүңүз (Monday, Tuesday ...)
Консолдон бир күндү белгилеңиз. Эгер Monday болсо -
 анда "Дуйшөмбү куну жава окуйм" же Tuesday болсо - анда "Шейшемби күнү англис тили сабагын окуйм"
 деп күнгө жараша кайсы сабакты окуганыңызды консолго чыгарыңыз.
Жуманын күндөрүн кыргыз тилинде көрсөтүңүз.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write the days");
        String day = scanner.nextLine();
        Days days = Days.valueOf(day);
        System.out.println(days.getMessage());
    }}