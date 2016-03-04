package org.learn.boot.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author fwg
 * @version 1.0 2015-10-30
 */
public class Users implements Serializable {

	public Users() {

	};

	public Users(Long id) {
		this.id = id;
	}

	/**
	 * 主键
	 */
	private Long id;

	private String mobile;

	private String pwd;

	/**
	 * 主图像url
	 */
	private String main_head_photo_url;

	/**
	 * 用户昵称
	 */
	private String nickname;

	/**
	 * 性别 0 男 1女
	 */
	private Integer sex;

	/**
	 * 生日
	 */
	private Date birthday;

	/**
	 * 身高cm
	 */
	private Integer height;

	/**
	 * 星座
	 */
	private String constellation;

	private Date ctime;

	private Date mtime;

	/**
	 * 请客号
	 */
	private String treat_number;

	/**
	 * 情感状态 0 未填 1 单身 2 已婚
	 */
	private Integer affective_state;

	/**
	 * 职业 0 未填 1 计算机/互联网/通信 2 生产/工艺/制造 3 商业/服务业/个体经营 4 金融/银行/投资/保险 5 文化/广告/传媒 6
	 * 娱乐/艺术/表演 7 医疗/护理/制药 8 法律/法务 9 教育/培训 10 公务员/事业单位 11 学生
	 */
	private Integer profession;

	/**
	 * 城市编码
	 */
	private String city_code;

	/**
	 * 0：未填写 1：5000以下 2：5001-8000 3：8001-12000 4：12001-18000 5：18001-25000
	 * 6：25001-50000 7：50000以上
	 */
	private Integer income;

	/**
	 * 是否喝酒 0：未填写 1：是 2：否
	 */
	private Integer is_drink;

	/**
	 * 是否抽烟 0：未填写 1：是 2：否
	 */
	private Integer is_smoking;

	/**
	 * 信用金
	 */
	private Integer credit_balance;

	/**
	 * 个性签名
	 */
	private String user_sign;

	/**
	 * 最近登录时间
	 */
	private Date login_time;

	/**
	 * 坐标
	 */
	private String coordinate;

	/**
	 * 手机设备型号
	 */
	private String mobile_device;

	/**
	 * 是否靓号 0 否 1 是
	 */
	private Integer pretty_num;

	/**
	 * 0 未审核 1 审核不通过 2审核通过
	 */
	private Integer review;

	/**
	 * 来源
	 */
	private String user_source;

	/**
	 * 0 androd 1 iphone
	 */
	private Integer phone_type;

	/**
	 * 后台管理操作时间
	 */
	private Date otime;

	private String names;

	private Date modify_names_time;

	/**
	 * 版本号
	 */
	private Integer versions;

	private String provice_code;

