update krew_doc_typ_t set appl_id='trnapp' where doc_typ_nm in ('AuthorDocumentType', 'BookDocumentType', 'BookOrderDocumentType');

update krew_doc_typ_t set doc_hdlr_url='http://localhost:9000/trnapp/kr/maintenance.do?methodToCall=docHandler' where doc_typ_nm in ('AuthorDocumentType', 'BookDocumentType');

update krew_doc_typ_t set doc_hdlr_url='http://localhost:9000/trnapp/bookOrder.do?methodToCall=docHandler' where doc_typ_nm = 'BookOrderDocumentType';