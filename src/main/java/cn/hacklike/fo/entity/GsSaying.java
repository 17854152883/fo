package cn.hacklike.fo.entity;

import cn.hacklike.fo.common.LkEntity;
import com.alibaba.druid.util.StringUtils;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

public class GsSaying extends LkEntity implements Serializable {

    private static final long serialVersionUID = -5419762322194647681L;
    @TableId(value = "gs_id", type = IdType.ASSIGN_ID)
    private String gsId;

    private String gsTitle;

    private String gsName;

    private String gsMj;

    private String gsText;

    private String gsRemark;

    private String gsImg;

    private String gsImgUrl;

    public String getGsImg() {
        return gsImg;
    }

    public void setGsImg(String gsImg) {
        this.gsImg = gsImg;
    }

    public String getGsImgUrl() {
        return gsImgUrl;
    }

    public void setGsImgUrl(String gsImgUrl) {
        this.gsImgUrl = gsImgUrl;
    }

    public String getGsId() {
        return gsId;
    }

    public void setGsId(String gsId) {
        this.gsId = gsId;
    }

    public String getGsTitle() {
        return gsTitle;
    }

    public void setGsTitle(String gsTitle) {
        this.gsTitle = gsTitle;
    }

    public String getGsName() {
        return gsName;
    }

    public void setGsName(String gsName) {
        this.gsName = gsName;
    }

    public String getGsMj() {
        return gsMj;
    }

    public void setGsMj(String gsMj) {
        this.gsMj = gsMj;
    }

    public String getGsText() {
        return gsText;
    }

    public void setGsText(String gsText) {
        this.gsText = gsText;
    }

    public String getGsRemark() {
        return gsRemark;
    }

    public void setGsRemark(String gsRemark) {
        this.gsRemark = gsRemark;
    }
}
