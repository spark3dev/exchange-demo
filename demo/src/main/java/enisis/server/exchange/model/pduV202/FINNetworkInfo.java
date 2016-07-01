package enisis.server.exchange.model.pduV202;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class FINNetworkInfo implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String userPriority;
   private java.lang.String copyService;
   private java.lang.String messageSyntaxVersion;
   private java.lang.Boolean isRetrieved;
   private java.lang.String releaseInfo;
   private java.lang.String validationIdentifier;
   private java.lang.String correspondentInputReference;
   private java.lang.String correspondentInputTime;
   private java.lang.String localOutputTime;
   private java.lang.String systemOriginated;
   private java.lang.String delayedMessage;

   public FINNetworkInfo()
   {
   }

   public java.lang.String getUserPriority()
   {
      return this.userPriority;
   }

   public void setUserPriority(java.lang.String userPriority)
   {
      this.userPriority = userPriority;
   }

   public java.lang.String getCopyService()
   {
      return this.copyService;
   }

   public void setCopyService(java.lang.String copyService)
   {
      this.copyService = copyService;
   }

   public java.lang.String getMessageSyntaxVersion()
   {
      return this.messageSyntaxVersion;
   }

   public void setMessageSyntaxVersion(java.lang.String messageSyntaxVersion)
   {
      this.messageSyntaxVersion = messageSyntaxVersion;
   }

   public java.lang.Boolean getIsRetrieved()
   {
      return this.isRetrieved;
   }

   public void setIsRetrieved(java.lang.Boolean isRetrieved)
   {
      this.isRetrieved = isRetrieved;
   }

   public java.lang.String getReleaseInfo()
   {
      return this.releaseInfo;
   }

   public void setReleaseInfo(java.lang.String releaseInfo)
   {
      this.releaseInfo = releaseInfo;
   }

   public java.lang.String getValidationIdentifier()
   {
      return this.validationIdentifier;
   }

   public void setValidationIdentifier(java.lang.String validationIdentifier)
   {
      this.validationIdentifier = validationIdentifier;
   }

   public java.lang.String getCorrespondentInputReference()
   {
      return this.correspondentInputReference;
   }

   public void setCorrespondentInputReference(
         java.lang.String correspondentInputReference)
   {
      this.correspondentInputReference = correspondentInputReference;
   }

   public java.lang.String getCorrespondentInputTime()
   {
      return this.correspondentInputTime;
   }

   public void setCorrespondentInputTime(
         java.lang.String correspondentInputTime)
   {
      this.correspondentInputTime = correspondentInputTime;
   }

   public java.lang.String getLocalOutputTime()
   {
      return this.localOutputTime;
   }

   public void setLocalOutputTime(java.lang.String localOutputTime)
   {
      this.localOutputTime = localOutputTime;
   }

   public java.lang.String getSystemOriginated()
   {
      return this.systemOriginated;
   }

   public void setSystemOriginated(java.lang.String systemOriginated)
   {
      this.systemOriginated = systemOriginated;
   }

   public java.lang.String getDelayedMessage()
   {
      return this.delayedMessage;
   }

   public void setDelayedMessage(java.lang.String delayedMessage)
   {
      this.delayedMessage = delayedMessage;
   }

   public FINNetworkInfo(java.lang.String userPriority,
         java.lang.String copyService,
         java.lang.String messageSyntaxVersion,
         java.lang.Boolean isRetrieved, java.lang.String releaseInfo,
         java.lang.String validationIdentifier,
         java.lang.String correspondentInputReference,
         java.lang.String correspondentInputTime,
         java.lang.String localOutputTime,
         java.lang.String systemOriginated, java.lang.String delayedMessage)
   {
      this.userPriority = userPriority;
      this.copyService = copyService;
      this.messageSyntaxVersion = messageSyntaxVersion;
      this.isRetrieved = isRetrieved;
      this.releaseInfo = releaseInfo;
      this.validationIdentifier = validationIdentifier;
      this.correspondentInputReference = correspondentInputReference;
      this.correspondentInputTime = correspondentInputTime;
      this.localOutputTime = localOutputTime;
      this.systemOriginated = systemOriginated;
      this.delayedMessage = delayedMessage;
   }

}