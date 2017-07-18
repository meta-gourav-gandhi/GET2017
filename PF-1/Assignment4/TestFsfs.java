

import org.junit.Test;

public class TestFsfs {

    @Test
    public void fsfsTestCase1() {
        int[] arrival_time = {1, 5, 9, 25};
        int[] job_size = {12, 7, 2, 5};
        Fcfs f = new Fcfs();
        int[][] output = f.FCFS(arrival_time, job_size);
        System.out.println("Job  job_arrived_time   Job_wait_time   Job_Start_at   Job_finished_at ");

        for (int i = 0; i < 4; i++) {
            System.out.print((i + 1) + "                   ");
            for (int j = 0; j < 4; j++) {
                System.out.print(output[i][j] + "           ");
            }
            System.out.println("");
        }
    }
}
