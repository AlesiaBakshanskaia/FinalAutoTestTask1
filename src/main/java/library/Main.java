package library;

import library.fund.MainFund;
import library.search.Searcher;
import library.storageMedium.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<StorageMedium> listMediaOurFund = new ArrayList<>();
        listMediaOurFund.add(new Book("Мурзук", 1974, 1, "Бианки"));
        listMediaOurFund.add(new Book("Грокаем алгоритмы", 2022, 2, "Бхаргава"));
        listMediaOurFund.add(new Magazine("Фома", 2023, 3, "12"));
        listMediaOurFund.add(new Magazine("Один дома", 1995, 4, "20"));
        listMediaOurFund.add(new Microfilm(
                "Наградной лист Иванова И.И.", 1965, 5, MicrofilmType.MICROFICHE));
        listMediaOurFund.add(new Letter(
                "Я к вам пишу...", 1833, 6, "Татьяна", "Онегин"));

        MainFund mainFund = new MainFund(
                "Муниципальная библиотека", "Петергоф", listMediaOurFund, new ArrayList<>());
        mainFund.addStorageMediaInList(new Book("Оранжевое горлышко", 1974, 7, "Бианки"));
        Searcher searcher = new Searcher();

        System.out.println("Мы рады приветствовать вас в основном фонде нашей библиотеки");
        while (true) {
            try {
                System.out.printf("%nВведите id интересующего вас носителя информации" +
                        "%n или автора книг или писем," +
                        "%n или 0, если хотите закончить работу: ");
                String data = getDataFromReader();
                try {
                    int id = Integer.parseInt(data);
                    if (id == 0) {
                        System.exit(0);
                    }
                    List<StorageMedium> results = searcher.findStorageMedium(mainFund, id);
                    if (results.size() == 0) {
                        System.out.printf("Носителя информации с номером %d в нашем фонде нет%n", id);
                    }
                    for (StorageMedium storageMedium : results) {
                        storageMedium.printMedium();
                    }
                } catch (NumberFormatException nfe) {
                    List<StorageMedium> results = searcher.findStorageMedium(mainFund, data);
                    if (results.size() == 0) {
                        System.out.printf("Книг или писем автора %s в нашем фонде нет%n", data);
                    }
                    for (StorageMedium storageMedium : results) {
                        storageMedium.printMedium();
                    }
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }


    }

    public static String getDataFromReader() {
        Scanner in = new Scanner(System.in);
        return in.next();
    }
}