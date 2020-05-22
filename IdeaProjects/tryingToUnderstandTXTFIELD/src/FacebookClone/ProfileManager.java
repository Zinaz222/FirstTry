package FacebookClone;

import java.awt.image.*;
import GraphPackage.*;
import ADTPackage.*;
/**
 An implementation of a profile manager on a simple social network.

 @author Jesse Grabowski
 @author Joseph Erickson
 @version 5.0 */
public class ProfileManager {
    private UndirectedGraph<Profile> allProfiles;

    /**
     * Constructor for an instance of a profile manager.
     */
    public ProfileManager() {
        allProfiles = new UndirectedGraph<>();
    } // end default constructor

    /**
     * Adds a profile to the social network.
     *
     * @param p The profile to be added to the network.
     */
    public void addProfile(Profile p) {
        allProfiles.addVertex(p);
    } // end addProfile

    /**
     * Creates a friendship between two users on the social network.
     *
     * @param a The first profile in the friendship.
     * @param b The second profile in the friendship.
     */
    public void friendshipTransaction(Profile a, Profile b) {
    } // end friendshipTransaction

    /**
     * Displays each profile's information and friends.
     */
    public void display(Profile startPoint) {
    } // end ProfileManager
}


**************************************************************************************************************************
package facenovelpackage;

import java.util.ArrayList;

/**
 An implementation of a profile manager on a simple social network.
 @author Jesse Grabowski
 @author Joseph Erickson
 @version 5.0 */

public class ProfileManager
{
    //undirected graph containing profiles


    private UndirectedGraph<Profile> allProfiles;



    /* Constructor for profile manager instance */



    public ProfileManager()
    {
        // naming our undirected graph

        allProfiles = new UndirectedGraph<>();


    }

    //end default constructor



    /** Adds profile to Facebook clone
     *
     *
     @param p  Profile that'll be added to the network */


    public void addProfile(Profile p)
    {
        //add vertices for undirected graph that'll be populated with profiles

        allProfiles.addVertex(p);


    }

    // end addProfile

    /** Addition of friends with two users
     *
     *
     @param profileOne  Profile one in friendship transaction


     @param profileTwo  Profile two in friendship transaction */


    public void friendshipTransaction(Profile profileOne, Profile profileTwo)
    {
        a.addFriend(profileTwo);


        b.addFriend(profileOne);
    }

    // end friendshipTransaction



    /** Removes specific profile from the Facebook clone


     @param user  Profile leaving the Facebook clone */




    public void leaveNetwork(Profile user)
    {


        allProfiles.remove(user);


    }



    /** Searches for profile of person based on name
     *
     * If name found, return profile
     *
     * If name not found, "Your search returned no results"


     @param userSearch  Name of user being searched


     @return specified user's profile */


    public Profile findUser(String userSearch)
    {


        for(Profile person : allProfiles.getNetwork())
        {

            if(person.getName().equals(userSearch))
            {

                return user;

            }
        }


        String error = "Your search returned no results";

        return error;
    }



    /** Shows all profiles and user's info
     *
     *
     @param initialProfile  Initial profile that will be displayed */



    public void display(Profile initialProfile)
    {


        ArrayList<Profile> network = allProfiles.getNetwork();


        int initialProfile = network.indexOf(initialProfile);


        for(int i = initialProfile; i < network.size(); i++)
        {
            network.get(i).display();
        }
    }
} // end ProfileManager