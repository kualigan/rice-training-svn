insert into KRIM_RSP_ID_S values (NULL);

insert into KRIM_RSP_T values (LAST_INSERT_ID(), UUID(), 1, 
                               (select RSP_TMPL_ID from KRIM_RSP_TMPL_T where NM = 'Review'),
                               'BOOKSTORE',
                               'Department Head Review',
                               '', 'A');

insert into krim_attr_data_id_s values (NULL);

insert into KRIM_RSP_ATTR_DATA_T VALUES (
LAST_INSERT_ID(),
UUID(),
1,
(select RSP_ID from KRIM_RSP_T where NM = 'Department Head Review'),
(select KIM_TYP_ID from KRIM_TYP_T where SRVC_NM = 'departmentHeadDerivedRoleTypeService'),
(select KIM_ATTR_DEFN_ID from KRIM_ATTR_DEFN_T where nm = 'documentTypeName'),
'BookDocumentType'
);

insert into krim_attr_data_id_s values (NULL);

insert into KRIM_RSP_ATTR_DATA_T VALUES (
LAST_INSERT_ID(),
UUID(),
1,
(select RSP_ID from KRIM_RSP_T where NM = 'Department Head Review'),
(select KIM_TYP_ID from KRIM_TYP_T where SRVC_NM = 'departmentHeadDerivedRoleTypeService'),
(select KIM_ATTR_DEFN_ID from KRIM_ATTR_DEFN_T where nm = 'routeNodeName'),
'DepartmentHeadReview'
);

insert into krim_attr_data_id_s values (NULL);

insert into KRIM_RSP_ATTR_DATA_T VALUES (
LAST_INSERT_ID(),
UUID(),
1,
(select RSP_ID from KRIM_RSP_T where NM = 'Department Head Review'),
(select KIM_TYP_ID from KRIM_TYP_T where SRVC_NM = 'departmentHeadDerivedRoleTypeService'),
(select KIM_ATTR_DEFN_ID from KRIM_ATTR_DEFN_T where nm = 'required'),
'true'
);

insert into krim_attr_data_id_s values (NULL);

insert into KRIM_RSP_ATTR_DATA_T VALUES (
LAST_INSERT_ID(),
UUID(),
1,
(select RSP_ID from KRIM_RSP_T where NM = 'Department Head Review'),
(select KIM_TYP_ID from KRIM_TYP_T where SRVC_NM = 'departmentHeadDerivedRoleTypeService'),
(select KIM_ATTR_DEFN_ID from KRIM_ATTR_DEFN_T where nm = 'actionDetailsAtRoleMemberLevel'),
'true'
);

INSERT INTO KRIM_ROLE_RSP_ID_S VALUES (NULL);

INSERT INTO KRIM_ROLE_RSP_T VALUES (
LAST_INSERT_ID(),
UUID(),
1,
(select ROLE_ID from KRIM_ROLE_T where ROLE_NM = 'Department Head (Derived)'),
(select RSP_ID from KRIM_RSP_T where NM = 'Department Head Review'),
Y
);

INSERT INTO KRIM_ROLE_RSP_ACTN_ID_S VALUES (NULL);

INSERT INTO KRIM_ROLE_RSP_ACTN_T VALUES (
LAST_INSERT_ID(),
UUID(),
1,
'A',
1,
'F',
'*',
(select RSP_ID from KRIM_RSP_T where NM = 'Department Head Review'),
'Y'
);