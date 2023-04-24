package com.ruoyi.web.controller.gushi;

import com.ruoyi.gushi.domain.GsLiterature;
import com.ruoyi.gushi.service.IGsLiteratureService;
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
 * 作品Controller
 * 
 * @author ruoyi
 * @date 2023-04-23
 */
@Controller
@RequestMapping("/gs/literature")
public class GsLiteratureController extends BaseController
{
    private String prefix = "gushi/literature";

    @Autowired
    private IGsLiteratureService gsLiteratureService;

    @RequiresPermissions("gs:literature:view")
    @GetMapping()
    public String literature()
    {
        return prefix + "/literature";
    }

    /**
     * 查询作品列表
     */
    @RequiresPermissions("gs:literature:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(GsLiterature gsLiterature)
    {
        startPage();
        List<GsLiterature> list = gsLiteratureService.selectGsLiteratureList(gsLiterature);
        return getDataTable(list);
    }

    /**
     * 导出作品列表
     */
    @RequiresPermissions("gs:literature:export")
    @Log(title = "作品", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(GsLiterature gsLiterature)
    {
        List<GsLiterature> list = gsLiteratureService.selectGsLiteratureList(gsLiterature);
        ExcelUtil<GsLiterature> util = new ExcelUtil<GsLiterature>(GsLiterature.class);
        return util.exportExcel(list, "作品数据");
    }

    /**
     * 新增作品
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存作品
     */
    @RequiresPermissions("gs:literature:add")
    @Log(title = "作品", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(GsLiterature gsLiterature)
    {
        return toAjax(gsLiteratureService.insertGsLiterature(gsLiterature));
    }

    /**
     * 修改作品
     */
    @RequiresPermissions("gs:literature:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        GsLiterature gsLiterature = gsLiteratureService.selectGsLiteratureById(id);
        mmap.put("gsLiterature", gsLiterature);
        return prefix + "/edit";
    }

    /**
     * 修改保存作品
     */
    @RequiresPermissions("gs:literature:edit")
    @Log(title = "作品", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(GsLiterature gsLiterature)
    {
        return toAjax(gsLiteratureService.updateGsLiterature(gsLiterature));
    }

    /**
     * 删除作品
     */
    @RequiresPermissions("gs:literature:remove")
    @Log(title = "作品", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(gsLiteratureService.deleteGsLiteratureByIds(ids));
    }
}
