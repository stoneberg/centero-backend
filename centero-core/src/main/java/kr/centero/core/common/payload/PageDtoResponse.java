package kr.centero.core.common.payload;

import kr.centero.core.common.pagination.PageResponse;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.function.Function;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PageDtoResponse {
    // This method is generic and can be used for transforming various types.
    public static <T, R> R convertPageDto(PageResponse<T> pageResponse, Function<PageResponse<T>, R> transformer) {
        return transformer.apply(pageResponse);
    }
}
