package com.groupthree.group3_bookfairsimulator.Fahim;

import java.io.Serializable;
import java.util.ArrayList;

public class addspeaker implements Serializable {
    private String speakerName;
    private String topic;
    private String eLink;

    public addspeaker(String speakerName, String topic, String eLink) {
        this.speakerName = speakerName;
        this.topic = topic;
        this.eLink = eLink;
    }

    public addspeaker() {
    }

    public String getSpeakerName() {
        return speakerName;
    }

    public void setSpeakerName(String speakerName) {
        this.speakerName = speakerName;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getELink() {
        return eLink;
    }

    public void setELink(String eLink) {
        this.eLink = eLink;
    }

    @Override
    public String toString() {
        return "addspeaker{" +
                "speakerName='" + speakerName + '\'' +
                ", topic='" + topic + '\'' +
                ", eLink='" + eLink + '\'' +
                '}';
    }
}
