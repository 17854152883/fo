package cn.hacklike.fo.entity;

import cn.hacklike.fo.common.LkEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

public class DmSaying extends LkEntity implements Serializable {

    private static final long serialVersionUID = -5419762311194647681L;
    @TableId(value = "dm_id", type = IdType.ASSIGN_ID)
    private String dmId;

    private String dmTitle;

    private String dmName;

    private String dmImgUrl;

    private String dmImg;

    private String dmText;

    public String getDmId() {
        return dmId;
    }

    public void setDmId(String dmId) {
        this.dmId = dmId;
    }

    public String getDmTitle() {
        return dmTitle;
    }

    public void setDmTitle(String dmTitle) {
        this.dmTitle = dmTitle;
    }

    public String getDmName() {
        return dmName;
    }

    public void setDmName(String dmName) {
        this.dmName = dmName;
    }

    public String getDmImgUrl() {
        return dmImgUrl;
    }

    public void setDmImgUrl(String dmImgUrl) {
        this.dmImgUrl = dmImgUrl;
    }

    public String getDmImg() {
        return dmImg;
    }

    public void setDmImg(String dmImg) {
        this.dmImg = dmImg;
    }

    public String getDmText() {
        return dmText;
    }

    public void setDmText(String dmText) {
        this.dmText = dmText;
    }
}
