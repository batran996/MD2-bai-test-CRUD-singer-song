package service.song;

import model.Song;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SongSeviceIPLM implements ISongSevice {
    public static List<Song> listSong = new ArrayList<>();

    static {
        listSong.add(new Song(1, "bai hat 1", 100, 20));
        listSong.add(new Song(2, "bai hat 2", 150, 30));
        listSong.add(new Song(3, "bai hat 3", 200, 50));
        listSong.add(new Song(4, "bai hat 4", 250, 100));
    }

    @Override
    public List<Song> findAll() {
        return listSong;
    }

    @Override
    public void save(Song e) {
        listSong.add(e);
    }

    @Override
    public void deleteById(int id) {
        listSong.remove(id);

    }

    @Override
    public Song findById(int id) {
        for (int i = 0; i < listSong.size(); i++) {
            if (id == listSong.get(i).getId()){
                return listSong.get(i);
            }
        }
        return null;
    }

    @Override
    public void sort() {
        Collections.sort(listSong);
    }


}
