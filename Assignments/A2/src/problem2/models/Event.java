package problem2.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Event {
    private final String name;
    private final LocalDateTime date;
    private final ZoneId timezone;

    public Event(String name, LocalDateTime date, ZoneId timezone) {
        this.name = name;
        this.date = date;
        this.timezone = timezone;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println(formatZoned(date.atZone(timezone)));
    }

    public void displayInTimeZone(ZoneId targetZone) {
        ZonedDateTime systemZoned = date.atZone(timezone);
        ZonedDateTime converted = systemZoned.withZoneSameInstant(targetZone);
        System.out.println(formatZoned(converted));
    }

    public void displayDetails() {
        String dayOfWeek = date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        boolean isLeapYear = date.toLocalDate().isLeapYear();

        LocalDate today = LocalDate.now();
        long daysUntil = ChronoUnit.DAYS.between(today, date.toLocalDate());

        System.out.println("\n=== Event Created ===");
        System.out.println("Name: " + name);
        System.out.println("Formatted: " + formatZoned(date.atZone(timezone)));
        System.out.println("Day of week: " + dayOfWeek);
        System.out.println("Leap year: " + (isLeapYear ? "Yes" : "No"));

        if (daysUntil > 0) {
            System.out.println("Days from today to event date: " + daysUntil);
        } else if (daysUntil == 0) {
            System.out.println("Days from today to event date: 0 (today)");
        } else {
            System.out.println("Days from today to event date: " + daysUntil + " (event is in the past)");
        }
    }

    private String formatZoned(ZonedDateTime zdt) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy @ HH:mm", Locale.ENGLISH);
        return zdt.format(fmt) + " [" + zdt.getZone().getId() + "]";
    }
}