package cn.xzxy.lewy.pojo;


import javax.persistence.*;

@Entity
@Table(name = "t_25_khjbxx")
public class Customer25 {
    private int id;
    private String CustomerCode;//客户编号
    private String Customer;//客户名称
    private String Phone;//电话
    private String Fax;//传真
    private String Address;//地址
    private String PostCode;//邮编
    private String Linkman;//联系人
    private String LinkmanMobile;//联系人手机
    private String CustomerType;//客户类型
    private String EnterpriseProperty;//企业性质
    private String EnterpriseSize;//企业规模
    private String Email;//电子邮件

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerCode() {
        return CustomerCode;
    }

    public void setCustomerCode(String customerCode) {
        CustomerCode = customerCode;
    }

    public String getCustomer() {
        return Customer;
    }

    public void setCustomer(String customer) {
        Customer = customer;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String fax) {
        Fax = fax;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPostCode() {
        return PostCode;
    }

    public void setPostCode(String postCode) {
        PostCode = postCode;
    }

    public String getLinkman() {
        return Linkman;
    }

    public void setLinkman(String linkman) {
        Linkman = linkman;
    }

    public String getLinkmanMobile() {
        return LinkmanMobile;
    }

    public void setLinkmanMobile(String linkmanMobile) {
        LinkmanMobile = linkmanMobile;
    }

    public String getCustomerType() {
        return CustomerType;
    }

    public void setCustomerType(String customerType) {
        CustomerType = customerType;
    }

    public String getEnterpriseProperty() {
        return EnterpriseProperty;
    }

    public void setEnterpriseProperty(String enterpriseProperty) {
        EnterpriseProperty = enterpriseProperty;
    }

    public String getEnterpriseSize() {
        return EnterpriseSize;
    }

    public void setEnterpriseSize(String enterpriseSize) {
        EnterpriseSize = enterpriseSize;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
