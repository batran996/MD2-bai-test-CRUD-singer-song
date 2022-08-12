package model;

import java.util.List;

public class Song  implements Comparable<Song>{
    private  int id;
    private  String name;
    private int listen;
    private int like;
    private List<Singer> listSinger;

    public Song() {
    }

    public Song(int id, String name, int listen, int like) {
        this.id = id;
        this.name = name;
        this.listen = listen;
        this.like = like;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getListen() {
        return listen;
    }

    public void setListen(int listen) {
        this.listen = listen;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public List<Singer> getListSinger() {
        return listSinger;
    }

    public void setListSinger(List<Singer> listSinger) {
        this.listSinger = listSinger;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", listen=" + listen +
                ", like=" + like +
                ", listSinger=" + listSinger +
                '}';
    }

    @Override
    public int compareTo(Song o) {
        if (!this.name.equals(o.name)) {
            return this.name.compareTo(o.name);
        } else {
            return this.listen - o.listen;
        }
    }
}
