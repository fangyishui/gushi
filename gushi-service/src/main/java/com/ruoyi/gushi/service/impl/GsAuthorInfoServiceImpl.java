package com.ruoyi.gushi.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.gushi.mapper.GsAuthorInfoMapper;
import com.ruoyi.gushi.domain.GsAuthorInfo;
import com.ruoyi.gushi.service.IGsAuthorInfoService;
import com.ruoyi.common.core.text.Convert;

/**
 * 作者信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-04-23
 */
@Service
public class GsAuthorInfoServiceImpl implements IGsAuthorInfoService 
{
    @Autowired
    private GsAuthorInfoMapper gsAuthorInfoMapper;

    /**
     * 查询作者信息
     * 
     * @param id 作者信息主键
     * @return 作者信息
     */
    @Override
    public GsAuthorInfo selectGsAuthorInfoById(Long id)
    {
        return gsAuthorInfoMapper.selectGsAuthorInfoById(id);
    }

    /**
     * 查询作者信息列表
     * 
     * @param gsAuthorInfo 作者信息
     * @return 作者信息
     */
    @Override
    public List<GsAuthorInfo> selectGsAuthorInfoList(GsAuthorInfo gsAuthorInfo)
    {
        return gsAuthorInfoMapper.selectGsAuthorInfoList(gsAuthorInfo);
    }

    /**
     * 新增作者信息
     * 
     * @param gsAuthorInfo 作者信息
     * @return 结果
     */
    @Override
    public int insertGsAuthorInfo(GsAuthorInfo gsAuthorInfo)
    {
        gsAuthorInfo.setCreateTime(DateUtils.getNowDate());
        return gsAuthorInfoMapper.insertGsAuthorInfo(gsAuthorInfo);
    }

    /**
     * 修改作者信息
     * 
     * @param gsAuthorInfo 作者信息
     * @return 结果
     */
    @Override
    public int updateGsAuthorInfo(GsAuthorInfo gsAuthorInfo)
    {
        gsAuthorInfo.setUpdateTime(DateUtils.getNowDate());
        return gsAuthorInfoMapper.updateGsAuthorInfo(gsAuthorInfo);
    }

    /**
     * 批量删除作者信息
     * 
     * @param ids 需要删除的作者信息主键
     * @return 结果
     */
    @Override
    public int deleteGsAuthorInfoByIds(String ids)
    {
        return gsAuthorInfoMapper.deleteGsAuthorInfoByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除作者信息信息
     * 
     * @param id 作者信息主键
     * @return 结果
     */
    @Override
    public int deleteGsAuthorInfoById(Long id)
    {
        return gsAuthorInfoMapper.deleteGsAuthorInfoById(id);
    }
}
