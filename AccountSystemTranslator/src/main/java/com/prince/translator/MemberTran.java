package com.prince.translator;

import com.prince.domain.dtos.MemberDto;
import com.prince.domain.persistence.Member;

import java.util.List;

public interface MemberTran {
    List<MemberDto> getAllMember();
    MemberDto getMemberById(Long id);
}
