package com.prince.websevices.controllers;

import com.prince.domain.dtos.MemberDto;
import com.prince.logic.MemberInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("members")
public class MembersController {
    private final MemberInfo memberInfo;

    public MembersController(MemberInfo memberInfo) {
        this.memberInfo = memberInfo;
    }

    @GetMapping("allmembers")
    public List<MemberDto> displayAll(){
        return memberInfo.getAllMember();
    }

    @GetMapping("member/{id}")
    public MemberDto getMember(@RequestParam Long id){
        return memberInfo.getMemberById(id);
    }
}
