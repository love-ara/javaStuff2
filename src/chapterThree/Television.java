package chapterThree;

import java.util.HashSet;
import java.util.Set;

public class Television {
    private boolean isOn;
    private int volume;
    private int channel;
    private Set<Integer> channelSet;

    public boolean isTvOn(){
        return isOn;
    }

    public void toggle(){
        isOn = !isOn;
        if(isOn){
            volume = 0;
            channel = 1;
            channelSet = new HashSet<>();

        }
    }

    public void increaseVolume(){
        volume++;
    }

    public void reduceVolume(){
        if(volume > 0) {
            volume--;
        }
    }

    public int getVolume(){
        return volume;
    }
    public void setChannel(int newChannel){
        channel = newChannel;
        channelSet.add(newChannel);
    }

    public int searchChannel(int searchedChannel){
       if(channelSet.contains(searchedChannel)){
           return searchedChannel;
       }else {
           return channel;
       }
    }

    public int getChannel(){
        return channel;
    }
}
