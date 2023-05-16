<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<%@ include file="header.jsp" %>
<body>
    <%-- JSP 코드와 HTML을 조합하여 필요한 동적 처리 수행 --%>
    <div class="container">
        <h2>게시판 글쓰기</h2>
        <form action="write.jsp" method="post">
            <div class="form-group">
                <label for="content">내용</label>
                <textarea class="form-control" rows="5" id="content" name="content" placeholder="내용 작성"></textarea>
            </div>
            <div class="form-group">
                <label for="writer">작성자</label>
                <input type="text" class="form-control" id="writer" placeholder="작성자(2자-10자)" name="writer">
            </div>
            <button type="submit" class="btn btn-default">등록</button>
        </form>
    </div>
    <%-- 다른 JSP 코드나 HTML 마크업 추가 --%>
</body>
<%@ include file="footer.jsp" %>
