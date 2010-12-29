package com.cmoos.vlcj;

import uk.co.caprica.vlcj.player.*;
import uk.co.caprica.vlcj.player.headless.*;

public class VLCJStreamInfo {
  public static void main(String[] args) {
    String[] libvlcArgs = {};
    System.setProperty("vlcj.log", "DEBUG");

    MediaPlayerFactory mediaPlayerFactory = new MediaPlayerFactory(libvlcArgs);
    HeadlessMediaPlayer mediaPlayer = mediaPlayerFactory.newMediaPlayer();
    mediaPlayer.playMedia("mmsh://media3.abc.net.au/raelp", ":sout=#description");
  }
}
