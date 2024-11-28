package kr.co.neighbor21.weirdoanimalbe.domain.admin;


import kr.co.neighbor21.weirdoanimalbe.domain.common.record.GridResponse;
import kr.co.neighbor21.weirdoanimalbe.domain.common.record.ItemResponse;
import kr.co.neighbor21.weirdoanimalbe.domain.admin.record.UserDeleteRequest;
import kr.co.neighbor21.weirdoanimalbe.domain.admin.record.UserDetailSearchRequest;
import kr.co.neighbor21.weirdoanimalbe.domain.admin.record.UserDetailSearchResponse;
import kr.co.neighbor21.weirdoanimalbe.domain.admin.record.UserListSearchRequest;
import kr.co.neighbor21.weirdoanimalbe.domain.admin.record.UserListSearchResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController(value = "/admin")
public class AdminController {


    private final AdminService adminService;

    @PostMapping("/users/detail/search")
    public ResponseEntity<ItemResponse<UserDetailSearchResponse>> getSearchUserDetail(
            @RequestBody UserDetailSearchRequest request) throws NotFoundException {
        ItemResponse<UserDetailSearchResponse> user = adminService.getSearchUserDetail(request);
        return ResponseEntity.ok().body(user);
    }

    @PostMapping("/users/list/search")
    public ResponseEntity<GridResponse<UserListSearchResponse>> getSearchUserList(
            @RequestBody UserListSearchRequest request) {
        GridResponse<UserListSearchResponse> userList = adminService.getSearchUserList(request);
        return ResponseEntity.ok().body(userList);
    }


    @PostMapping("/users/delete")
    public ResponseEntity<ItemResponse<String>> deleteUser(
            @RequestBody UserDeleteRequest request) {
        ItemResponse<String> response = adminService.deleteUser(request);
        return ResponseEntity.ok().body(response);
    }
}
