package com.gs.imd.concert.data.model;

import java.util.UUID;

import com.gs.pwm.concert.data.model.Position;

import org.apache.geode.pdx.PdxReader;
import org.apache.geode.pdx.PdxSerializable;
import org.apache.geode.pdx.PdxWriter;

public class Portfolio implements PdxSerializable {

  public String alertID;
  public String groupId;
  public String externalReferenceID;
  public String targetPortfolioID;
  public String eventID;
  public String refeedEventID;
  public String rootEventID;
  public String clOrderID;
  public String execID;
  public String externalExecID;
  public String orderID;
  public String allocID;
  public String entityID;
  public String fiAccountGroupId;
  public String externalEntityID;
  public String fiAccountId;
  public String portId;
  public String noteXRefID;
  public String eventStateCacheUpdateTime;
  public String eventStateID;
  public String clOrdID;
  public String externalOrderID;
  public String externalOrderIDSource;
  public String parentOrderID;
  public String partyXRefID;
  public String externalQuoteID;
  public String entityType;
  public String correlationMatrixId;
  public String informationRatioId;
  public String partyID;
  public String targetAllocID;
  public String tradeID;
  public String tradeLegID;
  public String tradeLegStatus;
  public String validationIssueID;
  public String validationIssueXRefID;
  public String objectID;
  public String validationID;
  public Position clientRelationshipAccounts;
  public Position parties;
  public Position linkedEntities;
  public Position processedStatus;

  //Test member to see if serialization and queries are working fine
  public String fixedValue;

  public Portfolio() {
  }

  public Portfolio(String randomInput) {
    String randomString = UUID.randomUUID().toString() + randomInput;
    this.alertID = randomString;
    this.groupId = randomString;
    this.externalReferenceID = randomString;
    this.targetPortfolioID = randomString;
    this.eventID = randomString;
    this.refeedEventID = randomString;
    this.rootEventID = randomString;
    this.clOrderID = randomString;
    this.execID = randomString;
    this.externalExecID = randomString;
    this.orderID = randomString;
    this.allocID = randomString;
    this.entityID = randomString;
    this.fiAccountGroupId = randomString;
    this.externalEntityID = randomString;
    this.fiAccountId = randomString;
    this.portId = randomString;
    this.noteXRefID = randomString;
    this.eventStateCacheUpdateTime = randomString;
    this.eventStateID = randomString;
    this.clOrdID = randomString;
    this.externalOrderID = randomString;
    this.externalOrderIDSource = randomString;
    this.parentOrderID = randomString;
    this.partyXRefID = randomString;
    this.externalQuoteID = randomString;
    this.entityType = randomString;
    this.correlationMatrixId = randomString;
    this.informationRatioId = randomString;
    this.partyID = randomString;
    this.targetAllocID = randomString;
    this.tradeID = randomString;
    this.tradeLegID = randomString;
    this.tradeLegStatus = randomString;
    this.validationIssueID = randomString;
    this.validationIssueXRefID = randomString;
    this.objectID = randomString;
    this.validationID = randomString;
    this.clientRelationshipAccounts = new Position(randomString);
    this.parties = new Position(randomString);
    this.linkedEntities = new Position(randomString);
    this.processedStatus = new Position(randomString);

    this.fixedValue = "gemfire";
  }

