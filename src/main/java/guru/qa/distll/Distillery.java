package guru.qa.distll;

import java.io.IOException;
import java.util.Scanner;

public class Distillery {

    final static int choiceOne = 1;
    final static int choiceTwo = 2;
    final static String MAIN_QUESTION = "Выберите, пожалуйста, опцию из списка, указав ее номер (1 или 2):"
            + System.lineSeparator() + "1. Подобрать комплект оборудования для домашней винокурни самостоятельно"
            + System.lineSeparator() + "2. Получить оборудование для домашней винокруни в базовой комплектации"
            + System.lineSeparator() + "Ваш выбор >> ";

    public static void main(String[] args) throws IOException {
        System.out.print(MAIN_QUESTION);
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int userChoice = scanner.nextInt();
                if (userChoice == choiceOne) {
                    System.out.println("\nВы выбрали опцию с номером: " + userChoice
                            + System.lineSeparator() + "Чтобы подобрать оборудование самостоятельно, " +
                            "укажите, пожалуйста, интересующий Вас объем перегонного куба (л): ");
                    if (scanner.hasNextInt()) {
                        Suite userSuite = new Suite();
                        int userVolumeAlembic = scanner.nextInt();
                        userSuite.setVolumeAlembic(userVolumeAlembic);
                        System.out.println("Укажите, пожалуйста, интересующую Вас высоту царги (см): ");
                        int userHeightSideBar = scanner.nextInt();
                        userSuite.setHeightSideBar(userHeightSideBar);
                        System.out.println("Укажите, пожалуйста, интересующий Вас объем холодильника (л): ");
                        int userVolumeRefrigerator = scanner.nextInt();
                        userSuite.setVolumeRefrigerator(userVolumeRefrigerator);
                        System.out.println("Вы выбрали следующие параметры оборудования:");
                        userSuite.getSuite(
                                userSuite.getVolumeAlembic(),
                                userSuite.getHeightSideBar(),
                                userSuite.getVolumeRefrigerator());
                        System.out.println("\n\nУчитывая объем выбранного Вами перегонного куба, мы хотели бы " +
                                "предложить Вам уже имеющийся в наличии комплект:");
                        ReadySuite readySuite = new ReadySuite();
                        if (userSuite.getVolumeAlembic() < 20) {
                            Suite finallySuite = new Suite(
                                    readySuite.getReadySuite().get(0).getVolumeAlembic(),
                                    readySuite.getReadySuite().get(0).getHeightSideBar(),
                                    readySuite.getReadySuite().get(0).getVolumeRefrigerator());
                            finallySuite.getSuite(
                                    finallySuite.getVolumeAlembic(),
                                    finallySuite.getHeightSideBar(),
                                    finallySuite.getVolumeRefrigerator());
                        } else if (userSuite.getVolumeAlembic() >= 20 && userSuite.getVolumeAlembic() < 30) {
                            Suite finallySuite = new Suite(
                                    readySuite.getReadySuite().get(1).getVolumeAlembic(),
                                    readySuite.getReadySuite().get(1).getHeightSideBar(),
                                    readySuite.getReadySuite().get(1).getVolumeRefrigerator());
                            finallySuite.getSuite(
                                    finallySuite.getVolumeAlembic(),
                                    finallySuite.getHeightSideBar(),
                                    finallySuite.getVolumeRefrigerator());
                        } else {
                            Suite finallySuite = new Suite(
                                    readySuite.getReadySuite().get(2).getVolumeAlembic(),
                                    readySuite.getReadySuite().get(2).getHeightSideBar(),
                                    readySuite.getReadySuite().get(2).getVolumeRefrigerator());
                            finallySuite.getSuite(
                                    finallySuite.getVolumeAlembic(),
                                    finallySuite.getHeightSideBar(),
                                    finallySuite.getVolumeRefrigerator());
                        }
                        Suite.Gifts gifts = new Suite.Gifts();
                        gifts.sendGifts();
                    } else {
                        System.out.print("Скорее всего Вы ввели строку или дробное число, " +
                                "а с такими данными подобрать из оборудования ничего не получится.");
                    }
                    scanner.close();
                    break;
                } else if (userChoice == choiceTwo) {
                    System.out.println("Вы выбрали опцию с номером: " + userChoice);
                    System.out.println("\nБазовая комплектация оборудования состоит из модулей " +
                            "со следующими параметрами:");
                    Suite defaultSuite = new Suite();
                    defaultSuite.getDefaultSuite();
                    break;
                } else {
                    System.out.print("Введите правильный номер опции из списка (1 или 2): ");
                }
            } else {
                System.out.print("Вы ввели строку или дробное число, а надо номер опции из списка (1 или 2): ");
                scanner.next();
            }
        }
    }
}
