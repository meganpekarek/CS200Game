package com.example.meganpekarek.gameproject;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.io.*;
import java.util.*;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.io.FileNotFoundException;

public class LayoutActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Layout Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.meganpekarek.gameproject/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Layout Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.meganpekarek.gameproject/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }

        /**
         * associates a given location label with a set of connected locations
         */
        private HashMap<String, Set<String>> connections;
        /**
         * associates a given location with its description object
         */
        private HashMap<String, LocationDescription> descriptions;

        /**
         * Creates a new GameLayout with the title as the key and the item(s) as the value
         */
        public LayoutActivity() {
            connections = new HashMap<String, Set<String>>();
            descriptions = new HashMap<String, LocationDescription>();
        }

        /**
         * Constructor that creates a new GameLayout with the specified info from the fileName
         *
         * @param connectionFile the path to the file containing the book information
         * @throws IOException if the file is not there
         */
//        public LayoutActivity(String itemFile, String connectionFile) {
//            this();
//            try {
//
//                File itemsFile = new File(itemFile);
//                File connFile = new File(connectionFile);
//                Scanner itemSc = new Scanner(itemsFile);
//                Scanner connSc = new Scanner(connFile);
//
//                while (itemSc.hasNextLine()) {
//                    String title = itemSc.nextLine();
//                    String item = itemSc.nextLine();
//                    String trivia = itemSc.nextLine();
//                    int energy = Integer.parseInt(itemSc.nextLine());
//                    itemSc.nextLine();
//                    LocationDescription location = new LocationDescription(title, item, trivia, energy);
//                    add(location);
//                }
//                itemSc.close();
//
//                while (connSc.hasNextLine()) {
//                    String title = connSc.nextLine();
//                    String number = connSc.nextLine();
//                    String value = connSc.nextLine();
//                    Set<String> conns = new HashSet<String>();
//                    while (!value.equals("_")) {
//                        conns.add(value);
//                        value = connSc.nextLine();
//                    }
//                    connections.put(title, conns);
//                }
//                connSc.close();
//
//
//            } catch (IOException e) {
//                return;
//            }
//        }

//        /**
//         * gives an iterator for the titles
//         *
//         * @returns a title iterator
//         */
//        public Iterator<String> getAllTitles() {
//            return connections.keySet().iterator();
//        }
//
//        /**
//         * returns the items for a title as a string
//         *
//         * @param title the title you want to see the items of
//         * @return the items as a string
//         */
//        public LocationDescription getItems(String title) {
//            return descriptions.get(title);
//        }
//
//        /**
//         * gives an iterator for the connections for a location
//         *
//         * @returns an iterator for the present connections or an iterator
//         * for an empty set of connections if the location is not there yet
//         */
//        public Iterator<String> getAllConnections(String title) {
//            if (connections.get(title) != null)
//                return connections.get(title).iterator();
//            Set<String> empty = new HashSet<String>();
//            return empty.iterator();
//        }
//
//        /**
//         * prints out a the connection specified from the specified location
//         *
//         * @param title      is the title of the location you're starting at
//         * @param connection is the connection number you want to go to
//         */
//        public void goToConnection(String title, int connection) {
//            Iterator<String> connsIter = this.getAllConnections(title);
//            String[] connsArray = new String[10];
//            for (int i = 0; i < connsArray.length; i++) {
//                if (connsIter.hasNext())
//                    connsArray[i] = (connsIter.next());
//            }
//            System.out.println();
//            System.out.println("You went from " + title + " to " + connsArray[connection]);
//        }
//
//        public String search(String title, String item) {
//            Queue<String> queue = new LinkedList<String>();
//            queue.add(title);
//            descriptions.get(title).mark();
//            while (!queue.isEmpty()) {
//                String currentLocation = queue.remove();
//                if (descriptions.get(currentLocation).getItem().equals(item)) {
//                    for (String s : queue) {
//                        descriptions.get(s).unmark();
//                    }
//                    return currentLocation;
//                }
//                Iterator<String> iter = getAllConnections(currentLocation);
//                while (iter.hasNext()) {
//                    String neighbor = iter.next();
//                    if (!descriptions.get(neighbor).isMarked()) {
//                        descriptions.get(neighbor).mark();
//                        queue.add(neighbor);
//                    }
//                }
//            }
//            Iterator<String> iter = getAllConnections(title);
//            while (iter.hasNext()) {
//                descriptions.get(iter.next()).unmark();
//            }
//            return null;
//        }
//
//        /**
//         * adds all items and connections of the passed LocationDescription to a certain location or adds it to a new location if the location is not present
//         *
//         * @param item is the LocationDescription to be added to the location the method is called on
//         */
//        public void add(LocationDescription item) {
//            if (descriptions.containsKey(item.getName())) {
//                descriptions.get(item.getName()).setItem(item.getItem());
//                //connections.get(item.getName()).addAll(item.getConnections());
//                // && connections.containsKey(item.getName())
//                return;
//            }
//            descriptions.put(item.getName(), item);
//            descriptions.get(item.getName()).setItem(item.getItem());
//            //connections.put(item.getName(), item.getConnections());
//            //connections.get(item.getName()).addAll(item.getConnections());
//        }
//
//        /**
//         * gets the location description for the specified location title
//         *
//         * @param title is the title of the location
//         * @returns the location description of the book
//         */
//        public LocationDescription getLocationDescription(String title) {
//            return descriptions.get(title);
//        }
//
//        /**
//         * removes an item from a certain location
//         *
//         * @param item is the item to be removed from the location
//         * @throws NoSuchElementException if the title the method is called on doesn't exist
//         *                                or the item doesn't exist in the location's name
//         */
//        public void remove(LocationDescription item) {
//            if (!descriptions.containsKey(item.getName()) && !descriptions.get(item.getName()).getItem().equals(item.getItem())) {
//                throw new NoSuchElementException("cant find in remove");
//            }
//            descriptions.remove(item.getName());
//        }
//
//        /**
//         * writes the information for all location titles and their items and connections to the specified file
//         *
//         * @param itemFile is the file you want to write the items to
//         * @param connFile is the file you want to write the connections to
//         */
//        public void write(String itemFile, String connFile) {
//            try {
//                PrintWriter itemPw = new PrintWriter(itemFile);
//                PrintWriter connPw = new PrintWriter(connFile);
//                for (String title : descriptions.keySet()) {
//                    LocationDescription item = descriptions.get(title);
//                    itemPw.println(item);
//                    itemPw.println("_");
//                }
//                itemPw.close();
//                System.out.println(connections.keySet());
//                for (String title : connections.keySet()) {
//                    connPw.println(title);
//                    for (String conn : connections.get(title)) {
//                        connPw.println(conn);
//                    }
//                    connPw.println("_");
//                }
//                connPw.close();
//            } catch (FileNotFoundException e) {
//                return;
//            }
//        }
//
//        public static void main(String[] args) {
//            LayoutActivity game = new LayoutActivity("sampleHunt.txt", "locationRoutes.txt");
//            game.write("megan", "this");
//        }
    }


