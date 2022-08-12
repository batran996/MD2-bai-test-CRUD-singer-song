package service.singer;

import model.Singer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SingerServiceIMPL implements ISingerService {

    private static final List<Singer> singerList = new ArrayList<>();

    static {
        singerList.add(new Singer(1, "sơn tùng", 30, like));
        singerList.add(new Singer(2, "sơn tường", 28, like));
        singerList.add(new Singer(3, "sơn nhà", 25, like));
        singerList.add(new Singer(4, "sơn cầu", 20, like));
    }


    @Override
    public List<Singer> findAll() {
        return singerList;
    }

    @Override
    public void save(Singer e) {
        singerList.add(e);
    }

    @Override
    public void deleteById(int id) {
        singerList.remove(id - 1);
        updateId();
    }

    @Override
    public Singer findById(int id) {
        return singerList.get(id - 1);
    }

    public void sort() {
        Collections.sort(singerList);
        updateId();
    }

    public void updateId() {
        for (int i = 0; i < singerList.size(); i++) {
            singerList.get(i).setId(i + 1);

        }
    }
}
