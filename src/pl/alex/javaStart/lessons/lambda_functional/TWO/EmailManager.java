package pl.alex.javaStart.lessons.lambda_functional.TWO;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class EmailManager {
    public static void main(String[] args) {
        List<Email> emailList = createEmailList();
        //tylko wysłane emaile
        List<Email> sentEmails = filterEmails(emailList, Email::isSent);
        System.out.println("Wysłane maile:");
        System.out.println(sentEmails);
        //filtrowanie maili, w których nadawca lub odbiorca ma wskazany adres email
        List<Email> bartEmails = filterEmails(emailList, email->
                        email.getSender().equals("bart@example.com") ||
                        email.getRecipient().equals("bart@example.com"));
        System.out.println("Maile przefiltrowane na podstawie nadawcy lub odbiorcy");
        System.out.println(bartEmails);
    }

    private static <T> List<T> filterEmails(List<T> list, Predicate<T>predicate) {
        List<T> filtered = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t)){
                filtered.add(t);
            }
        }
        return filtered;
    }


    private static List<Email> createEmailList() {
        List<Email> emails = new ArrayList<>();
        emails.add(new Email(
                "joe@example.com",
                "barbara@example.com",
                "Kup bułki",
                "Cześć!, Kup proszę bułki, gdy będziesz wracać z pracy.",
                false)
        );
        emails.add(new Email(
                "carl@example.com",
                "joe@example.com",
                "Nowa inwestycja",
                "Siema! Musimy omówić temat nowej inwestycji, pasuje Ci jutro?",
                true)
        );
        emails.add(new Email(
                "joe@example.com",
                "bart@example.com",
                "Wypad na miasto",
                "Cześć. Idziemy dzisiaj wieczorem z chłopakami na miasto. Dołączasz do nas?",
                true)
        );
        return emails;
    }
}