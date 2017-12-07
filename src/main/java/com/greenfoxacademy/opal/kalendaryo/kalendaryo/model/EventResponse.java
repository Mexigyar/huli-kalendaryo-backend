package com.greenfoxacademy.opal.kalendaryo.kalendaryo.model;


public class EventResponse {

    //Identifies this as a notification channel used to watch for changes to a resource. Value: the fixed string "api#channel".
    String kind = "api#channel";

    //The channel ID
    String channelId;

    //It identifies the watched resource, in our case the event, ID of the event
    String resourceId;

    //  example:  "https://www.googleapis.com/calendar/v3/calendars/my_calendar@gmail.com/events"
    String resourceUri;

    public EventResponse() {
    }

    public EventResponse(String kind, String channelId, String resourceId, String resourceUri) {
        this.kind = kind;
        this.channelId = channelId;
        this.resourceId = resourceId;
        this.resourceUri = resourceUri;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getId() {
        return channelId;
    }

    public void setId(String id) {
        this.channelId = id;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceUri() {
        return resourceUri;
    }

    public void setResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
    }
}
