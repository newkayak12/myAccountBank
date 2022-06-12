package com.server.base.repository.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.server.base.common.authorizations.annotations.AuthorizeDto;
import com.server.base.common.validations.Validations;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@AuthorizeDto
@Builder
@ToString
public class CategorySubDto implements Serializable {
    @NotNull(message = "카테고리 No가 필요합니다.", groups = {Validations.removeSub.class})
    private  Long categorySubNo;
    private  UserDto user;
    @JsonIgnore
    private  Long categoryNo;
    @NotNull(message = "서브 카테고리 이름은 필수 항목입니다.", groups = {Validations.saveSub.class})
    private  String category_etc2;
}