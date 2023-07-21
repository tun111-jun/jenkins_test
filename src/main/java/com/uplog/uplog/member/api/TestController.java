package com.uplog.uplog.member.api;

import com.uplog.uplog.member.dao.TestRepository;
import com.uplog.uplog.member.model.Testcreate;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {
    private final TestRepository testRepository;

    // summary -> api 내용(기능) description -> 세부 설명 tag -> 그룹 (도메인 별 컨트롤러 이름)
    @Operation(summary = "테스트 요청", description = "설명", tags = { "Member Controller" })
    // response 코드 별로 응답 시 내용(설명) 작성
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "OK",
                    content = @Content(schema = @Schema(implementation = TestController.class))),
            @ApiResponse(responseCode = "400", description = "BAD REQUEST"),
            @ApiResponse(responseCode = "404", description = "NOT FOUND"),
            @ApiResponse(responseCode = "500", description = "INTERNAL SERVER ERROR")
    })
    @GetMapping("/test/{TestStr}")
    public String test(@PathVariable("TestStr")Long str) {

        System.out.println("error");
        Testcreate testcreate=new Testcreate();
        testcreate.tesSetting(str);
        testRepository.save(testcreate);
        return "Hello this is test";
    }
    @GetMapping("/test/sdfef/{testt}")
    public String testtwo(@PathVariable("testt")Long str) {


        return "Hello";
    }
}
