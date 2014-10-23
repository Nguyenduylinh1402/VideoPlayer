package com.linhnguyen.videoplayer;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoPlayer extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_video_player);
		
		VideoView vid = (VideoView)findViewById(R.id.videoView);
		//vid.setVideoPath("android.resource://com.linhnguyen.videoplayer"+R.raw.prime);
		vid.setVideoPath("/storage/emulated/0/Download/Prime.mp4");
		vid.setMediaController(new MediaController(this));
		vid.start();
		vid.requestFocus();
	}

}
