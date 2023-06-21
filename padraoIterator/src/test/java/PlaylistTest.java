import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PlaylistTest {

    @Test
    void deveIterarSobreAsMusicasDaPlaylist() {
        Playlist playlist = new Playlist();
        playlist.addSong("Música 1");
        playlist.addSong("Música 2");
        playlist.addSong("Música 3");

        StringBuilder sb = new StringBuilder();
        for (Song song : playlist) {
            sb.append(song.getTitle()).append("\n");
        }

        String expected = "Música 1\nMúsica 2\nMúsica 3\n";
        assertEquals(expected, sb.toString());
    }
}
