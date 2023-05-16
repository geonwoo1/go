<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<%@ include file="../common/header.jsp" %>

<body>
  
<div class="board_wrap">
  <div class="board_title">
    <strong>공지사항</strong>
    <p>공지사항을 빠르고 정확하게 안내해드립니다.</p>
  </div>
  <div class="board_list_wrap">
    <div class="board_list">
      <div class="top">
        <div class="num">번호</div>
        <div class="title">제목</div>
        <div class="writer">글쓴이</div>
        <div class="date">작성일</div>
        <div class="count">조회</div>
      </div>
      
      <% for (int i = 5; i >= 1; i--) { %>
        <div>
          <div class="num"><%= i %></div>
          <div class="title"><a href="view.html">글 제목이 들어갑니다.</a></div>
          <div class="writer">김이름</div>
          <div class="date">2021.1.15</div>
          <div class="count">33</div>
        </div>
      <% } %>
      
    </div>
  </div>
</div>

</body>

<%@ include file="../common/footer.jsp" %>
</html>
