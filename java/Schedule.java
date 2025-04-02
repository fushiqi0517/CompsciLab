import java.io.*;
import java.util.*;

public class Schedule {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("schedule.dat"));
        int n = Integer.parseInt(br.readLine()); // Number of datasets

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine()); // Number of jobs
            List<Job> jobs = new ArrayList<>();

            for (int j = 0; j < x; j++) {
                String[] times = br.readLine().split(" ");
                int start = convertToMinutes(times[0], times[1]);
                int end = convertToMinutes(times[2], times[3]);
                jobs.add(new Job(start, end));
            }

            System.out.println(maxNonOverlappingJobs(jobs));
        }
        br.close();
    }

    static int convertToMinutes(String time, String period) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);

        // Convert to 24-hour format
        if (period.equals("PM") && hours != 12) {
            hours += 12;
        } else if (period.equals("AM") && hours == 12) {
            hours = 0;
        }

        return hours * 60 + minutes;
    }

    static int maxNonOverlappingJobs(List<Job> jobs) {
        jobs.sort(Comparator.comparingInt(job -> job.end));

        int count = 0;
        int lastEndTime = 180; // 03:00 AM in minutes

        for (Job job : jobs) {
            if (job.start >= lastEndTime) {
                count++;
                lastEndTime = job.end;
            }
        }

        return count;
    }

    static class Job {
        int start;
        int end;

        Job(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
