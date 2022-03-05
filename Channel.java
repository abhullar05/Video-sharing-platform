import java.util.Arrays;
import java.util.Objects;

/**
 * Homework 7 - Channel
 * <p>
 * The Channel class represents details about a content uploader.
 * This includes their channel name, subscribers, an array of Video
 * objects created by them, and the number of uploads.
 *
 * @author advitbhullar
 *
 * @version October 11 ,2021
 */

public class Channel {
    /**
     * Name of the channel
     */
    private final String channelName;
    /**
     * Number of subscribers of this channel
     */
    private int channelSubscribers;
    /**
     * Number of videos uploaded by this channel. This may be of use when iterating through the videos array.
     */
    private int numUploads;
    /**
     * An array containing videos uploaded by this creator.
     */
    private Video[] videos;

    public Channel ( String channelName, int channelSubscribers, int numUploads, Video[] videos ) {
        this.channelName = channelName;
        this.channelSubscribers = channelSubscribers;
        this.numUploads = numUploads;
        this.videos = videos;
    }

    public Channel(String channelName) {
        this.channelName = channelName;
        channelSubscribers = 0;
        numUploads = 0;
        videos = new Video[100];
    }
    public void addChannelSubscriber() {

        channelSubscribers++;
    }
    public Video findVideo(String videoName) {
        for (int i = 0; i < numUploads ; i++) {
            if ((videos[i].getVideoName()).equals(videoName)) {
                return videos[i] ;
            }
        }
        return null;
    }

    public String getChannelName() {
        return channelName;
    }

    public int getChannelSubscribers() {
        return channelSubscribers;
    }

    public int getNumUploads() {
        return numUploads;
    }

    public Video[] getVideos() {
        return videos;
    }
    public int getTotalViews() {
        int totalViews = 0;
        for (int i = 0; i < numUploads; i++) {
            totalViews += videos[i].getViews();
        }
        return totalViews;
    }

    public void setChannelSubscribers(int channelSubscribers) {
        this.channelSubscribers = channelSubscribers;
    }

    public void setVideos(Video [] videos, int numUploads) {
        this.videos = videos;
        this.numUploads = numUploads;
    }

    @Override
    public String toString() {
        return "Channel[" + channelName + ", " +
                channelSubscribers +
                ", " + numUploads + ']';
    }
    public boolean uploadVideo ( Video video ) {
        if (numUploads >= 100)
            return false;
        for (int i = 0; i < numUploads; i++) {
            if ((videos[i].getVideoName()).equals(video.getVideoName()))
                return false;
        }
        videos[numUploads] = video;
        numUploads++;
        return true;
    }
}
