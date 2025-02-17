import java.util.Scanner;
/*Name:Riley Kelm
Date: February 17th 2025
Description:Takes in the temperature over the course of days and tells the usert eh average temp the highest temp and the lowest temp




 */
public class Assignment2 {
    private static Scanner input = new Scanner((System.in));

    public static void main(String[] args) {
        boolean date_checker = false;
        float[][] temp = new float[1][1];
        int highest_temp = 0;
        int lowest_temp = 0;
        float average_temp=0;
        int days = 0;
        while (date_checker == false) {
            System.out.println("Please input the number of days you are recording over");
            days = input.nextInt();
            if (days > 366 || days < 2) {
                System.out.println("Please input only a whole number between 2 and 366");
            } else {
                temp = new float[days][3];
                date_checker = true;
            }
        }

        for (int x = 0; x < days; ) {
            for (int i = 0; i < 3; ) {
                while (i == 0) {
                    System.out.printf("Please input the low temperature for the day "+(x+1));
                    temp[x][i] = input.nextFloat();
                    System.out.println(temp[x][i]);

                    if (-100 <= temp[x][i] && temp[x][i] <= 100) {
                        if (x != 0) {
                            if (temp[x][i] < temp[lowest_temp][i]) {
                                lowest_temp = x;

                            }
                        }
                        i = i + 1;
                    } else {
                        System.out.println("That is not a valid input please make sure it is between -100 and 100");
                    }

                }
                while (i == 1) {
                    System.out.println("Please input the high temperature for the day"+(x+1));
                    temp[x][i] = input.nextFloat();

                    if (-100 <= temp[x][i] && temp[x][i] <= 100 && temp[x][i] >= temp[x][i - 1]) {
                        if (x != 0) {
                            if (temp[x][i] > temp[highest_temp][i]) {
                                highest_temp = x;
                            }
                        }
                        i = i + 1;
                    } else {
                        System.out.println("That is not a valid input make sure it is between -100 and 100 and greater or equal to your lowest temperature ");
                    }
                }
                while (i == 2) {
                    temp[x][i] = (temp[x][1] + temp[x][0]) / 2;
                    average_temp+=temp[x][i];
                    System.out.println(temp[x][i]);
                    i = i + 1;
                }
            }
            x = x + 1;
        }



        for (int x = 0; x < days; x++ ) {
            System.out.println("The average temperature for day "+(x+1)+"is "+temp[x][2]);
        }
        System.out.println("The overall average temperature is "+(average_temp/days));
        System.out.println("The day that had the highest temperature was day "+(highest_temp+1)+" with a temperature of "+(temp[highest_temp][1]));
        System.out.println("The day that had the lowest temperature was day "+(lowest_temp+1)+" with a temperature of "+(temp[lowest_temp][0]));
    }
    }

