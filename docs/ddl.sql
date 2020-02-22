CREATE TABLE BOARD_BASE(
BOARD_SEQ SERIAL PRIMARY KEY,
BOARD_TP_CD VARCHAR(60),
BOARD_NM VARCHAR(255) NOT NULL,
BOARD_DESC TEXT,
ROW_STATUS VARCHAR(20), CREATE_DATE TIMESTAMP, CREATE_BY VARCHAR(255), MODIFIED_DATE TIMESTAMP, MODIFIED_BY VARCHAR(255)
);


CREATE TABLE BOARD_POST(
POST_SEQ SERIAL PRIMARY KEY,
BOARD_SEQ INTEGER NOT NULL,
TITLE VARCHAR(1000) NOT NULL,
CONTENT TEXT NOT NULL,
WRITER VARCHAR(60),
TAG VARCHAR(500),
VIEW_CNT BIGINT,
ROW_STATUS VARCHAR(20), CREATE_DATE TIMESTAMP, CREATE_BY VARCHAR(255), MODIFIED_DATE TIMESTAMP, MODIFIED_BY VARCHAR(255)
);


CREATE TABLE BOARD_COMMENT(
COMMENT_SEQ SERIAL PRIMARY KEY,
POST_SEQ INTEGER NOT NULL,
UP_COMMENT_SEQ INTEGER,
COMMENT TEXT NOT NULL,
WRITER VARCHAR(60),
ROW_STATUS VARCHAR(20), CREATE_DATE TIMESTAMP, CREATE_BY VARCHAR(255), MODIFIED_DATE TIMESTAMP, MODIFIED_BY VARCHAR(255)
);


COMMENT ON TABLE BOARD_BASE IS '게시판 기본';


COMMENT ON COLUMN BOARD_BASE.BOARD_SEQ IS '게시판 일련번호';
COMMENT ON COLUMN BOARD_BASE.BOARD_TP_CD IS '게시판 유형 코드';
COMMENT ON COLUMN BOARD_BASE.BOARD_NM IS '게시판 이름';
COMMENT ON COLUMN BOARD_BASE.BOARD_DESC IS '게시판 설명';




COMMENT ON TABLE BOARD_POST IS '게시판 게시물';


COMMENT ON COLUMN BOARD_POST.POST_SEQ IS '게시물 일련번호';
COMMENT ON COLUMN BOARD_POST.BOARD_SEQ IS '게시판 일련번호';
COMMENT ON COLUMN BOARD_POST.TITLE IS '제목';
COMMENT ON COLUMN BOARD_POST.CONTENT IS '내용';
COMMENT ON COLUMN BOARD_POST.WRITER IS '작성자';
COMMENT ON COLUMN BOARD_POST.TAG IS '태그';
COMMENT ON COLUMN BOARD_POST.VIEW_CNT IS '조회수';




COMMENT ON TABLE BOARD_COMMENT IS '게시판 댓글';


COMMENT ON COLUMN BOARD_COMMENT.COMMENT_SEQ IS '댓글 일련번호';
COMMENT ON COLUMN BOARD_COMMENT.POST_SEQ IS '게시물 일련번호';
COMMENT ON COLUMN BOARD_COMMENT.UP_COMMENT_SEQ IS '';
COMMENT ON COLUMN BOARD_COMMENT.COMMENT IS '내용';
COMMENT ON COLUMN BOARD_COMMENT.WRITER IS '작성자';