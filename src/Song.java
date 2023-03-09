import java.util.ArrayList;
import java.util.Locale;


public class Song {
    //properties


    private String title;
    private String artist;



    //constructor
    public Song(String t, String a){
        title = t;
        artist = a;

    }


    public String getTitle(){
        return title;

    }

    public String getArtist(){
        return artist;

    }
    private static final ArrayList<String> list = new ArrayList<>();
    public static int howMany(ArrayList<String> names){
        int newPersonCount = 0;
        for (String name : names){
            name = name.toLowerCase(Locale.ROOT);
            if (!list.contains(name)){
                list.add(name);
                newPersonCount++;
            }
        }
        return newPersonCount;


    }
}
