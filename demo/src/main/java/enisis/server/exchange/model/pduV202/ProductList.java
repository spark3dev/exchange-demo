package enisis.server.exchange.model.pduV202;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ProductList implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.util.List<enisis.server.exchange.model.pduV202.Product> product;

   public ProductList()
   {
   }

   public java.util.List<enisis.server.exchange.model.pduV202.Product> getProduct()
   {
      return this.product;
   }

   public void setProduct(
         java.util.List<enisis.server.exchange.model.pduV202.Product> product)
   {
      this.product = product;
   }

   public ProductList(
         java.util.List<enisis.server.exchange.model.pduV202.Product> product)
   {
      this.product = product;
   }

}