package oneToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	int cId;
	String cName;
	String cAddress;
	@OneToMany
	List<Product>prodList;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int cId, String cName, String cAddress, List<Product> prodList) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cAddress = cAddress;
		this.prodList = prodList;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcAddress() {
		return cAddress;
	}
	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}
	public List<Product> getProdList() {
		return prodList;
	}
	public void setProdList(List<Product> prodList) {
		this.prodList = prodList;
	}
	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", cName=" + cName + ", cAddress=" + cAddress + ", prodList=" + prodList + "]";
	}
	

}
