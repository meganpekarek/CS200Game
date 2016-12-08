package com.example.meganpekarek.gameproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;

import java.io.*;
import java.util.*;

public class LocationDescription {

        /**
         * the title of the location
         */
        private String title;

        /**
         * the trivia at the location
         */
        private Trivia trivia;

        /**
         * the energy change at the location
         */
        private int energy;

        /**
         * marks each seen location for the search method
         */
        private boolean mark = false;

        /**
         * Creates a new LocationDescription with the specified title and item
         *
         * @param title is the title of the location
         */
        public LocationDescription(String title, Trivia trivia, int energy) {
            this.title = title;
            this.trivia = trivia;
            this.energy = energy;

    //        trivia = new Trivia("Jack", "Black", "is", "back", "whack");
//            Gson gson = new Gson();
//            String file = gson.toJson(trivia);
//            System.out.println(file);
        }

        public boolean isMarked() {
            return mark;
        }

        /**
         * sets a location to seen or marked
         */
        public void mark() {
            mark = true;
        }

        /**
         * sets a location to unseen or unmarked
         */
        public void unmark() {
            mark = false;
        }

        /**
         * gets the title
         *
         * @return the title of the location
         */
        public String getName() {
            return title;
        }

        /**
         * sets the title for the location
         *
         * @param title the title you want to set for the location
         */
        public void setName(String title) {
            this.title = title;
        }

        /**
         * gets the trivia
         *
         * @return the trivia of the location
         */
        public Trivia getTrivia() {
            return trivia;
        }

        /**
         * sets the trivia for the location
         *
         * @param trivia the trivia you want to set for the location
         */
        public void setTrivia(Trivia trivia) {
            this.trivia = trivia;
        }

        /**
         * gets the energy change
         *
         * @return the change in energy for the location
         */
        public int getEnergy() {
            return energy;
        }

        /**
         * sets the energy for the location
         *
         * @param energy the change in energy you want to set for the location
         */
        public void setEnergy(int energy) {
            this.energy = energy;
        }

        /**
         * method to give all information for a certain location as a string
         * @returns a string of all the information
         */
        public String toString() {
            return title + "\n" + trivia + "\n" + energy;
        }
    }

