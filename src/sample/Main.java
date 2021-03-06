package sample;

import javax.swing.*;

public class Main{

    public static void main(String[] args) {
        NewJFrame newJFrame = new NewJFrame();
        newJFrame.setVisible(true);
        JLabel jLabelWorks = newJFrame.getjLabel5();
        JobList jobList = new JobList();
        JLabel jLabelClient1 = newJFrame.getjLabel1();
        Thread t1 = new Thread(new ThreadClient(jLabelClient1, jobList));
        t1.start();
        JLabel jLabelClient2 = newJFrame.getjLabel2();
        Thread t2 = new Thread(new ThreadClient(jLabelClient2, jobList));
        t2.start();
        JLabel jLabelWorker1 = newJFrame.getjLabel3();
        Thread t3 = new Thread(new ThreadWorker(jLabelWorker1,jLabelWorks, jobList));
        t3.start();
        JLabel jLabelWorker2 = newJFrame.getjLabel4();
        Thread t4 = new Thread(new ThreadWorker(jLabelWorker2,jLabelWorks, jobList));
        t4.start();
    }
}
