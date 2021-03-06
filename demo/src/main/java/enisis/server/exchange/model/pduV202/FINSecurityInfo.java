package enisis.server.exchange.model.pduV202;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class FINSecurityInfo implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private String checksumResult;
   private java.lang.String checksumValue;
   private java.lang.String pacResult;
   private java.lang.String pacValue;
   private java.lang.String macResult;
   private java.lang.String macValue;
   private enisis.server.exchange.model.pduV202.MACSignatureValue macSignatureValue;
   private enisis.server.exchange.model.pduV202.PAC2SignatureValue pac2SignatureValue;

   public FINSecurityInfo()
   {
   }

   public java.lang.String getChecksumValue()
   {
      return this.checksumValue;
   }

   public void setChecksumValue(java.lang.String checksumValue)
   {
      this.checksumValue = checksumValue;
   }

   public java.lang.String getPacResult()
   {
      return this.pacResult;
   }

   public void setPacResult(java.lang.String pacResult)
   {
      this.pacResult = pacResult;
   }

   public java.lang.String getPacValue()
   {
      return this.pacValue;
   }

   public void setPacValue(java.lang.String pacValue)
   {
      this.pacValue = pacValue;
   }

   public java.lang.String getMacResult()
   {
      return this.macResult;
   }

   public void setMacResult(java.lang.String macResult)
   {
      this.macResult = macResult;
   }

   public java.lang.String getMacValue()
   {
      return this.macValue;
   }

   public void setMacValue(java.lang.String macValue)
   {
      this.macValue = macValue;
   }

   public enisis.server.exchange.model.pduV202.MACSignatureValue getMacSignatureValue()
   {
      return this.macSignatureValue;
   }

   public void setMacSignatureValue(
         enisis.server.exchange.model.pduV202.MACSignatureValue macSignatureValue)
   {
      this.macSignatureValue = macSignatureValue;
   }

   public enisis.server.exchange.model.pduV202.PAC2SignatureValue getPac2SignatureValue()
   {
      return this.pac2SignatureValue;
   }

   public void setPac2SignatureValue(
         enisis.server.exchange.model.pduV202.PAC2SignatureValue pac2SignatureValue)
   {
      this.pac2SignatureValue = pac2SignatureValue;
   }

   public java.lang.String getChecksumResult()
   {
      return this.checksumResult;
   }

   public void setChecksumResult(java.lang.String checksumResult)
   {
      this.checksumResult = checksumResult;
   }

   public FINSecurityInfo(
         java.lang.String checksumResult,
         java.lang.String checksumValue,
         java.lang.String pacResult,
         java.lang.String pacValue,
         java.lang.String macResult,
         java.lang.String macValue,
         enisis.server.exchange.model.pduV202.MACSignatureValue macSignatureValue,
         enisis.server.exchange.model.pduV202.PAC2SignatureValue pac2SignatureValue)
   {
      this.checksumResult = checksumResult;
      this.checksumValue = checksumValue;
      this.pacResult = pacResult;
      this.pacValue = pacValue;
      this.macResult = macResult;
      this.macValue = macValue;
      this.macSignatureValue = macSignatureValue;
      this.pac2SignatureValue = pac2SignatureValue;
   }

}