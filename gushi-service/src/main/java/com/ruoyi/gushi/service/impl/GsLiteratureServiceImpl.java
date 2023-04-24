package com.ruoyi.gushi.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.gushi.domain.GsLiterature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.gushi.mapper.GsLiteratureMapper;
import com.ruoyi.gushi.service.IGsLiteratureService;
import com.ruoyi.common.core.text.Convert;

/**
 * 作品Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-04-23
 */
@Service
public class GsLiteratureServiceImpl implements IGsLiteratureService 
{
    @Autowired
    private GsLiteratureMapper gsLiteratureMapper;

    /**
     * 查询作品
     * 
     * @param id 作品主键
     * @return 作品
     */
    @Override
    public GsLiterature selectGsLiteratureById(Long id)
    {
        return gsLiteratureMapper.selectGsLiteratureById(id);
    }

    /**
     * 查询作品列表
     * 
     * @param gsLiterature 作品
     * @return 作品
     */
    @Override
    public List<GsLiterature> selectGsLiteratureList(GsLiterature gsLiterature)
    {
        return gsLiteratureMapper.selectGsLiteratureList(gsLiterature);
    }

    /**
     * 新增作品
     * 
     * @param gsLiterature 作品
     * @return 结果
     */
    @Override
    public int insertGsLiterature(GsLiterature gsLiterature)
    {
        gsLiterature.setCreateTime(DateUtils.getNowDate());
        return gsLiteratureMapper.insertGsLiterature(gsLiterature);
    }

    /**
     * 修改作品
     * 
     * @param gsLiterature 作品
     * @return 结果
     */
    @Override
    public int updateGsLiterature(GsLiterature gsLiterature)
    {
        gsLiterature.setUpdateTime(DateUtils.getNowDate());
        return gsLiteratureMapper.updateGsLiterature(gsLiterature);
    }

    /**
     * 批量删除作品
     * 
     * @param ids 需要删除的作品主键
     * @return 结果
     */
    @Override
    public int deleteGsLiteratureByIds(String ids)
    {
        return gsLiteratureMapper.deleteGsLiteratureByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除作品信息
     * 
     * @param id 作品主键
     * @return 结果
     */
    @Override
    public int deleteGsLiteratureById(Long id)
    {
        return gsLiteratureMapper.deleteGsLiteratureById(id);
    }
}
