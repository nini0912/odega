package test;

import java.security.Timestamp;

public class OdegaTheme_DTO {
	private int num;
	private String user_id;
	private String nickname;
	private int user_like_cnt;
	private Timestamp reg;
	private String title;
	private int post_like_cnt;
	private String img_url;
	private String content;
	private int user_num;
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getUser_like_cnt() {
		return user_like_cnt;
	}
	public void setUser_like_cnt(int user_like_cnt) {
		this.user_like_cnt = user_like_cnt;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPost_like_cnt() {
		return post_like_cnt;
	}
	public void setPost_like_cnt(int post_like_cnt) {
		this.post_like_cnt = post_like_cnt;
	}
	public String getImg_url() {
		return img_url;
	}
	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}
	public Timestamp getReg() {
		return reg;
	}
	public void setReg(Timestamp reg) {
		this.reg = reg;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getUser_num() {
		return user_num;
	}
	public void setUser_num(int user_num) {
		this.user_num = user_num;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	
	
}
