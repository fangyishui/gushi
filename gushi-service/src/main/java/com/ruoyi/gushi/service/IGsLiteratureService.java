package com.ruoyi.gushi.service;

import java.util.List;
import com.ruoyi.gushi.domain.GsLiterature;

/**
 * 作品Service接口
 * 
 * @author ruoyi
 * @date 2023-04-23
 */
public interface IGsLiteratureService 
{
    /**
     * 查询作品
     * 
     * @param id 作品主键
     * @return 作品
     */
    public GsLiterature selectGsLiteratureById(Long id);

    /**
     * 查询作品列表
     * 
     * @param gsLiterature 作品
     * @return 作品集合
     */
    public List<GsLiterature> selectGsLiteratureList(GsLiterature gsLiterature);

    /**
     * 新增作品
     * 
     * @param gsLiterature 作品
     * @return 结果
     */
    public int insertGsLiterature(GsLiterature gsLiterature);

    /**
     * 修改作品
     * 
     * @param gsLiterature 作品
     * @return 结果
     */
    public int updateGsLiterature(GsLiterature gsLiterature);

    /**
     * 批量删除作品
     * 
     * @param ids 需要删除的作品主键集合
     * @return 结果
     */
    public int deleteGsLiteratureByIds(String ids);

    /**
     * 删除作品信息
     * 
     * @param id 作品主键
     * @return 结果
     */
    public int deleteGsLiteratureById(Long id);
}
