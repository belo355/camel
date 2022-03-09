package br.com.caelum.camel.domain;

import javax.xml.bind.JAXB;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

@XmlRootElement
public class Pedido {

   private Long id;
   private String dataCompra;
   private List<Item> itens;
   private Pagamento pagamento;

   public Pedido createPedido() throws FileNotFoundException {
      return JAXB.unmarshal(new FileInputStream("pedido.xml"), Pedido.class);
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getDataCompra() {
      return dataCompra;
   }

   public void setDataCompra(String dataCompra) {
      this.dataCompra = dataCompra;
   }

   public List<Item> getItens() {
      return itens;
   }

   public void setItens(List<Item> itens) {
      this.itens = itens;
   }

   public Pagamento getPagamento() {
      return pagamento;
   }

   public void setPagamento(Pagamento pagamento) {
      this.pagamento = pagamento;
   }
}
