package com.aps.mp3;

import com.mpatric.mp3agic.ID3v2;
import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.Mp3File;
import com.mpatric.mp3agic.UnsupportedTagException;

import java.io.IOException;
import java.nio.file.Path;

public class Mp3 {
    public static String getArtist(Path path) {
        try {
            Mp3File mp3file = new Mp3File(path);
            ID3v2 id3v2Tag = mp3file.getId3v2Tag();
            return id3v2Tag != null ? id3v2Tag.getAlbumArtist() : null;
        } catch (IOException | UnsupportedTagException | InvalidDataException e) {
            return null;
        }
    }
}
