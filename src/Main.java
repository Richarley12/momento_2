
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        List<Accountant> count = new ArrayList<>();
        List<Watchman> watch = new ArrayList<>();
        List<CleaningStaff> clean = new ArrayList<>();
        List<Admin> admon = new ArrayList<>();

        boolean stop = false;
        while (!stop) {
            System.out.println("Please enter your option: 1- enter datum 2-print datum 3-Exit");
            int option = Integer.parseInt(inputData.nextLine());
            switch (option) {
                case 1:
                    int flag = 1;
                    while (flag == 1) {
                        System.out.println("Please select what datum to like you enter: 1-Accountant 2- Watchman 3-CleaningStaff 4-Admin 5-Exit");
                        option = Integer.parseInt(inputData.nextLine());
                        switch (option) {
                            case 1:
                                while (option != 0) {
                                    Accountant temp = new Accountant();
                                    System.out.println("Please enter the name");
                                    temp.setName(inputData.nextLine());
                                    System.out.println("Please enter the identification");
                                    temp.setIdentification(inputData.nextLine());
                                    System.out.println("Please enter the age");
                                    temp.setAge(Integer.parseInt(inputData.nextLine()));
                                    System.out.println("Please enter the leader");
                                    temp.setLeader(inputData.nextLine());
                                    System.out.println("Please enter the parking");
                                    temp.setParking(inputData.nextLine());
                                    System.out.println("Would you like enter other datum? 1-Yes or 0-No");
                                    option = Integer.parseInt(inputData.nextLine());
                                    count.add(temp);
                                }
                                break;
                            case 2:
                                while (option != 0) {
                                    Watchman temp = new Watchman();
                                    System.out.println("Please enter the name");
                                    temp.setName(inputData.nextLine());
                                    System.out.println("Please enter the identification");
                                    temp.setIdentification(inputData.nextLine());
                                    System.out.println("Please enter the age");
                                    temp.setAge(Integer.parseInt(inputData.nextLine()));
                                    System.out.println("Please enter the type weapon");
                                    temp.setWeapon(inputData.nextLine());
                                    System.out.println("Please enter the workday");
                                    temp.setWorkday(inputData.nextLine());
                                    System.out.println("Would you like enter other datum? 1-Yes or 0-No");
                                    option = Integer.parseInt(inputData.nextLine());
                                    watch.add(temp);
                                }
                                break;
                            case 3:
                                while (option != 0) {
                                    CleaningStaff temp = new CleaningStaff();
                                    System.out.println("Please enter the name");
                                    temp.setName(inputData.nextLine());
                                    System.out.println("Please enter the identification");
                                    temp.setIdentification(inputData.nextLine());
                                    System.out.println("Please enter the age");
                                    temp.setAge(Integer.parseInt(inputData.nextLine()));
                                    System.out.println("Please enter the dayOff");
                                    temp.setDayOff(inputData.nextLine());
                                    System.out.println("Would you like enter other datum? 1-Yes or 0-No");
                                    option = Integer.parseInt(inputData.nextLine());
                                    clean.add(temp);
                                }
                                break;
                            case 4:
                                while (option != 0) {
                                    Admin temp = new Admin();
                                    System.out.println("Please enter the name");
                                    temp.setName(inputData.nextLine());
                                    System.out.println("Please enter the identification");
                                    temp.setIdentification(inputData.nextLine());
                                    System.out.println("Please enter the age");
                                    temp.setAge(Integer.parseInt(inputData.nextLine()));
                                    System.out.println("Please enter the leader");
                                    temp.setLeader(inputData.nextLine());
                                    System.out.println("Please enter the parking");
                                    temp.setParking(inputData.nextLine());
                                    System.out.println("Would you like enter other datum? 1-Yes or 0-No");
                                    option = Integer.parseInt(inputData.nextLine());
                                    admon.add(temp);
                                }
                                break;
                            case 5:
                                flag = 0;
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Please select what datum to like you print: 1-Accountant 2- Watchman 3-CleaningStaff 4-Admin 5-Exit");
                    option = Integer.parseInt(inputData.nextLine());
                    switch (option) {
                        case 1:
                            for (int i = 0; i < count.size(); i++) {
                                System.out.println(count.get(i).getName());
                                System.out.println(count.get(i).getIdentification());
                                System.out.println(count.get(i).getAge());
                                System.out.println(count.get(i).getLeader());
                                System.out.println(count.get(i).getParking());
                            }
                            break;
                        case 2:
                            for (int i=0; i< watch.size();i++){
                                System.out.println(watch.get(i).getName());
                                System.out.println(watch.get(i).getIdentification());
                                System.out.println(watch.get(i).getAge());
                                System.out.println(watch.get(i).getWeapon());
                                System.out.println(watch.get(i).getWorkday());
                            }
                            break;
                        case 3:
                            for (int i=0; i< clean.size();i++){
                                System.out.println(clean.get(i).getName());
                                System.out.println(clean.get(i).getIdentification());
                                System.out.println(clean.get(i).getAge());
                                System.out.println(clean.get(i).getDayOff());
                            }
                            break;
                        case 4:
                            for (int i=0; i< admon.size();i++){
                                System.out.println(admon.get(i).getName());
                                System.out.println(admon.get(i).getIdentification());
                                System.out.println(admon.get(i).getAge());
                                System.out.println(admon.get(i).getLeader());
                                System.out.println(admon.get(i).getParking());
                            }
                            break;
                        case 5:
                            break;
                    }
                    break;
                case 3: stop=true;
                break;
            }

        }
    }
}