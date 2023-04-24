package com.ruoyi.gushi.service;

import java.util.List;
import com.ruoyi.gushi.domain.GsAuthorInfo;

/**
 * 作者信息Service接口
 * 
 * @author ruoyi
 * @date 2023-04-23
 */
public interface IGsAuthorInfoService 
{
    /**
     * 查询作者信息
     * 
     * @param id 作者信息主键
     * @return 作者信息
     */
    public GsAuthorInfo selectGsAuthorInfoById(Long id);

    /**
     * 查询作者信息列表
     * 
     * @param gsAuthorInfo 作者信息
     * @return 作者信息集合
     */
    public List<GsAuthorInfo> selectGsAuthorInfoList(GsAuthorInfo gsAuthorInfo);

    /**
     * 新增作者信息
     * 
     * @param gsAuthorInfo 作者信息
     * @return 结果
     */
    public int insertGsAuthorInfo(GsAuthorInfo gsAuthorInfo);

    /**
     * 修改作者信息
     * 
     * @param gsAuthorInfo 作者信息
     * @return 结果
     */
    public int updateGsAuthorInfo(GsAuthorInfo gsAuthorInfo);

    /**
     * 批量删除作者信息
     * 
     * @param ids 需要删除的作者信息主键集合
     * @return 结果
     */
    public int deleteGsAuthorInfoByIds(String ids);

    /**
     * 删除作者信息信息
     * 
     * @param id 作者信息主键
     * @return 结果
     */
    public int deleteGsAuthorInfoById(Long id);
}
