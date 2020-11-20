package com.xgs.hisystem.controller;

import com.xgs.hisystem.pojo.bo.BaseResponse;
import com.xgs.hisystem.pojo.vo.register.GetCardIdInforReqVO;
import com.xgs.hisystem.pojo.vo.toll.*;
import com.xgs.hisystem.service.ITollService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *  @author更多免费资料获取请加公众号“前劲科技”，车联网，物联网，医院HIS，OA等高端代码获取或者代码有疑问，软件定制开发加微信17725354261，Q技术群：25686021
 * @date 2019-5-14
 * @description:
 */
@RestController
@RequestMapping(value = "/toll")
@Api(tags = "收费管理API")
public class TollController {

    @Autowired
    private ITollService iTollService;

    @PostMapping(value = "/getCardIdInfor")
    public cardRspVO getCardIdInfor() {

        return iTollService.getCardIdInfor();
    }

    /**
     * 获取病历信息
     *
     * @param cardId
     * @param tollStatus
     * @return
     */
    @GetMapping(value = "/getAllMedicalRecord")
    public List<TollRspVO> getAllMedicalRecord(@RequestParam String cardId,
                                               @RequestParam String tollStatus) {

        return iTollService.getAllMedicalRecord(cardId, tollStatus);
    }

    /**
     * 获取处方笺信息
     *
     * @param cardId
     * @param registerId
     * @return
     * @throws Exception
     */
    @PostMapping(value = "/getMedicalRecord")
    public TollMedicalRecordRspVO getMedicalRecord(@RequestParam String cardId,
                                                   @RequestParam String registerId) throws Exception {

        return iTollService.getMedicalRecord(cardId, registerId);
    }


    /**
     * 划价收费完成，保存信息
     *
     * @param reqVO
     * @return
     */
    @PostMapping(value = "/saveTollInfo")
    public BaseResponse<String> saveTollInfo(@RequestBody @Validated SaveTollInfoReqVO reqVO) {

        return iTollService.saveTollInfo(reqVO);
    }


    @PostMapping(value = "getexaminationtollinfo")
    @ApiOperation(value = "获取体检收费信息", httpMethod = "POST", notes = "获取体检收费信息")
    @ApiImplicitParam(name = "reqVO",value = "获取体检收费信息", dataType = "GetCardIdInforReqVO")
    private BaseResponse<GetExaminationTollInfoRspVO> getExaminationTollInfo(@RequestBody GetCardIdInforReqVO reqVO){
        return iTollService.getExaminationTollInfo(reqVO);
    }

    @PostMapping(value = "saveexaminationtollinfo")
    @ApiOperation(value = "保存体检收费记录", httpMethod = "POST", notes = "保存体检收费记录")
    private BaseResponse<String> saveExaminationTollInfo(@RequestParam String registerId){
        return iTollService.saveExaminationTollInfo(registerId);
    }
}
