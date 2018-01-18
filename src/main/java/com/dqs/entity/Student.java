package com.dqs.entity;
/**
 * 
 * 学生实体类
 * @author 王天博
 * 2018年1月18日
 */
public class Student {
	private String id      ; //id
	private String user_id ; //用户编号
	private String name    ; //姓名
	private String team_id ; //班级id
	private String tel     ; //电话
	private String reward  ; //奖惩
	private String point   ; //绩点
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeam_id() {
		return team_id;
	}
	public void setTeam_id(String team_id) {
		this.team_id = team_id;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getReward() {
		return reward;
	}
	public void setReward(String reward) {
		this.reward = reward;
	}
	public String getPoint() {
		return point;
	}
	public void setPoint(String point) {
		this.point = point;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", user_id=" + user_id + ", name=" + name + ", team_id=" + team_id + ", gender="
				 + ", tel=" + tel + ", reward=" + reward + ", point=" + point + "]";
	}
	public Student(String id, String user_id, String name, String team_id, int gender, String tel, String reward,
			String point) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.name = name;
		this.team_id = team_id;
		this.tel = tel;
		this.reward = reward;
		this.point = point;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
