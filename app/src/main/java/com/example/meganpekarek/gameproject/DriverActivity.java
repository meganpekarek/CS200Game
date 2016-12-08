package com.example.meganpekarek.gameproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.*;
import java.io.*;
//import mrpstructures.*;

public class DriverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver);
    }

//        private LayoutActivity game;
//
//        public static void main(String[] args) throws IOException {
//
//            LayoutActivity game = new LayoutActivity("sampleHunt.txt", "locationRoutes.txt");
//
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Where would you like to start your search?");
//            String start = sc.next();
//            System.out.println("What would you like to search for?");
//            String item = sc.next();
//            System.out.println(game.search(start, item));
//
//            System.out.println("**********************************************");
//
//            System.out.println("Iterate over the locations");
//            Iterator<String> titleIter = game.getAllTitles();
//            while(titleIter.hasNext()) {
//                System.out.println(titleIter.next());
//                System.out.println();
//            }
//            System.out.println();
//            System.out.println("***********************************************");
//
//            iterateAllTitles(game);
//
//
//            System.out.println("************************************************");
//            System.out.println("Moving from one location to it's specified connection");
//            game.goToConnection("Elizabeth", 1);
//
//            System.out.println();
//            System.out.println("***********************************************");
//        }
//
//        private static void iterateAllTitles(LayoutActivity game) {
//            System.out.println("Iterating over all items");
//            Iterator<String> titleIter2 = game.getAllTitles();
//            while (titleIter2.hasNext()) {
//                String title = titleIter2.next();
//                System.out.println();
//                System.out.println("Items for " + title);
//                System.out.println(game.getItems(title));
//            }
//            Iterator<String> titleIter = game.getAllTitles();
//            while(titleIter.hasNext()){
//                String title = titleIter.next();
//                System.out.println();
//                System.out.println("Iterating over all connections for " + title);
//                System.out.println();
//                Iterator<String> connIter = game.getAllConnections(title);
//                while (connIter.hasNext()) {
//                    System.out.println(connIter.next());
//                }
//            }
//        }
    }
