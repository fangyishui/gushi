package com.ruoyi.web.controller.gushi;


import com.ruoyi.gushi.domain.GsAuthorInfo;
import com.ruoyi.gushi.service.IGsAuthorInfoService;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 作者信息Controller
 * 
 * @author ruoyi
 * @date 2023-04-23
 */
@Controller
@RequestMapping("/gs/info")
public class GsAuthorInfoController extends BaseController
{
    private String prefix = "gushi/info";

    @Autowired
    private IGsAuthorInfoService gsAuthorInfoService;

    @RequiresPermissions("gs:info:view")
    @GetMapping()
    public String info()
    {
        return prefix + "/info";
    }

    /**
     * 查询作者信息列表
     */
    @RequiresPermissions("gs:info:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(GsAuthorInfo gsAuthorInfo)
    {
        startPage();
        List<GsAuthorInfo> list = gsAuthorInfoService.selectGsAuthorInfoList(gsAuthorInfo);
        return getDataTable(list);
    }

    /**
     * 导出作者信息列表
     */
    @RequiresPermissions("gs:info:export")
    @Log(title = "作者信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(GsAuthorInfo gsAuthorInfo)
    {
        List<GsAuthorInfo> list = gsAuthorInfoService.selectGsAuthorInfoList(gsAuthorInfo);
        ExcelUtil<GsAuthorInfo> util = new ExcelUtil<GsAuthorInfo>(GsAuthorInfo.class);
        return util.exportExcel(list, "作者信息数据");
    }

    /**
     * 新增作者信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存作者信息
     */
    @RequiresPermissions("gs:info:add")
    @Log(title = "作者信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(GsAuthorInfo gsAuthorInfo)
    {
        return toAjax(gsAuthorInfoService.insertGsAuthorInfo(gsAuthorInfo));
    }

    /**
     * 修改作者信息
     */
    @RequiresPermissions("gs:info:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        GsAuthorInfo gsAuthorInfo = gsAuthorInfoService.selectGsAuthorInfoById(id);
        mmap.put("gsAuthorInfo", gsAuthorInfo);
        return prefix + "/edit";
    }

    /**
     * 修改保存作者信息
     */
    @RequiresPermissions("gs:info:edit")
    @Log(title = "作者信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(GsAuthorInfo gsAuthorInfo)
    {
        return toAjax(gsAuthorInfoService.updateGsAuthorInfo(gsAuthorInfo));
    }

    /**
     * 删除作者信息
     */
    @RequiresPermissions("gs:info:remove")
    @Log(title = "作者信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(gsAuthorInfoService.deleteGsAuthorInfoByIds(ids));
    }
}
