package com.zy.entity;

public class Tree {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tree.tid
     *
     * @mbggenerated Mon Apr 15 15:29:27 CST 2019
     */
    private Integer tid;
    private String name;
    private Boolean open=true;
    private String file;
    
    public String getFile() {
		return url;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getName() {
		return treename;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getOpen() {
		return open;
	}

	public void setOpen(Boolean open) {
		this.open = open;
	}

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tree.treename
     *
     * @mbggenerated Mon Apr 15 15:29:27 CST 2019
     */
    private String treename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tree.url
     *
     * @mbggenerated Mon Apr 15 15:29:27 CST 2019
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tree.pid
     *
     * @mbggenerated Mon Apr 15 15:29:27 CST 2019
     */
    private Integer pid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tree.icon
     *
     * @mbggenerated Mon Apr 15 15:29:27 CST 2019
     */
    private String icon;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tree.tid
     *
     * @return the value of tree.tid
     *
     * @mbggenerated Mon Apr 15 15:29:27 CST 2019
     */
    public Integer getTid() {
        return tid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tree.tid
     *
     * @param tid the value for tree.tid
     *
     * @mbggenerated Mon Apr 15 15:29:27 CST 2019
     */
    public void setTid(Integer tid) {
        this.tid = tid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tree.treename
     *
     * @return the value of tree.treename
     *
     * @mbggenerated Mon Apr 15 15:29:27 CST 2019
     */
    public String getTreename() {
        return treename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tree.treename
     *
     * @param treename the value for tree.treename
     *
     * @mbggenerated Mon Apr 15 15:29:27 CST 2019
     */
    public void setTreename(String treename) {
        this.treename = treename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tree.url
     *
     * @return the value of tree.url
     *
     * @mbggenerated Mon Apr 15 15:29:27 CST 2019
     */
    public String getUrl() {
        return null;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tree.url
     *
     * @param url the value for tree.url
     *
     * @mbggenerated Mon Apr 15 15:29:27 CST 2019
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tree.pid
     *
     * @return the value of tree.pid
     *
     * @mbggenerated Mon Apr 15 15:29:27 CST 2019
     */
    public Integer getPid() {
    	if(pid==null) return pid=0;
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tree.pid
     *
     * @param pid the value for tree.pid
     *
     * @mbggenerated Mon Apr 15 15:29:27 CST 2019
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tree.icon
     *
     * @return the value of tree.icon
     *
     * @mbggenerated Mon Apr 15 15:29:27 CST 2019
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tree.icon
     *
     * @param icon the value for tree.icon
     *
     * @mbggenerated Mon Apr 15 15:29:27 CST 2019
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }
}