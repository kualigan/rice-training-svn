CREATE TABLE kuldemoclient.author_s LIKE kuldemo.author_s;
INSERT INTO kuldemoclient.author_s SELECT * FROM kuldemo.author_s;

CREATE TABLE kuldemoclient.author_t LIKE kuldemo.author_t;
INSERT INTO kuldemoclient.author_t SELECT * FROM kuldemo.author_t;

CREATE TABLE kuldemoclient.book_order_doc_t LIKE kuldemo.book_order_doc_t;
INSERT INTO kuldemoclient.book_order_doc_t SELECT * FROM kuldemo.book_order_doc_t;

CREATE TABLE kuldemoclient.book_order_entry_s LIKE kuldemo.book_order_entry_s;
INSERT INTO kuldemoclient.book_order_entry_s SELECT * FROM kuldemo.book_order_entry_s;

CREATE TABLE kuldemoclient.book_order_entry_t LIKE kuldemo.book_order_entry_t;
INSERT INTO kuldemoclient.book_order_entry_t SELECT * FROM kuldemo.book_order_entry_t;

CREATE TABLE kuldemoclient.book_s LIKE kuldemo.book_s;
INSERT INTO kuldemoclient.book_s SELECT * FROM kuldemo.book_s;

CREATE TABLE kuldemoclient.book_t LIKE kuldemo.book_t;
INSERT INTO kuldemoclient.book_t SELECT * FROM kuldemo.book_t;

CREATE TABLE kuldemoclient.chapter_s LIKE kuldemo.chapter_s;
INSERT INTO kuldemoclient.chapter_s SELECT * FROM kuldemo.chapter_s;

CREATE TABLE kuldemoclient.chapter_t LIKE kuldemo.chapter_t;
INSERT INTO kuldemoclient.chapter_t SELECT * FROM kuldemo.chapter_t;

