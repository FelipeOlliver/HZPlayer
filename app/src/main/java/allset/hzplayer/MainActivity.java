package allset.hzplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer hzPlayerMediaPlayer = MediaPlayer.create(this, R.raw.khz14000);
        final Button play14khz = (Button) this.findViewById(R.id.play_14khz);
        play14khz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hzPlayerMediaPlayer.start();
            }
        });


    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
