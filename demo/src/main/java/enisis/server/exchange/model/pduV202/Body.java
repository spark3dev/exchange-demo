package enisis.server.exchange.model.pduV202;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Body implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.util.List<java.lang.String> content;

   public Body()
   {
   }

   public java.util.List<java.lang.String> getContent()
   {
      return this.content;
   }

   public void setContent(java.util.List<java.lang.String> content)
   {
      this.content = content;
   }

   public Body(java.util.List<java.lang.String> content)
   {
      this.content = content;
   }

}