package com.sysrs.jobreadiness.corejava.java8;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

/**
 * DateTimeAPI is a modern and comprehensive set of classes and interfaces for
 * handling dates, times, durations, and time zones.
 *
 */
public class DateTimeAPIDemo {

	public static void main(String[] args) {
		// LocalDate: Represents a date (year, month, day)
		LocalDate currentDate = LocalDate.now();
		System.out.println("Current Date: " + currentDate);

		// LocalTime: Represents a time (hour, minute, second)
		LocalTime currentTime = LocalTime.now();
		System.out.println("Current Time: " + currentTime);

		// LocalDateTime: Represents a combination of date and time
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("Current Date and Time: " + currentDateTime);

		// Parsing and Formatting Dates
		String dateStr = "2023-11-25";
		LocalDate parsedDate = LocalDate.parse(dateStr);
		System.out.println("Parsed Date: " + parsedDate);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedDateTime = currentDateTime.format(formatter);
		System.out.println("Formatted Date and Time: " + formattedDateTime);

		// Duration: Represents a time-based amount of time
		LocalTime startTime = LocalTime.of(10, 0);
		LocalTime endTime = LocalTime.of(12, 30);
		Duration duration = Duration.between(startTime, endTime);
		System.out.println(
				"Duration between " + startTime + " and " + endTime + ": " + duration.toMinutes() + " minutes");

		// Period: Represents a date-based amount of time
		LocalDate startDate = LocalDate.of(2022, 1, 1);
		LocalDate endDate = LocalDate.of(2023, 1, 1);
		Period period = Period.between(startDate, endDate);
		System.out.println("Period between " + startDate + " and " + endDate + ": " + period.getYears() + " years and "
				+ period.getMonths() + " months");

		// TemporalAdjusters: Adjusting dates
		LocalDate nextSunday = currentDate.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
		System.out.println("Next Sunday: " + nextSunday);

		// Adding and subtracting time
		LocalDateTime futureDateTime = currentDateTime.plus(1, ChronoUnit.WEEKS);
		System.out.println("Date and Time after one week: " + futureDateTime);

		// ZoneId and ZonedDateTime: Handling time zones
		ZoneId newYorkZone = ZoneId.of("America/New_York");
		ZonedDateTime newYorkDateTime = currentDateTime.atZone(newYorkZone);
		System.out.println("Current Date and Time in New York: " + newYorkDateTime);

		// Clock: Obtaining the current instant
		Clock clock = Clock.systemUTC();
		Instant instant = Instant.now(clock);
		System.out.println("Current Instant: " + instant);
	}
}
