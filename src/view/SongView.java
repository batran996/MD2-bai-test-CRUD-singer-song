package view;

import controller.SongController;
import model.Singer;
import model.Song;

import java.util.Scanner;

public class SongView {
    private final SongController songController = new SongController();
    Scanner sc = new Scanner(System.in);
    public void showListSong() {
        for (Song song : songController.getSong()) {
            System.out.println(song.getId() + ". " + song.getName() + " " + song.getListen() + " " + song.getLike());
        }
        System.out.println("NHAP BACK DE QUAY LAI MENU");
        String backMenu = sc.nextLine();
        if (backMenu.equalsIgnoreCase("back")) {
            new Main();
        }
    }
    //////////////////////////////////////
    public void createSong() {
        System.out.println("Enter song name:");
        String name = sc.nextLine();
        System.out.println("Enter song listen:");
        int listen = Integer.parseInt(sc.nextLine());
        System.out.println("Enter song like");
        int like = Integer.parseInt(sc.nextLine());
        songController.addSong(new Singer(songController.getSong().size() + 1,name,listen,like));
        showListSong();
        System.out.println("NHAP BACK DE QUAY LAI MENU");
        String backMenu = sc.nextLine();
        if (backMenu.equalsIgnoreCase("back")) {
            new Main();
        }

    }





}
