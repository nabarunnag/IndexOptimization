package com.gs.pwm.concert.data.model;

import org.apache.geode.pdx.PdxReader;
import org.apache.geode.pdx.PdxSerializable;
import org.apache.geode.pdx.PdxWriter;

public class Position implements PdxSerializable {
  public String accountID;
  public String partyID;
  public String entityId;
  public String region;
  public String name;

  public Position() {
  }

  public Position(String randomString) {
    this.accountID = randomString;
    this.partyID = randomString;
    this.entityId = randomString;
    this.region = randomString;
    this.name = randomString;
  }

  @Override
    public void toData(PdxWriter pdxWriter) {
      pdxWriter.writeString("accountID", accountID);
      pdxWriter.writeString("partyID", partyID);
      pdxWriter.writeString("entityId", entityId);
      pdxWriter.writeString("region", region);
      pdxWriter.writeString("name", name);
    }

  @Override
  public void fromData(PdxReader pdxReader) {
    accountID = pdxReader.readString("accountID");
    partyID = pdxReader.readString("partyID");
    entityId = pdxReader.readString("entityId");
    region = pdxReader.readString("region");
    name = pdxReader.readString("name");
  }

}
