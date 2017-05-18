package entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
@Entity
@Table(name="user")
public class User implements java.io.Serializable {

	// Fields
	@Id
	private Integer userId;
	@Basic
	private String userNo;
	private String userName;
	private String passWord;
	private Integer typeId;
	private String userType;
	private Integer userStatu;
	private Integer groupId;
	private Integer classId;
	private Double amount;
	private Double integral;
	private String userNick;
	private String userSex;
	private Timestamp birthDate;
	private String userIcon;
	private Integer level;
	private String departMent;
	private String region;
	private String addres;
	private String phoneNo;
	private String mobileNo;
	private String email;
	private Timestamp loginTime;
	private String loginImei;
	private String loginPhone;
	private String wxId;
	private String aliPayId;
	private String signLabel;
	private String aliPushDeviceId;
	private Double locLon;
	private Double locLat;
	private String locRegion;
	private Timestamp locTime;
	private Timestamp updateTime;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String userNo, Integer typeId, String userType, Integer userStatu) {
		this.userNo = userNo;
		this.typeId = typeId;
		this.userType = userType;
		this.userStatu = userStatu;
	}

	/** full constructor */
	public User(String userNo, String userName, String passWord, Integer typeId, String userType, Integer userStatu,
			Integer groupId, Integer classId, Double amount, Double integral, String userNick, String userSex,
			Timestamp birthDate, String userIcon, Integer level, String departMent, String region, String addres,
			String phoneNo, String mobileNo, String email, Timestamp loginTime, String loginImei, String loginPhone,
			String wxId, String aliPayId, String signLabel, String aliPushDeviceId, Double locLon, Double locLat,
			String locRegion, Timestamp locTime, Timestamp updateTime) {
		this.userNo = userNo;
		this.userName = userName;
		this.passWord = passWord;
		this.typeId = typeId;
		this.userType = userType;
		this.userStatu = userStatu;
		this.groupId = groupId;
		this.classId = classId;
		this.amount = amount;
		this.integral = integral;
		this.userNick = userNick;
		this.userSex = userSex;
		this.birthDate = birthDate;
		this.userIcon = userIcon;
		this.level = level;
		this.departMent = departMent;
		this.region = region;
		this.addres = addres;
		this.phoneNo = phoneNo;
		this.mobileNo = mobileNo;
		this.email = email;
		this.loginTime = loginTime;
		this.loginImei = loginImei;
		this.loginPhone = loginPhone;
		this.wxId = wxId;
		this.aliPayId = aliPayId;
		this.signLabel = signLabel;
		this.aliPushDeviceId = aliPushDeviceId;
		this.locLon = locLon;
		this.locLat = locLat;
		this.locRegion = locRegion;
		this.locTime = locTime;
		this.updateTime = updateTime;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserNo() {
		return this.userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return this.passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Integer getUserStatu() {
		return this.userStatu;
	}

	public void setUserStatu(Integer userStatu) {
		this.userStatu = userStatu;
	}

	public Integer getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public Integer getClassId() {
		return this.classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getIntegral() {
		return this.integral;
	}

	public void setIntegral(Double integral) {
		this.integral = integral;
	}

	public String getUserNick() {
		return this.userNick;
	}

	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}

	public String getUserSex() {
		return this.userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public Timestamp getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Timestamp birthDate) {
		this.birthDate = birthDate;
	}

	public String getUserIcon() {
		return this.userIcon;
	}

	public void setUserIcon(String userIcon) {
		this.userIcon = userIcon;
	}

	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getDepartMent() {
		return this.departMent;
	}

	public void setDepartMent(String departMent) {
		this.departMent = departMent;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getAddres() {
		return this.addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getLoginTime() {
		return this.loginTime;
	}

	public void setLoginTime(Timestamp loginTime) {
		this.loginTime = loginTime;
	}

	public String getLoginImei() {
		return this.loginImei;
	}

	public void setLoginImei(String loginImei) {
		this.loginImei = loginImei;
	}

	public String getLoginPhone() {
		return this.loginPhone;
	}

	public void setLoginPhone(String loginPhone) {
		this.loginPhone = loginPhone;
	}

	public String getWxId() {
		return this.wxId;
	}

	public void setWxId(String wxId) {
		this.wxId = wxId;
	}

	public String getAliPayId() {
		return this.aliPayId;
	}

	public void setAliPayId(String aliPayId) {
		this.aliPayId = aliPayId;
	}

	public String getSignLabel() {
		return this.signLabel;
	}

	public void setSignLabel(String signLabel) {
		this.signLabel = signLabel;
	}

	public String getAliPushDeviceId() {
		return this.aliPushDeviceId;
	}

	public void setAliPushDeviceId(String aliPushDeviceId) {
		this.aliPushDeviceId = aliPushDeviceId;
	}

	public Double getLocLon() {
		return this.locLon;
	}

	public void setLocLon(Double locLon) {
		this.locLon = locLon;
	}

	public Double getLocLat() {
		return this.locLat;
	}

	public void setLocLat(Double locLat) {
		this.locLat = locLat;
	}

	public String getLocRegion() {
		return this.locRegion;
	}

	public void setLocRegion(String locRegion) {
		this.locRegion = locRegion;
	}

	public Timestamp getLocTime() {
		return this.locTime;
	}

	public void setLocTime(Timestamp locTime) {
		this.locTime = locTime;
	}

	public Timestamp getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

}