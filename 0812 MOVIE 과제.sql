-- ������ ���� --
CREATE SEQUENCE SEQ_NO
START WITH 1
MAXVALUE 2000;

COMMIT;

-- ���̺� ���� --
CREATE TABLE MOVIE_MAIN 
(
    NO NUMBER DEFAULT SEQ_NO.NEXTVAL PRIMARY KEY
    ,TITLE VARCHAR2(20)
    ,YEAR NUMBER
    ,RATING NUMBER
    ,GENRE NUMBER
);

CREATE TABLE MOVIE_GENRE
(
GENRE_NO NUMBER PRIMARY KEY
,GENRE_NAME VARCHAR2(20)
);

-- �������� ���� --
ALTER TABLE MOVIE_MAIN
    ADD CONSTRAINT UK_YEAR UNIQUE (YEAR)
    ADD CONSTRAINT FK_GENRE FOREIGN KEY (GENRE)REFERENCES MOVIE_GENRE (GENRE_NO);

ALTER TABLE MOVIE_MAIN
    DROP CONSTRAINT UK_YEAR;
    
ALTER TABLE MOVIE_MAIN
    ADD CONSTRAINT UK_TITLE UNIQUE (TITLE);
    
-- MOVIE_GENRE ���̺� ������ ���� --
INSERT INTO MOVIE_GENRE
(
    GENRE_NO
    ,GENRE_NAME
)
VALUES
(
    400
    ,'���'
);
    
COMMIT;

-- MOVIE_MAIN ���̺� ������ ���� --
INSERT INTO MOVIE_MAIN
(
    TITLE
    ,YEAR
    ,RATING
    ,GENRE
)
VALUES
(
    '�������̸�'
    ,2023
    ,5
    ,400
);

-- ��������, ������ ���� --
ALTER TABLE MOVIE_MAIN
    MODIFY TITLE VARCHAR2(40);
    
UPDATE MOVIE_MAIN
    SET RATING = 3
    WHERE TITLE = '����';
    
DELETE MOVIE_MAIN
    WHERE TITLE = 'ž��';
    -- �Ʒ��� ���˿� --
SELECT
        NO
        ,TITLE
        ,YEAR
        ,RATING
        ,GENRE
    FROM MOVIE_MAIN    ;
    
commit;

SELECT
        NO
        , TITLE
        , YEAR
        , RATING
        , GENRE
        FROM MOVIE_MAIN
        WHERE RATING BETWEEN 3 AND 4