import java.util.HashMap;
import java.util.Map;

public class MostPlayedSong {


    Map<String, Map<String, Integer>> band_song_count = new HashMap<String, Map<String, Integer>>();

    public void play(String bandname, String songname){
        System.out.println("BandName :" + bandname + " --->Song :" + songname);
        //Increment the count for song played in the band_song_count hashmap

        //first check if contains bandname key
        Map tempMap = band_song_count.get(bandname);
        if(band_song_count.containsKey(bandname))
        {
            if(tempMap.containsKey(songname)) {
                int new_count = (int) tempMap.get(songname) + 1;
                tempMap.put(songname, new_count);
            }
            else
            {
                tempMap.put(songname, 1);
            }
        }
        else
        {
            band_song_count.put(bandname, tempMap = new HashMap<>());
            band_song_count.get(bandname).put(songname, 1);
        }
    }
    String topSong(String bandname) {
        //parsing logic
        String song_name = null;
        int max_count = 0;
        if(band_song_count.containsKey(bandname))
        {
            for(Map.Entry<String , Integer> t: band_song_count.get(bandname).entrySet())
            {
                if(t.getValue() > max_count)
                {
                    song_name = t.getKey();
                    max_count = t.getValue();
                }
            }
        }
        System.out.println("Maximum Song played is: " + song_name + " Played " + max_count + " times" );
        return song_name;
    }

    public void print(){
        for(Map.Entry <String, Map <String, Integer>> t :this.band_song_count.entrySet()){
            String bandIs = t.getKey();
            for (Map.Entry<String,Integer> e : t.getValue().entrySet())
                System.out.println("OuterKey:" + bandIs + " InnerKey: " + e.getKey()+ " VALUE:" +e.getValue());
        }
    }

    public static void main(String[] args) {
        MostPlayedSong mostPlayedSong=new MostPlayedSong();
        mostPlayedSong.play("Guns N Roses", "Welcome To the Jungle");
        mostPlayedSong.play("Guns N Roses", "Welcome To the Jungle");
        mostPlayedSong.play("Guns N Roses", "Welcome To the Jungle");
        mostPlayedSong.play("Guns N Roses", "Welcome To the Jungle");
        mostPlayedSong.play("Guns N Roses", "Hello");
        mostPlayedSong.play("Guns N Roses", "1Hello");
        mostPlayedSong.play("Guns N Roses", "1Hello");
        mostPlayedSong.play("Guns N Roses", "1Hello");
        mostPlayedSong.play("Guns N Roses", "1Hello");
        mostPlayedSong.play("Guns N Roses", "1Hello");
        mostPlayedSong.play("Guns N Roses", "1Hello");
        mostPlayedSong.play("Guns N Roses", "1Hello");
        mostPlayedSong.play("Guns N Roses", "1Hello");
        mostPlayedSong.play("Guns N Roses", "1Hello");



        System.out.println(mostPlayedSong.topSong("Guns N Roses"));
    }
}
