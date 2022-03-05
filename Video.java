import java.util.Objects;

/**
 * Homework 7 - Video
 * <p>
 * The Video class represents common details about a video uploaded to a video sharing platform.
 * Each video is created by a Channel.
 *
 * @author advitbhullar
 *
 * @version October 11 ,2021
 */
public class Video {
    /**
     * Name of the video.
     */
    private final String videoName;
    /**
     * Channel which created the video.
     */
    private final Channel channel;
    /**
     * Length of video in seconds
     */
    private final int duration;
    /**
     * Number of views for the video, initialized at zero.
     */
    private int numViews;

    public Video( String videoName, Channel channel, int minutes, int seconds) {
        this.videoName = videoName;
        this.channel = channel;
        this.duration = minutes * 60 + seconds;
        numViews = 0;
    }
    public void addView() {

        numViews++;
    }

    public Channel getChannel() {
        return channel;
    }
    public String getDuration() {
        return String.format("%2d,%2d", duration / 60, duration % 60);
    }
    public int getViews() {
        return numViews;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setViews(int numViews) {
        this.numViews = numViews;
    }

    @Override
    public String toString() {
        return "Video[" +
                videoName + ',' +
                channel + ',' +
                this.getDuration() + ',' +
                numViews +
                ']';
    }

}