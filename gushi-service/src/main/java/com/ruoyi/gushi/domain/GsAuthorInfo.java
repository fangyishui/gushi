package com.ruoyi.gushi.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 作者信息对象 gs_author_info
 * 
 * @author ruoyi
 * @date 2023-04-23
 */
public class GsAuthorInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 作者ID */
    @Excel(name = "作者ID")
    private String authorId;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 姓 */
    @Excel(name = "姓")
    private String xing;

    /** 名 */
    @Excel(name = "名")
    private String ming;

    /** 字 */
    @Excel(name = "字")
    private String zi;

    /** 号 */
    @Excel(name = "号")
    private String hao;

    /** 年代 */
    @Excel(name = "年代")
    private String years;

    /** 短介绍 */
    @Excel(name = "短介绍")
    private String shortDescription;

    /** 详细介绍 */
    @Excel(name = "详细介绍")
    private String description;

    /** 创建人 */
    @Excel(name = "创建人")
    private String createPerson;

    /** 更新人 */
    @Excel(name = "更新人")
    private String updatePerson;

    /** 是否启用 1 禁用  0 启用 */
    @Excel(name = "是否启用 1 禁用  0 启用")
    private Integer enable;

    /** 是否删除 1 删除 0 未删除 */
    @Excel(name = "是否删除 1 删除 0 未删除")
    private Integer isDelete;

    /** 备注 */
    @Excel(name = "备注")
    private String remarks;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setAuthorId(String authorId) 
    {
        this.authorId = authorId;
    }

    public String getAuthorId() 
    {
        return authorId;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setXing(String xing) 
    {
        this.xing = xing;
    }

    public String getXing() 
    {
        return xing;
    }
    public void setMing(String ming) 
    {
        this.ming = ming;
    }

    public String getMing() 
    {
        return ming;
    }
    public void setZi(String zi) 
    {
        this.zi = zi;
    }

    public String getZi() 
    {
        return zi;
    }
    public void setHao(String hao) 
    {
        this.hao = hao;
    }

    public String getHao() 
    {
        return hao;
    }
    public void setYears(String years) 
    {
        this.years = years;
    }

    public String getYears() 
    {
        return years;
    }
    public void setShortDescription(String shortDescription) 
    {
        this.shortDescription = shortDescription;
    }

    public String getShortDescription() 
    {
        return shortDescription;
    }
    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }
    public void setCreatePerson(String createPerson) 
    {
        this.createPerson = createPerson;
    }

    public String getCreatePerson() 
    {
        return createPerson;
    }
    public void setUpdatePerson(String updatePerson) 
    {
        this.updatePerson = updatePerson;
    }

    public String getUpdatePerson() 
    {
        return updatePerson;
    }
    public void setEnable(Integer enable) 
    {
        this.enable = enable;
    }

    public Integer getEnable() 
    {
        return enable;
    }
    public void setIsDelete(Integer isDelete) 
    {
        this.isDelete = isDelete;
    }

    public Integer getIsDelete() 
    {
        return isDelete;
    }
    public void setRemarks(String remarks) 
    {
        this.remarks = remarks;
    }

    public String getRemarks() 
    {
        return remarks;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("authorId", getAuthorId())
            .append("name", getName())
            .append("xing", getXing())
            .append("ming", getMing())
            .append("zi", getZi())
            .append("hao", getHao())
            .append("years", getYears())
            .append("shortDescription", getShortDescription())
            .append("description", getDescription())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("createPerson", getCreatePerson())
            .append("updatePerson", getUpdatePerson())
            .append("enable", getEnable())
            .append("isDelete", getIsDelete())
            .append("remarks", getRemarks())
            .toString();
    }
}
