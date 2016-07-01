package enisis.server.exchange.model.pduV202;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class DeliveryNotification implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String reconciliationInfo;
   private java.lang.String originalReconciliationInfo;
   private java.lang.String relatedReconciliationInfo;

   private String receiverDeliveryStatus;

   private java.lang.String messageIdentifier;

   private enisis.server.exchange.model.pduV202.AddressInfo receiver;

   private enisis.server.exchange.model.pduV202.InterfaceInfo interfaceInfo;

   private enisis.server.exchange.model.pduV202.NetworkInfo networkInfo;

   private enisis.server.exchange.model.pduV202.SecurityInfo securityInfo;

   private enisis.server.exchange.model.pduV202.ExchangeInfo exchangeInfo;

   private java.lang.Boolean isDirty;

   public DeliveryNotification()
   {
   }

   public java.lang.String getReconciliationInfo()
   {
      return this.reconciliationInfo;
   }

   public void setReconciliationInfo(java.lang.String reconciliationInfo)
   {
      this.reconciliationInfo = reconciliationInfo;
   }

   public java.lang.String getOriginalReconciliationInfo()
   {
      return this.originalReconciliationInfo;
   }

   public void setOriginalReconciliationInfo(
         java.lang.String originalReconciliationInfo)
   {
      this.originalReconciliationInfo = originalReconciliationInfo;
   }

   public java.lang.String getRelatedReconciliationInfo()
   {
      return this.relatedReconciliationInfo;
   }

   public void setRelatedReconciliationInfo(
         java.lang.String relatedReconciliationInfo)
   {
      this.relatedReconciliationInfo = relatedReconciliationInfo;
   }

   public java.lang.String getMessageIdentifier()
   {
      return this.messageIdentifier;
   }

   public void setMessageIdentifier(java.lang.String messageIdentifier)
   {
      this.messageIdentifier = messageIdentifier;
   }

   public enisis.server.exchange.model.pduV202.AddressInfo getReceiver()
   {
      return this.receiver;
   }

   public void setReceiver(
         enisis.server.exchange.model.pduV202.AddressInfo receiver)
   {
      this.receiver = receiver;
   }

   public enisis.server.exchange.model.pduV202.InterfaceInfo getInterfaceInfo()
   {
      return this.interfaceInfo;
   }

   public void setInterfaceInfo(
         enisis.server.exchange.model.pduV202.InterfaceInfo interfaceInfo)
   {
      this.interfaceInfo = interfaceInfo;
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

   public enisis.server.exchange.model.pduV202.SecurityInfo getSecurityInfo()
   {
      return this.securityInfo;
   }

   public void setSecurityInfo(
         enisis.server.exchange.model.pduV202.SecurityInfo securityInfo)
   {
      this.securityInfo = securityInfo;
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

   public java.lang.Boolean getIsDirty()
   {
      return this.isDirty;
   }

   public void setIsDirty(java.lang.Boolean isDirty)
   {
      this.isDirty = isDirty;
   }

   public java.lang.String getReceiverDeliveryStatus()
   {
      return this.receiverDeliveryStatus;
   }

   public void setReceiverDeliveryStatus(java.lang.String receiverDeliveryStatus)
   {
      this.receiverDeliveryStatus = receiverDeliveryStatus;
   }

   public DeliveryNotification(java.lang.String reconciliationInfo,
         java.lang.String originalReconciliationInfo,
         java.lang.String relatedReconciliationInfo,
         java.lang.String receiverDeliveryStatus,
         java.lang.String messageIdentifier,
         enisis.server.exchange.model.pduV202.AddressInfo receiver,
         enisis.server.exchange.model.pduV202.InterfaceInfo interfaceInfo,
         enisis.server.exchange.model.pduV202.NetworkInfo networkInfo,
         enisis.server.exchange.model.pduV202.SecurityInfo securityInfo,
         enisis.server.exchange.model.pduV202.ExchangeInfo exchangeInfo,
         java.lang.Boolean isDirty)
   {
      this.reconciliationInfo = reconciliationInfo;
      this.originalReconciliationInfo = originalReconciliationInfo;
      this.relatedReconciliationInfo = relatedReconciliationInfo;
      this.receiverDeliveryStatus = receiverDeliveryStatus;
      this.messageIdentifier = messageIdentifier;
      this.receiver = receiver;
      this.interfaceInfo = interfaceInfo;
      this.networkInfo = networkInfo;
      this.securityInfo = securityInfo;
      this.exchangeInfo = exchangeInfo;
      this.isDirty = isDirty;
   }

}