package com.groupthree.group3_bookfairsimulator.Fahim;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class addspeakerManager {
    private static final String fileName = "Data/addspeaker.bin";

    public static ArrayList<addspeaker> speakerList = new ArrayList<>();
    static {
        speakerList.addAll(getspeakerList());
    }

    private static ArrayList<addspeaker> getspeakerList() {

        ArrayList<addspeaker> addspeakersList = new ArrayList<>();

        try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(fileName))) {
            addspeakersList = (ArrayList<addspeaker>) stream.readObject();
        } catch (InvalidClassException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return addspeakersList;
    }

    public static void savespeakerList() {
        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            ArrayList<addspeaker> tempList = new ArrayList<>(speakerList);
            stream.writeObject(tempList);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Could not save data to file");
        }
    }


    public static void resetspeakerList() {
        speakerList.clear();
        savespeakerList();
    }
}


