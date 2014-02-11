INSERT INTO book_s VALUES(NULL);

INSERT INTO book_t (
	book_id, title, author_id, category, isbn, publisher, pub_date, obj_id
) VALUES (
LAST_INSERT_ID(),
'The Hitchhikers Guide to the Galaxy',
(select author_id from author_t where first_name='Douglas'),
'Science Fiction',
'0-330-25864-8',
'Pan Books',
'1979-10-12',
uuid());

-- add additional books here
