package view;

import controller.SingerController;
import model.Singer;

import java.util.Scanner;

public class SingerView {

    Scanner sc = new Scanner(System.in);
    private final SingerController singerController = new SingerController();

    public void showListSinger() {
        for (Singer singer : singerController.getSingers()) {
            System.out.println(singer.getId() + ". " + singer.getName() + " " + singer.getAge());
        }
        System.out.println("NHAP BACK DE QUAY LAI MENU");
        String backMenu = sc.nextLine();
        if (backMenu.equalsIgnoreCase("back")) {
            new Main();
        }

    }

    public void createSinger() {
        System.out.println("Enter singer name:");
        String name = sc.nextLine();
        System.out.println("Enter singer age:");
        int age = Integer.parseInt(sc.nextLine());
        singerController.addSinger(new Singer(singerController.getSingers().size() + 1, name, age));
showListSinger();
        System.out.println("NHAP BACK DE QUAY LAI MENU");
        String backMenu = sc.nextLine();
        if (backMenu.equalsIgnoreCase("back")) {
            new Main();
        }

    }

    public void deleteSinger() {
        System.out.println("Enter singer id to delete: ");
        int id = Integer.parseInt(sc.nextLine());
        if (!isValid(id)) {
            System.out.println("Id out of range");
            return;
        }
        System.out.println("Are you sure want to delete (Y / N)?");
        String check = sc.nextLine();
        if (check.equalsIgnoreCase("y")) {
            singerController.deleteSinger(id);
            showListSinger();
            System.out.println("NHAP BACK DE QUAY LAI MENU");
            String backMenu = sc.nextLine();
            if (backMenu.equalsIgnoreCase("back")) {
                new Main();
            }
        } else if (check.equalsIgnoreCase("n")) {
            System.out.println("Not deleting you are list singer");
            showListSinger();
        } else {
            System.out.println("Invalid choice");
            System.out.println("NHAP BACK DE QUAY LAI MENU");
            String backMenu = sc.nextLine();
            if (backMenu.equalsIgnoreCase("back")) {
                new Main();
            }
        }
    }

    public void showDetailSinger() {
        System.out.println("Enter singer id to show:");
        int id = Integer.parseInt(sc.nextLine());
        Singer singer = singerController.findSingerById(id);
        System.out.println("Id: " + singer.getId() + ", name: " + singer.getName() + ", age: " + singer.getAge());
        System.out.println("NHAP BACK DE QUAY LAI MENU");
        String backMenu = sc.nextLine();
        if (backMenu.equalsIgnoreCase("back")) {
            new Main();
        }
    }

    public void updateSinger() {
        System.out.println("EDIT SINGER");
        System.out.println("Enter singer id :");
        int id = Integer.parseInt(sc.nextLine());
        if (!isValid(id)) {
            System.out.println("Id out of range");
            System.out.println("NHAP BACK DE QUAY LAI MENU");
            String backMenu = sc.nextLine();
            if (backMenu.equalsIgnoreCase("back")) {
                new Main();
            }
        }
        Singer singer = singerController.findSingerById(id);
        System.out.println("Enter new singer name:");
        String name = sc.nextLine();
        System.out.println("Enter new singer age:");
        int age = Integer.parseInt(sc.nextLine());
        singer.setName(name);
        singer.setAge(age);
        showListSinger();
        System.out.println("NHAP BACK DE QUAY LAI MENU");
        String backMenu = sc.nextLine();
        if (backMenu.equalsIgnoreCase("back")) {
            new Main();
        }
    }

    public void sortSingerList() {
        singerController.sortSingerList();
        System.out.println("Singer list sorted");
        showListSinger();
        System.out.println("NHAP BACK DE QUAY LAI MENU");
        String backMenu = sc.nextLine();
        if (backMenu.equalsIgnoreCase("back")) {
            new Main();
        }
    }

    private boolean isValid(int id) {
        int size = singerController.getSingers().size();
        for (int i = 0; i <size ; i++) {
            if (id == new SingerController().getSingers().get(i).getId()){
                return true;
            }
        }
        return false;
    }
}