  @Override
  public void toData(PdxWriter pdxWriter) {
    pdxWriter.writeString("alertID",alertID);
    pdxWriter.writeString("groupId",groupId);
    pdxWriter.writeString("externalReferenceID",externalReferenceID);
    pdxWriter.writeString("targetPortfolioID",targetPortfolioID);
    pdxWriter.writeString("eventID",eventID);
    pdxWriter.writeString("refeedEventID",refeedEventID);
    pdxWriter.writeString("rootEventID",rootEventID);
    pdxWriter.writeString("clOrderID",clOrderID);
    pdxWriter.writeString("execID",execID);
    pdxWriter.writeString("externalExecID",externalExecID);
    pdxWriter.writeString("orderID",orderID);
    pdxWriter.writeString("allocID",allocID);
    pdxWriter.writeString("entityID",entityID);
    pdxWriter.writeString("fiAccountGroupId",fiAccountGroupId);
    pdxWriter.writeString("externalEntityID",externalEntityID);
    pdxWriter.writeString("fiAccountId",fiAccountId);
    pdxWriter.writeString("portId",portId);
    pdxWriter.writeString("noteXRefID",noteXRefID);
    pdxWriter.writeString("eventStateCacheUpdateTime",eventStateCacheUpdateTime);
    pdxWriter.writeString("eventStateID",eventStateID);
    pdxWriter.writeString("clOrdID",clOrdID);
    pdxWriter.writeString("externalOrderID",externalOrderID);
    pdxWriter.writeString("externalOrderIDSource",externalOrderIDSource);
    pdxWriter.writeString("parentOrderID",parentOrderID);
    pdxWriter.writeString("partyXRefID",partyXRefID);
    pdxWriter.writeString("externalQuoteID",externalQuoteID);
    pdxWriter.writeString("entityType",entityType);
    pdxWriter.writeString("correlationMatrixId",correlationMatrixId);
    pdxWriter.writeString("informationRatioId",informationRatioId);
    pdxWriter.writeString("partyID",partyID);
    pdxWriter.writeString("targetAllocID",targetAllocID);
    pdxWriter.writeString("tradeID",tradeID);
    pdxWriter.writeString("tradeLegID",tradeLegID);
    pdxWriter.writeString("tradeLegStatus",tradeLegStatus);
    pdxWriter.writeString("validationIssueID",validationIssueID);
    pdxWriter.writeString("validationIssueXRefID",validationIssueXRefID);
    pdxWriter.writeString("objectID",objectID);
    pdxWriter.writeString("validationID",validationID);
    pdxWriter.writeObject("clientRelationshipAccounts",clientRelationshipAccounts);
    pdxWriter.writeObject("parties",parties);
    pdxWriter.writeObject("linkedEntities",linkedEntities);
    pdxWriter.writeObject("processedStatus",processedStatus);

    pdxWriter.writeString("fixedValue",fixedValue);

  }

  @Override
  public void fromData(PdxReader pdxReader) {
    this.alertID = pdxReader.readString("alertID");
    this.groupId = pdxReader.readString("groupId");
    this.externalReferenceID = pdxReader.readString("externalReferenceID");
    this.targetPortfolioID = pdxReader.readString("targetPortfolioID");
    this.eventID = pdxReader.readString("eventID");
    this.refeedEventID = pdxReader.readString("refeedEventID");
    this.rootEventID = pdxReader.readString("rootEventID");
    this.clOrderID = pdxReader.readString("clOrderID");
    this.execID = pdxReader.readString("execID");
    this.externalExecID = pdxReader.readString("externalExecID");
    this.orderID = pdxReader.readString("orderID");
    this.allocID = pdxReader.readString("allocID");
    this.entityID = pdxReader.readString("entityID");
    this.fiAccountGroupId = pdxReader.readString("fiAccountGroupId");
    this.externalEntityID = pdxReader.readString("externalEntityID");
    this.fiAccountId = pdxReader.readString("fiAccountId");
    this.portId = pdxReader.readString("portId");
    this.noteXRefID = pdxReader.readString("noteXRefID");
    this.eventStateCacheUpdateTime = pdxReader.readString("eventStateCacheUpdateTime");
    this.eventStateID = pdxReader.readString("eventStateID");
    this.clOrdID = pdxReader.readString("clOrdID");
    this.externalOrderID = pdxReader.readString("externalOrderID");
    this.externalOrderIDSource = pdxReader.readString("externalOrderIDSource");
    this.parentOrderID = pdxReader.readString("parentOrderID");
    this.partyXRefID = pdxReader.readString("partyXRefID");
    this.externalQuoteID = pdxReader.readString("externalQuoteID");
    this.entityType = pdxReader.readString("entityType");
    this.correlationMatrixId = pdxReader.readString("correlationMatrixId");
    this.informationRatioId = pdxReader.readString("informationRatioId");
    this.partyID = pdxReader.readString("partyID");
    this.targetAllocID = pdxReader.readString("targetAllocID");
    this.tradeID = pdxReader.readString("tradeID");
    this.tradeLegID = pdxReader.readString("tradeLegID");
    this.tradeLegStatus = pdxReader.readString("tradeLegStatus");
    this.validationIssueID = pdxReader.readString("validationIssueID");
    this.validationIssueXRefID = pdxReader.readString("validationIssueXRefID");
    this.objectID = pdxReader.readString("objectID");
    this.validationID = pdxReader.readString("validationID");
    this.clientRelationshipAccounts = (Position) pdxReader.readObject("clientRelationshipAccounts");
    this.parties = (Position) pdxReader.readObject("parties");
    this.linkedEntities = (Position) pdxReader.readObject("linkedEntities");
    this.processedStatus = (Position) pdxReader.readObject("processedStatus");


    this.fixedValue = pdxReader.readString("fixedValue");
  }
}
