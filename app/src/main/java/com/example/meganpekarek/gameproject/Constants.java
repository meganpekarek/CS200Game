package com.example.meganpekarek.gameproject;

/**
 * Created by meganpekarek on 12/5/16.
 */
public class Constants {
    public final static String startTitle = "Start";
    public final static String startItem = "#";
    public final static String startMsg = "You must answer the trivia questions correctly in order to retrieve your three items! First one is: " + "\n" + "What does Davy Jones have growing out of his face?";
    public final static int startEnergy = 0;

    public final static String losePatchTitle = "You lost your eye patch! -20 energy units";
    public final static String patchItem = "#";
    public final static String patchMsg = "What is Barbossa's first name?";
    public final static int patchEnergy = -20;

    //        if (findViewById(R.id.fragment_container) != null) {
//
//            // However, if we're being restored from a previous state,
//            // then we don't need to do anything and should return or else
//            // we could end up with overlapping fragments.
//            if (savedInstanceState != null) {
//                return;
//            }
//
//            // Create a new Fragment to be placed in the activity layout
//            StartFragment firstFragment = new StartFragment();
//
//            // In case this activity was started with special instructions from an
//            // Intent, pass the Intent's extras to the fragment as arguments
//            firstFragment.setArguments(getIntent().getExtras());
//
//            // Add the fragment to the 'fragment_container' FrameLayout
//            getSupportFragmentManager().beginTransaction()
//                    .add(R.id.fragment_container, firstFragment).commit();
//        }

    //        FragmentTransaction ft = getFragmentManager().beginTransaction();
//        StartFragment myFrag = new StartFragment();
//        ft.add(R.id.fragment_container, myFrag);
//        ft.commit();


//    public Fragment goToFragment(String _frag) {
//        Fragment f = null;
//        switch (_frag) {
//            case StartFragment.TAG:
//                f = new StartFragment();
//                FragmentTransaction ft = getFragmentManager().beginTransaction();
//                ft.replace(FragmentTransaction.TRANSIT_FRAGMENT_FADE, null);
//                ft.commit();
//                break;
//        }
//        return f;
//    }


//    display("What is Barbossa's real name?", "Hector", "Robert");
//    switch (view.getId()) {
//        case R.id.begin_button:
//            display("What does Barbossa have coming out of his face?", "Tentacles", "Hands");
//            break;
//        case R.id.after_button:
//            display("What does Elizabeth love?", "Will", "Me");
//            break;
//    }

//    /**
//     * gets the item at the location
//     *
//     * @return the item of the location
//     */
//    public Item getItem() {
//        return item;
//    }
//
//    /**
//     * sets the item for the location
//     *
//     * @param item the item you want to set for the location
//     */
//    public void setItem(Item item) {
//        this.item = item;
//    }

//    String title = Constants.startTitle;
//    String item = Constants.startItem;
//    //     String trivia = Constants.startMsg;
//    int energy = Constants.startEnergy;
//    //LocationDescription location = new LocationDescription(title, item, trivia, this.energy + energy);
//    //    add(location);
//
//    String title2 = Constants.startTitle;
//    String item2 = Constants.startItem;
//    String trivia2 = Constants.startMsg;
//    int energy2 = Constants.startEnergy;
//    //    LocationDescription location2 = new LocationDescription(title2, item2, trivia2, this.energy + energy2);
//    //   add(location2);
//
//    String titleConn = Constants.startTitle;
//    //String number = connSc.nextLine();
//    String[] value = {Constants.losePatchTitle, ""};
//    //      connections.put(titleConn, value);

//    HashMap<String, String> btn1Map = new HashMap<String, String>();
//    btn1Map.put("Port", "Tentacles");
//    btn1Map.put("LoseEyePatch", "Something else");
//    btn1Map.put("Port", "this thing");

}
