package Game.BH.MatchTheSong.Controller;

import java.util.List;
public class MatchTheSongField {

private List<Song> songs;
private List<Etcaudio> etcaudio;

public List<Song> getSongs() {
return songs;
}

public void setSongs(List<Song> songs) {
this.songs = songs;
}

public List<Etcaudio> getEtcaudio() {
return etcaudio;
}

public void setEtcaudio(List<Etcaudio> etcaudio) {
this.etcaudio = etcaudio;
}

}