import java.util.Arrays;
import java.util.Objects;

/**
 * Homework 7 - Profile
 * <p>
 * The Profile class represents details about a content viewer.
 * This includes their username, an array of Channel
 * objects representing content creators they've subscribed to, and the
 * number of channels subscribed to.
 *
 * @author advitbhullar
 *
 * @version October 11 ,2021
 */
public class Profile {
    /**
     * Username of the user
     */
    private final String username;
    /**
     * An array containing channels subscribed to by this user.
     */
    private Channel[] subscribed;
    /**
     * Number of channels subscribed to by this user
     */
    private int numSubscribed;

    public Profile(String username) {
        this.username = username;
        numSubscribed = 0;
        subscribed = new Channel[100];
    }
    public Channel findChannel(String channelName) {
        for (int i = 0; i < numSubscribed ; i++ ) {
            if ((subscribed[i].getChannelName()).equals(channelName))
                return subscribed[i];
        }
        return null;
    }

    public Channel[] getSubscribed() {
        return subscribed;
    }

    public String getUsername() {
        return username;
    }

    public void setSubscribed(Channel[] subscribed , int numSubscribed) {
        this.subscribed = subscribed;
        this.numSubscribed = numSubscribed;
    }
    public boolean subscribeToChannel(Channel channel) {
        if (numSubscribed >= 100)
            return false;
        for (int i = 0; i < numSubscribed; i++) {
            if ((subscribed[i].getChannelName()).equals(channel.getChannelName()))
                return false;
        }
        subscribed[numSubscribed] = channel;
        numSubscribed = numSubscribed + 1;
        channel.setChannelSubscribers(channel.getChannelSubscribers() + 1);
        return true;
    }

    @Override
    public String toString() {
        return "Profile[" + username + "]";
    }

}


