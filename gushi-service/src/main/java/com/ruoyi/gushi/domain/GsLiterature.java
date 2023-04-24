package com.ruoyi.gushi.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 作品对象 gs_literature
 * 
 * @author ruoyi
 * @date 2023-04-23
 */
public class GsLiterature extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 作品id */
    @Excel(name = "作品id")
    private String literatureId;

    /** 作者id */
    @Excel(name = "作者id")
    private String authorId;

    /** 作品图片 */
    @Excel(name = "作品图片")
    private String literatureImg;

    /** 文体 ：1 诗 2词 3歌 4赋 5元曲 */
    @Excel(name = "文体 ：1 诗 2词 3歌 4赋 5元曲")
    private Integer type;

    /** 词牌名 */
    @Excel(name = "词牌名")
    private String detailType;

    /** 内容 */
    @Excel(name = "内容")
    private String content;

    /** 释义 */
    @Excel(name = "释义")
    private String interpretation;

    /** 创建人 */
    @Excel(name = "创建人")
    private String createPerson;

    /** 更新人 */
    @Excel(name = "更新人")
    private String updatePerson;

    /** 是否启用 1 启用 0 未启用 */
    @Excel(name = "是否启用 1 启用 0 未启用")
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
    public void setLiteratureId(String literatureId) 
    {
        this.literatureId = literatureId;
    }

    public String getLiteratureId() 
    {
        return literatureId;
    }
    public void setAuthorId(String authorId) 
    {
        this.authorId = authorId;
    }

    public String getAuthorId() 
    {
        return authorId;
    }
    public void setLiteratureImg(String literatureImg) 
    {
        this.literatureImg = literatureImg;
    }

    public String getLiteratureImg() 
    {
        return literatureImg;
    }
    public void setType(Integer type) 
    {
        this.type = type;
    }

    public Integer getType() 
    {
        return type;
    }
    public void setDetailType(String detailType) 
    {
        this.detailType = detailType;
    }

    public String getDetailType() 
    {
        return detailType;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setInterpretation(String interpretation) 
    {
        this.interpretation = interpretation;
    }

    public String getInterpretation() 
    {
        return interpretation;
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
            .append("literatureId", getLiteratureId())
            .append("authorId", getAuthorId())
            .append("literatureImg", getLiteratureImg())
            .append("type", getType())
            .append("detailType", getDetailType())
            .append("content", getContent())
            .append("interpretation", getInterpretation())
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
