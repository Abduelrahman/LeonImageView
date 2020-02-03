package am.leon;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    LeonImageView imageView;
    List<Media> mediaList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_config);
        mediaList.add(new Media("https://brands.solutionplus.net/storage/photos/configs/blue-note-863135.jpeg", Media.TYPE_PHOTO));
        mediaList.add(new Media("https://brands.solutionplus.net/storage/photos/configs/blue-ocean-large-876999.jpeg", Media.TYPE_PHOTO));
//        mediaList.add("https://brands.solutionplus.net/storage/photos/configs/blue-note-863135.jpeg");
        mediaList.add(new Media(null, Media.TYPE_PHOTO));
        mediaList.add(new Media("https://brands.solutionplus.net/storage/photos/configs/blue-note-863135.jpeg", Media.TYPE_VIDEO));
        mediaList.add(new Media("https://brands.solutionplus.net/storage/photos/configs/new-product-config-969255.jpg", Media.TYPE_PHOTO));
        mediaList.add(new Media("https://api.tmooralmadina.solutionplus.net/storage/photos/configs/royal-sagai-582472.jpg", Media.TYPE_PHOTO));
        mediaList.add(new Media("https://api.tmooralmadina.solutionplus.net/storage/photos/configs/royal-mabroom-884161.jpg", Media.TYPE_PHOTO));
        mediaList.add(new Media("https://api.tmooralmadina.solutionplus.net/storage/photos/configs/anbra-934097.png", Media.TYPE_PHOTO));
        mediaList.add(new Media("https://api.tmooralmadina.solutionplus.net/storage/photos/configs/sukkari-figs-apricot-konoz-alalia-496682.png", Media.TYPE_PHOTO));

        imageView = findViewById(R.id.img);
//        imageView.loadImage("https://brands.solutionplus.net/storage/photos/configs/blue-note-863135.jpeg");
        imageView.loadMediaImages(mediaList);

    }

}