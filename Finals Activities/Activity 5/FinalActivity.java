package finalactivity;

import java.util.Scanner;
import java.text.DecimalFormat;

public class FinalActivity {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int weeklyGross, employee = 1, ctr = 1;
        double weeklyBonus;
        char classLabel = ' ';
        DecimalFormat df = new DecimalFormat("0.00");

        double payRange[] = new double[9];
        char label[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        int classCount[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};

        System.out.println("---------- SIMULATION START ----------");
        for (int i = 0; i < 50; i++) {
                try {
                    System.out.println("Employee " + (i + 1) + " Gross");
                    weeklyGross = sc.nextInt();

                    if (weeklyGross < 0 || weeklyGross < 100000) {
                        weeklyBonus = (double) weeklyGross * 0.09;
                        payRange[i] = weeklyBonus + 200;
                        if (payRange[i] >= 200 && payRange[i] <= 299) {
                            classLabel = label[0];
                            ctr++;
                            classCount[0]++;
                        } 
                        else if (payRange[i] >= 300 && payRange[i] <= 399) {
                            classLabel = label[1];
                            ctr++;
                            classCount[1]++;
                        } 
                        else if (payRange[i] >= 400 && payRange[i] <= 499) {
                            classLabel = label[2];
                            ctr++;
                            classCount[2]++;
                        } 
                        else if (payRange[i] >= 500 && payRange[i] <= 599) {
                            classLabel = label[3];
                            ctr++;
                            classCount[3]++;
                        } 
                        else if (payRange[i] >= 600 && payRange[i] <= 699) {
                            classLabel = label[4];
                            ctr++;
                            classCount[4]++;
                        } 
                        else if (payRange[i] >= 700 && payRange[i] <= 799) {
                            classLabel = label[5];
                            ctr++;
                            classCount[5]++;
                        } 
                        else if (payRange[i] >= 800 && payRange[i] <= 899) {
                            classLabel = label[6];
                            ctr++;
                            classCount[6]++;
                        } 
                        else if (payRange[i] >= 900 && payRange[i] <= 999) {
                            classLabel = label[7];
                            ctr++;
                            classCount[7]++;
                        } 
                        else if (payRange[i] > 1000) {
                            classLabel = label[8];
                            ctr++;
                            classCount[8]++;
                        }
                        System.out.println("Employee #" + (i + 1));
                        System.out.println("Week Gross " + (i + 1) + ": " + df.format(weeklyGross));
                        System.out.println("Week Bonus " + (i + 1) + ": " + df.format(weeklyBonus));
                        System.out.println("Week Total " + (i + 1) + ": " + df.format(payRange[i]));
                        System.out.println("Classification " + (i + 1) + ": " + classLabel);
                        System.out.println("----------");

                        System.out.println("Enter new employee?\n[1] Yes\n[2] No");
                        employee = sc.nextInt();
                        if (employee == 2){
                            for (i = 0; i < 9; i++) {
                                System.out.println("There are " + classCount[i] + " in Classification " + label[i]);
                            }
                            System.exit(0);
                        }
                            
                        System.out.println("---------- SIMULATION SUCCESSFUL ----------");
                    } else {
                        System.out.println("---------- SIMULATION FAILED ----------");
                        System.exit(0);
                    }
                } catch (NumberFormatException ex) {
                    System.out.println("---------- SIMULATION FAILED ----------");
                    System.exit(0);
                }
            }
        }
    }