	private static final long serialVersionUID = 1L;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile == null ? null : mobile.trim();
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd == null ? null : pwd.trim();
	}

	public String getMain_head_photo_url() {
		return main_head_photo_url;
	}

	public void setMain_head_photo_url(String main_head_photo_url) {
		this.main_head_photo_url = main_head_photo_url == null ? null
				: main_head_photo_url.trim();
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname == null ? null : nickname.trim();
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public String getConstellation() {
		return constellation;
	}

	public void setConstellation(String constellation) {
		this.constellation = constellation == null ? null : constellation
				.trim();
	}

	public Date getCtime() {
		return ctime;
	}

	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}

	public Date getMtime() {
		return mtime;
	}

	public void setMtime(Date mtime) {
		this.mtime = mtime;
	}

	public String getTreat_number() {
		return treat_number;
	}

	public void setTreat_number(String treat_number) {
		this.treat_number = treat_number == null ? null : treat_number.trim();
	}

	public Integer getAffective_state() {
		return affective_state;
	}

	public void setAffective_state(Integer affective_state) {
		this.affective_state = affective_state;
	}

	public Integer getProfession() {
		return profession;
	}

	public void setProfession(Integer profession) {
		this.profession = profession;
	}

	public String getCity_code() {
		return city_code;
	}

	public void setCity_code(String city_code) {
		this.city_code = city_code == null ? null : city_code.trim();
	}

	public Integer getIncome() {
		return income;
	}

	public void setIncome(Integer income) {
		this.income = income;
	}

	public Integer getIs_drink() {
		return is_drink;
	}

	public void setIs_drink(Integer is_drink) {
		this.is_drink = is_drink;
	}

	public Integer getIs_smoking() {
		return is_smoking;
	}

	public void setIs_smoking(Integer is_smoking) {
		this.is_smoking = is_smoking;
	}

	public Integer getCredit_balance() {
		return credit_balance;
	}

	public void setCredit_balance(Integer credit_balance) {
		this.credit_balance = credit_balance;
	}

	public String getUser_sign() {
		return user_sign;
	}

	public void setUser_sign(String user_sign) {
		this.user_sign = user_sign == null ? null : user_sign.trim();
	}

	public Date getLogin_time() {
		return login_time;
	}

	public void setLogin_time(Date login_time) {
		this.login_time = login_time;
	}

	public String getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(String coordinate) {
		this.coordinate = coordinate == null ? null : coordinate.trim();
	}

	public String getMobile_device() {
		return mobile_device;
	}

	public void setMobile_device(String mobile_device) {
		this.mobile_device = mobile_device == null ? null : mobile_device
				.trim();
	}

	public Integer getPretty_num() {
		return pretty_num;
	}

	public void setPretty_num(Integer pretty_num) {
		this.pretty_num = pretty_num;
	}

	public Integer getReview() {
		return review;
	}

	public void setReview(Integer review) {
		this.review = review;
	}

	public String getUser_source() {
		return user_source;
	}

	public void setUser_source(String user_source) {
		this.user_source = user_source == null ? null : user_source.trim();
	}

	public Integer getPhone_type() {
		return phone_type;
	}

	public void setPhone_type(Integer phone_type) {
		this.phone_type = phone_type;
	}

	public Date getOtime() {
		return otime;
	}

	public void setOtime(Date otime) {
		this.otime = otime;
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names == null ? null : names.trim();
	}

	public Date getModify_names_time() {
		return modify_names_time;
	}

	public void setModify_names_time(Date modify_names_time) {
		this.modify_names_time = modify_names_time;
	}

	public Integer getVersions() {
		return versions;
	}

	public void setVersions(Integer versions) {
		this.versions = versions;
	}

	public String getProvice_code() {
		return provice_code;
	}

	public void setProvice_code(String provice_code) {
		this.provice_code = provice_code == null ? null : provice_code.trim();
	}

	@Override
	public boolean equals(Object that) {
		if (this == that) {
			return true;
		}
		if (that == null) {
			return false;
		}
		if (getClass() != that.getClass()) {
			return false;
		}
		Users other = (Users) that;
		return (this.getId() == null ? other.getId() == null : this.getId()
				.equals(other.getId()))
				&& (this.getMobile() == null ? other.getMobile() == null : this
						.getMobile().equals(other.getMobile()))
				&& (this.getPwd() == null ? other.getPwd() == null : this
						.getPwd().equals(other.getPwd()))
				&& (this.getMain_head_photo_url() == null ? other
						.getMain_head_photo_url() == null : this
						.getMain_head_photo_url().equals(
								other.getMain_head_photo_url()))
				&& (this.getNickname() == null ? other.getNickname() == null
						: this.getNickname().equals(other.getNickname()))
				&& (this.getSex() == null ? other.getSex() == null : this
						.getSex().equals(other.getSex()))
				&& (this.getBirthday() == null ? other.getBirthday() == null
						: this.getBirthday().equals(other.getBirthday()))
				&& (this.getHeight() == null ? other.getHeight() == null : this
						.getHeight().equals(other.getHeight()))
				&& (this.getConstellation() == null ? other.getConstellation() == null
						: this.getConstellation().equals(
								other.getConstellation()))
				&& (this.getCtime() == null ? other.getCtime() == null : this
						.getCtime().equals(other.getCtime()))
				&& (this.getMtime() == null ? other.getMtime() == null : this
						.getMtime().equals(other.getMtime()))
				&& (this.getTreat_number() == null ? other.getTreat_number() == null
						: this.getTreat_number()
								.equals(other.getTreat_number()))
				&& (this.getAffective_state() == null ? other
						.getAffective_state() == null : this
						.getAffective_state()
						.equals(other.getAffective_state()))
				&& (this.getProfession() == null ? other.getProfession() == null
						: this.getProfession().equals(other.getProfession()))
				&& (this.getCity_code() == null ? other.getCity_code() == null
						: this.getCity_code().equals(other.getCity_code()))
				&& (this.getIncome() == null ? other.getIncome() == null : this
						.getIncome().equals(other.getIncome()))
				&& (this.getIs_drink() == null ? other.getIs_drink() == null
						: this.getIs_drink().equals(other.getIs_drink()))
				&& (this.getIs_smoking() == null ? other.getIs_smoking() == null
						: this.getIs_smoking().equals(other.getIs_smoking()))
				&& (this.getCredit_balance() == null ? other
						.getCredit_balance() == null : this.getCredit_balance()
						.equals(other.getCredit_balance()))
				&& (this.getUser_sign() == null ? other.getUser_sign() == null
						: this.getUser_sign().equals(other.getUser_sign()))
				&& (this.getLogin_time() == null ? other.getLogin_time() == null
						: this.getLogin_time().equals(other.getLogin_time()))
				&& (this.getCoordinate() == null ? other.getCoordinate() == null
						: this.getCoordinate().equals(other.getCoordinate()))
				&& (this.getMobile_device() == null ? other.getMobile_device() == null
						: this.getMobile_device().equals(
								other.getMobile_device()))
				&& (this.getPretty_num() == null ? other.getPretty_num() == null
						: this.getPretty_num().equals(other.getPretty_num()))
				&& (this.getReview() == null ? other.getReview() == null : this
						.getReview().equals(other.getReview()))
				&& (this.getUser_source() == null ? other.getUser_source() == null
						: this.getUser_source().equals(other.getUser_source()))
				&& (this.getPhone_type() == null ? other.getPhone_type() == null
						: this.getPhone_type().equals(other.getPhone_type()))
				&& (this.getOtime() == null ? other.getOtime() == null : this
						.getOtime().equals(other.getOtime()))
				&& (this.getNames() == null ? other.getNames() == null : this
						.getNames().equals(other.getNames()))
				&& (this.getModify_names_time() == null ? other
						.getModify_names_time() == null : this
						.getModify_names_time().equals(
								other.getModify_names_time()))
				&& (this.getVersions() == null ? other.getVersions() == null
						: this.getVersions().equals(other.getVersions()))
				&& (this.getProvice_code() == null ? other.getProvice_code() == null
						: this.getProvice_code()
								.equals(other.getProvice_code()));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		result = prime * result
				+ ((getMobile() == null) ? 0 : getMobile().hashCode());
		result = prime * result
				+ ((getPwd() == null) ? 0 : getPwd().hashCode());
		result = prime
				* result
				+ ((getMain_head_photo_url() == null) ? 0
						: getMain_head_photo_url().hashCode());
		result = prime * result
				+ ((getNickname() == null) ? 0 : getNickname().hashCode());
		result = prime * result
				+ ((getSex() == null) ? 0 : getSex().hashCode());
		result = prime * result
				+ ((getBirthday() == null) ? 0 : getBirthday().hashCode());
		result = prime * result
				+ ((getHeight() == null) ? 0 : getHeight().hashCode());
		result = prime
				* result
				+ ((getConstellation() == null) ? 0 : getConstellation()
						.hashCode());
		result = prime * result
				+ ((getCtime() == null) ? 0 : getCtime().hashCode());
		result = prime * result
				+ ((getMtime() == null) ? 0 : getMtime().hashCode());
		result = prime
				* result
				+ ((getTreat_number() == null) ? 0 : getTreat_number()
						.hashCode());
		result = prime
				* result
				+ ((getAffective_state() == null) ? 0 : getAffective_state()
						.hashCode());
		result = prime * result
				+ ((getProfession() == null) ? 0 : getProfession().hashCode());
		result = prime * result
				+ ((getCity_code() == null) ? 0 : getCity_code().hashCode());
		result = prime * result
				+ ((getIncome() == null) ? 0 : getIncome().hashCode());
		result = prime * result
				+ ((getIs_drink() == null) ? 0 : getIs_drink().hashCode());
		result = prime * result
				+ ((getIs_smoking() == null) ? 0 : getIs_smoking().hashCode());
		result = prime
				* result
				+ ((getCredit_balance() == null) ? 0 : getCredit_balance()
						.hashCode());
		result = prime * result
				+ ((getUser_sign() == null) ? 0 : getUser_sign().hashCode());
		result = prime * result
				+ ((getLogin_time() == null) ? 0 : getLogin_time().hashCode());
		result = prime * result
				+ ((getCoordinate() == null) ? 0 : getCoordinate().hashCode());
		result = prime
				* result
				+ ((getMobile_device() == null) ? 0 : getMobile_device()
						.hashCode());
		result = prime * result
				+ ((getPretty_num() == null) ? 0 : getPretty_num().hashCode());
		result = prime * result
				+ ((getReview() == null) ? 0 : getReview().hashCode());
		result = prime
				* result
				+ ((getUser_source() == null) ? 0 : getUser_source().hashCode());
		result = prime * result
				+ ((getPhone_type() == null) ? 0 : getPhone_type().hashCode());
		result = prime * result
				+ ((getOtime() == null) ? 0 : getOtime().hashCode());
		result = prime * result
				+ ((getNames() == null) ? 0 : getNames().hashCode());
		result = prime
				* result
				+ ((getModify_names_time() == null) ? 0
						: getModify_names_time().hashCode());
		result = prime * result
				+ ((getVersions() == null) ? 0 : getVersions().hashCode());
		result = prime
				* result
				+ ((getProvice_code() == null) ? 0 : getProvice_code()
						.hashCode());
		return result;
	}
}