package cn.hacklike.fo.common;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

public class LkEntity implements Serializable {

    @TableField(
            value = "create_time",
            fill = FieldFill.INSERT
    )
    private Long createTime;
    @TableField(
            value = "update_time",
            fill = FieldFill.INSERT_UPDATE
    )
    private Long updateTime;
    @TableField(
            value = "update_user",
            fill = FieldFill.INSERT_UPDATE
    )
    private String updateUser;

    public LkEntity() {
    }

    public LkEntity(String tenantId, Long createTime, Long updateTime, String updateUser) {
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.updateUser = updateUser;
    }

    public Long getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return this.updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }
}

