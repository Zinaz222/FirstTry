package FacebookClone;

public class Profile {
    private BufferedImage picture;
    private String name;
    private String status;
    private ArrayList<Profile> friendslist;

    /** Constructor for an instance of a profile. */
    public Profile()
    {

        friendslist = new ArrayList<>();
    } // end default constructor

    /** Returns the picture associated with the profile.
     @return  The profile's picture. */
    public BufferedImage getProfilePicture()
    {

        return picture;
    } // end getProfilePicture

    /** Sets the picture associated with the profile to the given picture.
     @param newPicture  The new picture associated with the profile. */
    public void setProfilePicture(BufferedImage newPicture)
    {

        picture = newPicture;
    } // end setProfilePicture

    /** Sets the name associated with the profile to the given name.
     @param firstName  The first name for the profile.
     @param lastName   The last name for the profile. */
    public void setName(String firstName, String lastName)
    {
        this.name = firstName +" "+  lastName;

    } // end setName

    /** Returns the name associated with the profile.
     @return  The profile's name. */
    public String getName()
    {

        return this.name;
    } // end getName

    /** Sets the current status of the profile to the given string.
     @param stat  The new status for the profile. */
    public void setStatus(String stat)
    {
        status = stat;
    } // end setStatus

    /** Returns the status associated with the profile.
     @return  The profile's status.*/
    public String getStatus()
    {

        return status;
    } // end getStatus

    /** Returns a list of all the person's friendProfiles on the social network.
     @return  The list of friendProfiles. */
    public ArrayList<Profile> getFriends()
    {

        return friendslist;
    } // end getFriends

    /** Adds a friend to the profile's list of friendProfiles.
     @param p  The profile to be added to the list. */
    public void addFriend(Profile p)
    {

        friendslist.add(p);
    } // end addFriend

    /** Removes a friend from the profile's list of friendProfiles.
     @param p  The profile to be removed from the list.
     @return  True if the profile was removed. */
    public boolean removeFriend(Profile p)
    {

        return friendslist.remove(p);
    } // end removeFriend

    public String toString()
    {

        return name;
    } // end toString

    /** Displays the profile's information and friendProfiles. */
    public void display()
    {
        System.out.println(name);
        System.out.println(status);
        if (friendslist.size ==0){
            System.out.println("User has no friends :(");
        for(String i: friendslist.size){
            System.out.println(friendslist.get(i));
        }
        }
    } // end display
} // end Profile

