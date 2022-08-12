package controller;

import model.Singer;
import model.Song;
import service.song.ISongSevice;
import service.song.SongSeviceIPLM;

import java.util.List;

public class SongController {
    private ISongSevice songSevice = new SongSeviceIPLM();
    public List<Song> getSong(){
      return   songSevice.findAll();
    }
    public void addSong(Singer song) {
        songSevice.save(song);
    }
    public void deleteSong(int id) {
        songSevice.deleteById(id);
    }
    public Song findSongById(int id) {
        return songSevice.findById(id);
    }
    public void sortSongList() {
        songSevice.sort();
    }
}
