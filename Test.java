import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

class VDV implements Comparable<VDV> {
    private static int idCounter = 1;
    private int id;
    private String name;
    private Date dob;
    private Date startTime;
    private Date endTime;
    private long priorityTime; // Thời gian ưu tiên dựa trên tuổi

    public VDV(String name, Date dob, Date startTime, Date endTime) {
        this.id = idCounter++;
        this.name = name;
        this.dob = dob;
        this.startTime = startTime;
        this.endTime = endTime;
        this.priorityTime = calculatePriorityTime(dob);
    }

    private long calculatePriorityTime(Date dob) {
        int age = calculateAge(dob);
        if (age < 18) {
            return 0;
        } else if (age < 25) {
            return 1000;
        } else if (age < 32) {
            return 2000;
        } else {
            return 3000;
        }
    }

    private int calculateAge(Date dob) {
        Date currentDate = new Date();
        int currentYear = currentDate.getYear() + 1900;
        int birthYear = dob.getYear() + 1900;
        return currentYear - birthYear;
    }

    public long getRealTime() {
        return endTime.getTime() - startTime.getTime();
    }

    public long getPriorityTime() {
        return priorityTime;
    }

    public long getAdjustedTime() {
        return getRealTime() + getPriorityTime();
    }

    @Override
    public int compareTo(VDV other) {
        return Long.compare(getAdjustedTime(), other.getAdjustedTime());
    }

    @Override
    public String toString() {
        return "VDV" + String.format("%02d", id) + " " + name + " " + formatTime(getRealTime()) + " "
                + formatTime(getPriorityTime()) + " " + formatTime(getAdjustedTime());
    }

    private String formatTime(long time) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(new Date(time));
    }
}

public class Test {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc dòng trống sau số lượng vận động viên

        ArrayList<VDV> athletes = new ArrayList<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            Date dob = dateFormat.parse(scanner.nextLine());
            Date startTime = timeFormat.parse(scanner.nextLine());
            Date endTime = timeFormat.parse(scanner.nextLine());
            athletes.add(new VDV(name, dob, startTime, endTime));
        }

        // Sắp xếp danh sách vận động viên theo thời gian đã tính ưu tiên
        Collections.sort(athletes);

        for (VDV athlete : athletes) {
            System.out.println(athlete);
        }

        scanner.close();
    }
}
