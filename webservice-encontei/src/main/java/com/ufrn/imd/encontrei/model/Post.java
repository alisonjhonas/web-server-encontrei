package com.ufrn.imd.encontrei.model;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	  public static final String FORMAT_DATE = "dd/MM/yyyy HH:mm:ss";
	    public static final String FORMAT_VIEW_DATE = "dd/MM/yyyy";
	    public static final String FORMAT_VIEW_TIME = "HH:mm";
	    public static final String FORMAT_TIME = "HH:mm:ss";
	    public static final String FORMAT_VIEW_DATE_TIME = FORMAT_VIEW_DATE +" "+ FORMAT_VIEW_TIME;

	    public static final Integer YES = 1;
	    public static final Integer NO = 0;

	    public enum PostType{
	        PERDI,ENCONTREI;

	        public static PostType getType(Integer type){
	            switch (type){
	                case 0: return PostType.PERDI;
	                case 1: return PostType.ENCONTREI;
	                default:return PostType.PERDI;
	            }
	        }
	    }
	    public enum PostStatus{
	        OPEN,RESOLVED;
	        public static PostStatus getStatus(Integer status){
	            switch (status){
	                case 0: return PostStatus.OPEN;
	                case 1: return PostStatus.RESOLVED;
	                default:return PostStatus.OPEN;
	            }
	        }
	    }
	    private Integer id;
	    private String title;
	    private String description;
	    private PostStatus status = PostStatus.OPEN;
	    private PostType type = PostType.PERDI;
	    private Date date;
	    private Date dateHappen;
	    private Image image;
	    private String pathImage;
	    private String location;
	    private double lat;
	    private double lng;
	    private int notify = NO;
	    private List<Tag> tags = new ArrayList<>();
	    private User user = new User();

	    public Post() {
	    }

	    public Post(Integer id, String text, String description, Date date, Date dateHappen, Image images, String location, List<Tag> tags, User user, boolean resolved) {
	        this.id = id;
	        this.title = text;
	        this.description = description;
	        this.date = date;
	        this.image = images;
	        this.location = location;
	        this.tags = tags;
	        this.user = user;
	        this.dateHappen = dateHappen;
	    }

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public PostStatus getStatus() {
			return status;
		}

		public void setStatus(PostStatus status) {
			this.status = status;
		}

		public PostType getType() {
			return type;
		}

		public void setType(PostType type) {
			this.type = type;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public Date getDateHappen() {
			return dateHappen;
		}

		public void setDateHappen(Date dateHappen) {
			this.dateHappen = dateHappen;
		}

		public Image getImage() {
			return image;
		}

		public void setImage(Image image) {
			this.image = image;
		}

		public String getPathImage() {
			return pathImage;
		}

		public void setPathImage(String pathImage) {
			this.pathImage = pathImage;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public double getLat() {
			return lat;
		}

		public void setLat(double lat) {
			this.lat = lat;
		}

		public double getLng() {
			return lng;
		}

		public void setLng(double lng) {
			this.lng = lng;
		}

		public int getNotify() {
			return notify;
		}

		public void setNotify(int notify) {
			this.notify = notify;
		}

		public List<Tag> getTags() {
			return tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}
}
