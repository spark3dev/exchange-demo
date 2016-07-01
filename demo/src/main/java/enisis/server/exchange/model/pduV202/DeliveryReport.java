package enisis.server.exchange.model.pduV202;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class DeliveryReport implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String senderReference;
   private java.lang.String relatedReference;
   private java.lang.String receiverDeliveryStatus;
   private enisis.server.exchange.model.pduV202.AddressFullName originalInstanceAddressee;
   private java.lang.String reportingApplication;
   private enisis.server.exchange.model.pduV202.NetworkInfo networkInfo;
   private enisis.server.exchange.model.pduV202.ExchangeInfo exchangeInfo;
   private enisis.server.exchange.model.pduV202.Interventions interventions;
   private java.lang.Boolean isRelatedInstanceOriginal;
   private enisis.server.exchange.model.pduV202.AddressFullName relatedInstanceAddressee;
   private java.lang.String messageCreator;
   private java.lang.Boolean isMessageModified;
   private java.lang.String messageFields;
   private enisis.server.exchange.model.pduV202.Message message;
   private java.lang.Boolean isDirty;

   public DeliveryReport()
   {
   }

   public java.lang.String getSenderReference()
   {
      return this.senderReference;
   }

   public void setSenderReference(java.lang.String senderReference)
   {
      this.senderReference = senderReference;
   }

   public java.lang.String getRelatedReference()
   {
      return this.relatedReference;
   }

   public void setRelatedReference(java.lang.String relatedReference)
   {
      this.relatedReference = relatedReference;
   }

   public java.lang.String getReceiverDeliveryStatus()
   {
      return this.receiverDeliveryStatus;
   }

   public void setReceiverDeliveryStatus(
         java.lang.String receiverDeliveryStatus)
   {
      this.receiverDeliveryStatus = receiverDeliveryStatus;
   }

   public enisis.server.exchange.model.pduV202.AddressFullName getOriginalInstanceAddressee()
   {
      return this.originalInstanceAddressee;
   }

   public void setOriginalInstanceAddressee(
         enisis.server.exchange.model.pduV202.AddressFullName originalInstanceAddressee)
   {
      this.originalInstanceAddressee = originalInstanceAddressee;
   }

   public java.lang.String getReportingApplication()
   {
      return this.reportingApplication;
   }

   public void setReportingApplication(java.lang.String reportingApplication)
   {
      this.reportingApplication = reportingApplication;
   }

   public enisis.server.exchange.model.pduV202.NetworkInfo getNetworkInfo()
   {
      return this.networkInfo;
   }

   public void setNetworkInfo(
         enisis.server.exchange.model.pduV202.NetworkInfo networkInfo)
   {
      this.networkInfo = networkInfo;
   }

   public enisis.server.exchange.model.pduV202.ExchangeInfo getExchangeInfo()
   {
      return this.exchangeInfo;
   }

   public void setExchangeInfo(
         enisis.server.exchange.model.pduV202.ExchangeInfo exchangeInfo)
   {
      this.exchangeInfo = exchangeInfo;
   }

   public enisis.server.exchange.model.pduV202.Interventions getInterventions()
   {
      return this.interventions;
   }

   public void setInterventions(
         enisis.server.exchange.model.pduV202.Interventions interventions)
   {
      this.interventions = interventions;
   }

   public java.lang.Boolean getIsRelatedInstanceOriginal()
   {
      return this.isRelatedInstanceOriginal;
   }

   public void setIsRelatedInstanceOriginal(
         java.lang.Boolean isRelatedInstanceOriginal)
   {
      this.isRelatedInstanceOriginal = isRelatedInstanceOriginal;
   }

   public enisis.server.exchange.model.pduV202.AddressFullName getRelatedInstanceAddressee()
   {
      return this.relatedInstanceAddressee;
   }

   public void setRelatedInstanceAddressee(
         enisis.server.exchange.model.pduV202.AddressFullName relatedInstanceAddressee)
   {
      this.relatedInstanceAddressee = relatedInstanceAddressee;
   }

   public java.lang.String getMessageCreator()
   {
      return this.messageCreator;
   }

   public void setMessageCreator(java.lang.String messageCreator)
   {
      this.messageCreator = messageCreator;
   }

   public java.lang.Boolean getIsMessageModified()
   {
      return this.isMessageModified;
   }

   public void setIsMessageModified(java.lang.Boolean isMessageModified)
   {
      this.isMessageModified = isMessageModified;
   }

   public java.lang.String getMessageFields()
   {
      return this.messageFields;
   }

   public void setMessageFields(java.lang.String messageFields)
   {
      this.messageFields = messageFields;
   }

   public enisis.server.exchange.model.pduV202.Message getMessage()
   {
      return this.message;
   }

   public void setMessage(enisis.server.exchange.model.pduV202.Message message)
   {
      this.message = message;
   }

   public java.lang.Boolean getIsDirty()
   {
      return this.isDirty;
   }

   public void setIsDirty(java.lang.Boolean isDirty)
   {
      this.isDirty = isDirty;
   }

   public DeliveryReport(
         java.lang.String senderReference,
         java.lang.String relatedReference,
         java.lang.String receiverDeliveryStatus,
         enisis.server.exchange.model.pduV202.AddressFullName originalInstanceAddressee,
         java.lang.String reportingApplication,
         enisis.server.exchange.model.pduV202.NetworkInfo networkInfo,
         enisis.server.exchange.model.pduV202.ExchangeInfo exchangeInfo,
         enisis.server.exchange.model.pduV202.Interventions interventions,
         java.lang.Boolean isRelatedInstanceOriginal,
         enisis.server.exchange.model.pduV202.AddressFullName relatedInstanceAddressee,
         java.lang.String messageCreator,
         java.lang.Boolean isMessageModified,
         java.lang.String messageFields,
         enisis.server.exchange.model.pduV202.Message message,
         java.lang.Boolean isDirty)
   {
      this.senderReference = senderReference;
      this.relatedReference = relatedReference;
      this.receiverDeliveryStatus = receiverDeliveryStatus;
      this.originalInstanceAddressee = originalInstanceAddressee;
      this.reportingApplication = reportingApplication;
      this.networkInfo = networkInfo;
      this.exchangeInfo = exchangeInfo;
      this.interventions = interventions;
      this.isRelatedInstanceOriginal = isRelatedInstanceOriginal;
      this.relatedInstanceAddressee = relatedInstanceAddressee;
      this.messageCreator = messageCreator;
      this.isMessageModified = isMessageModified;
      this.messageFields = messageFields;
      this.message = message;
      this.isDirty = isDirty;
   }

}