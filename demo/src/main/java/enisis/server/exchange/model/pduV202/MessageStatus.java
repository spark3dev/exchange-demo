package enisis.server.exchange.model.pduV202;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class MessageStatus implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String senderReference;
   private java.lang.Integer seqNr;
   private java.lang.Boolean isSuccess;
   private java.lang.String errorCode;
   private java.lang.String errorText;
   private enisis.server.exchange.model.pduV202.ExchangeInfo exchangeInfo;

   public MessageStatus()
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

   public java.lang.Integer getSeqNr()
   {
      return this.seqNr;
   }

   public void setSeqNr(java.lang.Integer seqNr)
   {
      this.seqNr = seqNr;
   }

   public java.lang.Boolean getIsSuccess()
   {
      return this.isSuccess;
   }

   public void setIsSuccess(java.lang.Boolean isSuccess)
   {
      this.isSuccess = isSuccess;
   }

   public java.lang.String getErrorCode()
   {
      return this.errorCode;
   }

   public void setErrorCode(java.lang.String errorCode)
   {
      this.errorCode = errorCode;
   }

   public java.lang.String getErrorText()
   {
      return this.errorText;
   }

   public void setErrorText(java.lang.String errorText)
   {
      this.errorText = errorText;
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

   public MessageStatus(java.lang.String senderReference,
         java.lang.Integer seqNr, java.lang.Boolean isSuccess,
         java.lang.String errorCode, java.lang.String errorText,
         enisis.server.exchange.model.pduV202.ExchangeInfo exchangeInfo)
   {
      this.senderReference = senderReference;
      this.seqNr = seqNr;
      this.isSuccess = isSuccess;
      this.errorCode = errorCode;
      this.errorText = errorText;
      this.exchangeInfo = exchangeInfo;
   }

}