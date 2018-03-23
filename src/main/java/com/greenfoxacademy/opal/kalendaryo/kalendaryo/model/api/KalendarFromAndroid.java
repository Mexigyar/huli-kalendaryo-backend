package com.greenfoxacademy.opal.kalendaryo.kalendaryo.model.api;

public class KalendarFromAndroid {

  private String outputGoogleAuthId;
  private String[] inputGoogleCalendars;

  public KalendarFromAndroid() {
  }

  public KalendarFromAndroid(String outputGoogleAuthId, String[] inputGoogleCalendars) {
    this.outputGoogleAuthId = outputGoogleAuthId;
    this.inputGoogleCalendars = inputGoogleCalendars;
  }

  public String getOutputGoogleAuthId() {
    return outputGoogleAuthId;
  }

  public void setOutputGoogleAuthId(String outputGoogleAuthId) {
    this.outputGoogleAuthId = outputGoogleAuthId;
  }

  public String[] getInputGoogleCalendars() {
    return inputGoogleCalendars;
  }

  public void setInputGoogleCalendars(String[] inputGoogleCalendars) {
    this.inputGoogleCalendars = inputGoogleCalendars;
  }
}