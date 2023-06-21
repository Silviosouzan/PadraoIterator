import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class Playlist implements Iterable<Song> {
    private List<Song> songs = new ArrayList<>();

    public void addSong(String title) {
        Song song = new Song(title);
        songs.add(song);
    }

    @Override
    public Iterator<Song> iterator() {
        return songs.iterator();
    }
}