package cn.xzxy.lewy.pojo;

import javax.persistence.*;

@Entity
@Table(name = "t_27_sjxx")
public class Driver27 {

    private int id;
    private String DriverName;//司机名称
    private String IDCard;//身份证号
    private String Phone;//电话
    private String Mobile;//手机
    private String Gender;//性别
    private String Birthday;//出生日期
    private String State;//状态
    private String CarNo;//车号
    private String AllowCarryVolume;//准载体积
    private String AllowCarryWeight;//准载重量
    private String Address;//住址
    private String CarType;//车型
    private String CarLength;//车厢长度
    private String CarDept;//车属单位
    private String CarDeptTel;//车属单位电话
    private String DriveLicence;//驾驶证
    private String RunLicence;//行驶证
    private String BizLicence;//营运证
    private String InsuranceCard;//保险证
    private String CarWidth;//车厢宽度
    private String GoodsHeight;//载物高度
    private String CarFrameNo;//车架号
    private String EngineNo;//发动机号
    private String Remark;//备注
    private int CompanyCar;//公司车

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDriverName() {
        return DriverName;
    }

    public void setDriverName(String driverName) {
        DriverName = driverName;
    }

    public String getIDCard() {
        return IDCard;
    }

    public void setIDCard(String IDCard) {
        this.IDCard = IDCard;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String birthday) {
        Birthday = birthday;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCarNo() {
        return CarNo;
    }

    public void setCarNo(String carNo) {
        CarNo = carNo;
    }

    public String getAllowCarryVolume() {
        return AllowCarryVolume;
    }

    public void setAllowCarryVolume(String allowCarryVolume) {
        AllowCarryVolume = allowCarryVolume;
    }

    public String getAllowCarryWeight() {
        return AllowCarryWeight;
    }

    public void setAllowCarryWeight(String allowCarryWeight) {
        AllowCarryWeight = allowCarryWeight;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCarType() {
        return CarType;
    }

    public void setCarType(String carType) {
        CarType = carType;
    }

    public String getCarLength() {
        return CarLength;
    }

    public void setCarLength(String carLength) {
        CarLength = carLength;
    }

    public String getCarDept() {
        return CarDept;
    }

    public void setCarDept(String carDept) {
        CarDept = carDept;
    }

    public String getCarDeptTel() {
        return CarDeptTel;
    }

    public void setCarDeptTel(String carDeptTel) {
        CarDeptTel = carDeptTel;
    }

    public String getDriveLicence() {
        return DriveLicence;
    }

    public void setDriveLicence(String driveLicence) {
        DriveLicence = driveLicence;
    }

    public String getRunLicence() {
        return RunLicence;
    }

    public void setRunLicence(String runLicence) {
        RunLicence = runLicence;
    }

    public String getBizLicence() {
        return BizLicence;
    }

    public void setBizLicence(String bizLicence) {
        BizLicence = bizLicence;
    }

    public String getInsuranceCard() {
        return InsuranceCard;
    }

    public void setInsuranceCard(String insuranceCard) {
        InsuranceCard = insuranceCard;
    }

    public String getCarWidth() {
        return CarWidth;
    }

    public void setCarWidth(String carWidth) {
        CarWidth = carWidth;
    }

    public String getGoodsHeight() {
        return GoodsHeight;
    }

    public void setGoodsHeight(String goodsHeight) {
        GoodsHeight = goodsHeight;
    }

    public String getCarFrameNo() {
        return CarFrameNo;
    }

    public void setCarFrameNo(String carFrameNo) {
        CarFrameNo = carFrameNo;
    }

    public String getEngineNo() {
        return EngineNo;
    }

    public void setEngineNo(String engineNo) {
        EngineNo = engineNo;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public int getCompanyCar() {
        return CompanyCar;
    }

    public void setCompanyCar(int companyCar) {
        CompanyCar = companyCar;
    }
}
